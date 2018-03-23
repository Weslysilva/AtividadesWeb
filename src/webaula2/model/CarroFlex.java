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
public class CarroFlex extends Carro{
 
    
    private int combustivelAlcool;
    private int combustivelGasolina;

    public CarroFlex(String placa , int consumo ,int combustivelAlcool, int combustivelGasolina ) {
        super(placa, consumo);
        this.combustivelAlcool = combustivelAlcool;
        this.combustivelGasolina = combustivelGasolina;
    }

    @Override
    public double getKm() {
    
        return ( super.consumo * 0.7 * combustivelAlcool) + ( super.consumo * combustivelGasolina );
    
    }

    public int getCombustivelAlcool() {
        return combustivelAlcool;
    }

    public int getCombustivelGasolina() {
        return combustivelGasolina;
    }
    
    
    
    
}
