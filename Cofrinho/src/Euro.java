public class Euro extends Moeda{

//    Construtor que recebe o valor da moeda
    public Euro(double valor) {
        super(valor);
    }

//    Método para exibir informações da moeda
    @Override
    public void info() {
        System.out.println("Euro - €" + valor);
    }

//    Método para converter o valor da moeda Dolar para Real
    @Override
    public double converter() {
        return this.valor * 5.58;
    }
}
