/*
source: Getting started with JUnit in NetBeans
https://www.youtube.com/watch?v=Vnyeq3ZS_1Q
To create test file in Test Packages:
(With class selected) Tools > Create/Update Tests
To run tests
(With class selected) right click class > Test File
*/

package testjunit;

public class square {
    private double sideLen;

     public square(double len) {
        sideLen = len;
     }

     public double area()  {
     System.out.println("sideLen = " + sideLen);
    return sideLen*sideLen;

    }
     
    public void setSideLength()  {
     
    }
}



