package org.example;

import org.example.MODELOS.Apartamento;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("**********************************");
        System.out.println("Bienvenido a APARTAMENTOS LA VILLA");
        Scanner lea = new Scanner(System.in);
        Apartamento apartamento = new Apartamento();
        System.out.println("A continuación, deberá ingresar los datos del apartamento");
        System.out.println("**********************************");
        System.out.println();
        System.out.println("Digite la dirección del domicilio: ");
        apartamento.setDireccion(lea.nextLine());
        System.out.println("Digite el número de habitaciones que contiene: ");
        apartamento.setNumeroHabitaciones(lea.nextLine());
        System.out.println("Digite el estado del inmueble (AMUEBLADO/ SIN AMUEBLAR): ");
        apartamento.setEstado(lea.nextLine());
        System.out.println("Digite los metros cuadrados que contiene la vivienda: ");
        apartamento.setArea(lea.nextDouble());
        System.out.println("Digite el valor del inmueble: ");
        apartamento.setCosto(lea.nextInt());
        System.out.println("Año de construcción del inmueble: ");
        Integer year = lea.nextInt();

        System.out.println("Mes de construcción del inmueble: ");
        Integer mes = lea.nextInt();

        System.out.println("Día de construcción del inmueble: ");
        Integer dia = lea.nextInt();

        System.out.println("SU APARTAMENTO HA SIDO REGISTRADO :)");
        System.out.println("**********************************");
        System.out.println("\nGRACIAS!");
        System.out.println();

        apartamento.setFechaConstruccion(LocalDate.of(year,mes,dia));
        System.out.println(apartamento);




    }
}