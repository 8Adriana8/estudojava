package aulas_14_10_22;

import java.util.Arrays;
import java.util.Scanner;

public class EstudoStrings {
    public static void main(String[] args) {
        //Strings sao cadeias de caracteres
        //"José" -> J = 0, o = 1, e = 3
        String nome = "Pedro"; //associando valor. Vai ficar armazenado na memória. Constante literal.

        if(nome == "Pedro"){
            System.out.println("São iguais!"); //está verificando se o valor desse objeto na memoria é igual ao outro. Compara o loval, não o texto.
        }

        System.out.println("Digite seu sobrenome: ");
        Scanner entrada = new Scanner(System.in);
        String sobrenome = entrada.nextLine(); //String é uma classe e sobrenome é o objeto

        //if(sobrenome == "Pereira") { //No primeiro teste (string nome o nome pedro ja é adicionado e armazenado. No segundo exemplo ele vai ser adicionado pereira ele nao guarda numa variavel, ele guarda na memoria e depois adicionado na memoria em um local diferente e depois checar, por isso resulta diferente)
          if(sobrenome.equals("Pereira")){ // aqui compara o conteúdo das strings
            System.out.println("São iguais"); // se eu tivesse escrito String sobrenome = "Pedro", ai seriam iguais
        } else{
            System.out.println("São diferentes");
        }
        //sobrenome.equalsIgnoreCase("pereira"); //ignora maiusculo e minusculo

// Outros métodos
        String java = "Java"; //consigo cortar
        String ja = java.substring(0, 2); //começo no 0 e paro no 2 (2 não incluso). Pguei o ja
        String va = java.substring( 2); //cortar a partir do 2 até o final da string

        System.out.println(ja);
        System.out.println(va);


        String m1 = "Hello, ";
        String m2 = "world!, ";
        String m3 = m1.concat(m2); // m1 + m2
System.out.println(m3);
        System.out.println(java.length()); // quantos caracteres ela possui
        System.out.println(java.isEmpty()); //verifica se está vazia => ""
        System.out.println(java.toUpperCase()); //JAVA em caixa alta
        System.out.println(java.toLowerCase());// java em caixa baixa

        //Exemplo
        System.out.println("Digite seu nome: ");
        String seuNome = entrada.nextLine();

        if(seuNome.toUpperCase().equals("José")) {
            System.out.println("Seu nome é José");
        }

        String data = "13/10/2022";
        String[] valores = data.split( "/"); //["13", "10", "2022"]
        System.out.println(valores[0]);

        String email = "jose.almir@gmail.com";
        String[] valoresEmail = email.split( "@"); // ["jose.almir", "gmail.com"]
        System.out.println(valoresEmail[0]);

        String nome2 = "José Souza";
        String[] nomeSeparado = nome2.split( " ");
        System.out.println(nomeSeparado[0]);

        String teste = "Amanhã é sexta-feira";
        String[] teste2 = teste.split( "");
        System.out.println(teste2);
        System.out.println(Arrays.toString(teste2));


    }
}
