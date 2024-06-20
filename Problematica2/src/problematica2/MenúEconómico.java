package problematica2;

public class MenúEconómico extends Menú{
    private double descuento;
    private String cuponDescuento;

    public MenúEconómico(String nombrePlato, double costoMenú, double descuento) {
        super(nombrePlato, costoMenú);
        this.descuento = descuento;
        this.cuponDescuento(); // Llama al método cuponDescuento para inicializar el cupón
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getCuponDescuento() {
        return cuponDescuento;
    }

    public void setCuponDescuento(String cuponDescuento) {
        this.cuponDescuento = cuponDescuento;
    }
    // metodos economico
    public void cuponDescuento() {
        this.cuponDescuento = "cupon valido de descuento";
        calcularSubtotal();
    }

    @Override
    public double calcularSubtotal() {
        double descuentoCalculo = costoMenú * (descuento / 100);
        totalMenú = costoMenú - descuentoCalculo;
        return totalMenú;
    }

    @Override
    public String toString() {
        return "\tPlato: " + nombrePlato + " " + cuponDescuento + "\n" +
               "\tValor Inicial: " + String.format("%.2f", costoMenú) + "\n" +
               "\tPorcentaje Descuento: " + String.format("%.2f", descuento) + "\n" +
               "\tValor del Menú: " + String.format("%.2f", totalMenú);
    }
}