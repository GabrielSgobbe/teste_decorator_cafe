public class Main {
     public static void main(String[] args) {
        System.out.println(" ==== Cafeteria Teste ====");

        Bebida b1 = new Espresso();
        imprimir(b1);

        Bebida b2 = new Chantilly(new Leite(new CafeCoado()));
        imprimir(b2);

        Bebida b3 = new Calda(new Chantilly(new Espresso()));
        imprimir(b3);

        Bebida b4 = new ChaPreto();
        b4 = new Leite(b4);
        b4 = new Chantilly(b4);
        imprimir(b4);


        }

        private static void imprimir(Bebida b){
            System.out.printf("%s - R$ %.2f%n", b.getDescricao(), b.getCusto());
        }

    }

