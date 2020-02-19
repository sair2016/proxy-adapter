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
public class Proxy_adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ProxyHospital PH = new ProxyHospital ();
      
      PH.AgendarCita();
      PH.Disagnostico();
      PH.CancelarCita();
        System.out.println("");     
        System.out.println("Solicitando Especialista");
        System.out.println("");
      PH.DC= new AdapterEspecialistaPublico();  
       PH.AgendarCita();
       PH.Disagnostico();
       PH.CancelarCita();
// TODO code application logic here
    }
    
}
