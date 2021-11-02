/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.solent.com504.oodd.cart.model.dto;

/**
 *
 * @author osten
 */
public class Invoice {

    private double total;
    private List<ShoppingItem> items;
   
    public Invoice(){
           }
    
    public void addItem(ShoppingItem item){
        items.add(item);
    }
    
    public double getTotal(){
        
        double sum = 0;
        for (ShoppingItem item: items){
            
        sum +=  item.getPrice() * item.getQuantity();
        }
       
        return sum;
    }
    
    public List<ShoppingItem> getItems(){
        return items;
    }
}
