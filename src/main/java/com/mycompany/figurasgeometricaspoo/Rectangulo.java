package com.mycompany.figurasgeometricaspoo;

public class Rectangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;

    public Rectangulo(String nombre, String color,double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
// Complejidad O(1)
    public double obtenerArea(){
        double area = lado1 * lado2;

         return area;

    }
// Complejidad O(1)
    public double obtenerPerimetro(){

        double perimetro= (lado1*2)+(lado2*2);

        return perimetro;

    }
    
    
}
