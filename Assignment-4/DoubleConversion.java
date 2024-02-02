import java.util.Scanner; 
public class DoubleConversion {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in); 
        System.out.print("input doble value "); //print statement
        String input1 = input.nextLine(); // get string input from user
        // primitive data type double = string data
        double inputDouble = Double.parseDouble(input1); //convert string to double
        System.out.println("input doble = " + inputDouble  ); //print statement
        
        //Double Object = primitiveData type double
        Double doubleObj = Double.valueOf(inputDouble); // convert primitive data type to object
        System.out.println("Double object value = "+ doubleObj ); //print statement
        
        // Double Object = String data
        Double doubleStrObj = Double.valueOf(input1); // convert string to object 
        System.out.println("Double String object value = "+ doubleStrObj ); // print statement
        
        //String obj = primitive data type 
        String strDouble = Double.toString(inputDouble); // convert primitive datatype to string
        System.out.println("String double object value = "+ strDouble );
        
    }
}