import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public static void main(String[]args){
    var sn = new Scanner(System.in);
    var salir = false;
    var opcion = 0;

    while (!salir){

      System.out.println("1. Opcion a");
      System.out.println("2. Opcion b");
      System.out.println("3. Opcion c");

      try {

        System.out.println("Elige una opcion");
        opcion = sn.nextInt();

        switch (opcion) {
          case 1:
            System.out.println("Has seleccionado la opcion a");
            break;
          case 2:
            System.out.println("Has seleccionado la opcion b");
            break;
          case 3:
            System.out.println("Has seleccionado la opcion c");
            break;
            default:
            System.out.println("Solo números entre 1 y 3");
        }
      } catch (InputMismatchException e) {
        System.out.println("Debes colocar un numero del 1 al 3");
        sn.next();
      }
    }

  }

}
