package com.mycompany.atividade_usando_class;

public class Atividade_Usando_Class {

    public static void main(String[] args) {
       Livros livro = new Livros("Buraco Negro", "Thiago", 45, 120);
       
        System.out.println("Livro:");
        System.out.println("\tTítulo: " + livro.titulo);
        System.out.println("\tAutor: " + livro.autor);
        System.out.println("\tNúmero de Páginas: " + livro.numeroPaginas);
        System.out.println("\tPreço: R$" + livro.preco);
        
        
    }
}
