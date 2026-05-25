public class Main {
    static void main(String[] args) {
        System.out.println(" ==== Cafeteria Teste ====");

        Bebida b1 = new Espresso();
        b1.imprimir();

        Bebida b2 = new Chantilly(new Leite(new CafeCoado()));
        b2.imprimir();

        Bebida b3 = new Calda(new Chantilly(new Espresso()));
        b3.imprimir();

    }
}
