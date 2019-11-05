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
public abstract class HotDrink implements Drink{
    
    @Override
    public void ServeDrink(){
        System.out.println("Boil water");
        
        Brew();
        
        System.out.println("Pour into cup");
        
        AddIngredient();
    }
    
    protected abstract void Brew();
    
    protected abstract void AddIngredient();
}
