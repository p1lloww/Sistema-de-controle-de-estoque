import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;
        Vector<Item> itens = new Vector<>(5);

        itens.add(new Acessorio("Anel de aço inox", 1, 1, 10));
        itens.add(new RoupaPMG("Camisa basica branca", 1, 1, 1, 10, 1));
        itens.add(new RoupaTamanhoUnico("Roupa especial com desenhos", 1, 1, 10));
        itens.add(new Acessorio("Colar de elos dourados", 1, 1, 10));
        itens.add(new RoupaTamanhoUnico("Calça especial com jeans especial", 1, 1, 10));

        do {
            System.out.println("Escolha uma opção: ");
            for (int i = 0; i < itens.size(); i++) {
                System.out.println(i + " - " + itens.get(i).getDescricao());
            }
            System.out.println("5 - Sair do sistema");
            escolha = sc.nextInt();
            switch (escolha) {
                case 0:
                    itens.get(0).venda();
                    itens.get(0).reposicaoEstoque();
                    break;
                case 1:
                    itens.get(1).venda();
                    itens.get(1).reposicaoEstoque();
                    break;
                case 2:
                    itens.get(2).venda();
                    itens.get(2).reposicaoEstoque();
                    break;
                case 3:
                    itens.get(3).venda();
                    itens.get(3).reposicaoEstoque();
                    break;
                case 4:
                    itens.get(4).venda();
                    itens.get(4).reposicaoEstoque();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;

            }
        } while (escolha != 5);

        for (Item i : itens) {
            System.out.println(i);
        }

    }
}
