
import java.util.Scanner;

class calculadora{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Elija operacion");
        System.out.println("(1) Adicion");
        System.out.println("(2) Substraccion");
        System.out.println("(3) Multiplicacion");
        System.out.println("(4) Division");

        int eleccion = scan.nextInt();

        System.out.println("Ingrese dos numeros");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if(eleccion==1){
            System.out.println("La respuesta es: " + adicion(x,y));
        }else if(eleccion==2){
            System.out.println("La respuesta es: " + substraccion(x,y));
        }else if(eleccion==3){
            System.out.println("La respuesta es: " + multiplicacion(x,y));
        }else if(eleccion==4){
            System.out.println("La respuesta es: " + division(x,y));
        }
        else{
            System.out.println("Ingrese una operacion valida");
        }

    }

    public static int adicion(int x, int y){
        int n = x + y;
        return n;
    }
    public static int substraccion(int x, int y){
        int n = x - y;
        return n;
    }
    public static int multiplicacion(int x, int y){
        int n = x*y;
        return n;
    }
    public static int division(int x, int y){
        int n = x/y;
        return n;
    }
}