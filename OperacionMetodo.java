class OperacionMetodo{
    
    public static void area( double a, double b, double c, double p) {
        Impresion print = new Impresion();
        double area = 0;
        double  multiplicacion = 0;
        multiplicacion = p*(p-a)*(p-b)*(p-c);
        area = Math.sqrt(multiplicacion);
        print.resultado(area,p);

    }

    public void p(Double a,Double b, Double c) {
        double  p = 0;
        p = (a+b+c)/2;
        System.out.println(p);
        area(a, b, c, p);
    }
    
}