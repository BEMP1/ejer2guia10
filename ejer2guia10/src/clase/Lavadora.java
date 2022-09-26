package clase;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    public double carga;

    public Lavadora() {
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double pesoKg) {
        super(precio, color, consumoEnergetico, pesoKg);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Lavadora lavadora = new Lavadora();
        lavadora.crearElectrodomestico();
        lavadora.setCarga(leer.nextDouble());
        while (lavadora.getCarga() < 0) {
            System.out.println("Se ingreso una carga menor a 0");
            lavadora.setCarga(leer.nextDouble());
        }
        return lavadora;
    }
    
    @Override
    public void precioFinal(Electrodomestico lavadora) {
        super.precioFinal(lavadora);
        if (carga>30) {
            precio = precio + 500;
        }
        
    }

}
