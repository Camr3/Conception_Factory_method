package Creators;

import Products.Burger;

public abstract class Restaurant {
    public Burger orderBurger(){
        Burger burger =  createBurger();
        burger.prepare();
        return burger;
    }
public abstract Burger createBurger();

}
