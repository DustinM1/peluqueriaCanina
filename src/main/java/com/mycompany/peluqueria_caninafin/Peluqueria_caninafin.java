
package com.mycompany.peluqueria_caninafin;
//Importa la igu(interfaz grafica de usuario) principal
import com.mycompany.peluqueria_caninafin.igu.Principal;

public class Peluqueria_caninafin {

    public static void main(String[] args) {
        //llama a la interfaz principal
      Principal menu = new Principal();
      //la hace visible
      menu.setVisible(true);
      //hace que aparezca en el centro de la pantalla
      menu.setLocationRelativeTo(null);
      
    }

}
