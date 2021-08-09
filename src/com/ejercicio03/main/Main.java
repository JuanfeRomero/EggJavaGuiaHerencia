package com.ejercicio03.main;


import com.ejercicio03.lavadora.Lavadora;
import com.ejercicio03.televisor.Televisor;
import com.ejercicio03.electrodomestico.Electrodomestico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* Siguiendo el ejercicio anterior, en el main vamos a crear un arrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico.  Se  deberá  también  mostrar el precio  de cada  tipo  de objeto,
es  decir,  el  precio  de  todos  los  televisores,  por  un  lado,  el  de  las  lavadoras  por
otro, y al final, la suma del precio de todos los Electrodomésticos. Por ejemplo, si
tenemos una lavadora con un precio de 2000 y un televisor de 5000, el resultado
final  será  de  7000  (2000+5000)  para  electrodomésticos,  2000  para  lavadora  y
5000 para televisor.
* */
public class Main {
    public static void main(String[] args) {
        int sumaTelevisores = 0;
        int sumaLavarropas = 0;
        int sumaProductos = 0;

        List<Electrodomestico> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            if(i%2 == 0){
                Televisor tele = new Televisor(1000, "negro", 'A', 100, 47, true);
                System.out.println("***********Creando televisor***********");
                //tele.crearTelevisor();
                list.add(tele);
            }else{
                Lavadora lava = new Lavadora(2000, "blanco", 'F', 50, 20);
                System.out.println("***********Creando lavarropas***********");
                //lava.crearLavadora();
                list.add(lava);
            }
        }

        Iterator<Electrodomestico> it = list.iterator();

        int counter = 0;
        while (it.hasNext()){
            System.out.println("contador " + counter++);
            int precio;
            Electrodomestico elec = it.next();
            if(elec instanceof Televisor){
                Televisor tele = (Televisor) elec;
                tele.precioFinal();
                sumaTelevisores += tele.getPrecio();
                precio = tele.getPrecio();
            }else{
                Lavadora lava = (Lavadora) elec;
                lava.precioFinal();
                sumaLavarropas += lava.getPrecio();
                precio = lava.getPrecio();
            }
            sumaProductos += precio;
        }

        System.out.println("Valores finales\n" +
                "Suma Televisores: " + sumaTelevisores + "\n" +
                "Suma Lavarropas: " + sumaLavarropas + "\n" +
                "Suma total: " + sumaProductos);
    }
}
