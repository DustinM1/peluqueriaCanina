
package com.mycompany.peluqueria_caninafin.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_duenio;
    private String nombre;
    private String num_tel;
    
    //creamos constructor vacio
     public Duenio(){
         
     }
     
     //creamos constructor con parametros
      public Duenio(int id_duenio,String nombre,String num_tel){
         this.id_duenio = id_duenio;
         this.nombre = nombre;
         this.num_tel = num_tel;
     }
      
      //creamos los metodos get y set
      public int getId_duenio(){
          return id_duenio;
      }
      public void setId_duenio(int id_duenio){
          this.id_duenio = id_duenio;
      }
       public String getNombre(){
          return nombre;
      }
      public void setNombre(String nombre){
          this.nombre = nombre;
      }
       public String getNum_tel(){
          return num_tel;
      }
      public void setNum_tel(String num_tel){
          this.num_tel = num_tel;
      }

  
}
