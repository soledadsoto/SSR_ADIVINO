import java.util.Scanner;

/**
 * Aciertos.java
 * representa la clase principal del proyecto * 
 * @author Soledad Soto
 * @version 1
 * @since 25.1.2018
 */

public class Aciertos {

/**

 * @param args metodo para la ejecución del programa
 * 
 */
    public static void main(String[] args) {
    	
 /**
  * n indica valor inicial de int
  * x indica valor que asigna el programa a int aleatoriamente
  */
        int n = 0,cont = 0;
        int x = (int) (500 *Math.random());
        //System.out.print(x);
/**
 * scanner sc introduce por teclado un número que será el valor de x
 * el programa comprobará si el número introducido x es menor mostrará mensaje "Casi aciertas"
 * el programa comprobará si el número introducido x es mayor mostrará mensaje "Te pasaste amigo"
 * el programa comprobará si el número introducido x es igual a n mostrará mensaje "Excelente!!!"
 */
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}

