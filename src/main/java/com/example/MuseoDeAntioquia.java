package com.example;

public class MuseoDeAntioquia implements EspacioCultural {

    @Override
    public void mostrarHorario() {
        System.out.println("Museo de Antioquia abre de 10:00 AM a 5:30 PM.");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "No tiene costo.";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Actividad: Ver exposiciones de arte.");
    }

}