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

 * @param args metodo para la ejecuci�n del programa
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
 * scanner sc introduce por teclado un n�mero que ser� el valor de x
 * el programa comprobar� si el n�mero introducido x es menor mostrar� mensaje "Casi aciertas"
 * el programa comprobar� si el n�mero introducido x es mayor mostrar� mensaje "Te pasaste amigo"
 * el programa comprobar� si el n�mero introducido x es igual a n mostrar� mensaje "Excelente!!!"
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

