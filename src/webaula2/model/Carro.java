/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webaula2.model;

import java.io.Serializable;

/**
 *
 * @author wesly
 */
public abstract class Carro implements Serializable{
    
    protected String placa;
    protected int consumo;
    
    public Carro(String placa, int consumo) {
        this.placa = placa;
        this.consumo = consumo;
    }
    
    public abstract double getKm();
    
    @Override
    public String toString() {
        
        return "Placa = " + this.placa + " Km = " + this.getKm();
    }
    
    public void imprimeKm(){
    
         System.out.println(this);
        
    }
    
}
