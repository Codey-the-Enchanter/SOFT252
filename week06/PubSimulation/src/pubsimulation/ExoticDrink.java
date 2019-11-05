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
public abstract class ExoticDrink implements Drink{
    
    public void ServeDrink(){
        System.out.println("Add ice");
        
        Spirit();
        
        System.out.println("Add mixer");
        
        Garnish();
    }
    
    protected abstract void Spirit();
    
    protected abstract void Garnish();
}
