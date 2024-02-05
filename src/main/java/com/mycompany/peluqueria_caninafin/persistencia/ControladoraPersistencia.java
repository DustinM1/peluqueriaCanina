package com.mycompany.peluqueria_caninafin.persistencia;

import com.mycompany.peluqueria_caninafin.logica.Cliente;
import com.mycompany.peluqueria_caninafin.logica.Duenio;
import com.mycompany.peluqueria_caninafin.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    DuenioJpaController duenioJpa = new DuenioJpaController();
    ClienteJpaController clienteJpa = new ClienteJpaController();

    public void guardar(Duenio duenio, Cliente masco) {
       
        //Crear en la BD el Dueño
        duenioJpa.create(duenio);
        
        //Crear en la BD la mascota
        clienteJpa.create(masco);
        
    }

    public List<Cliente> traerMascotas() {
        
        return clienteJpa.findClienteEntities();
                
    }

    public void borrarMascota(int num_duenio) {
        try {
            clienteJpa.destroy(num_duenio);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente traerMascota(int num_duenio) {
        return clienteJpa.findCliente(num_duenio);
    }

    public void modificarMascota(Cliente masco) {
        try {
            clienteJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id_duenio) {
        return duenioJpa.findDuenio(id_duenio);
    }

    public void modificarDuenio(Duenio dueno) {
        try {
            duenioJpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
