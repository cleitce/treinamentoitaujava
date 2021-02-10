
function buscarcliente(){
    let id = document.getElementById("txtID").value;
    const url = "http://localhost:8080/cliente/id/" + id;

    fetch(url)   // o .then aguarda o retorno do fetch para prosseguir
        .then(retorno => tratarRetorno(retorno));    // passa o retorno do FETCH para função tratarRetorno()

}

/*
function name(param){
    console.log(param);
}
equivale a:
param => console.log(param);
*/

function tratarRetorno(ret){
    //console.log(valor_retorno);
    if(ret.status == 200)
    {
        ret.json().then( cliente => exibirDados(cliente) );
    } else {
        document.getElementById("dados").innerHTML = "<FONT COLOR='#ff0000'><b>Cliente não encontrado!</b></FONT>";
    }
}

function exibirDados(dados){
    let tela = `ID: <b>${dados.id}</b> <br>NOME: <b>${dados.nome}</b> <br>CPF: <b>${dados.cpf}</b>`
    document.getElementById("dados").innerHTML = tela;
}

function listartodos(){
    const url = "http://localhost:8080/cliente/all";

    fetch(url)   // o .then aguarda o retorno do fetch para prosseguir
        .then(retorno => tratarRetornoTodos(retorno));    // passa o retorno do FETCH para função tratarRetornoTodos()
  
}

function tratarRetornoTodos(ret){
    //console.log(ret);
    if(ret.status == 200)
    {
        ret.json().then( clientes => exibirLista(clientes) );
        //ret.json().then( cliente => exibirDadosTodos(cliente) );
    } else {
        //document.getElementById("dados").innerHTML = "<FONT COLOR='#ff0000'><b>Cliente não encontrado!</b></FONT>";
    }    
}

function exibirLista(lista){
    let tabela = "<table width='100%' cellpadding='0' cellspacing='0'>";
    tabela += "<tr><th class='headerTable'>ID</th><th class='headerTable'>Nome</th><th class='headerTable'>CPF</th></tr>";
    for(i = 0; i < lista.length; i++){
        tabela += `<tr>`;
        tabela += `<td class='rowsTable'>${lista[i].id}</td>`;
        tabela += `<td class='rowsTable'>${lista[i].nome}</td>`;
        tabela += `<td class='rowsTable'>${lista[i].cpf}</td>`;
        tabela += `</tr>`;
    }
    tabela += "</tabela>";

    document.getElementById("lista").innerHTML = tabela;
}