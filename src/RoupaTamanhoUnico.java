import java.util.Scanner;

public class RoupaTamanhoUnico extends Peca implements Item {
    Scanner sc;
    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
        sc = new Scanner(System.in);
    }

    @Override
    public void venda() {
        this.quantidade--;
    }

    @Override
    public String toString() {
        return this.descricao +
                " {estoque=" + quantidade +
                '}';
    }
}
