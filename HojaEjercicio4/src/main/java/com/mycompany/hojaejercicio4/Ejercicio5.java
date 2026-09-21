package com.mycompany.hojaejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Maria");
        nombres.add("Juan");
        nombres.add("Nicole");

        System.out.print("Ingrese un nombre para buscar: ");
        String nombre = sc.nextLine();

        if (nombres.contains(nombre)) {
            System.out.println("El nombre existe en la lista.");
        } else {
            System.out.println("El nombre NO existe en la lista.");
        }
    }
}