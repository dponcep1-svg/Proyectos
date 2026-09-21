package com.mycompany.hojaejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Ingrese 5 nombres:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres.add(sc.nextLine());
        }

        System.out.println("\nNombres almacenados:");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}