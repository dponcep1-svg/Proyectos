package com.mycompany.hojaejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> elementos = new ArrayList<>();

        System.out.println("Ingrese elementos. Escriba 'fin' para terminar.");

        while (true) {
            System.out.print("Elemento: ");
            String elemento = sc.nextLine();

            if (elemento.equalsIgnoreCase("fin")) {
                break;
            }

            elementos.add(elemento);
        }

        System.out.println("\nElementos ingresados:");

        for (String elemento : elementos) {
            System.out.println(elemento);
        }
    }
}