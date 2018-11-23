/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timhortons;

/**
 *
 * @author Chintan Shah
 */
public interface Consumable {

/* Perform getCalorieCount 
    and return Colorie Count
  */
    public int getCalorieCount();
    
    
    /**
     * Perform Consuption method 
     * @return  "Drink It"  or "Eat it" According to the product
     */

    public String ConsuptionMethod();

}
