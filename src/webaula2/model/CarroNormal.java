/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webaula2.model;

/**
 *
 * @author wesly
 */
public class CarroNormal extends Carro {

    int combustivel;

    public CarroNormal(String placa, int consumo, int combustivel) {
        super(placa, consumo);
        this.combustivel = combustivel;
    }
    
    public CarroNormal(String placa, int combustivel) {
        this(placa, 10, combustivel);
    }

    
    
    @Override
    public double getKm() {
        return this.consumo * this.combustivel;
    }
    
}
