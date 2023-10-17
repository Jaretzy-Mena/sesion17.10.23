import java.util.InputMismatchException;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args){
        int resultado=dividir();
        System.out.println(resultado);
    }
    public static int dividir(){
        int x = PedirEntero();
        int y = PedirEntero();
        System.out.println("x= "+x);
        System.out.println("y= "+y);
        return x/y;
    }
    public static int PedirEntero(){
        Scanner lector=new Scanner(System.in);
        System.out.println("Ingrese un valor entero: ");
        while(true){
            try {
                return lector.nextInt();
            } catch (InputMismatchException e) {
                lector.nextLine();//Insertar un salto de linea
                System.out.println("Ingrese un valor entero: s");
            }
        }
    }
}
