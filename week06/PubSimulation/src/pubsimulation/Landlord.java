/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsimulation;

/**
 *
 * @author mburren
 */
public class Landlord {
    private Drink drink;
    
    public Landlord() {
        drink = new Tea();
        drink.ServeDrink();
    }
}
