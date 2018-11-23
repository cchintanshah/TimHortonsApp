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
public class TimHortons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        TimsOrder t = TimsOrder.create();
        System.out.println(t);
        System.out.println("Total Price : $%.2f\n " + t.getAmountDue());

    }

}
