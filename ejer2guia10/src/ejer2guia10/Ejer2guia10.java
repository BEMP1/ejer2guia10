package ejer2guia10;

import clase.Televisor;


public class Ejer2guia10 {

    public static void main(String[] args) {
        Televisor lava1 = new Televisor();
        lava1.crearTelevisor(lava1);
        lava1.precioFinal(lava1);
        System.out.println(lava1.getPrecio());
    }

}
