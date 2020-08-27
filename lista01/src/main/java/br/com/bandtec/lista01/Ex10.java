/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista01;

/**
 *Jorge Abe Estado começou a se exercitar e deseja saber quantas calorias vai perder nos
exercícios. Crie uma classe Java que:
a) Seja executável
b) Solicite ao usuário o tempo, em minutos (valor inteiro) que ele passou se aquecendo
c) Solicite ao usuário o tempo em minutos (valor inteiro) que ele fez exercícios aeróbicos
(correr, andar, pedalar etc)
d) Solicite ao usuário o tempo em minutos (valor inteiro) que ele fez exercícios de
musculação
e) Calcule quantas calorias o Jorge perdeu, sendo que: * cada minuto de aquecimento faz perder 12 calorias
* cada minuto de ex aeróbico faz perder 20 calorias
* cada minuto de musculação faz perder 25 calorias
f) Exiba, usando interpolação e apenas valores numéricos inteiros, uma frase como esta: "Olá, Jorge. Você fez um total de X minutos de exercícios e perdeu cerca de Y calorias"
 * @author Rhian
 */
public class Ex10 {
    public static void main(String[] args) {
        Integer aquecer = 10;
        Integer exercicio = 20;
        Integer muscula = 30;
        Integer total = aquecer + muscula + exercicio;
        Integer calculo = (aquecer * 12) + (exercicio * 20) + (muscula * 20);
        String msg = String.format("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias",total,calculo);
        System.out.println(msg);
    }
}
