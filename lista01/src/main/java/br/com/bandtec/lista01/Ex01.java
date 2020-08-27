/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista01;

/**
 *
 * @author Rhian
 */
public class Ex01 {
    public static void main(String[] args) {
        Double n1 = 8.0;
        Double n2 = 9.0;
        Double soma,sub,mult,div;
        soma = n1 + n2;
        sub = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;
        String mensagem = String.format("O resultado da soma:\n %.2f \n O resultado da subtração:\n %.2f \n "
                + "O resultado da Multiplicação:\n %.2f \n  O resultado da divisão:\n %.2f", soma,sub,mult,div);
        System.out.println(mensagem);
    }
}
