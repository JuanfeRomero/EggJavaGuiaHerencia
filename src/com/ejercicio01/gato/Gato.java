package com.ejercicio01.gato;

import com.ejercicio01.animal.Animal;

public class Gato extends Animal {
    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentar() {
        System.out.println("El gato come atun");
    }
}
