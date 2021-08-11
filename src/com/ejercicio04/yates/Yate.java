package com.ejercicio04.yates;

import com.ejercicio04.barco_a_motor.BarcoAMotor;

import java.util.Scanner;

public class Yate extends BarcoAMotor {
    private int camarotes;

    public Yate() {
    }

    @Override
    public void crearBarco() {
        super.crearBarco();

        System.out.println("Ingrese la cantidad de camarotes");
        camarotes = new Scanner(System.in).nextInt();
    }

    @Override
    public double valorModulo() {
        return super.valorModulo() + camarotes;
    }

    @Override
    public String toString() {
        return "Yate{" +
                "matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioFabricacion=" + anioFabricacion +
                ", potenciaCV=" + potenciaCV +
                ", camarotes=" + camarotes +
                '}';
    }
}
