import java.util.Objects;

public abstract class Moeda {


//    Atributos
    protected double valor;

//    Construtor que recebe o valor da moeda
    public Moeda(double valor) {
        this.valor = valor;
    }

    //    Métodos Abstratos que serão implementados pelas subclasses
    public abstract void info(); // Método para exibir informações sobre a moeda

    public abstract double converter(); // Método para converter o valor do Euro e do Dolar para Real


//    Método equals para verificar se dois objetos são iguais com base no valor.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Moeda moeda = (Moeda) obj;
        return Double.compare(moeda.valor, valor) == 0;
    }

//    Método hashCode para gerar um código hash com base no valor da moeda
    public int hashCode () {
        return Objects.hash(valor);
    }
}
