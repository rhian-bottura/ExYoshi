/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista01;

/**
 *Exercício 06 - Média Notas
Crie uma nova classe (Class) no projeto e:
a) Ela deve ser executável
b) Solicite o nome e duas notas ao usuário. 
* As notas são números reais. 
* c) Calcule a média entre as notas (Dica: é da mesma forma como se faz em JavaScript)
d) Exiba uma frase como esta: "Olá, NOME. Sua média foi de MEDIA" e) Use Interpolação com 1 casa decimal para a média
 * @author Rhian
 */
public class Ex06 {
    public static void main(String[] args) {
        String nome = "Rhian";
        Double n1 = 10.0;
        Double n2 = 9.75;
        Double media = (n1 + n2) / 2;
        String msg = String.format("Olá, %s. Sua média foi de %.2f", nome,media);
        System.out.println(msg);
    }
}
