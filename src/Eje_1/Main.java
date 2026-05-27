package Eje_1;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    /*
Ejercicio 1: Gestión de turnos en un banco usando Queue y LinkedList
Una sucursal bancaria atiende clientes en orden de llegada.
Requisitos
Crear una cola de clientes utilizando Queue<String>.
Implementar la cola usando LinkedList.
Agregar al menos 8 clientes.
Mostrar:
--Cliente en espera.
--Cliente atendido.
--Cantidad de clientes restantes.
--Atender clientes hasta vaciar la cola.
 */
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        cola.offer("Juan");
        cola.offer("Maria");
        cola.offer("Carlos");
        cola.offer("Ana");
        cola.offer("Luis");
        cola.offer("Sofia");
        cola.offer("Pedro");
        cola.offer("Laura");

        System.out.println("Clientes en la cola: " + cola);
        System.out.println("Total: " + cola.size());
        System.out.println();

        while (!cola.isEmpty()) {
            System.out.println("En espera: " + cola.peek());
            String atendido = cola.poll();
            System.out.println("Atendido: " + atendido);
            System.out.println("Restantes: " + cola.size());
            System.out.println();
        }

        System.out.println("Ya no hay clientes.");
    }
}
