package problematica1;

public class Arquero extends Logistica {

    public double precision;
    public int agilidad;

    public Arquero(String nombre, int puntosDeVida, int nivelExperiencia,
            double precision, int agilidad) {
        super(nombre, puntosDeVida, nivelExperiencia);
        this.precision = precision;
        this.agilidad = agilidad;
    }

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public void punteria() {
        // aumenta la precisión temporalmente
        precision += 10;
        System.out.println(nombre + " utiliza su puntería!");
    }

    @Override
    public void atacar(Logistica enemigo) {
        int herida = (int) (precision * 2);  
        enemigo.defender(herida);
    }

    @Override
    public void defender(int herida) {
        puntosDeVida -= herida / agilidad;  

    }
}
