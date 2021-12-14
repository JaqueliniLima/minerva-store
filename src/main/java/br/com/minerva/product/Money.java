package br.com.minerva.product;

public class Money {
    private double value;

    public Money(double value){
        if(value <= 0 )
            throw  new IllegalArgumentException("Valor informado inválido");
        this.value = value;
    }

}
