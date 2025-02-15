package com.parctice.designpattern.d_factory;

import com.parctice.designpattern.d_factory.store.ChicagoPizzaStore;
import com.parctice.designpattern.d_factory.store.NYPizzaStore;
import com.parctice.designpattern.d_factory.store.PizzaStore;

public class PizzaDriveApplication {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        nyStore.orderPizza("cheese");
        System.out.println();
        System.out.println();

        chicagoStore.orderPizza("cheese");
    }
}
