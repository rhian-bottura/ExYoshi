/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista01;

/**
 *a) A classe deve ser executável
b) O programa solicita o salário bruto
c) O programa calcula o desconto do INSS, que é sempre de 10% sobre o bruto
d) O programa calcula o desconto de IR, que é sempre de 20% sobre o bruto
e) O programa pergunta quanto custa a condução diária só de ida da casa para o trabalho. O desconto de VT é sempre o que o usuário gasta. Assim, calcula-se assim: Valor de
condução ida x 2 x 22. f) Calcule o salário líquido, que é o bruto menos os descontos de INSS, IR e VT
g) Exibam, usando interpolação e com os valores numéricos com 2 casas decimais, uma
frase como esta: "Seu bruto é R$A, tem um total de R$B em descontos e receberá um líquido de R$C"
 * @author Rhian
 */
public class Ex09 {
    public static void main(String[] args) {
        Double bruto = 2000.0;
        Double conducao = 4.0;
        Double desconto = (bruto * 0.1) + (bruto * 0.2) + (conducao *2 * 22);
        Double salario = bruto - desconto;
        String msg = String.format("Seu bruto é R$%.2f, tem um total de R$%.2f em descontos e receberá um líquido de R$%.2f",bruto,desconto,salario);
        System.out.println(msg);
        
        
    }
}
