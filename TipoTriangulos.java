import java.util.Scanner;
public class Triangulos {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Entrar el primer lado: ");
        int l1 = reader.nextInt();
        System.out.print("Entrar el segundo lado: ");
        int l2 = reader.nextInt();
        System.out.print("Entrar el tercer lado: ");
        int l3 = reader.nextInt();
        if(l1==l2 && l1==l3){
            System.out.println("El triangulo es equilátero");
        } else if (l1==l2 || l1==l3 || l2==l3) {
            System.out.println("El triangulo es isósceles");
        } else {
            System.out.println("El triangulo es escaleno");
        }
    }
}
