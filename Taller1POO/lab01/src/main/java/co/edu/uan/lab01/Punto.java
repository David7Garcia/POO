package co.edu.uan.lab01;

public class Punto extends Figura {
    private double Area = 0.0;
    private double punto;

    public Punto() {

        System.out.println("Nuevo punto creado");
    }

    public double getPunto() {
        return punto;
    }

    public void setPunto(double punto) {
        this.punto = punto;
    }

    @Override
    public double area() {
        
        System.out.println("LOL recuerda que un punto no tiene Area");
        System.out.println("Soy un punto de area: "+Area+" cm");
        return Area;
    }
    
}
