/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author fatah
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) {
    
        
        JFrame frame = new JFrame("Parking Simulator");
        Parking panel = new Parking();
        frame.setContentPane(panel);
        panel.setLayout(null);
        frame.setSize(1090, 400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArrayList<Car> cars=new ArrayList<Car>();
        

       
      for(int i=1 ; i<=3 ; i++)
      {   
          Car c = new Car(i); 
          cars.add(c);
          panel.add(c);
       } 
      
      for(Car c : cars)
      {
          Thread t=new Thread(c);
          t.start();
      }
      frame.setVisible(true);
    }

}
