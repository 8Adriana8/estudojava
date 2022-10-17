package aulas_14_10_22;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // variavel do tipo scanner, precisa importartuma das diversas formas de ler JAVA

        System.out.println("Qual seu nome?");
        String nome = entrada.nextLine(); //eu leio a proxima linha q o usuario digitar

        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Qual sua altura em metros? ");
        double altura = entrada.nextDouble(); //no brasil, numeros decimais tem virgula. Isso q o scanner acha. se colocarmos com . ele nao acha

        System.out.println("Qual seu peso? (kg)");
        double peso = entrada.nextDouble();

        // Calcule o IMC = PESO / ALTURA ^ 2
        double imc = peso / Math.pow(altura, 2);

        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos ! ");
        System.out.println("Este é o seu IMC = " + imc); // ln pula uma linha
        System.out.printf("Este é o seu IMC = %.2f \n ", imc); // esse %.2f ele mostra com 2 casas decimais //print f nao pula linha. Se quiser pular coloque \n
        System.out.printf("Olá, meu nome é %s e tenho %d anos e meu IMC é \n", nome, idade);

        //tabela: https://www.calculoimc.com.br/tabela-de-imc

        if (imc < 17) {
           System.out.println("Muito abaixo do peso");
        } else if (imc > 17 && imc <= 18.49) {
           System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.99) {
           System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Acima do peso");
        } else if(imc >= 30 && imc <= 34.99) {
            System.out.println("Obesidade I");
        } else if(imc >= 35 && imc <= 39.99) {
            System.out.println("Obesidade II (severa)");
        } else {
        System.out.println("Obesidade III mórbida.");
        }

 // Switch-case
        System.out.println("Selecione uma dieta(1 a 3)");
        System.out.println("1-Agua");
        System.out.println("2- Fruta");
        System.out.println("3-Batata");
        int dieta = entrada.nextInt(); //ele digita

        //escolha
        switch(dieta){
        case 1:
             System.out.println("Você escolheu a dieta 1");
        break; //impedir de testar as condições abaixo
        case 2:
             System.out.println("Você escolheu a dieta 2");
        break;
        case 3:
             System.out.println("Voce escolheu a dieta 3");
        default: //""else""
             System.out.println("Esta dieta nao existe!");
        }
        //Laço de repetição
        System.out.println("Você tem quantos alimentos preferidos?");
        int totalAlimentos = entrada.nextInt();

        for(int  i = 0; i < totalAlimentos ; i++){
            System.out.println(i);
        }
        int i = 0;
        while(i < totalAlimentos){
            System.out.println(i);
            i++;

        }
        System.out.println(i);

        }
        }