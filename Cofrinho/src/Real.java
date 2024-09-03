public class Real extends Moeda {

//    Construtor que recebe o valor da moeda
    public Real(double valor) {
        super(valor);
    }

//    Método para exibir informações da moeda
    @Override
    public void info() {
        System.out.println("Real - R$" + valor);
    }

    @Override
    public double converter() {
        return this.valor;
    }
}
