/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webaula2;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import webaula2.model.Carro;
import webaula2.model.CarroFlex;
import webaula2.model.CarroNormal;

/**
 *
 * @author wesly
 */
public class WebAula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Carro> listaCarro = new ArrayList<>();
        
        
        
        String placa;
        int consumo = 0;
        int combustivel = 0;
        int gasolina = 0;
        int alcool = 0;
        
        Scanner ler = new Scanner(in);
        
        placa = ler.nextLine();
        try {
               consumo = ler.nextInt();
               combustivel = ler.nextInt();
               
               Carro c1 = new CarroNormal(placa,consumo,combustivel);
               c1.imprimeKm();
               listaCarro.add(c1);
        
        } catch (Exception e) {
            System.err.print("Informe um numero inteiro");
        
        }
        
        placa = ler.next();
        try {
            consumo = ler.nextInt();
            combustivel = ler.nextInt();       
            alcool = ler.nextInt();
            gasolina = ler.nextInt();
        
            Carro c2 = new CarroFlex(placa,consumo,alcool,gasolina);
            c2.imprimeKm();
            listaCarro.add(c2);
      
             try {
                 System.out.println( ((CarroFlex)c2).getCombustivelAlcool()) ;
                 System.out.println( ((CarroFlex)c2).getCombustivelGasolina()) ;
      
             } catch (Exception e) {
        
             }
             
        } catch (Exception e) {
        
            e.printStackTrace();
            System.err.println("Informe um numero inteiro");
        }
        
        
        for (Iterator<Carro> iterator = listaCarro.iterator(); iterator.hasNext();) {
            Carro next = iterator.next();
            System.out.println(next.toString());
            
        }

    }
    
}
