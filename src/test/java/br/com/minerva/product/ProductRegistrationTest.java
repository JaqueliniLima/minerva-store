package br.com.minerva.product;

import br.com.minerva.product.exception.NameProductRequiredException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductRegistrationTest {

    private static final String NAME_PRODUCT = "Calça Flare";
    private static final String DESCRIPTION_PRODUCT = "Calça cintura alta";

    @Test
    public void deveRetornarExcecaoQuandoNomeProdutoNaoEstiverPreenchido(){
        assertThrows(NameProductRequiredException.class, () -> new Product(null, DESCRIPTION_PRODUCT, 0.0));
    }

    @Test
    public void deveCadastrarUmProdutoQuandoNomeEstiverPreenchido(){
        Product product = new Product(NAME_PRODUCT, DESCRIPTION_PRODUCT, 70.0);
        assertEquals(NAME_PRODUCT,product.getName());
    }
}
