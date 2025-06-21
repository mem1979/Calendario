package com.sta.calendario.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.model.*;

import lombok.*;

/**
 * Esto es un ejemplo de una entidad.
 * 
 * Siéntete libre de renombrarla, modificarla o borrarla a tu gusto.
 */

@Entity @Getter @Setter
public class Vacaciones extends Identifiable {
	
	    private LocalDate fechaInicio;
	    private LocalDate fechaFin;

	    @Column(length=40)
	    private String motivo;

	    @ManyToOne
	    private Empleado empleado;
}
