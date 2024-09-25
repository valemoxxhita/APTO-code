package org.example.MODELOS;

import java.time.LocalDate;

public class Propietario
{
    private Long id;
    private String nombre;
    private String cedula;
    private String telefono;
    private String nacionalidad;
    private String numeroPropiedades;
    private LocalDate fechaNacimiento;

    public Propietario()
    {
    }

    public Propietario(Long id, String nombre, String cedula, String telefono, String nacionalidad, String numeroPropiedades, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.nacionalidad = nacionalidad;
        this.numeroPropiedades = numeroPropiedades;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNumeroPropiedades() {
        return numeroPropiedades;
    }

    public void setNumeroPropiedades(String numeroPropiedades) {
        this.numeroPropiedades = numeroPropiedades;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", numeroPropiedades='" + numeroPropiedades + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
