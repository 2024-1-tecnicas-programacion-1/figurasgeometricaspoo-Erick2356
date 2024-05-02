package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    public Triangulo(String nombre, String color,double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    public double obtenerArea(){
        double area = (base*altura)/2;

         return area;

    }

    public double obtenerPerimetro(){

        double perimetro= 

        return perimetro;

    }
    
    
}
