package aulas_14_10_22;//Enums são estruturas com constantes definidas.
//Dias da semana, Meses do ano, Turnos do dia, estações
//Níveis (junior, pleno, senior), feriados nacionais. nipes de cartas

public class EstudoEnums {
public static void main(String[] args){
    enum DiaDaSemana {
    SEGUNDA,              //O CONTEÚDO NAO É SEMPRE MAIUSCULO.
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO,
}
DiaDaSemana hoje = DiaDaSemana.QUINTA; // a variavel assume o valor de um dos valores. Tipo, nome e valor . enum.constante
System.out.println(hoje); //aplicacao- delimitar valores para a variavel

enum NivelDev { JUNIOR, PLENO, SENIOR}
NivelDev nivel = NivelDev.PLENO;

switch(nivel) {
    case JUNIOR:
 System.out.println("Seu nivel é junior");
 break;
    case PLENO:
 System.out.println("Seu nivel é pleno");
 break;
    case SENIOR:
 System.out.println("Seu nível é senior");
 break; //nem precisou do default pq tem que ser um desses.
}
// Versão enhanced
    switch(nivel) {
    case JUNIOR -> {
        System.out.println("Seu nível é junior");
    }
    case PLENO -> {
        System.out.println("Seu nível é pleno!");
    }
case SENIOR -> {
    System.out.println("Seu nível é senior");
}
default -> {
    System.out.println("Nunca executa");
}


}




}
}
