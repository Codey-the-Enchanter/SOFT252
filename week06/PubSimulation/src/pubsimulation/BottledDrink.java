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
public class BottledDrink extends ColdDrink{
    
    @Override
    protected void PrepDrink(){
        System.out.println("Open bottle");
    }
}
