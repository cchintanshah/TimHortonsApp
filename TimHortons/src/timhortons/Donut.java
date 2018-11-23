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
public class Donut extends TimsProducts implements Consumable{

    private String description;
    private int calorieCount;

    private Donut(String description, int calorieCount, String name, double cost, double price) {
        super(name, cost, price);
        this.description = description;
        this.calorieCount = calorieCount;
    }

    public static  Donut create() {
        
        
       Donut d = null;
        d = new Donut(description,calorieCount,d.getName(),d.getProductionCost(),d.getRetailPrice());
        
        
        return d;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int getCalorieCount() {
        return 50;
    }

    @Override
    public String ConsuptionMethod() {
        return "Eat it";
    }

    @Override
    public String toString() {
        return "Donut{" + "description=" + description + ", calorieCount=" + calorieCount + '}';
    }
    
    @Override
   public double getProductionCost(){
   return 2.00;
   }

   @Override
    public double getRetailPrice(){
    
    return 3.15;
    }

}
