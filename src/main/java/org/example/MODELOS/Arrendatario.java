package org.example.MODELOS;

import java.time.LocalDate;

public class Arrendatario
{
    private Long id;
    private String nombre;
    private String telefono;
    private String email;
    private String ocupacion;
    private String cedula;
    private LocalDate fechaNacimiento;

    public Arrendatario()
    {
    }

    public Arrendatario(Long id, String nombre, String telefono, String email, String ocupacion, String cedula, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.ocupacion = ocupacion;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Arrendatario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", cedula='" + cedula + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}

