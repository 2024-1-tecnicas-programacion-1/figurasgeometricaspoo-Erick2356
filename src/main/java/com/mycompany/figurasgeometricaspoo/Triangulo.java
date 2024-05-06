package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    public Triangulo(String nombre, String color,double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }
// Complejidad O(1)
    public double obtenerArea(){
        double area = (base*altura)/2;

         return area;

    }
// Complejidad O(1)
    public double obtenerPerimetro(){

        double p= Math.sqrt(base*base+altura*altura);

        double perimetro = base+ 2*p;

        return perimetro;

    }
    
    
}
