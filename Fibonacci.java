import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Cuantos numeros enteros va a ingresar: ");
        int cn = reader.nextInt();
        int n;
        int cnf = 0;
        int sum_nf = 0;
        float prom_nf;
        int mayor_nf = 0, menor_nf = 0;
        boolean marca_nf = true;
        for (int i = 0; i < cn; i++) {
            System.out.print("Numero " + (i+1) + ": ");
            n = reader.nextInt();
            if(pertenece_sf(n)){
                if (marca_nf) {
                    marca_nf = false;
                    mayor_nf = n;
                    menor_nf = n;
                }
                if (n>=mayor_nf) {
                    mayor_nf = n;
                }
                if (n<=menor_nf) {
                    menor_nf = n;
                }
                cnf++;
                sum_nf += n;
            }
        }
        prom_nf = (float)sum_nf / (float)cnf;
        System.out.println("Se ingresaron "+cnf+" numeros pertenecientes a la serie fibonacci.");
        if(cnf>0){
            System.out.println("El mayor numero fibonacci ingresado fue: "+mayor_nf);
            System.out.println("El menor numero fibonacci ingresado fue: "+menor_nf);
            System.out.println("El promedio de los numeros fibonacci ingresados es: "+ prom_nf);
        }
        reader.close();
    }
    public static boolean pertenece_sf(int n){
        int a = 0;
        int b = 1;
        int c = 0;
        while (n>=c) {
            a = b;
            b = c;
            if (n==c) {
                return true;
            }
            c = a + b;
        }
        return false;
    }
}