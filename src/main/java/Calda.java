public class Calda extends AdicionalDecorator{

    public Calda(Bebida bebida) {
        super(bebida);
    }


    @Override
    public String getDescricao() {
        return bebida.getDescricao()+ ", Calda de chocolate";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 2.50;
    }
}
