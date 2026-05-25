public class Leite  extends AdicionalDecorator{

    public Leite(Bebida bebida) {
        super(bebida);
    }


    @Override
    public String getDescricao() {
        return bebida.getDescricao()+ ", Leite";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 1.50;
    }
}
