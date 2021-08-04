package com.ejercicio01.caballo;

import com.ejercicio01.animal.Animal;

public class Caballo extends Animal {
    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentar() {
        System.out.println("El caballo come manzana");
    }
}
