/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.bandtec.projeto_individual;

import java.util.Random;

/**
 *
 * @author Rhian
 */
public class Valores {
    Random rand = new Random();
    Double cpu;
    Double disco;
    Double memoria;
    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public Double getCpu() {
        return cpu;
    }

    public void setCpu(Double cpu) {
        this.cpu = cpu;
    }

    public Double getDisco() {
        return disco;
    }

    public void setDisco(Double disco) {
        this.disco = disco;
    }

    public Double getMemoria() {
        return memoria;
    }

    public void setMemoria(Double memoria) {
        this.memoria = memoria;
    }
    public void aleatorio(){
        cpu = (rand.nextDouble() * 3) + 1;
        disco = (rand.nextDouble() * 998) + 1;
        memoria = (rand.nextDouble() * 7) + 1;
        
        
    }
    public double gerarPor(Double valor,Double maximo){
        Double p = ((maximo - (maximo - valor)) / maximo) * 100;
        return p;
    
    }
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
