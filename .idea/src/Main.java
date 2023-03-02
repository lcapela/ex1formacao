import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op;
        int opcaoBebida;
        Scanner ler = new Scanner(System.in);

        LinkedList<Produto> listaProdutos = new LinkedList<>();

        Produto b1 = new Produto(0.65, "Pepsi", 10);
        Produto b2 = new Produto(0.7, "Coca-Cola", 10);
        Produto b3 = new Produto(0.6, "Ice-Tea", 10);
        Maquina m1 = new Maquina(0);

        listaProdutos.add(b1);
        listaProdutos.add(b2);


        do {
            Menu.menu();
            op = ler.nextInt();
            switch (op) {
                case 1:
                    for (int i = 0; i < listaProdutos.size(); i++) {
                        System.out.println("Codigo de Compra: " + i);
                        System.out.println(listaProdutos.get(i).toString());
                    }
                case 2:
                    System.out.println("Qual o codigo da bebida que deseja: ");
                    opcaoBebida = ler.nextInt();

                    System.out.println("Insere o dinheiro: ");
                    double dinheiro = 0;
                    do {
                        dinheiro  += ler.nextDouble();
                        if (listaProdutos.get(opcaoBebida).precoProduto > dinheiro) {
                            System.out.println("Inserir mais dinheiro");
                        }
                    } while (listaProdutos.get(opcaoBebida).precoProduto < dinheiro);
                    listaProdutos.get(opcaoBebida).tirarStock();
                    m1.valorSaldo(listaProdutos.get(opcaoBebida).precoProduto);

                    double troco = dinheiro-listaProdutos.get(opcaoBebida).precoProduto;
                    if(troco < 0){
                        System.out.println("O troco: "+troco);
                    }

                case 3:
                    int opcao3 ;
                    do{
                        System.out.println("Sub-Menu");
                        System.out.println("1-Saldo da maquina");
                        System.out.println("2-Stock");
                        System.out.println("3-Adicionar stock");
                        opcao3 = ler.nextInt();

                        switch (opcao3){
                            case 1:
                                m1.getSaldo();
                                break;
                            case 2 :
                                for(int i = 0; i < listaProdutos.size(); i++){
                                    listaProdutos.get(i).toStringQtdENome();
                                }
                                break;
                        }
                    }while(opcao3 > 3);
            }

        }while (op > 3);
    }
}