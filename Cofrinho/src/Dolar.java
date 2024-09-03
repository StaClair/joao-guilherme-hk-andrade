public class Dolar extends Moeda {

//    Construtor que recebe o valor da moeda
    public Dolar(double valor) {
        super(valor);
    }

//    Método para exibir informações da moeda
    @Override
    public void info() {
        System.out.println("Dolar - $" + valor);
    }

//   Método para converter o valor da moeda Dolar para Real
    @Override
    public double converter() {
        return this.valor * 5.15;
    }
}
