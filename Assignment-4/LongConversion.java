import java.util.Scanner; 
public class LongConversion {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in); 
        System.out.print("input Long value "); //print statement
        String input1 = input.nextLine(); // get string input from user
        // primitive data type double = string data
        long inputLong = Long.parseLong(input1); //convert string to double
        System.out.println("User input Long = " + inputLong  ); //print statement
        
        //Double Object = primitiveData type double
        long Longobj = Long.valueOf(inputLong); // convert primitive data type to object
        System.out.println("Long object value = "+ Longobj ); //print statement
        
        // Double Object = String data
        long Longobjstr = Long.valueOf(input1); // convert string to object 
        System.out.println("Long String object value = "+ Longobjstr ); // print statement
        
        //String obj = primitive data type 
        String strLong = Long.toString(inputLong); // convert primitive datatype to string
        System.out.println("String Long object value = "+ strLong );
        
    }
}

