import java.util.InputMismatchException;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args){
        int x = PedirEnterosConExcepciones();
        System.out.println("x = "+x);
    }
    
    public static int PedirEnterosSinExcepciones(){
        Scanner lector=new Scanner(System.in);
        System.out.println("Ingrese un valor entero");
        lector.close();
        return lector.nextInt();
    }
    
    public static int PedirEnterosConValidación(){
        Scanner lector= new Scanner(System.in);
        boolean esValido = true;
        System.out.println("Ingrese un valor entero");
        String entrada = lector.next();
        for(int i=0; i<entrada.length(); i++){
            if(!Character.isDigit(entrada.charAt(i))){
                esValido=false;
                break;
            }
        }
        if (esValido){
            return Integer.parseInt(entrada);
        }
        return 0;
    }
    public static int PedirEnterosConExcepciones(){
        Scanner lector= new Scanner(System.in);
        System.out.println("Ingrese un valor entero");
        try{
            return lector.nextInt();
        }catch(InputMismatchException e){
            return 0;
        }
    }
}