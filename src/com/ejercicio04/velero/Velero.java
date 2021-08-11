package com.ejercicio04.velero;

import com.ejercicio04.barco.Barco;

import java.util.Scanner;

public class Velero extends Barco {
    private int mastiles;

    public Velero() {
    }

    @Override
    public void crearBarco() {
        super.crearBarco();

        System.out.println("Ingrese la cantidad de mastiles");
        mastiles = new Scanner(System.in).nextInt();
    }

    @Override
    public double valorModulo() {
        return super.valorModulo() + mastiles;
    }

    @Override
    public String toString() {
        return "Velero{" +
                "matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioFabricacion=" + anioFabricacion +
                ", mastiles=" + mastiles +
                '}';
    }
}
