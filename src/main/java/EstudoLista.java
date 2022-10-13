import java.util.ArrayList; //importa isso para poder usar la em baixo


public class EstudoLista {
    public static void main(String[] args) {
//cria um novo ArrayList e guarda Integer
        ArrayList<Integer> numeros = new ArrayList<>();  // meu Array. Aqui nao da p usar essa sintaxe que é particular do js.
        ArrayList<String> nomes = new ArrayList<>(); // exemplos
        System.out.println(numeros);

        //lista vazia. Adicionar elementos:
        numeros.add(10); //equivale ao push do js
        numeros.add(20);
        numeros.add(1000);
        System.out.println(numeros); // 10   20    1000
        // System.out.println(numeros[2]); nao funciona aqui
        System.out.println(numeros.get(2)); // numeros [2]

        // Substituição : assim nao da: numeros[0] = 500;
        numeros.set(0, 500);

        System.out.println(numeros);
        //Remove o elemento na posição 0
        numeros.remove(0);
        System.out.println(numeros);

        numeros.add(1, 200); //adiciona o elemento na posição e move os demais.
        System.out.println(numeros);

        numeros.add(3, 200);
        System.out.println(numeros);
        System.out.println(numeros.size()); //array.length


        for (int i = 0; i < numeros.size(); i++) {  //size ao inves de length . comeca na posicao 0, 1, 2, 3 ate alcancar o tamanho do array
            System.out.println(numeros.get(i));
        }
        System.out.println("----------"); //vai de um em um atribui na var num e da o print, um por um. Dispensa usar o index.
        for (int numero : numeros) { //A var int num guarda cada um dos numeros, cada um na sua posicao. Pega posicao 0 e adiciona o valor, 1 e adiciona o valor(roda a funcao que esta entre chaves) e so para qdo chegar na ultima posicao. para cada valor dentro do array ele executa o codigo. sem rpecisar de index. Sem uma variavel de controle.
            System.out.println(numero);
        }
//perguntar para o array se ele tem algo dentro dele
        System.out.println(numeros.contains(500));//true = achou, false = não achou.

//se quer saber se existe um numero e saber a posicao dele
        System.out.println(numeros.indexOf(1000));

//se colocar um num que nao existe o java retorna -1
        System.out.println(numeros.indexOf(500));

        //mostra o array do PRIMEIRO encontrado
        System.out.println(numeros.indexOf(200));

//mostra o ultimo encontrado
        System.out.println(numeros.lastIndexOf(200));

    }
}
