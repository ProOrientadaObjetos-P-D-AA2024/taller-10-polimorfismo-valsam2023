package problematica1;

public class Juego {

    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Guerrero", 80, 8, 10, 8, 13);
        Mago mago = new Mago("Valdon", 70, 7, 20, 18);
        Arquero arquero = new Arquero("Barton", 90, 6, 95, 20);

        System.out.println("Inicio de la batalla:");

        // acciones de cada  jugador
        arquero.punteria();
        guerrero.fuerzaEscudo();
        mago.visiones();

        // Se enfrentan uno a uno
        combate(guerrero, mago);
        combate(mago, arquero);
        combate(arquero, guerrero);
    }

    public static void combate(Logistica p1, Logistica p2) {
        System.out.println("\n" + p1.getNombre() + " vs " + p2.getNombre());

        while (p1.getPuntosDeVida() > 0 && p2.getPuntosDeVida() > 0) {
            p1.atacar(p2);
            if (p2.getPuntosDeVida() > 0) {
                p2.atacar(p1);
            }
        }

        if (p1.getPuntosDeVida() > 0) {
            System.out.println(p1.getNombre() + " gana la batalla");
            p1.subirNivel();
        } else {
            System.out.println(p2.getNombre() + " gana la batalla");
            p2.subirNivel();
        }
    }
}