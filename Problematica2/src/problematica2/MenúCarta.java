package problematica2;

public class MenúCarta extends Menú{
    private double guarnicion;
    private double bebida;
    private double propina;
    private String entrada;

    public MenúCarta(String nombrePlato, double costoMenú, double guarnicion,
                     double bebida, double propina) {
        super(nombrePlato, costoMenú);
        this.guarnicion = guarnicion;
        this.bebida = bebida;
        this.propina = propina;
        this.entrada(); // Llama al método entrada para inicializar la entrada
    }

    public double getGuarnicion() {
        return guarnicion;
    }

    public void setGuarnicion(double guarnicion) {
        this.guarnicion = guarnicion;
    }

    public double getBebida() {
        return bebida;
    }

    public void setBebida(double bebida) {
        this.bebida = bebida;
    }

    public double getPropina() {
        return propina;
    }

    public void setPropina(double propina) {
        this.propina = propina;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }
    
    // metodos carta
    public void entrada() {
        this.entrada = "incluye coctel de camarones";
        calcularSubtotal();
    }

    @Override
    public double calcularSubtotal() {
        totalMenú = costoMenú + guarnicion + bebida;
        return totalMenú;
    }

    @Override
    public String toString() {
        return "\tPlato: " + nombrePlato + " " + entrada + "\n" +
               "\tValor Inicial: " + String.format("%.2f", costoMenú) + "\n" +
               "\tValor guarnición: " + String.format("%.2f", guarnicion) + "\n" +
               "\tValor bebida: " + String.format("%.2f", bebida) + "\n" +
               "\tPorcentaje Adicional: " + String.format("%.2f", propina) + "\n" +
               "\tValor del Menú: " + String.format("%.2f", totalMenú);
    }
}