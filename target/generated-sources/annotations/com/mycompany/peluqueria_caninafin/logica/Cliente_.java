package com.mycompany.peluqueria_caninafin.logica;

import com.mycompany.peluqueria_caninafin.logica.Duenio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-02-05T19:54:24", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> num_duenio;
    public static volatile SingularAttribute<Cliente, String> nombre_perro;
    public static volatile SingularAttribute<Cliente, String> raza;
    public static volatile SingularAttribute<Cliente, String> color;
    public static volatile SingularAttribute<Cliente, String> alergico;
    public static volatile SingularAttribute<Cliente, String> observaciones;
    public static volatile SingularAttribute<Cliente, Duenio> unDuenio;
    public static volatile SingularAttribute<Cliente, String> atencion_especial;

}