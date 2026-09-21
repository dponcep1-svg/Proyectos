package com.mycompany.hojaejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> calificaciones = new ArrayList<>();

        System.out.print("Cuantas calificaciones desea ingresar: ");
        int cantidad = sc.nextInt();

        double suma = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese calificacion " + (i + 1) + ": ");
            double calificacion = sc.nextDouble();

            calificaciones.add(calificacion);
            suma += calificacion;
        }

        double promedio = suma / calificaciones.size();

        System.out.println("\nCalificaciones: " + calificaciones);
        System.out.println("Promedio: " + promedio);
    }
}