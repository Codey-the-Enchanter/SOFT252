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
public class TapDrink extends ColdDrink{
    
    @Override
    protected void PrepDrink(){
        System.out.println("Put glass under tap");
    }
}
