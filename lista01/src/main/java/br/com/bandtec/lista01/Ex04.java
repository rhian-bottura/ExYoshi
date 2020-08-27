/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista01;

/**
 *
 * A. Seja executável. B. Solicite o valor unitário de um produto. C. Solicite a
 * quantidade vendida. D. Solicite o valor pago pelo cliente. E. Calcule e exiba
 * o troco com a seguinte frase. "Seu troco será de R$ X"
 * @author Rhian
 */
public class Ex04 {
    public static void main(String[] args) {
            Double prod = 23.5;
            Integer qtde = 4;
            Double total = prod * qtde;
            Double valorPago = 100.0;
            Double troco = valorPago - total;
            String msg = String.format("Seu troco será de R$%.2f",troco);
            System.out.println(msg);
    }
    
}
