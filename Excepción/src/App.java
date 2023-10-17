public class App {
    public static void main(String[] args){
        int x=98, y=0;
        System.out.println(DividirSinExcepciones(x,y));
        System.out.println(DividirConvalidación(x,y));
        System.out.println(DividirConExcepciones(x,y));
    }
    public static int DividirSinExcepciones(int x, int y){
        return x/y;
    }
    
    public static int DividirConvalidación(int x, int y){
        if(y!=0){
            return x/y;
        }else{
            return 0;
        }
    }
    public static int DividirConExcepciones(int x, int y){
        try{
            return x/y;
        }catch(ArithmeticException e){
            return 0;
        }
    }
}
