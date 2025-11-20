import java.util.Scanner;

public class Acessorio extends Peca implements Item {
    private final Scanner sc = new Scanner(System.in);

    @Override
    public void venda() {
        System.out.print("Digite a quantidade vendida: ");
        int quantidadeVendida = sc.nextInt();
        if (this.quantidade > quantidadeVendida) {
            this.quantidade = this.quantidade - quantidadeVendida;
        } else {
            System.out.println("A quantidade a ser vendida é superior a quantidade no estoque");
        }
    }

    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public String toString() {
        return this.descricao +
                " {estoque=" + quantidade +
                '}';
    }
}