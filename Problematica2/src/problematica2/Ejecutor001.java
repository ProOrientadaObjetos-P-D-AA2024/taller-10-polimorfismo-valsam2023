package problematica2;

public class Ejecutor001 {

    public static void main(String[] args) {
        Menú menú1 = new MenúNiños("Menú Infantil Paw patrol", 6.00, 1.00, 3.50);
        Menú menú2 = new MenúNiños("Menú Infantil Intensamente", 5.00, 1.00, 3.50);
        Menú menú3 = new MenúEconómico("Economía deliciosa", 4.00, 25.00);
        Menú menú4 = new MenúDía("Almuerzo", 6.00, 0.50, 0.50);
        Menú menú5 = new MenúCarta("Especial de la carta", 10.00, 1.50, 2.00, 13.00);

        Cuenta cuenta = new Cuenta("Valentina Samaniego", 15.0);
        cuenta.agregarMenú(menú1);
        cuenta.agregarMenú(menú2);
        cuenta.agregarMenú(menú3);
        cuenta.agregarMenú(menú4);
        cuenta.agregarMenú(menú5);
        System.out.println(cuenta.toString());
    }
}