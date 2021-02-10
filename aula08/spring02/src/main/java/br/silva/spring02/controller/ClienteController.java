package br.silva.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.silva.spring02.model.Cliente;
import br.silva.spring02.repository.ClienteRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteRepo repo;

    @GetMapping("/id/{id}")     // o campo {id} significa que é uma variável chamada id
    public ResponseEntity<Cliente> buscaCliente(@PathVariable int id){
        Cliente clienteEncontrado = repo.findById(id).orElse(null);  //find o id ou retorna null

        if(clienteEncontrado != null){   //encontrou o cliente
            return ResponseEntity.ok(clienteEncontrado);  //ok é o status 200
        }

        //  ResponseEntity.status(402);     //Exemplo para retornar código 402
        return ResponseEntity.notFound().build();   // notfound é o status 404 e .build significa monta a resposta com nada dentro
    }

    @GetMapping("/all")
    public ResponseEntity<List<Cliente>> buscarTodos(){
        List<Cliente> lista = (List<Cliente>) repo.findAll();
        return ResponseEntity.ok(lista);
    }

}
