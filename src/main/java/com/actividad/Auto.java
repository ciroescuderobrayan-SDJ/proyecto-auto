package com.actividad;

public class Auto {

    // Atributos
    public String marca;
    public String modelo;
    public String color;
    public int velocidad;

    // Metodo para encender el auto
    public void encender() {
        System.out.println("El auto esta encendiendo");
    }

    // Metodo para acelerar el auto
    public void acelerar(int aumento) {
        velocidad += aumento;
        System.out.println("El auto acelero a " + velocidad + " km/h");
    }

    // Metodo para frenar el auto
    public void frenar(int reduccion) {
        velocidad -= reduccion;
        if (velocidad < 0) {
            velocidad = 0;
        }
        System.out.println("El auto frena. velocidad actual " + velocidad + " km/h");

    }

    // Metodo para mostrar información//

    public void mostrarInformación() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("-----------------------------");
    }

}