package problematica1;

public class Guerrero extends Logistica {

    public double fuerza;
    public int resistencia;
    public int armadura;

    public Guerrero(String nombre, int puntosDeVida, int nivelExperiencia,
            double fuerza, int resistencia, int armadura) {
        super(nombre, puntosDeVida, nivelExperiencia);
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.armadura = armadura;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public void fuerzaEscudo() {
        // fortaleza defensiva
        resistencia += 5;
        armadura += 5;
        System.out.println(nombre + " fortalece su escudo y resistencia!");
    }

    @Override
    public void atacar(Logistica enemigo) {
        int herida = (int) (fuerza * 3);  
        enemigo.defender(herida);
    }

    @Override
    public void defender(int herida) {
        puntosDeVida -= herida / armadura;
    }
}
