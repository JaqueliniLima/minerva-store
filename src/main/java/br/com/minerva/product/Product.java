package br.com.minerva.product;

import br.com.minerva.product.exception.NameProductRequiredException;

public class Product {

    private final String name;
    private final String description;
    private final Money price;

    public Product(String name, String description, double price) {
        this.checkNameIsValid(name);
        this.name = name;
        this.description = description;
        this.price = new Money(price);
    }

    private void checkNameIsValid(String name) {
        if(this.isNameInvalid(name)) throw new NameProductRequiredException("Nome do produto é obrigatorio");
    }

    private boolean isNameInvalid(String name) {
        return name == null || name.isBlank();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
