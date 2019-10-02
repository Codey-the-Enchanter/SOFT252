/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankentities;

/**
 *
 * @author mburren
 */
public class BankAccount {
    private double balance;
    private double overdraft;
    private String holder;
    
    public BankAccount(String holder) {
        this.holder = holder;
        overdraft = 500;
        balance = 100;
    }
    
    public void depositMoney(int amount) {
        balance += amount;
    }
    
    public boolean withdrawMoney(int amount) {
        if ((balance + overdraft) < amount)
            return false;
        else {
            balance -= amount;
            return true;
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getHolder() {
        return holder;
    }
    
    public double getOverdraft() {
        return overdraft;
    }
    
    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}
