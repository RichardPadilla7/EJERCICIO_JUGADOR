public class Incovaciones {


    public static void main(String[] args) {

        System.out.println("--------------------------------");
        System.out.println("Jugador 1");
        Jugador jugador1 = new Jugador();
        jugador1.patear();
        jugador1.correr();


        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("Jugador 2");
        Jugador jugador2 = new Jugador("Ariel777", "st.Domingo", 21);
        jugador2.saltar(2);
        jugador2.patear();
        jugador2.correr();


    }
}
