import java.util.Scanner;
public class Hex2Bin{
   public static void main (String [] args){
   
   
   Scanner kb = new Scanner(System.in);
   System.out.print("Enter a Hexadecimal string: ");
   
   String input = kb.nextLine();
   String[] hexBits = {"0000", "0001", "0010", "0011",
  "0100", "0101", "0110", "0111",
  "1000", "1001", "1010", "1011",
  "1100", "1101", "1110", "1111"};
  
  System.out.print("The equivalent binary for hexadecimal " + input + ": " );
  for(int i = 0; i< input.length(); i++){
   
    char index = input.charAt(i); 

      char upperCase = Character.toUpperCase(index);
          switch (upperCase) {
            case '0':
                System.out.print(hexBits[0] + " ");
              break;
            case '1':
                System.out.print(hexBits[1] + " ");
              break;
            case '2':
                System.out.print(hexBits[2] + " ");
              break;
            case '3':
                System.out.print(hexBits[3] + " ");
              break;  
            case '4':
                System.out.print(hexBits[4] + " ");
              break;
            case '5':
                System.out.print(hexBits[5] + " ");
              break;  
           case '6':
                System.out.print(hexBits[6] + " ");
              break; 
           case '7':
                System.out.print(hexBits[7] + " ");
              break; 
           case '8':
                System.out.print(hexBits[8] + " ");
              break; 
           case '9':
                System.out.print(hexBits[9] + " ");
              break; 
           case 'A':
              System.out.print(hexBits[10] + " ");
              break;
            case 'B':  
               System.out.print(hexBits[11] + " ");;
               break;
            case 'C': 
               System.out.print(hexBits[12] + " ");
               break;
            case 'D': 
               System.out.print(hexBits[13] + " ");
               break;
            case 'E': 
               System.out.print(hexBits[14] + " ");
               break;
            case 'F': 
              System.out.print(hexBits[15] + " ");
               break;
           default:
               break;
            }
   
       }


   
   
  }
}