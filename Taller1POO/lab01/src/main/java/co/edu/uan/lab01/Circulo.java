package co.edu.uan.lab01;

public class Circulo extends Figura {

    private double radio;
    private double Area;

    public Circulo() {
        System.out.println("Nuevo Circulo Creado");
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double area() {
        Area = Math.pow(this.radio, 2) * Math.PI;
        System.out.println("Soy un Circulo de Area: "+Area+"  cm^2");
        return Area;
    }
}
