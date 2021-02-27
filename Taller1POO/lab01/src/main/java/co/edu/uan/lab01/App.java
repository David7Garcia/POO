package co.edu.uan.lab01;
import java.util.Scanner; 
import java.util.concurrent.TimeUnit;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws InterruptedException {
        boolean salir = true;
        String stringOpcion = "";
        String stringEntrada = "";
        String stringEntrada2 = "";
        System.out.println("Bienvenido");
        menutextos();
        Scanner sc = new Scanner(System.in);// Creación de un objeto Scanner
        do {
            
            stringOpcion = sc.nextLine(); // Invocamos un método sobre un objeto Scanner
            
            switch(stringOpcion){
                case "0":
                    salir = false;
                break;

                case "1":
                    Circulo Circulo = new Circulo();
                    System.out.println("Ingrese el valor del radio en centimetros para circulo");
                    stringEntrada = sc.nextLine(); // Invocamos un método sobre un objeto Scanner
                    if (stringEntrada != null && stringEntrada != "") {
                        Circulo.setRadio(Double.parseDouble(stringEntrada));
                        Circulo.area();
                    }
                    carga();
                    menutextos();
                break;
                
                case "2":
                    Rectangulo Rectangulo  = new Rectangulo();
                    System.out.println("Ingrese el valor de el primer lado en centimetros para Rectangulo");
                    stringEntrada = sc.nextLine(); // Invocamos un método sobre un objeto Scanner
                    System.out.println("Ingrese el valor de el segundo lado en centimetros para Rectangulo");
                    stringEntrada2 = sc.nextLine(); // Invocamos un método sobre un objeto Scanner
                    if (stringEntrada != null && stringEntrada != "") {
                        Rectangulo.setLado1(Double.parseDouble(stringEntrada));
                        Rectangulo.setLado2(Double.parseDouble(stringEntrada2));
                        Rectangulo.area();

                    }
                    carga();
                    menutextos();  
                break;

                case "3":
                    Punto Punto  = new Punto();
                    System.out.println("Ingrese el valor del radio en centimetros para Punto");
                    stringEntrada = sc.nextLine(); // Invocamos un método sobre un objeto Scanner
                    if (stringEntrada != null && stringEntrada != "") {
                        Punto.setPunto(Double.parseDouble(stringEntrada));
                        Punto.area();
                    }
                    carga();
                    menutextos();  
                break;



                default:
                System.out.println("Elija unicamente uno de los numeros de las opciones(1,2,3)");

            }   
        } while (salir);
        System.out.flush();
        System.out.println("gracias por usarme");
        sc.close();
    }
    /**
    * Metodo que solo imprime textos menu
    */
    public static void menutextos() {
        System.out.println("Por favor Seleccione la figura que desea utilizar");
        System.out.println("Figura no se deja como opcion debido a que ella se instancia cuando uno de sus hijos es invocado");      
        System.out.println("1. circulo");
        System.out.println("2. rectangulo");
        System.out.println("3. punto");
        System.out.println("0. Salir");
        System.out.println("por favor indique su numero de opcion");
    }

    public static void carga() throws InterruptedException {
        System.out.println("");
        System.out.println("Volviendo a el menu de opciones...");
        System.out.println("");
        TimeUnit.SECONDS.sleep(5);    
        System.out.println("--------------------------------------------------");
        System.out.println("");
    }

}
