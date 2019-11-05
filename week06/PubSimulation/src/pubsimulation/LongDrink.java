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
public class LongDrink extends ExoticDrink{
    
    @Override
    protected void Spirit(){
        System.out.println("Add spirit");
    }
    
    @Override
    protected void Garnish(){
        System.out.println("Add simple garnish");
    }
}
