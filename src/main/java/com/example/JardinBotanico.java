package com.example;

public class JardinBotanico implements EspacioCultural {

    @Override
    public void mostrarHorario(){
        System.out.println("El jardin botanico abre de 8:00 AM a 5:00 PM.");
    }

    @Override
    public String obtenerRequisitoEntrada() {
       return "Precio: 8.000 COP.";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Atividad: Casa de las Mariposas Forjas Bolívar.");
    }
}