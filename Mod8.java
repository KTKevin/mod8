package tester;
import java.lang.Math;
public class Mod8 {
	// input, integer z, output, integer in z base 8.
	
 public int base8(int z)
 {   if(z == 0)
	 return 0;
	 int power = (int)Math.floor(Math.log(z)/Math.log(8));
	 int remainder = z; 
     int base8=0;
     int quote = (int)Math.floor(remainder/(int)Math.pow(8, power));
     while(power>=0)
     { 
    	 base8 = base8 + (int)Math.pow(10,power)*quote;
    	 remainder = remainder - (int)Math.pow(8, power)*quote;
    	 power = power-1;
    	 if(power!= -1)
    	 quote = (int)Math.floorDiv(remainder,(int)Math.pow(8, power));
     }
	 return base8; 
 }
 
 public int base10(int z)
 {

	 int power = (int)(Math.floor(Math.log(z)/Math.log(10)));
	 int base10 = 0;
	 int quote = z;
	 int digit = z;
	
	 while (power >= 0)
	 {  
		quote = digit/(int)Math.pow(10, power);
	    base10 = base10 + (int)Math.pow(8, power)*quote;
        digit = digit - quote*(int)Math.pow(10, power);
		 
		power = power-1; 
	 }
	 return base10;
 }
 
 public int addinbase8(int z, int w)
 
 {
	 int b10 = base10(z)+base10(w);
	 return base8(b10);
 }
 
 

}
