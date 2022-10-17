package aulas_14_10_22.poo17_10;

public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ehFlex;
    int qtPortas;
    double combustivelAtual;
    double consumo;
boolean estaLigado; //atributo

    Carro(String modelo, String marca, int ano, boolean ehFlex, int qtPortas) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ehFlex = ehFlex;
        this.qtPortas = qtPortas;
        this.combustivelAtual = 30.0; //todos os carros comecam com 30L
        this.consumo = consumo;
        this.estaLigado = false; //todos os carros começam desligados
    }
    //Abastecer
    void abastecer(double total) { //parâmetros do método
        this.combustivelAtual += total; // this.combustivel = this.combustivelAtual + total;
    }
    // metodo: abastecer, viajar, ligar, desligar,
//ligar
    void ligar() {
        this.estaLigado = true;
    }
    //desligar
    void desligar() {
        this.estaLigado = false;
    }
    //viajar
    boolean viajar(String local, double distancia){
        //intencao do metodo é de tentar viajar , se conseguir true e se não, falso.
        if(!this.estaLigado){
            this.ligar();
        }
        //calcula quantos litros serão necessarios para a viagem
        double totalLitros = distancia / this.consumo;

        if(this.combustivelAtual - totalLitros > 0){
        this.combustivelAtual -= totalLitros;
        System.out.println("A viagem p/ " + local + "aconteceu. Sobrou " + this.combustivelAtual + " L");
        return true; //a viagem aconteceu
    } else{
        System.out.println("A viagem não foi possível. ");
        return false; //a viagem não foi possivel
    }

    }
    //No geral, a main serve para testar a classe
    public static void main(String[] args){
        Carro carro1 = new Carro("XY", "Ferrari", 2019, true, 4);
        Carro carro2 = new Carro("Z", "Ford", 2000, false, 2);

        //atributo laranja e método rosa
        System.out.println(carro1.combustivelAtual);
        carro1.abastecer(5);
        System.out.println(carro1.combustivelAtual);

        System.out.println(carro1.estaLigado);
        carro1.ligar();
        System.out.println(carro1.estaLigado);

        System.out.println(carro1.ano); // 2019
        carro1.ano = 2022;
        System.out.println(carro1.ano); // 2022

        boolean viajou = carro1.viajar("Fortaleza", 300);
        System.out.println(viajou);
    }


    }


