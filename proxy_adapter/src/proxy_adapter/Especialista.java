/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy_adapter;

/**
 *
 * @author Wilmer Sair Ramos
 */
public class Especialista {
    public void obtenerTratemiento(){
        System.out.println("TRATAMIENTO DICTADO");
        
    }
    
    public void agendarDia(){
        System.out.println("Tratamiento agendado");
    }
    
    public void cancelarDia(){
        System.out.println("Tratamiento Cancelado");
    }
}
