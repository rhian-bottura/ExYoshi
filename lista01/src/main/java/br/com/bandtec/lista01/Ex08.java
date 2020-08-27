/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista01;

/**
 *No país “Quisito” existe um benefício social chamado "Bolsa Filhos". Crie uma classe
Java que:
a) Solicite ao usuário quantos filhos de 0 a 3 anos possui. 
* b) Solicite ao usuário quantos filhos de 4 a 16 anos possui. 
* c) Solicite ao usuário quantos filhos de 17 a 18 anos possui. 
* d) Calcule o valor da Bolsa, sendo que o governo paga: 
* R$25,12 por filhos com menos de 4 anos
* R$15,88 por filhos entre 4 e 16 anos
* R$12,44 por filhos entre 17 e 18 anos
e) Exiba uma frase como esta: "Você tem um total de T filhos e vai receber R$B de bolsa" Use interpolação com 2 casas decimais para o valor da bolsa
 * @author Rhian
 */
public class Ex08 {
    public static void main(String[] args) {
        Integer filho03 = 3;
        Integer filho16 = 2;
        Integer filho18 = 1;
        Integer total = filho03 + filho16 + filho18;
        Double calculo = (filho03 * 25.12) + (filho16 * 15.88)+ (filho18 * 12.44);
        String msg = String.format("Você tem um total de %d filhos e vai receber R$%.2f de bolsa",total,calculo);
        System.out.println(msg);
    }
}
