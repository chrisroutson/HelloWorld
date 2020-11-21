
package HelloWorld;

import java.util.Scanner;
import java.lang.Math;     
public class PaintEstimator {
   public static void main(String[] args) {
         Scanner scnr=new Scanner(System.in);
              
               
               double height,width,area,paint_needed;
              
              
               
               final double one_gallon_covers=350;
              
              
              
               System.out.println("Enter wall height (feet):");
               height=scnr.nextDouble();
              
              
              
               System.out.println("Enter wall width (feet):");
               width=scnr.nextDouble();
              
              
               
               area=width*height;
              
              
               
               System.out.println("Wall area: "+area+" square feet");
              
              
               
               paint_needed=area/one_gallon_covers;
              
              
               
               System.out.println("Paint needed: "+paint_needed+" gallons");
              
              
               
               System.out.println("Cans needed: "+Math.round(paint_needed)+" can(s)");
      

   }

}
