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

/**
 * 
 * Let's assume that TimBits are not Consumable. so this will not implement that interface but it is a 
 * Tim's Product.
 */
public class TimBits extends TimsProducts{
    
// Description and Calorie Count of TimBits
    private String description;
    private int calorieCount;

/**
 * 
 * @param description
 * @param calorieCount
 * @param name
 * @param cost
 * @param price 
 * 
 * This will create TimBit will all properties.
 */
    public TimBits(String description, int calorieCount, String name, double cost, double price) {
        super(name, cost, price);
        this.description = description;
        this.calorieCount = calorieCount;
    }
    
    /**
     * 
     * @return 
     */
    public static TimBits create() {
        
        TimBits tb = null;
        tb = new TimBits(description,calorieCount,tb.getName(),tb.getProductionCost(),tb.getRetailPrice());
        
        
        return tb;
    }

    @Override
    public String toString() {
        return "TimBits{" + "description=" + description + ", calorieCount=" + calorieCount + '}';
    }
    
   @Override
   public double getProductionCost(){
   return 0.99;
   }

   @Override
    public double getRetailPrice(){
    
    return 1.5;
    }
    
    
    
}
