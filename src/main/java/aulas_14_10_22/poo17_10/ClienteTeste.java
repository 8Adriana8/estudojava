package aulas_14_10_22.poo17_10;

import java.time.LocalDate;
//Encapsulamento ->
//Escolhe quais atributos/métodos serão visíveis fora da classe
//public (padrao) -> visível para todos
//private -> os métodos/atributos são visiveis apenas na classe
//protected -> bem parecido com o private
public class ClienteTeste {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente(1, "Felipe", "José", LocalDate.of(1993, 5, 25), 1.85, 95.0);

       System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getNomeCompleto());
        cliente1.setAltura(50);
    }
}
