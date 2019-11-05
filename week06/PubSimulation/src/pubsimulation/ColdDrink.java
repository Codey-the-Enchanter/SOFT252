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
public abstract class ColdDrink implements Drink{
    
    @Override
    public void ServeDrink(){
        PrepDrink();
        
        System.out.println("Pour into glass");
    }
    
    protected abstract void PrepDrink();
}
