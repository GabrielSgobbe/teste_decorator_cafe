public class Chantilly extends AdicionalDecorator{

    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao()+ ", Chantilly";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 2.50;
    }
}
