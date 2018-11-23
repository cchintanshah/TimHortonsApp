/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timhortons;

import javafx.scene.paint.Color;

/**
 *
 * @author Chintan Shah
 */
public class Mug extends TimsProducts implements Consumable {

    

    private  Color color;
    
    
   
    public Mug(Color color,String name,double cost,double price) {
        super(name, cost, price);
        
        this.color = color;
    }

    public  static  Mug create() {
        
        Mug obj = null;
        obj = new Mug(color,obj.getName(),obj.getProductionCost(),obj.getRetailPrice());
        
        return obj ;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Mug{" + "color=" + color + '}';
    }

    @Override
    public int getCalorieCount() {
        return 10;
    }

    @Override
    public String ConsuptionMethod() {
        return "Drink it";
    }
    
    @Override
   public double getProductionCost(){
   return 0.75;
   }

   @Override
    public double getRetailPrice(){
    
    return 2.00;
    }

}
