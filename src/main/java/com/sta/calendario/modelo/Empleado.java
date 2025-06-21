package com.sta.calendario.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import com.sta.calendario.anotaciones.*;

import lombok.*;

/**
 * Esto es un ejemplo de una entidad.
 * 
 * Siéntete libre de renombrarla, modificarla o borrarla a tu gusto.
 */

@Entity
@Getter @Setter

public class Empleado extends Identifiable {
	
	@Column(length=40) @Required
    private String nombre;

    /*------------- Colección a mostrar en calendario -------------*/
	
	@Calendarizado
    @OneToMany(mappedBy="empleado", cascade=CascadeType.ALL)
    private Collection<Vacaciones> vacaciones = new ArrayList<>();
}
