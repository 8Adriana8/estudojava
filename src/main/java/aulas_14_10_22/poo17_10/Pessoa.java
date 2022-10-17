package aulas_14_10_22.poo17_10;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.SortedMap;

public class Pessoa {
    //Propriedades/ atributos de uma pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;
    //Só o molde, qdo gerarmos um objeto dessa pessoa, ela tera essas prorpiedades
//variaveis criadas sem valor - As que sao primitivas ficam com valor 0 e as outras null ate receberem valor.
//Ações de uma Pessoa

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

    }

    Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = 0;
        this.altura = 0.5;
        this.peso = 2.0;
    }

    // Ações de uma Pessoa (métodos)
    void dizOla() {
        System.out.println("Olá, tudo bem? Meu nome é " + this.nome);
    }

    void mostrarImc() {
double imc = this.peso / (this.altura * this.altura);
System.out.println("O meu IMC é " + imc);
    }
    double calculaImc(){ //Deve retornar um valor .Se o valor for relevante, usar o return, se nao usa void.
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }

}