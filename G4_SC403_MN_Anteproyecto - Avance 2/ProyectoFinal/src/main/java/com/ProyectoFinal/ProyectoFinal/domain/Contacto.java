package com.ProyectoFinal.ProyectoFinal.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="contacto")

public class Contacto implements Serializable {
    
    private static final long serialVersionUID= 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="correo")
    private int correo;
    @Column(name="mensaje")
    private String mensaje;

     
}