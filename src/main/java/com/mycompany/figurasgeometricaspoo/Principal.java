package com.mycompany.figurasgeometricaspoo;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
         System.out.println("Ingrese el nombre de la figura");
         String figura = e.nextLine();
         System.out.println("Ingrese el color de la figura");
         String color = e.nextLine();
         System.out.println("Ingrese el tipo de  figura \n1: Circulo \n2: Rectángulo \n3: Triángulo ");
         int tipof = e.nextInt();

         switch (tipof) {
            case 1:
            System.out.println("Ingrese el radio del circulo");
                double radio = e.nextDouble();
                Circulo c = new Circulo(figura, color, radio);
                System.out.println("El area del circulo es: " + c.obtenerArea());
                System.out.println("El perimetro del circulo es " + c.obtenerPerimetro());
                break;

                case 2:
                System.out.println("Ingrese el valor del lado 1 del rectángulo");
                double lado1 = e.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo");
                double lado2 = e.nextDouble();
                Rectangulo r = new Rectangulo(figura, color, lado1, lado2);
                System.out.println("El area del rectángulo es: " + r.obtenerArea());
                System.out.println("El perimetro del rectángulo es: " + r.obtenerPerimetro());
                break;

                case 3:
                System.out.println("Ingrese el valor de la base del triángulo");
                double base = e.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo");
                double altura = e.nextDouble();
                Triangulo t = new Triangulo(figura, color, base, altura);
                System.out.println("El area del triángulo es: " + t.obtenerArea());
                System.out.println("El perimetro del triángulo es: " + t.obtenerPerimetro());
                break;

                default:
                System.out.println("Opción no válida");
                break;


        
    }

}
}