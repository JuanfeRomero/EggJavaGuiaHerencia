package com.ejercicio02.lavadora;

import com.ejercicio02.electrodomestico.Electrodomestico;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
        super();
    }

    public Lavadora(int precio, String color, char consumo, int peso, int carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", peso=" + peso +
                ", carga=" + carga +
                '}';
    }

    public void crearLavadora() {
        Scanner sc = new Scanner(System.in);
        super.crearElectrodomestico();

        System.out.println("Ingrese la capacidad de carga maxima de la lavadora en kilos");
        carga = sc.nextInt();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();

        if(carga > 30){
            precio += 500;
        }

        System.out.println("Precio final actualizado por ser Lavarropas: $" + precio);
    }
}
