import java.util.Scanner;

class LecturaDatos{
    static double A;
    static double B;
    static double C;

    static Scanner entrada = new Scanner(System.in);

    public  void leerDatos(){ 
        OperacionMetodo opMetodo = new OperacionMetodo();
        System.out.println("Introduce Area A: ");
        A = entrada.nextInt();
        System.out.println("Introduce Area B: ");
        B = entrada.nextInt();
        System.out.println("Introduce Area C: ");
        C = entrada.nextInt();   
        
        opMetodo.p(A,B,C);
    }
}