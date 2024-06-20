package problematica2;

public class MenúNiños extends Menú{
    private double costoHelado;
    private double costoPastel;
    private String sorpresa;

    public MenúNiños(String nombrePlato, double costoMenú, double costoHelado,
                     double costoPastel) {
        super(nombrePlato, costoMenú);
        this.costoHelado = costoHelado;
        this.costoPastel = costoPastel;
        this.sorpresa(); // inicializo la sorpresa
    }

    public double getCostoHelado() {
        return costoHelado;
    }

    public void setCostoHelado(double costoHelado) {
        this.costoHelado = costoHelado;
    }

    public double getCostoPastel() {
        return costoPastel;
    }

    public void setCostoPastel(double costoPastel) {
        this.costoPastel = costoPastel;
    }

    public String getSorpresa() {
        return sorpresa;
    }

    public void setSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }
    
    // metodos niños
    public void sorpresa() {
        this.sorpresa = "incluye juguete";
        calcularSubtotal();
    }

    @Override
    public double calcularSubtotal() {
        totalMenú = costoMenú + costoHelado + costoPastel;
        return totalMenú;
    }

    @Override
    public String toString() {
        return "\tPlato: " + nombrePlato + " " + sorpresa + "\n" +
               "\tValor Inicial: " + String.format("%.2f", costoMenú) + "\n" +
               "\tValor helado: " + String.format("%.2f", costoHelado) + "\n" +
               "\tValor pastel: " + String.format("%.2f", costoPastel) + "\n" +
               "\tValor del Menú: " + String.format("%.2f", totalMenú);
    }
}