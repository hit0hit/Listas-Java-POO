package EX3;


public class Compra {
    private Pessoa pessoa;
    private Produto produto;

    public void Comprar(Pessoa pessoa, Produto produto) {
        this.pessoa = pessoa;
        this.produto = produto;
    }

    public String VerificarCompra() {
        return "\n" + pessoa.ConsultaNome()
        + " comprou um "
        + produto
        +" com sucesso!";
    }
}
