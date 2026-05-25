public class Espresso implements Bebida{

    @Override
    public String getDescricao() {
        return "Expresso";
    }

    @Override
    public double getCusto() {
        return 5.00;
    }
}
