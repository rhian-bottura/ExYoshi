/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista01;

/**
 *Crie uma classe Java que:
a) Seja executável
b) Solicite o login do cliente
c) Solicite a senha do cliente
d) Solicite a quantidade de vezes que o usuário aceita errar a senha antes do bloqueio
e) Exiba uma frase como esta: "Seu login é L e sua senha é S. Você tem T tentativas antes de ser bloqueado" Use interpolação
 * @author Rhian
 */
public class Ex07 {
    public static void main(String[] args) {
        String login = "Rhian01";
        String senha = "@admin123";
        Integer qtdeErro = 3;
        String msg = String.format("Seu login é %s e sua senha é %s. Você tem %d tentativas antes de ser bloqueado",login,senha,qtdeErro);
        System.out.println(msg);
    }
}
