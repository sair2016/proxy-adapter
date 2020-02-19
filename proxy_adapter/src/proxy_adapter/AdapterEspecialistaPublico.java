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
public class AdapterEspecialistaPublico extends Doctor{
 
    Especialista EP= new Especialista();
    
    
    @Override
    public void agendarCita(){
        EP.agendarDia();
    }
    
    
    @Override
    public void cancelarCita(){
        EP.cancelarDia();
    }
    
    @Override
    public void obtenerDiagnostico(){
        EP.obtenerTratemiento();
    }
}
