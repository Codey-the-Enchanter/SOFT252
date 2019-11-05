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
public class Coffee extends HotDrink{
    
    @Override
    protected void Brew(){
        System.out.println("Brew coffee");
    }
    
    @Override
    protected void AddIngredient(){
        System.out.println("Add Lemon");
    }
}
