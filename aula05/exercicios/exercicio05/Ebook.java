package exercicio05;

public class Ebook {
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    public Ebook(String titulo, String autor, int totalPaginas, int paginaAtual)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = paginaAtual;
    }

    public void avancarPagina(){
        if(paginaAtual < totalPaginas)
        {        
            paginaAtual ++;
        }
        else
        {
            System.out.println("Não é possível avançar para próxima pagina!");
        }
    }

    public void retrocederPagina(){
        if(paginaAtual > 1)
        {
            paginaAtual --;
        }
        else
        {
            System.out.println("Não é possível retroceder para próxima pagina!");
        }        
    }

    public void irParaPagina(int pagina){
        if((pagina >= 1) && (pagina <= totalPaginas))
        {
            paginaAtual = pagina;
        }
        else
        {
            System.out.println("Não é possível ir para pagina " + pagina);
        }         

    }

    public int exibirPagina(){
        return paginaAtual;
    }

    public void mostrarCapa(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Total de páginas: " + this.totalPaginas);
        System.out.println("Página atual: " + this.paginaAtual);
    }

}
