package com.mycompany.hojaejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n--- ACTIVIDADES PENDIENTES ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Mostrar tareas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese la tarea: ");
                    tareas.add(sc.nextLine());
                    System.out.println("Tarea agregada.");
                    break;

                case 2:
                    System.out.println("Tareas: " + tareas);
                    System.out.print("Ingrese el indice de la tarea completada: ");
                    int completada = sc.nextInt();

                    if (completada >= 0 && completada < tareas.size()) {
                        System.out.println("Tarea completada: " + tareas.get(completada));
                        tareas.remove(completada);
                    } else {
                        System.out.println("Indice no valido.");
                    }
                    break;

                case 3:
                    System.out.println("Tareas: " + tareas);
                    System.out.print("Ingrese el indice a eliminar: ");
                    int eliminar = sc.nextInt();

                    if (eliminar >= 0 && eliminar < tareas.size()) {
                        tareas.remove(eliminar);
                        System.out.println("Tarea eliminada.");
                    } else {
                        System.out.println("Indice no valido.");
                    }
                    break;

                case 4:
                    System.out.println("Tareas pendientes: " + tareas);
                    break;

                case 5:
                    System.out.println("Programa terminado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 5);
    }
}