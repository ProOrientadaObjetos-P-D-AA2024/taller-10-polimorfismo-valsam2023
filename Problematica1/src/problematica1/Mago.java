package problematica1;

public class Mago extends Logistica {

    public int poderMagico;
    public int conocimientoArcano;

    public Mago(String nombre, int puntosDeVida, int nivelExperiencia,
            int poderMagico, int conocimientoArcano) {
        super(nombre, puntosDeVida, nivelExperiencia);
        this.poderMagico = poderMagico;
        this.conocimientoArcano = conocimientoArcano;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    public int getConocimientoArcano() {
        return conocimientoArcano;
    }

    public void setConocimientoArcano(int conocimientoArcano) {
        this.conocimientoArcano = conocimientoArcano;
    }

    public void visiones() {
        // visiones que incrementan el poder mágico 
        poderMagico += 15;
        System.out.println(nombre + " ve el futuro y potencia su magia!");
    }

    @Override
    public void atacar(Logistica enemigo) {
        int herida = poderMagico * 4;  
        enemigo.defender(herida);
    }

    @Override
    public void defender(int herida) {
        puntosDeVida -= herida / conocimientoArcano;  
    }
}
