import java.util.Scanner;
public class NumeroMayor {
    public static void main(String[] args) {
        int n1 = -2, n2 = -100, n3 = 40, n4 = 63;
        int mayor = 0;
        if(n1>=n2){
            if(n1>=n3){
                if(n1>=n4){
                    mayor = n1;
                }
            }
        }
        if(n2>=n1){
            if(n2>=n3){
                if(n2>=n4){
                    mayor = n2;
                }
            }
        }
        if(n3>=n1){
            if(n3>=n2){
                if(n3>=n4){
                    mayor = n3;
                }
            }
        }
        if(n4>=n1){
            if(n4>=n2){
                if(n4>=n3){
                    mayor = n4;
                }
            }
        }
        System.out.println("El mayor numero ingresado es: " + mayor);

        // Scanner reader = new Scanner(System.in);
        // boolean mn = false;
        // int mayor = 0;

        // for (int i = 0; i < 4; i++) {
        //     System.out.print("Enter a number: ");
        //     int n = reader.nextInt();
        //     if(mn == false){
        //         mn = true;
        //         mayor = n;
        //     }
        //     if(n>mayor){
        //         mayor = n;
        //     }
        // }
        // printIntFormat(mayor);
        // reader.close();
    }
}
