public class Jugador {

    String avatar, pais;
    int edad;
    int saltos = 2;

    //JUGADOR 1
    public Jugador(String avatar, String pais, int edad){
        this.avatar = avatar;
        this.pais = pais;
        this.edad = edad;
    }



    public void patear(){
        System.out.println("--------------------------------");
        System.out.println("El avatar: " + avatar);
        System.out.println("Su pais " + pais);
        System.out.println("Su edad: "  + edad);
        System.out.println("El jugador Patea al rival!!");
        System.out.println("--------------------------------");


    }
    public void correr(){
        System.out.println("--------------------------------");
        System.out.println("El avatar: " + avatar);
        System.out.println("Su pais " + pais);
        System.out.println("Su edad: "  + edad);
        System.out.println("El jugador Corre al objetivo!!");
        System.out.println("--------------------------------");
    }




    //JUGADOR2
    public void saltar(int saltos){
        saltos += saltos;
        System.out.println("--------------------------------");
        System.out.println("El avatar: " + avatar);
        System.out.println("Su pais " + pais);
        System.out.println("Su edad: "  + edad);
        System.out.println("El jugador Salta " + saltos +" veces al objetivo!!");
        System.out.println("--------------------------------");
    }













}