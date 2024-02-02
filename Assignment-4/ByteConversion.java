import java.util.Scanner;

public class ByteConversion {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Byte Value : ");
        String str=input.nextLine();
         // string to primitiva datatype
        byte b1 = Byte.parseByte(str); 
        System.out.println("Input Byte : "+b1); 
        // primitive data type to object data type
        byte byteobj = Byte.valueOf(b1);
        System.out.println("Byte Object Value : "+byteobj);
        //String to Object datatype
        byte bytestrobj = Byte.valueOf(str);
        System.out.println("Byte String Object Value : "+bytestrobj);
        // primitive datatype to string datatype
        String bytestr = Byte.toString(b1);
        System.out.println("String Byte object Value : "+bytestr); 
    }
}
