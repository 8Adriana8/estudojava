package aulas_14_10_22.correcao;

import java.util.Scanner;

public class Exercicio6_17_10 {


    public Class Circulo{
        double raio;
        String  cor;
        final double pi = 3.14;
    }

Circulo(){
        this.raio = 1.0;
        this.cor = "Azul";
}

    void calcula(){
    double calculaCirculo = 2 * (this.pi * this.raio);
        double conta = this.calculaCirculo();
        System.out.println("O circulo é " + conta);
    }
}
/*Boa tarde pessoal, seguem alguns exemplos que eu recomendo vocês tentarem como um reforço ao que vimos hoje:
Exercícios: Abstração, Métodos, Construtores e Atributos.

1) Crie uma classe Circulo que possui:
	* Atributos: raio, cor.
	* Construtores:
		- Cria circulos com base no parâmetro raio do construtor;
		- Cria círculos de raio 1;
	* Métodos:
		- calcularArea() => deve retornar double (PI * RAIO * RAIO)
		- calcularCircunferencia => deve retornar double (2 * PI * RAIO)
		- mudarRaio(double novoRaio) => deve alterar o valor do raio

2) Crie uma classe Empregado que possui:
	* Atributos: nome, sobrenome, salario
	* Construtores:
		- Cria empregados com base nos parâmetros nome, sobrenome e salario;
	* Métodos:
		- calcularSalarioAnual() => deve retornar double
		- aumentarSalario(double aumento) => aumenta o valor do salário
		- nomeCompleto() => deve retornar a concatenação do nome e sobrenome

3) Crie uma classe Autor que possui:
	* Atributos: nome, email;
	* Construtores:
		- Cria autores com base nos parâmetros nome e email;
	* Métodos:
		- alteraNome(String novoNome) => muda o nome atual do autor
		- alteraEmail(String novoEmail) => muda o email atual do autor

4) Crie uma classe Livro que possui:
	* Atributos: nome, autor, preco;
	* Construtores:
		- Cria livros com base nos parâmetros nome, autor(objeto da classe Autor), preco;

O importante aqui é tentarem fazer, pois só com prática o conceito da Abstração fica mais claro para vocês.*/