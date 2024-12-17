package Creators;

import Products.*;

public class VeggieBurgerRestaurant extends Restaurant{
    public Burger createBurger(){
        return new VeggieBurger();
    }
}
