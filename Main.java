import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[]args) throws IOException {
    var sn = new Scanner(System.in);
    var salir = false;
    var opcion = 0;

    while (!salir){

      System.out.println("1. Hechos relevantes del año 2002");
      System.out.println("2. Información celulares");
      System.out.println("3. Información sobre la guerra en Ucrania");

      try {

        System.out.println("Elige una opcion");
        opcion = sn.nextInt();

        switch (opcion) {
          case 1:
            System.out.println("Has seleccionado la opcion 1");
            File file = new File("2002.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNext()){
              System.out.println(scan.nextLine());  
            }
            break;
          case 2:
            System.out.println("Has seleccionado la opcion 2");
            File file = new File("Proyecto - B.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNext()){
              System.out.println(scan.nextLine());
            break;
          case 3:
            System.out.println("Has seleccionado la opcion 3");
            File file = new File("Proyecto - C.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNext()){
              System.out.println(scan.nextLine());
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
