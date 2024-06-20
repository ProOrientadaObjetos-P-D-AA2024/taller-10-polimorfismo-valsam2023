package problematica2;

public abstract class Menú {
    protected String nombrePlato;
    protected double totalMenú;
    protected double costoMenú;

    public Menú(String nombrePlato, double costoMenú) {
        this.nombrePlato = nombrePlato;
        this.costoMenú = costoMenú;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public double getTotalMenú() {
        return totalMenú;
    }

    public void setTotalMenú(double totalMenú) {
        this.totalMenú = totalMenú;
    }

    public double getCostoMenú() {
        return costoMenú;
    }

    public void setCostoMenú(double costoMenú) {
        this.costoMenú = costoMenú;
    }
    
    public abstract double calcularSubtotal();

    @Override
    public String toString() {
        return "Nombre del plato: " + nombrePlato + ", Valor total del menú: $" + totalMenú;
    }
}