import java.text.DecimalFormat;
import java.util.ArrayList;

public class Cofrinho {
//  ArrayList para adicionar as moedas
    ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();


    //    Métodos Públicos
//    Método para adicionar uma moeda à lista
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }
//    Método para remover uma moeda da lista
    public void remover(Moeda moeda) {
        if (listaMoedas.contains(moeda)) {
            listaMoedas.remove(moeda);
            System.out.println("Moeda removida com sucesso!");
        } else {
            System.out.println("Moeda não encontrada! Por favor tente novamente!");
        }
    }

//    Método para listar as moedas no cofrinho
    public void listagemMoedas() {
        System.out.println("Moedas no cofre:");
        for (Moeda moeda : listaMoedas) {  // loop para apresentação
            moeda.info();
        }
    }

//    Método para calcular e exibir o total convertido das moedas em Real
    public void totalConvertido() {
        double total = 0.0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter(); // Chama o método converter() de cada moeda e adiciona ao total
        }
        DecimalFormat df = new DecimalFormat("#.##"); // Formata o total para apresentar duas casas decimais
        String totalFormatado = df.format(total);
        
        System.out.println("Total convertido para Real - R$" + totalFormatado);
    }
}
