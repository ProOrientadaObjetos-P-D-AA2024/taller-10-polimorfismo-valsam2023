package problematica2;

import java.util.ArrayList;

public class Cuenta {
    private String nombreCliente;
    private ArrayList<Menú> menus;
    private double iva;

    public Cuenta(String nombreCliente, double iva) {
        this.nombreCliente = nombreCliente;
        this.iva = iva;
        this.menus = new ArrayList<>();
    }

    public void agregarMenú(Menú menú) {
        menus.add(menú);
    }

    public double calcularSubtotal() {
        double subtotal = 0;
        for (int i = 0; i < menus.size(); i++) {
            Menú menú = menus.get(i);
            subtotal += menú.calcularSubtotal();
        }
        return subtotal;
    }

    public double calcularTotal() {
        double subtotal = calcularSubtotal();
        double total = subtotal * (1 + iva / 100);
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura\n");
        sb.append("Cliente: ").append(nombreCliente).append("\n");
        
        for (int i = 0; i < menus.size(); i++) {
            Menú menú = menus.get(i);
            sb.append(menú.toString()).append("\n\n");
        }
        
        sb.append("Subtotal: ").append(String.format("%.2f", calcularSubtotal())).append("\n");
        sb.append("IVA: ").append(String.format("%.1f", iva)).append("%\n");
        sb.append("Total a pagar: ").append(String.format("%.3f", calcularTotal()));
        
        return sb.toString();
    }
}