public abstract class Peca {
    protected String descricao;
    protected int quantidade;
    protected int estoqueMinimo;
    protected int estoqueMaximo;

    public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    public abstract void venda();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void reposicaoEstoque() {
        if (this.quantidade < this.estoqueMinimo) {
            this.quantidade = this.estoqueMaximo;
        }
    }


}
