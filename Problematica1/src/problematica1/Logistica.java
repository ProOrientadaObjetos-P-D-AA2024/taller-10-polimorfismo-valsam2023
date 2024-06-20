package problematica1;

public abstract class Logistica {
    protected String nombre;
    protected int puntosDeVida;
    protected int nivelExperiencia;

    public Logistica(String nombre, int puntosDeVida, int nivelExperiencia) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.nivelExperiencia = nivelExperiencia;
    }
    
    public abstract void atacar(Logistica enemigo);
    
    public abstract void defender(int danio);
    
    public void subirNivel() {
        nivelExperiencia++;
        puntosDeVida += 10;  // aumenta en 10 puntos la vida
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public int getNivelExperiencia() {
        return nivelExperiencia;
    }

    @Override
    public String toString() {
        return nombre + " (Vida: " + puntosDeVida + ", Nivel: " + nivelExperiencia + ")";
    }
}