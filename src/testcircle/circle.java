/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcircle;

/**
 *
 * @author kantaria
 */
public class circle 
{
    public double radius;  //data fields or member variable
    
    public circle() //no argument constructore
    {
        radius=5.5;
    }
    public circle(double r) //argument constructore
    {
        radius=r;
    }
    public double areaCircle() //member method
    {
        return 3.14*radius*radius;
    }
}
