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
public class Muffins extends TimsProducts implements Consumable {
    
    private String description;
    private int calorieCount;

    public Muffins(String description, int calorieCount, String name, double cost, double price) {
        super(name, cost, price);
        this.description = description;
        this.calorieCount = calorieCount;
    }

     public static  Muffins create() {
         
         Muffins mf = null;
        mf = new Muffins(description,calorieCount);
        
        
        return mf;

    }

    private Muffins(String description, int calorieCount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Muffins{" + "description=" + description + ", calorieCount=" + calorieCount + '}';
    }
   

    @Override
    public int getCalorieCount() {
        return 0;
        
    }

    @Override
    public String ConsuptionMethod() {
        return "Eat It";
        
    }
    @Override
   public double getProductionCost(){
   return 0;
   }

   @Override
    public double getRetailPrice(){
    
    return 0;
    }
    
}
