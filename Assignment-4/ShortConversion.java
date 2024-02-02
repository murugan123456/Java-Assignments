import java.util.Scanner;
public class ShortConversion {
    public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    System.out.println("enter Short Value : ");
    String str = input.nextLine();
    // string to primitive datatype
    short s1 = Short.parseShort(str);
    System.out.println("User Short Input "+s1);
    // primitive data type objdatye
    short shortobj = Short.valueOf(s1);
    System.out.println(" Short object value : "+shortobj);
    //string to object datatype
    short shortstrobj = Short.valueOf(str);
    System.out.println("Short String Object Value : "+shortstrobj);
    // primitive datatype to string datatype
    String shortstr = Short.toString(s1);
    System.out.println("Short String value : "+shortstr);
    }
}
