public interface Bebida {
    String getDescricao();
    double getCusto();

    default void imprimir(){
        System.out.printf("%s -  R$ %.2f%n", getDescricao(), getCusto());
    }
}
