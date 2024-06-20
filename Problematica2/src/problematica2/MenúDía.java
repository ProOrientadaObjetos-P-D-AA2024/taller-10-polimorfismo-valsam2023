package problematica2;

public class MenúDía extends Menú{
    private double postre;
    private double bebida;
    private String sopa;

    public MenúDía(String nombrePlato, double costoMenú, double postre,
                   double costoBebida) {
        super(nombrePlato, costoMenú);
        this.postre = postre;
        this.bebida = costoBebida;
        this.sopa(); // Llama al método sopa para inicializar la sopa
    }
    public double getPostre() {
        return postre;
    }

    public void setPostre(double postre) {
        this.postre = postre;
    }

    public double getBebida() {
        return bebida;
    }

    public void setBebida(double bebida) {
        this.bebida = bebida;
    }

    public String getSopa() {
        return sopa;
    }

    public void setSopa(String sopa) {
        this.sopa = sopa;
    }
    
    // metodos dia
    public void sopa() {
        this.sopa = "incluye sopa";
        calcularSubtotal();
    }

    @Override
    public double calcularSubtotal() {
        totalMenú = costoMenú + postre + bebida;
        return totalMenú;
    }

    @Override
    public String toString() {
        return "\tPlato: " + nombrePlato + " " + sopa + "\n" +
               "\tValor Inicial: " + String.format("%.2f", costoMenú) + "\n" +
               "\tValor bebida: " + String.format("%.2f", bebida) + "\n" +
               "\tValor postre: " + String.format("%.2f", postre) + "\n" +
               "\tValor del Menú: " + String.format("%.2f", totalMenú);
    }
}