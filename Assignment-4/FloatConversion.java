import java.util.Scanner; 
public class FloatConversion {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in); 
        System.out.print("input Float value "); //print statement
        String input1 = input.nextLine(); // get string input from user
        // primitive data type double = string data
        float inputfloat = Float.parseFloat(input1); //convert string to double
        System.out.println("input Float = " + inputfloat  ); //print statement
        
        //Double Object = primitiveData type double
        float floatobj = Float.valueOf(inputfloat); // convert primitive data type to object
        System.out.println("Float object value = "+ floatobj ); //print statement
        
        // Double Object = String data
        float floatobjstr = Float.valueOf(input1); // convert string to object 
        System.out.println("Float String object value = "+ floatobjstr ); // print statement
        
        //String obj = primitive data type 
        String strfloat = Float.toString(inputfloat); // convert primitive datatype to string
        System.out.println("String Float object value = "+ strfloat );
        
    }
}
