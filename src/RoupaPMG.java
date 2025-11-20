import java.util.Scanner;

public class RoupaPMG implements Item {
    private String descricao;
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;
    private int estoqueMaximo;
    private int estoqueMinimo;
    private final Scanner sc = new Scanner(System.in);

    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMaximo, int estoqueMinimo) {
        this.descricao = descricao;
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
        this.estoqueMaximo = estoqueMaximo;
        this.estoqueMinimo = estoqueMinimo;
    }

    public void venda() {
        int quantidadeVendida;
        System.out.print("Digite o tamanho da roupa(P, M ou G): ");
        char tamanhoDigitado = sc.next().charAt(0);
        switch (tamanhoDigitado) {
            case 'P':
            case 'p':
                this.quantidadeP--;
                break;
            case 'M':
            case 'm':
                this.quantidadeM--;
                break;
            case 'G':
            case 'g':
                this.quantidadeG--;
                break;
            default:
                System.out.println("Caractere invalido");
                break;
        }
    }

    public void reposicaoEstoque() {
        if (this.quantidadeP < this.estoqueMinimo) {
            this.quantidadeP = this.estoqueMaximo;
        }

        if (this.quantidadeM < this.estoqueMinimo) {
            this.quantidadeM = this.estoqueMaximo;
        }

        if (this.quantidadeG < this.estoqueMinimo) {
            this.quantidadeG = this.estoqueMaximo;
        }
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public String toString() {
        return this.descricao +
                " {estoqueP=" + quantidadeP +
                ", estoqueM=" + quantidadeM +
                ", estoqueG=" + quantidadeG +
                '}';
    }
}

