package ejer2guia10;

import clase.Lavadora;
import clase.Televisor;


public class Ejer2guia10 {

    public static void main(String[] args) {
        Lavadora lava1 = new Lavadora();
        lava1.crearLavadora(lava1);
        lava1.precioFinal(lava1);
        System.out.println(lava1.getPrecio());
        Televisor tele1 = new Televisor();
        tele1.crearTelevisor(tele1);
        tele1.precioFinal(tele1);
        System.out.println(tele1.getPrecio());
    }

}
