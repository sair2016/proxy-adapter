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
public class ProxyHospital {
    Doctor DC = new Doctor();
    
     public void AgendarCita(){
        DC.agendarCita();
    }
    
    public void CancelarCita(){
        DC.cancelarCita();
    }
    
    public void Disagnostico(){
        DC.obtenerDiagnostico();
    }
}
