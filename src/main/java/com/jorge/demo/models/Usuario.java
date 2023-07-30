package com.jorge.demo.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 3, max = 20)
    private String nombre;

    @Size(min = 3, max = 20)
    private String apellido;

    // usar String en lugar de Integer por si el numero tiene algun caracter
    @Size(min = 7, max = 14)
    private String telefono;

    @Size(min = 3, max = 100)
    private String email;

    @Size(min = 8, max = 30)
    private String password;

    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-DD hh:mm:ss")
    private Date created_at;

    @DateTimeFormat(pattern = "yyyy-MM-DD hh:mm:ss")
    private Date updated_at;

    public Usuario() {
    }

    public Usuario(String nombre,String apellido,String telefono,String email,String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
    }

    @PrePersist
    protected void onCreate(){
        this.created_at = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updated_at = new Date();
    }
    
}
