package org.example.MODELOS;

import java.time.LocalDate;

public class Apartamento
{
    private Long id;
    private String direccion;
    private String numeroHabitaciones;
    private String estado;
    private LocalDate fechaConstruccion;
    private Double area;
    private Integer costo;


    public Apartamento()
    {

    }

    public Apartamento(Long id, String direccion, String numeroHabitaciones, Double area, Integer costo, String estado, LocalDate fechaConstruccion) {
        this.id = id;
        this.direccion = direccion;
        this.numeroHabitaciones = numeroHabitaciones;
        this.area = area;
        this.costo = costo;
        this.estado = estado;
        this.fechaConstruccion = fechaConstruccion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(String numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(LocalDate fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", numeroHabitaciones='" + numeroHabitaciones + '\'' +
                ", area=" + area +
                ", costo=" + costo +
                ", estado='" + estado + '\'' +
                ", fechaConstruccion=" + fechaConstruccion +
                '}';
    }
}
