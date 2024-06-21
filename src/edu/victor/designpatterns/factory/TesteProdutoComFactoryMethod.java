package edu.victor.designpatterns.factory;

public class TesteProdutoComFactoryMethod {
    public static void main(String[] args) throws IllegalAccessException {
        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);

        System.out.println(produtoFisico + "\n" + produtoDigital);

    }
}
