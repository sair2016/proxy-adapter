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
public class Doctor {
    public void agendarCita(){
        System.out.println("cita agentada");
    }
    
    public void cancelarCita(){
        System.out.println("cita cancelada");
    }
    
    public void obtenerDiagnostico(){
        System.out.println("Diagnostico dado");
    }
}
