
package main;

import Controlador.ctrCalcular;
import Modelo.ConsultaCalcular;
import Modelo.Calcular;
import Vista.Panel;
import Vista.Login;
import Vista.elaces;
import static java.awt.Frame.MAXIMIZED_BOTH;


public class controlMain {
    

    
    public static void main(String[] args) {
        
        Calcular mod = new Calcular();
        ConsultaCalcular modC = new ConsultaCalcular();
        Panel frm = new Panel () ;
        elaces ee=new elaces();
        
        ctrCalcular ctrl = new ctrCalcular(mod,modC,frm);
        ctrl.iniciar();
        frm.setVisible(true);
  
        
    }
    
}
