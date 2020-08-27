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
public class Ex02 {
    public static void main(String[] args) {
        String nome = "Rhian";
        Integer nasc = 2001;
        Integer idade = 2030 - nasc;
        String msg = String.format("Em 2030 você tera %d anos",idade);
        System.out.println(msg);
    }
}
