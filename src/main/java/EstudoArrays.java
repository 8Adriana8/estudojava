import java.util.Scanner;

public class EstudoArrays {
    public static void main(String[] args){
        int[] numeros = {1, 2, 3, 4, 5}; //nunca vai poder guardar string, pq é int. No array classico nao tem cmo adicionar valores. Consigo alterar valores mas nao adicionar ou diminuir.

        for(int i = 0; i < numeros.length; i++) { // o i vai do 0 ao 4. A posicao inicial é 0. nesse tem 4 posicoes.
            System.out.println("Aposição " + i + "com valor de " + numeros[i]);
        System.out.println(numeros.length); //tamanho do array
        numeros[3] = 1000; //substitui
        // System.out.println(numeros[3]); // pegar array na posicao 3

        }
        //posso criar um array sem valores.
        int[] numeros2 = new int[50]; // 0...49
        numeros2[0] = 500;
        numeros2[1] = -200;
        //...
        numeros2[49] = 1;

        double[] notas = new double[5];
        String[] nomes= {"Jose", "Renato", "Victor"};
        String[] sobrenomes = new String[10];

        Scanner entrada = new Scanner(System.in);

        //System.out.println(">Digite um número: ");
        //int quantidade =entrada.nextInt();
        //boolean[] valores = new boolean[quantidade];

        //Exemplo
        System.out.println("Digite o total de notas: ");
        int totalNotas = entrada.nextInt(); //5
        //entrada.nextLine();

        double[] notasProva = new double[totalNotas]; // cria o array c espacos....0..4

        for(int i = 0; i < totalNotas; i++) {
            System.out.println("Digite o valor da nota:");
            notasProva[i] = entrada.nextDouble();
        }
        double soma = 0.0;
        for(double nota : notasProva) { //Para cada nota que tem aqui dentrto (notasProva) ele executa. Se tiverem 3 notas, ele executa 3 vezes. Vantagem de nao ter que declarar todo o index de novo
         soma += nota;
         }
        double media = soma / notasProva.length;

        //condição ternária : coloca uma condicao e se essa condicao for Verdadeira, o primeiro texto é usao, se nao o segundo texto é usado
        String mensagem = (media < 7) ? "Voce esta reprovado" : "Voce esta aprovado";
        System.out.println(mensagem);

        //Default values (primitivos valor 0, nao primitivos null(ausencia de um objeto))
        int numero; // qdo vc cria variavel e nao da valor p ela ->java tenta achar uma solução e da um valor 0. 2 tipos de variáveis o java da um valor padrão se eu nao der valor p ele.
        double nota2; // padrão = 0.0
        long populacao; // padrão = 0
        boolean teste; // = false
        //Classe String
        String nome; // null -> ausência de objeto na variável.

        //Wrapper classes ->null
        Integer numero2 = 1; //classe que representa o int.
        double nota3 = 1.0;
        Long pop2 = 1L;
        Boolean teste2 = false;

    }
}
