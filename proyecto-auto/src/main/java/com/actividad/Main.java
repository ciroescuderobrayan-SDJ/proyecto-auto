package com.actividad;

public class Main {
    public static void main(String[] args) {

        // primer auto
        Auto auto1 = new Auto();
        auto1.marca = "Toyota";
        auto1.modelo = "Corolla";
        auto1.color = "Rojo";
        auto1.velocidad = 0;

        // segundo auto
        Auto auto2 = new Auto();
        auto2.marca = "Chevrolet";
        auto2.modelo = "spark";
        auto2.color = "Blanco";
        auto2.velocidad = 0;

        // Acciones auto 1
        auto1.encender();
        auto1.acelerar(60);
        auto1.frenar(20);

        // Acciones auto 2
        auto2.encender();
        auto2.acelerar(40);

        // Mostrar información de ambos autos
        auto1.mostrarInformación();
        auto2.mostrarInformación();

    }
}