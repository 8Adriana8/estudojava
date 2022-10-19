package aulas_14_10_22.poo17_10;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.SortedMap;
import java.util.ArrayList;
public class Pessoa {// Abstrair, sim plificar
    //Propriedades/ atributos de uma pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

//Só o molde, qdo gerarmos um objeto dessa pessoa, ela tera essas prorpiedades

//variaveis criadas sem valor - As que sao primitivas ficam com valor 0 e as outras null ate receberem valor.

//Ações de uma Pessoa

    ArrayList<Pessoa> conhecidos = new ArrayList<>();

    Pessoa() {//construtor da classe
        //this -> representa o objeto

        this.nome = "José";
        this.sobrenome = "Carlos";
        this.idade = 29;
        this.peso = 55.0;
        this.altura = 1.65;

    }

    Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.dizOla();

    }

    Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = 0;
        this.altura = 0.5;
        this.peso = 2.0;
    }

    // Ações de uma Pessoa (métodos)
    // <tipo_retorno> nomeDoMetodo(PARAMETROS) {}
    void dizOla() {//metodo que nao retorna nada

        System.out.println("Olá, tudo bem? Meu nome é " + this.nome);
    }

    void mostrarImc() {
double imc = this.peso / (this.altura * this.altura);
        double imc = this.calculaImc();
System.out.println("O meu IMC é " + imc);
    }
    double calculaImc(){ //Deve retornar um valor .Se o valor for relevante, usar o return, se nao usa void.
        double imc = this.peso / (this.altura * this.altura);
        return imc;

    void comer(String comida){
        System.out.println("Estou comendo" + comida);
        this.peso += 1.5;
        }
        void cumprimentar(Pessoa pessoa){
        this.dizOla();
        pessoa.dizOla();

        if(!this.conhecePessoa(pessoa)){
            this.addPessoaNova(pessoa);
            pessoa.addPessoaNova(this); //this é o objeto que chama cumprimentar()
            }

        }
        void addPessoaNova(Pessoa pessoa){//faz o objeto "conhecer"
        System.out.println(this.nome + "conheceu" + pessoa.nome + "!!!")
       this.conhecidos.add(pessoa);
        }

        boolean conhecePessoa(Pessoa pessoa){
        //se true, a pessoa(this) conhece a outra pessoa
            //se false, não conhece
        return this.conhecidos.contains(pessoa);
        }
    }

}