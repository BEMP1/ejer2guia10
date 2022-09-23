package clase;

import java.util.Scanner;

public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double pesoKg;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double pesoKg) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.pesoKg = pesoKg;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public void comprobarConsumoEnergetico(char consumo) {
        if (consumo != 'A' && consumo != 'B' && consumo != 'C' && consumo != 'D' && consumo != 'E' && consumo != 'F') {
            consumo = 'F';
        }
    }

    public void comprobarColor(String color) {
        if (!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("gris")) {
            color = "Blanco";
        }
    }

    public Electrodomestico crearElectrodomestico() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Electrodomestico electrodomestico = new Electrodomestico();
        electrodomestico.setPrecio(1000);
        System.out.println("Ingrese el color");
        electrodomestico.setColor(leer.next());
        electrodomestico.comprobarColor(electrodomestico.getColor());
        System.out.println("Ingrese el consumo electrico");
        electrodomestico.setConsumoEnergetico(leer.next().charAt(0));
        electrodomestico.comprobarConsumoEnergetico(electrodomestico.getConsumoEnergetico());
        System.out.println("Ingrese el peso en Kg");
        electrodomestico.setPesoKg(leer.nextDouble());
        while (electrodomestico.getPesoKg() < 0) {
            System.out.println("Se ingreso un peso menor a 0");
            electrodomestico.setPesoKg(leer.nextDouble());
        }

        return electrodomestico;
    }

    public void precioFinal(double precio, char consumo, double peso) {
        switch (consumo) {
            case 'A':
                precio = precio + 1000;
                break;
            case 'B':
                precio = precio + 800;
                break;
            case 'C':
                precio = precio + 600;
                break;
            case 'D':
                precio = precio + 500;
                break;
            case 'E':
                precio = precio + 300;
                break;
            case 'F':
                precio = precio + 100;
                break;
            default:
                System.out.println("Error al subir el precio en el consumo");
        }

        switch ((int) peso / 10) {
            case 1:
            case 2:
                precio = precio + 100;
                break;
            case 3:
            case 4:
            case 5:
                precio = precio + 500;
                break;
            case 6:
            case 7:
                precio = precio + 800;
                break;
            default:
                precio = precio + 1000;
        }

    }
}
