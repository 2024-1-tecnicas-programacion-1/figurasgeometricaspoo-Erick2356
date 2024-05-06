package com.mycompany.figurasgeometricaspoo;

public class Circulo extends FiguraGeometrica {
    private double radio;

// Complejidad O(1)
    public Circulo(String nombre, String color,double radio) {
        super(nombre, color);
        this.radio = radio;
    }



// Complejidad O(1)
    public double obtenerArea() {

         double area = Math.PI * Math.pow(radio, 2);

         return area;


    }

// Complejidad O(1)
    public double obtenerPerimetro() {

        double perimetro = 2 * Math.PI * radio;
        return perimetro;


}
}
