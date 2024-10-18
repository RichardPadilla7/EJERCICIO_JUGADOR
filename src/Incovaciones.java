import java.util.Scanner;
public class Incovaciones {

   public static void main(String[] args) {

      Scanner ingresar = new Scanner(System.in);

      System.out.println("Ingresa su nombre de avatar: ");
      String avatar = ingresar.nextLine();

      System.out.println("Ingrese su pais: ");
      String pais = ingresar.nextLine();

      System.out.println("Ingrese su edad: ");
      int edad = ingresar.nextInt();
      ingresar.nextLine();  //BUFFER LIMPIA


      Jugador jugador1 = new Jugador(avatar, pais, edad);
      jugador1.patear();
      jugador1.correr();


      System.out.println("\nIngresa su nombre de avatar para el segundo jugador: ");
      avatar = ingresar.nextLine();

      System.out.println("Ingrese su pais para el segundo jugador: ");
      pais = ingresar.nextLine();

      System.out.println("Ingrese su edad para el segundo jugador: ");
      edad = ingresar.nextInt();

      Jugador jugador2 = new Jugador(avatar, pais, edad);
      jugador2.saltar(2);
      jugador2.patear();
      jugador2.correr();

   }
}