import java.util.Scanner;

public class Interatividade {
// Classe criada somente para deixar a classe Main mais limpa e organizada. Aqui serãp disponibilizados os códigos para criação dos Menus Interativos

//  Scanner para entrada de dados do usuário
    Scanner scanner = new Scanner(System.in);
    
//    Criação de um objeto cofrinho para manipulação das moedas
    Cofrinho cofrinho = new Cofrinho();

//    Método para exibir e gerenciar o menu interativo
    public void menuInterativo() {
        int opcao;
        do {
            System.out.println("Bem-vindo ao Cofrinho!");
            System.out.println("Por favor, escolha uma das opções abaixo:");
            System.out.println("[1] - Adicionar Moedas");
            System.out.println("[2] - Remover Moedas");
            System.out.println("[3] - Listar Moedas");
            System.out.println("[4] - Converter Total de Moedas para Real");
            System.out.println("[0] - Finalizar programa");

//           Lê a opção escolhida pelo usuário
           opcao = scanner.nextInt();

//           Executa a ação de acordo com a opção escolhida
            switch (opcao) {
                case 1:
                    menuAdicionar();
                    break;

                case 2:
                    menuRemover();
                    break;

                case 3:
                    cofrinho.listagemMoedas();
                    break;

                case 4:
                    cofrinho.totalConvertido();
                    break;

                case 0:
                    System.out.println("Programa finalizado com sucesso!.");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente!");
            }
        } while (opcao != 0);
    }

//    Método para adicionar uma moeda ao cofrinho
    private void menuAdicionar() {
    int opcaoMoeda;
    Moeda moeda = null;

    do {
        System.out.println("Escolha a Moeda desejada:");
        System.out.println("[1] - Real");
        System.out.println("[2] - Dolar");
        System.out.println("[3] - Euro");
        opcaoMoeda = scanner.nextInt();

//        Cria a moeda com base na opção escolhida pelo usuário
        switch (opcaoMoeda) {
            case 1:
                System.out.println("Digite o valor da moeda a ser adicionado:");
                double valor = scanner.nextDouble();
                moeda = new Real(valor);
                break;
            case 2:
                System.out.println("Digite o valor da moeda a ser adicionado:");
                valor = scanner.nextDouble();
                moeda = new Dolar(valor);
                break;
            case 3:
                System.out.println("Digite o valor da moeda a ser adicionado:");
                valor = scanner.nextDouble();
                moeda = new Euro(valor);
                break;
            default:
                System.out.println("Opção inválida. Por favor, tente novamente!");
        }
    } while (moeda == null); // Repete o loop se moeda ainda for nula

    cofrinho.adicionar(moeda);
    System.out.println("Moeda adicionada com sucesso!");
}

//      Método para remover uma moeda do cofrinho
    private void menuRemover() {
        int opcaoMoeda;
        Moeda moeda = null;
        do {
//            Exibe o menu de opções para remover a moeda desejada
            System.out.println("Escolha a Moeda desejada:");
            System.out.println("[1] - Real");
            System.out.println("[2] - Dolar");
            System.out.println("[3] - Euro");
            opcaoMoeda = scanner.nextInt();

//            A moeda é removida de acordo com a opção selecionada
            switch (opcaoMoeda) {
                case 1:
                    System.out.println("Digite o valor da moeda a ser removida:");
                    double valor = scanner.nextDouble();
                    moeda = new Real(valor);
                    break;
                case 2:
                    System.out.println("Digite o valor da moeda a ser removida:");
                    valor = scanner.nextDouble();
                    moeda = new Dolar(valor);
                    break;
                case 3:
                    System.out.println("Digite o valor da moeda a ser removida:");
                    valor = scanner.nextDouble();
                    moeda = new Euro(valor);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente!");
            }
        } while(moeda == null); // Repete o loop caso a opção escolhida seja incorreta

        cofrinho.remover(moeda);
        System.out.println("Moeda REMOVIDA com sucesso!");
        
    }
    
}
