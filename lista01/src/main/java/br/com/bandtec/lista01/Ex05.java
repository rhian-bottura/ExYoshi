/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista01;

/**
 *Crie uma classe chamada “CalculadoraSalario” Java que:
A. Seja executável. 
* B. Solicite que o usuário digite o seu salário. 
* C. Solicite a porcentagem de imposto que o usuário deverá pagar.
* D. Exiba o valor do salário líquido. Por exemplo:
Se o salário for 1000,00, e o imposto for de 20%, o salário 
 * @author Rhian
 */
public class Ex05 {
    public static void main(String[] args) {
        Double salario = 1000.00;
        Double imposto = 20.0;
        Double liquido =salario - ( salario * (imposto / 100));
        String msg = String.format("Salario liquido é R$%.2f",liquido);
        System.out.println(msg);
    }
}
