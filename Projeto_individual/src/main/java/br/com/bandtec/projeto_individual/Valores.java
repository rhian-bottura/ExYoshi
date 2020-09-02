/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.bandtec.projeto_individual;


/**
 *
 * @author Rhian
 */
public class Valores {
    //Método que gera a porcentagem para colocar na barra
    public double gerarPor(Double valor,Double maximo){
        Double p = ((maximo - (maximo - valor)) / maximo) * 100;
        return p;
    
    }
    // método que pega o maior numero
    public double maiorNum(Double valor,Double maior){
        if(maior == 0 ){
            maior = valor;
        }else{
            if(valor > maior){
                maior = valor;
            }
        
        
        }
        return maior;
    
    }
    // método que pega o menor numero
    public double menorNum(Double valor,Double menor){
        if(menor == 0 ){
            menor = valor;
        }else{
            if(valor < menor){
                menor = valor;
            }
        
        
        }
        return menor;
    
    }
}
