package com.ejercicio04.alquiler;

import com.ejercicio04.barco.Barco;
import com.ejercicio04.barco_a_motor.BarcoAMotor;
import com.ejercicio04.velero.Velero;
import com.ejercicio04.yates.Yate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Alquiler {
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private int dniCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private char posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public void crearAlquiler(){

        System.out.println("Ingrese el nombre del cliente");
        nombre = sc.nextLine();

        System.out.println("Ingrese el dni del cliente");
        dniCliente = sc.nextInt();
        sc.nextLine();

        conseguirFechas();

        System.out.println("Elija la posicion de amarre (A-B-C-D)");
        posicionAmarre = sc.nextLine().charAt(0);

        System.out.println("Seleccione el tipo de bote a alquilar:\n" +
                "1- Barco\n" +
                "2- Barco a motor\n" +
                "3- Velero\n" +
                "4- Yate");
        switch (sc.nextInt()){
            case 1:
                barco = new Barco();
                break;
            case 2:
                barco = new BarcoAMotor();
                break;
            case 3:
                barco = new Velero();
                break;
            case 4:
                barco = new Yate();
                break;
        }
        barco.crearBarco();
    }

    private void conseguirFechas(){
        LocalDate[] fechas = new LocalDate[2];
        String regex = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$";

        String fecha;

        for (int i = 0; i < fechas.length; i++) {
            do{
                System.out.print(i == 0? "Ingrese la fecha de alquiler " : "Ingrese la fecha de devolucion del alquiler ");
                System.out.println("con el siguiente formato \"dd-mm-aaaa\"");
                fecha = sc.nextLine();
                if(!fecha.matches(regex)){
                    System.out.println("Error. Formato incorrecto.");
                }
            }while(!fecha.matches(regex));

            fechas[i] = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }
        
        fechaAlquiler = fechas[0];
        fechaDevolucion = fechas[1];
    }

    public void calcularAlquiler(){
        double total;
        long periodoAlquiler = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);

        total = periodoAlquiler * barco.valorModulo();

        System.out.println("El valor del alquiler por los " + periodoAlquiler +  " dias seleccionado es: " + total);
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "\n, nombre='" + nombre + '\'' +
                "\n, dniCliente=" + dniCliente +
                "\n, fechaAlquiler=" + fechaAlquiler +
                "\n, fechaDevolucion=" + fechaDevolucion +
                "\n, posicionAmarre=" + posicionAmarre +
                "\n, barco=" + barco +
                '}';
    }
}
