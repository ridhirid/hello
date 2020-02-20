/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcircle;

import java.util.Scanner;

/**
 *
 * @author kantaria
 ridhima tara is my name
 */
public class TestCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        circle c1=new circle(); //default constructore
//        c1.radius=2.5;
//        System.out.println("area of circle="+c1.areaCircle());

          circle c2=new circle();  //calles default constructore
          System.out.println("radius="+c2.radius);
          System.out.println("area of circle="+c2.areaCircle());
        
          circle c3=new circle();
          System.out.println("radius c3="+c3.radius);
          System.out.println("area of circlec3="+c3.areaCircle());
          
          Scanner input=new Scanner(System.in);
          System.out.println("enter any value of radius");
          double r=input.nextDouble();
          circle c4=new circle(r); //calles argument constrictpre
          System.out.println("radius c4="+c4.radius);
          System.out.println("area of circlec4="+c4.areaCircle());
    }
    
}
