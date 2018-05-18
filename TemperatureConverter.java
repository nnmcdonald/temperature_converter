////////////////////////////////////////////////////////////////////////////
//
// Nathaniel McDonald
// February 6, 2016
//
////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  DESCRIPTION: This program converts a temperature from celsius to farenheit, or from farenheit to celsius.
// 
// INPUTS:  A temperature and whether it's in celsius or farenheit.
//    
//
// OUTPUTS:  The  original temperature and the converted value.
//   
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class TemperatureConverter
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Please enter a temperature rounded to two decimal places. (Just a number)");
    double tempNumber = keyboard.nextDouble();
    
    System.out.println("Is this temperature in farenheit or celsius? Enter \"f\" for farenheit or \"c\" for celsius" +
                       ", it is not case sensitive.");
    String tempType = keyboard.next();
    
    double degreesConverted;
    //Converts the tempNumber entered into Celsius
    if (tempType.equalsIgnoreCase("f"))
    {
      degreesConverted = 5*(tempNumber - 32)/9;
      //Displays the conversion rounded to two decimal places.
      System.out.printf("%1.2f %1s equals %1.2f C" , tempNumber, tempType, degreesConverted);
    } 
    //Converts the tempNumber entered into Farenheit
    else if (tempType.equalsIgnoreCase("c"))
    { 
      degreesConverted = (9*(tempNumber/5) + 32);
      //Displays the conversion rounded to two decimal places.
      System.out.printf("%1.2f %1s equals %1.2f F" , tempNumber, tempType, degreesConverted);
    } 
    //Displays an error message if something other than c or f is entered for the temperature type.
    else  
      System.out.println("Error, please just enter a \"c\" or \"f\".");
      
      keyboard.close();
  }
}
