import java.util.Scanner;
public class Bin2Hex{
   public static void main (String [] args){
  


   Scanner kb = new Scanner(System.in);
   System.out.print("Enter a binary string: ");
   char arr[] = { '0', '1', '2', '3', '4', '5', '6', '7','8', '9',  'A', 'B', 'C', 'D', 'E', 'F' };
   String hexVal = " ";
   
   
   
   
   int binary = kb.nextInt();
   int print = binary;
   int temp; 
   int dec = 0; 
   int pow = 1; //starts at 1 because 2^0 = 1
   int lastDig; 
 
   temp = binary;
   
   while( binary > 0){
      lastDig = binary%10; //captures the last digit of the number
      
      dec = dec  + lastDig * pow; // add updated number to the new digit times power
     //if rem is 0 adds no value to the updated number
      
      binary = binary/10; //updates number excluding number captured above
      
      pow = pow * 2; //updates the power for each digit 
   }
       
                
   //convert to hex
   
     while(dec > 0){
         int remainder = dec%16; //remainder of division that corresponds with index of array
         hexVal = arr[remainder] + hexVal; //adds values from array to final latest value goes first
         dec = dec/16; //updates dec to result of division to do the next remainder with 
         
     }
 
      System.out.println("The equivalent hex for binary number... " + + print +  " is:  " + hexVal);













   }
}