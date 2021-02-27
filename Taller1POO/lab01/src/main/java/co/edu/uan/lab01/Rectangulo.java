package co.edu.uan.lab01;

public class Rectangulo extends Figura {

    private double lado1;
    private double lado2;
    private double Area;


    public Rectangulo() {

        System.out.println("Nuevo Rectangulo Creado");
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado) {
        this.lado1 = lado;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado) {
        this.lado2 = lado;
    }

    @Override
    public double area() {
        Area = lado1 * lado2;
        System.out.println("Soy un Rectangulo de Area: "+Area+" cm^2");

        if(lado1 == lado2){
            System.out.println("felicidades tienes un cuadrado");
        }
        return Area;
    }


    
}
