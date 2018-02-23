import java.util.Scanner;

public class PerimetroTriangulos {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Cuantos triangulos va a ingresar: ");
        int ct = reader.nextInt(); // Cantidad de triangulos a ingresar.
        int cteq = 0, cti = 0, ctes = 0; // Contador para cada tipo de triangulo.
        float perimetro_mayor_eq = 0, perimetro_menor_eq = 0; // Perimetro para el mayor y menor triangulo equilátero.
        float perimetro_mayor_i = 0, perimetro_menor_i = 0; // Perimetro para el mayor y menor triangulo isósceles.
        float perimetro_mayor_es = 0, perimetro_menor_es = 0; // Perimetro para el mayor y menor triangulo escaleno.
        int marca_eq = 0, marca_i = 0, marca_es = 0; // Marcas para el primero de cada tipo de triangulos.
        int tt; // Tipo de triangulo.
        float l1, l2, l3; // Lados del triangulo.
        float pt; // Perimetro triangulo.


        for (int i = 0; i < ct; i++) {
            // Entrada de lados.
            System.out.println("Datos del triangulo numero: "+ (i+1));
            System.out.print("Entrar el primer lado: ");
            l1 = reader.nextFloat();
            System.out.print("Entrar el segundo lado: ");
            l2 = reader.nextFloat();
            System.out.print("Entrar el tercer lado: ");
            l3 = reader.nextFloat();
            // Calcular el tipo de triangulo.
            if(l1 == l2 && l1 == l3){
                tt = 1;
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                tt = 2;
            } else {
                tt = 3;
            }
            // Calculo del perimetro.
            pt = l1 + l2 + l3;
            // Triangulo equilátero.
            if (tt == 1) {
                cteq++;
                if (marca_eq == 0) {
                    marca_eq = 1;
                    perimetro_mayor_eq = pt;
                    perimetro_menor_eq = pt;
                }
                if( pt >= perimetro_mayor_eq ){
                    perimetro_mayor_eq = pt;
                }
                if( pt <=perimetro_menor_eq ){
                    perimetro_menor_eq = pt;
                }
            // Triangulo isósceles.
            } else if(tt == 2){
                cti++;
                if (marca_i == 0) {
                    marca_i = 1;
                    perimetro_mayor_i = pt;
                    perimetro_menor_i = pt;
                }
                if( pt >= perimetro_mayor_i ){
                    perimetro_mayor_i = pt;
                }
                if( pt <=perimetro_menor_i ){
                    perimetro_menor_i = pt;
                }
            // Triangulo escaleno.
            } else if(tt == 3){
                ctes++;
                if (marca_es == 0) {
                    marca_es = 1;
                    perimetro_mayor_es = pt;
                    perimetro_menor_es = pt;
                }
                if( pt >= perimetro_mayor_es ){
                    perimetro_mayor_es = pt;
                }
                if( pt <=perimetro_menor_es ){
                    perimetro_menor_es = pt;
                }
            }
        }
        System.out.println("Hay " + cteq + " triangulos equilátero.");
        System.out.println("Hay " + cti + " triangulos isósceles.");
        System.out.println("Hay " + ctes + " triangulos escaleno.");
        if (marca_eq == 1) {
            System.out.println("El perimetro del mayor equilátero es " + perimetro_mayor_eq);
            System.out.println("El perimetro del menor equilátero es " + perimetro_menor_eq);
        }
        if (marca_i == 1) {
            System.out.println("El perimetro del mayor isósceles es " + perimetro_mayor_i);
            System.out.println("El perimetro del menor isósceles es " + perimetro_menor_i);
        }
        if (marca_es == 1) {
            System.out.println("El perimetro del mayor escaleno es " + perimetro_mayor_es);
            System.out.println("El perimetro del menor escaleno es " + perimetro_menor_es);
        }
        reader.close();
    }
}
