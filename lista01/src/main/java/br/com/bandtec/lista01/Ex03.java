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
public class Ex03 {
    public static void main(String[] args) {
        Double limPeso = 200.0;
        Integer limPessoa = 10;
        Double p1 = 80.5;
        Double p2 = 83.5;
        Double p3 = 70.5;
        Double total = p1 + p2 + p3;
        String msg = String.format("Entraram 3 pessoas no elevador, no qual cabe %d pessoas.O peso total no elevador é de %.2f, sendo que ele suporta %.1f ", limPessoa,total,limPeso);
        System.out.println(msg);
    }
}
