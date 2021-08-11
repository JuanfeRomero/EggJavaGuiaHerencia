package com.ejercicio04.barco;

import java.util.Scanner;

public class Barco {
    protected String matricula;
    protected double eslora;
    protected int anioFabricacion;

    public Barco() {
    }

    public void crearBarco(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la matricula del barco");
        matricula = sc.nextLine();

        System.out.println("Ingrese la medida de la eslora en metros");
        eslora = sc.nextDouble();

        System.out.println("Ingrese el año de fabricación del barco");
        anioFabricacion = sc.nextInt();
    }

    public double valorModulo(){
        return eslora*10;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", anioFabricacion=" + anioFabricacion +
                '}';
    }
}
