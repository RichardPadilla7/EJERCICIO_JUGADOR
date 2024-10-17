public class Jugador {

    String avatar, pais;
    int edad;

    //JUGADOR 1
    public Jugador(){
        this.avatar = "RichardVN";
        this.pais = "Ecuador";
        this.edad = 20;
    }


    public void patear(){
        System.out.println("--------------------------------");
        System.out.println("El avatar: " + avatar);
        System.out.println("Su pais " + pais);
        System.out.println("Su edad: "  + edad);
        System.out.println("El jugador 1 Patea al rival!!");
        System.out.println("--------------------------------");


    }
    public void correr(){
        System.out.println("--------------------------------");
        System.out.println("El avatar: " + avatar);
        System.out.println("Su pais " + pais);
        System.out.println("Su edad: "  + edad);
        System.out.println("El jugador 1 Corre al objetivo!!");
        System.out.println("--------------------------------");
    }




    //JUGADOR2

    public Jugador(String avatar, String pais, int edad){
        this.avatar = avatar;
        this.pais = pais;
        this.edad = edad;
    }

    public void saltar(){
        System.out.println("--------------------------------");
        System.out.println("El avatar: " + avatar);
        System.out.println("Su pais " + pais);
        System.out.println("Su edad: "  + edad);
        System.out.println("El jugador 2 Salta al objetivo!!");
        System.out.println("--------------------------------");
    }













}