package Eje_3.main;

import Eje_3.modelo.Paciente;
import java.util.PriorityQueue;

public class Main {
    /*Ejercicio 3: Sistema de prioridades hospitalarias usando PriorityQueue
Un hospital atiende pacientes según el nivel de gravedad y no por orden de llegada.

Requisitos
Crear una clase Paciente con:
--nombre
--prioridad
--Utilizar PriorityQueue<Paciente>.
--Implementar Comparable<Paciente> para ordenar por prioridad.
--Registrar al menos 6 pacientes.
--Mostrar el orden en que serán atendidos.

Prioridades
1 = Emergencia

2 = Urgente

3 = Consulta general
     */
    public static void main(String[] args) {
        PriorityQueue<Paciente> sala = new PriorityQueue<>();

        sala.offer(new Paciente("Juan", 3));
        sala.offer(new Paciente("Maria", 1));
        sala.offer(new Paciente("Carlos", 2));
        sala.offer(new Paciente("Ana", 3));
        sala.offer(new Paciente("Luis", 1));
        sala.offer(new Paciente("Sofia", 2));

        System.out.println("Orden de atencion:\n");

        int turno = 1;
        while (!sala.isEmpty()) {
            Paciente p = sala.poll();
            System.out.println(turno + ". " + p);
            turno++;
        }
    }
}