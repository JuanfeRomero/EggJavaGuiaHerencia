package com.ejercicio04.main;

import com.ejercicio04.alquiler.Alquiler;

public class Main {
    public static void main(String[] args) {
        Alquiler renta = new Alquiler();

        renta.crearAlquiler();

        renta.calcularAlquiler();

        System.out.println(renta);
    }
}
