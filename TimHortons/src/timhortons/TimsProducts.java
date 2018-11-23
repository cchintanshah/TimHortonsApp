/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timhortons;

/**
 *
 * @author Chintan shah
 */
public class TimsProducts implements Commodity{
    
    private String name;
    private double cost;
    private double price;

    public TimsProducts() {
    
    }
    
    
    
    
    public TimsProducts(String name,double cost,double price){
        
        this.cost=cost;
        this.name = name;
        this.price = price;
    
      }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

   

    @Override
    public double getProductionCost() {
        
        
        return 0;
        
    }

    @Override
    public double getRetailPrice() {
        
        return 0;
        
    }
    
    
    
    @Override
    public String toString() {
        return "TimsProducts{" + "name=" + name + ", cost=" + cost + ", price=" + price + '}';
    }
    
}
