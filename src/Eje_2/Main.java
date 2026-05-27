package Eje_2;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
    /*
   Ejercicio 2: Historial de navegación usando Deque
Desarrollar un sistema simple de navegación web similar al botón “Atrás” y “Adelante”.
Requisitos
Utilizar Deque<String>.
Simular páginas visitadas.
Permitir:
--Agregar nuevas páginas.
--Retroceder.
--Avanzar.
--Mostrar el historial actual.
--Ejemplo de operaciones
--Visitar: Google
--Visitar: YouTube
--Visitar: Moodle
--Retroceder
--Avanzar
     */
    public static void main(String[] args) {
        Deque<String> historial = new LinkedList<>();

        // Visitar paginas (se agregan al frente)
        historial.addFirst("Google");
        System.out.println("Visitando: Google");

        historial.addFirst("YouTube");
        System.out.println("Visitando: YouTube");

        historial.addFirst("Moodle");
        System.out.println("Visitando: Moodle");

        System.out.println("\nPagina actual: " + historial.peekFirst());
        System.out.println("Historial: " + historial);

        // Retroceder: quitamos la actual y la guardamos por si queremos volver
        String paginaActual = historial.removeFirst();
        historial.addLast(paginaActual);
        System.out.println("\nRetroceder...");
        System.out.println("Pagina actual: " + historial.peekFirst());
        System.out.println("Historial: " + historial);

        // Avanzar: traemos de vuelta la ultima al frente
        String paginaAdelante = historial.removeLast();
        historial.addFirst(paginaAdelante);
        System.out.println("\nAvanzar...");
        System.out.println("Pagina actual: " + historial.peekFirst());
        System.out.println("Historial: " + historial);
    }
}
