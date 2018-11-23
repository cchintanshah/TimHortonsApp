/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timhortons;

import java.util.Scanner;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;

/**
 *
 * @author Chintan Shah
 */

public class TimsOrder {

    private int size;
    private String name;
    public double sum = 0 ;

    private TimsOrder(int size, String name) {
        this.size = size;
        this.name = name;
    }
   
    /**
     *
     * @return
     */
    public static TimsOrder create() {
        int dnt=0,mg=0,muff=0,tb=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Let me know your order ! Enter how many product you want: ");
        int size = sc.nextInt();
        
        System.out.println("Please Enter 1: For Coffee Mug, Enter 2 For Donut, Enter 3 for TimBits, Enter 4 for Muffins");
        int choice = sc.nextInt();
        
        switch(choice){
        
            case 1 :
                mg++;
                Mug m = Mug.create();
               break;
            case 2 :
                dnt++;
               Donut d = Donut.create();
                break;
            case 3 :
                tb++;
                 TimBits t = TimBits.create();
                break;
            case 4 :
                Muffins mf = Muffins.create();
                muff++;
                break;
            default:
                System.out.println("Please enter valid choice. Thank You");
                break;
                
          
         }
        
       

        return null;
    }

        TimsProducts d = new Donut(name);
        TimsProducts m = new  Mug();
        TimsProducts tb = new  TimBits();
        TimsProducts mf = new  Muffins();
        
    // user define method to calculate the due amount 
    public double getAmountDue() {
        
        for(int i=0 ; i<= size;i++){ 
        
            sum = sum + d.getRetailPrice()+m.getRetailPrice()+tb.getRetailPrice()+mf.getRetailPrice();
        
        }
        
        
        return sum;
    }

    @Override
    public String toString() {
        return "Order for :"+ name +"/n"+super.toString();
    }

}
