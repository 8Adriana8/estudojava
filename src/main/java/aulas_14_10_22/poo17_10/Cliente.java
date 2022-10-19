package aulas_14_10_22.poo17_10;

import java.time.LocalDate;

public class Cliente {

    private int id;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;

    Cliente(int id, String nome, String sobrenome, LocalDate dataNascimento, double altura, double peso) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    //Getter - Possibilitam a leituda dos atributos (somente leitura dos atributos privados, nao pode alterar)
    //Customizar a leitura dos valores
    // Sintaxe:
    public String getNome() {
        return this.nome;
    }

    // outro exemplo
    public String getSobrenome() {
        return this.sobrenome;
    }

    public String getNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }
    //Setter para alterar o valor. Setter nao retorna nada, é um void.
    //COMO o valor é alterado
    //Validar o novo valor e ver se faz sentido.

    public void setAltura(double altura){
        if(altura > 0 && altura < 2.51) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida. Atributo não modificado");
        }
    }
    public void setPeso(double novoPeso){
        this.peso = novoPeso;
    }
}