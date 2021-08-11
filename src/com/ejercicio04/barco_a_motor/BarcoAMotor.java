package com.ejercicio04.barco_a_motor;

import com.ejercicio04.barco.Barco;

import java.util.Scanner;

public class BarcoAMotor extends Barco {
    protected int potenciaCV;

    public BarcoAMotor() {
    }

    @Override
    public void crearBarco() {
        super.crearBarco();

        System.out.println("Ingrese la potencia del CV");
        potenciaCV = new Scanner(System.in).nextInt();
    }

    @Override
    public double valorModulo() {
        return super.valorModulo() + potenciaCV;
    }

    @Override
    public String toString() {
        return "BarcoAMotor{" +
                "matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioFabricacion=" + anioFabricacion +
                ", potenciaCV=" + potenciaCV +
                '}';
    }
}
