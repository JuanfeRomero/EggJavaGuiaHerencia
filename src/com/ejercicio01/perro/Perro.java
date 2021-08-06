package com.ejercicio01.perro;

import com.ejercicio01.animal.Animal;

public class Perro extends Animal {
    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentar() {
        System.out.println("El perro come lo que hay ");
    }
}
