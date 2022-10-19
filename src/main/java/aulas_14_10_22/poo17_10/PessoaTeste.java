package aulas_14_10_22.poo17_10;

import java.sql.SQLOutput;

//intuito de testar o uso da classe Pessoa.
public class PessoaTeste {
    public static void main(String [] args) {
        //arquivos no mesmo pacote se conhecem. Pode criar um objeto sem rpecisar importar nada.
//sintaxe new -> constroi um NOVO objeto de pessoa
        Pessoa pessoa1 = new Pessoa();
        System.out.println(pessoa1.nome);
        pessoa1.nome = "José"; //obj.atributo
        pessoa1.sobrenome = "Carlos";
        pessoa1.idade = 29;
        pessoa1.peso = 55.0;
        pessoa1.altura = 1.65;

        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        System.out.println(pessoa2.nome);

        Pessoa pessoa4 = new Pessoa("Pedro", "Gomes", 35, 1.75, 30.5);

        Pessoa pessoa5 = new Pessoa("Carlos", "José", 22, 1.9, 77.0);

        Pessoa recemNascido = new Pessoa("Enzo", "Pereira");

        System.out. println(recemNascido.altura);
        recemNascido.idade++; // envelhecer
        recemNascido.dizOla();

        // Chamada de métodos
        pessoa4.dizOla();
        pessoa4.mostrarImc();
        double imcPessoa4 = pessoa4.calculaImc();
        System.out.println(imcPessoa4);

        pessoa4.comer("batata");

        //Exemplo pessoas
        Pessoa pedro = new Pessoa("Carlos", "Carlos", 30, 1.80, 70);
        Pessoa joao = new Pessoa("Joao", "Mane", 28, 1.70, 88);

        //pedro.addPessoaNova(joao); isso daria mtos bugs no meu codigo. forcando uma passagem
        pedro.cumprimentar(joao);
        pedro.cumprimentar(joao);
        pedro.comer("batata");
    }
}