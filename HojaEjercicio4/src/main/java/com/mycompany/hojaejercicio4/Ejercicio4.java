package com.mycompany.hojaejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> elementos = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar por indice");
            System.out.println("3. Mostrar elementos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese elemento: ");
                    elementos.add(sc.nextLine());
                    System.out.println("Elemento agregado.");
                    break;

                case 2:
                    if (elementos.isEmpty()) {
                        System.out.println("La lista esta vacia.");
                    } else {
                        System.out.println("Lista: " + elementos);
                        System.out.print("Ingrese el indice a eliminar: ");
                        int indice = sc.nextInt();

                        if (indice >= 0 && indice < elementos.size()) {
                            elementos.remove(indice);
                            System.out.println("Elemento eliminado.");
                        } else {
                            System.out.println("Indice no valido.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Elementos: " + elementos);
                    break;

                case 4:
                    System.out.println("Programa terminado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 4);
    }
}