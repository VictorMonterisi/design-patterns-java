package edu.victor.designpatterns.factory;

public class ProdutoFactory {

    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) throws IllegalAccessException {
        switch (tipoProdutoEnum) {
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;
            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return produtoDigital;
            default:
                throw new IllegalAccessException("Tipo de produto não disponível");
        }
    }

}
