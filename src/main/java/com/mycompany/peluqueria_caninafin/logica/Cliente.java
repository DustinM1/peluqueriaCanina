
package com.mycompany.peluqueria_caninafin.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cliente implements Serializable {
    
    //las notaciones van arriba del campo
    @Id
    //Para que la persona no escriba el numero y se genere de forma automatica usamos sequence(para que sea sequencial)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_duenio;
    private String nombre_perro;
    private String raza;
    private String color;
    private String alergico;
    private String atencion_especial;
    private String observaciones;
    
    //realizamos 1 a 1 con la clase Duenio
    // Duenio(hace referencia a la clase Duenio) y unDuenio es donde se va a guardar la informacion
    @OneToOne
    private Duenio unDuenio;
    
    //creamos constructor vacio
    public Cliente(){
        
    }
    
    //creamos constructor con parametros
    public Cliente(int num_duenio,String nombre_perro,String raza,String color,String alergico, String atencion_especial,String observaciones,Duenio unDuenio){
        this.num_duenio = num_duenio;
        this.nombre_perro = nombre_perro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.observaciones = observaciones;
        this.unDuenio = unDuenio;
    }
    //creamos los metodos get y set
    public int getNum_duenio(){
        return num_duenio;
    }
    public void setNum_duenio(int num_duenio){
        this.num_duenio = num_duenio;
    }
    //creamos los metodos get y set
    public String getNombre_Perro(){
        return nombre_perro;
    }
    public void setNombre_Perro(String nombre_perro){
        this.nombre_perro = nombre_perro;
    }
    //creamos los metodos get y set
        public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    //creamos los metodos get y set
        public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    //creamos los metodos get y set
        public String getAlergico(){
        return alergico;
    }
    public void setAlergico(String alergico){
        this.alergico = alergico;
    }
    //creamos los metodos get y set
        public String getAtencion_Especial(){
        return atencion_especial;
    }
    public void setAtencion_Especial(String atencion_especial){
        this.atencion_especial = atencion_especial;
    }
    //creamos los metodos get y set
        public String getObservaciones(){
        return observaciones;
    }
    public void setObservaciones(String observaciones){
        this.observaciones = observaciones;
    }
    
    public Duenio getUnDuenio(){
        return unDuenio;
    }
    public void setUn_Duenio(Duenio unDuenio){
        this.unDuenio = unDuenio;
    }
}
