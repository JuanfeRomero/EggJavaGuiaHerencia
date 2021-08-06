package com.ejercicio02.main;


import com.ejercicio02.lavadora.Lavadora;
import com.ejercicio02.televisor.Televisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Televisor tele = new Televisor();
        System.out.println("***********Creando televisor***********");
        tele.crearTelevisor();
        tele.precioFinal();

        Lavadora lava = new Lavadora();
        System.out.println("***********Creando lavarropas***********");
        lava.crearLavadora();
        lava.precioFinal();
    }
}
