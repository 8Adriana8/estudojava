package aulas_14_10_22;

public class Variaveis {
    //execucao do nosso programa JAVA.Tem q escrever dentro das chaves.
    public static void main(String[] args) {
        System.out.println("Hello, world!"); //equivale ao console.log
   // Variáveis no JAVA
   // fortemente tipado e estaticamente tipado (qdo da um tipo, vc nao muda mais)
   // let idade nao existe no JAVA .
   int idade = 20; // numero inteiro, sem casas decimais
   double salario = 4500.99; // dupla precisão. representa num decimal. tipo primeiro e depois nome da variavel
   float nota = 7.5f; //coloca f/F para aceitar. sufixo para float. tem metade da precisao de um double na questao de casas decimais
    //usamos float quando usamos bibliotecas mais antigas tipo 2005.
       /* //cada numero tem o chamado alcance - o double representa ate 15 casa decimais approx. O float menos */
 /**  int populacaoTerra = 7_900_000_000; // _ so facilita a visualizacao. Int vai ate 2bi.
   long populacaoTerra = 7_900_000_000l;// coloca o l/L no final do numero p o JAVA entender q é um numero */
   boolean  tarefaConcluida = false; //(true or false)
   int i = 1, j = 0, k = 1000; //multiplas variáveis
   String nomeCompleto = "José Almir"; //sempre aspas duplas

   int teste = 10;
   teste = 9; // reatribuição de valores é possível.

   final int teste2 = 200; //impossivel mudar o valor
   // teste2 = 1000;

        //Operadores
        int a = 10;
        int b = 5;

        int soma = a + b; // 15
        int subtracao = a - b; // 5
        int multiplicacao = a * b; // 50
        int divisao = a/b; // 2

        System.out.println("O resultado da soma é " + soma); //" O resultado da soma é 15"
        //A DIVISAO ENTRE DOIS INTEIROS RESULTA EM INTEIRO
        int sete = 7;
        int dois = 2;
        double dois2 = 2.0;
        System.out.println(sete / dois); //
        System.out.println(sete/dois2);
        double resultado2 = sete / dois2;
        System.out.println(resultado2);

        //Math
        double x = Math.sqrt(144); // square root raiz quadrada 12
        double y = Math.pow(5, 2); // 25
        System.out.println(Math.PI);
        // casting != converter a variável
        int pi2 = (int) Math.PI; // de 3.14556677... ele erde depois da virgula e fica inteiro
        System.out.println(pi2);

        double resultado3 = sete / (double) dois; // 7/2.0 = 3.5
        //casting serve para trasnformar um dos dois para double. Casting não é converter a variáv el , so o valor

        //Operadores 2

        int valor = 5;
        valor++; // incremento +1
        valor--; //decremento -1
        ++valor;
        valor += 10; // valor = valor + 10

        //Operadores relacionais

        boolean teste1 = 5 > 1; // true
        boolean teste3 = 5 < 2; // false
        boolean teste4 = 5 == 5; // true
        boolean teste5 = 5 != 1; // true
        boolean teste6 = 6 >= 6; // true
        boolean teste7 = 5 <= 9; // true
 //nao existe === aqui

        //Operadores Lógicos
        boolean teste8 = true && false; //false
        boolean teste9 = true || false; //true
        boolean teste10 = (5 > 10) && (10 < 5); // false
        boolean teste11 = (10 >= 0) || (1 < 5); // true
        boolean teste12 = (5 > 1); // true
        boolean teste13 = !teste12; //false pq inverte o valor. Antes era true e virou false



    }
}