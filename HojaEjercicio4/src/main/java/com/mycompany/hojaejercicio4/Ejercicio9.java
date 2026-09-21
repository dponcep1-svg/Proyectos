package com.mycompany.hojaejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        System.out.print("Cuantos empleados desea ingresar: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        double suma = 0;

        for (int i = 0; i < cantidad; i++) {

            System.out.print("Nombre del empleado: ");
            String nombre = sc.nextLine();

            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            sc.nextLine();

            Empleado empleado = new Empleado(nombre, salario);
            empleados.add(empleado);

            suma += salario;
        }

        double promedio = suma / empleados.size();

        System.out.println("\n--- EMPLEADOS ---");

        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.nombre);
            System.out.println("Salario: " + empleado.salario);
        }

        System.out.println("\nPromedio de salarios: " + promedio);
    }
}