package Eje_4;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
    /*
    Ejercicio 4: Gestión de tareas pendientes usando Deque y LinkedList
Una aplicación administra tareas pendientes donde algunas tareas son urgentes.

Requisitos
Crear un Deque<String> usando LinkedList.

Agregar:
--tareas normales al final
--tareas urgentes al inicio
--Mostrar el orden de ejecución.
--Procesar tareas una por una.

Ejemplo
--Normal: Revisar correos
--Normal: Actualizar reporte
--Urgente: Reiniciar servidor
--Urgente: Resolver caída del sistema
     */
    public static void main(String[] args) {
        Deque<String> tareas = new LinkedList<>();

        // Tareas normales al final
        tareas.offerLast("Revisar correos");
        tareas.offerLast("Actualizar reporte");

        // Tareas urgentes al inicio
        tareas.offerFirst("Reiniciar servidor");
        tareas.offerFirst("Resolver caida del sistema");

        System.out.println("Orden de ejecucion: " + tareas);
        System.out.println();

        // Procesar una por una
        int n = 1;
        while (!tareas.isEmpty()) {
            String tarea = tareas.pollFirst();
            System.out.println(n + ". Ejecutando: " + tarea);
            n++;
        }

        System.out.println("\nNo quedan tareas.");
    }
}