
package com.mycompany.peluqueria_caninafin.logica;

import com.mycompany.peluqueria_caninafin.persistencia.ControladoraPersistencia;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String observaciones, 
            String color, String alergico, String atenEsp, String num_tel, String nombDuenio) {
       
        //Creamos el dueno y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombDuenio);
        duenio.setNum_tel(num_tel);
        
        //Creamos la mascota y asignamos sus valores
        Cliente masco = new Cliente();
        masco.setRaza(raza);
        masco.setAlergico(alergico);
        masco.setAtencion_Especial(atenEsp);
        masco.setColor(color);
        masco.setNombre_Perro(nombreMasco);
        masco.setObservaciones(observaciones);
        masco.setUn_Duenio(duenio);
       
        
       controlPersis.guardar(duenio,masco);
        
    }

    public List<Cliente> traerMascotas() {
        
        return controlPersis.traerMascotas();
 
    }

    public void borrarMascota(int num_duenio) {
        controlPersis.borrarMascota(num_duenio);
    }

    public Cliente traerMascota(int num_duenio) {
        return controlPersis.traerMascota(num_duenio);
    }

    public void modificarMascota(Cliente masco, String nombreMasco, String raza, String color, String observaciones, String alergico,
            String atenEsp, String num_tel, String nombDuenio) {
    
      masco.setNombre_Perro(nombreMasco);
      masco.setRaza(raza);
      masco.setColor(color);
      masco.setObservaciones(observaciones);
      masco.setAlergico(alergico);
      masco.setAtencion_Especial(atenEsp);
      
      //modifico la mascota(Cliente)
      controlPersis.modificarMascota(masco);
      
      //seteo nuevos valores del dueño
      Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
      dueno.setNum_tel(num_tel);
      dueno.setNombre(nombDuenio);
      
           //llamar al modificar Dueño
       this.modificarDuenio(dueno);
    }

    private Duenio buscarDuenio(int id_duenio) {
     return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }
}
