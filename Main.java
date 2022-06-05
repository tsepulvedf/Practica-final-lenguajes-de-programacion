import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
import java.net.*;
import java.util.*;

public class Main {

  public static void main(String[]args) throws IOException {
    var sn = new Scanner(System.in);
    var salir = false;
    var opcion = 0;

    while (!salir){

      System.out.println("1. Hechos relevantes del año 2002");
      System.out.println("2. Información general sobre celulares");
      System.out.println("3. Información sobre la guerra en Ucrania");

      try {

        System.out.println("Elige una opcion");
        opcion = sn.nextInt();

        switch (opcion) {
          case 1:
             get2002(); 
             break;
            }
          case 2:
             getCelular();
             break;
          case 3:
             getUcrania();
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
