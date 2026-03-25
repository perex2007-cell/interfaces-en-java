package com.example;

public class ParqueExplora implements EspacioCultural {

    @Override
    public void mostrarHorario() {
        System.out.println("Parque Explora abre de 8:30 AM a 4:00 PM.");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "Precio: 181.300 COP";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Actividad: Plan Familiar.");
    }

}