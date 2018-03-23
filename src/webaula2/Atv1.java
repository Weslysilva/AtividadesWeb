/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webaula2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
public class Atv1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        
    String caminho = "/home/wesly/web2";
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
    ArrayList<Carro> listaCarro = new ArrayList<>();
    
    File diretorio = new File(caminho);
    diretorio.mkdir();

     try{
            FileInputStream Carro = new FileInputStream(caminho+"/carro.tmp");
               try (ObjectInputStream oE = new ObjectInputStream(Carro)) {
                   listaCarro = (ArrayList<Carro>) oE.readObject(); 
               } 
        }catch(FileNotFoundException ex){}
           
    //listaCarro=carregar(listaCarro, caminho);   
      
    impLista(listaCarro);
    
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

        
        salvar(listaCarro,caminho);
        impLista(listaCarro);
        
    }
    
    
    public static ArrayList carregar(ArrayList e, String caminho) throws IOException, ClassNotFoundException{
                 
          try{
            FileInputStream Carro = new FileInputStream(caminho+"/carro.tmp");
               try (ObjectInputStream oE = new ObjectInputStream(Carro)) {
                   e = (ArrayList<Carro>) oE.readObject(); 
               } 
        }catch(FileNotFoundException ex){}
           
        return e;
    
    }
    
    public static void salvar(ArrayList e, String caminho) throws FileNotFoundException, IOException{
    
        
        FileOutputStream Carro = new FileOutputStream(caminho+"/carro.tmp");
        try (ObjectOutputStream oE = new ObjectOutputStream(Carro)) {
            oE.writeObject(e);
            
        }
        
        
    
    }
  
    public static void impLista(ArrayList listaCarro){
    
         for (Iterator<Carro> iterator = listaCarro.iterator(); iterator.hasNext();) {
            Carro next = iterator.next();
            System.out.println(next.toString());
            
        }
        
    }
    
}
