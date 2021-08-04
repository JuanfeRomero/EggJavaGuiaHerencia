package com.ejercicio01.main;

import com.ejercicio01.animal.Animal;
import com.ejercicio01.caballo.Caballo;
import com.ejercicio01.gato.Gato;
import com.ejercicio01.perro.Perro;

/*
* Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
* La  clase  Animal  tendrá  como  atributos  el  nombre,  alimento,  edad  y  raza  del Animal.
* Crear  un  método  en  la  clase  Animal  a  través  del  cual  cada  clase  hija  deberá
* mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
* una clase Main que realice lo siguiente
* */
public class Main {
    public static void main(String[] args) {
        //-->Declaracion del objeto PERRO
        Animal perro = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro.alimentar();
        //-->Declaracion de otro PERRO
        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.alimentar();

        //-->Declaracion del objeto Gato
        Animal gato=new Gato("Pelusa","Galletas",15,"Siames");
        gato.alimentar();
        //-->Declaración del objeto Caballo
        Animal caballo=new Caballo("Spark","Pasto",25,"Fino");
        caballo.alimentar();

    }
}
