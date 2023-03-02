import java.util.Scanner;

public class Produto {
    double precoProduto;
    String nome;
    int qtdBebida;


    Scanner ler = new Scanner(System.in);

    public Produto(double precoProduto, String nome, int qtdBebida) {

        this.precoProduto = precoProduto;
        this.nome = nome;
        this.qtdBebida = qtdBebida;
    }
    public void reporStock(){
        int qtd;
        System.out.println("Qual a quantidade a inserir: \n");
        qtd = ler.nextInt();
        setQtdBebida(qtd);
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQtdBebida() {
        return qtdBebida;
    }

    public void setQtdBebida(int qtdBebida) {
        this.qtdBebida = qtdBebida;
    }
    public void tirarStock() {
        this.qtdBebida -= 1;
    }


    @Override
    public String toString() {
        return "Produto:" +
                "Preco Produto=" + precoProduto +" €"+
                ", Nome='" + nome + '\'' +
                ", Quantidade =" + qtdBebida +
                '}';
    }
    public String toStringQtdENome() {
        return
                ", Nome='" + nome + '\'' +
                ", Quantidade =" + qtdBebida +
                '}';
    }

}
