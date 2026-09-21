package com.mycompany.hojaejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();

        System.out.print("Cuantos numeros desea ingresar: ");
        int cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            numeros.add(sc.nextInt());
        }

        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }

        System.out.println("\nLista original: " + numeros);
        System.out.println("Numeros pares: " + pares);
    }
}