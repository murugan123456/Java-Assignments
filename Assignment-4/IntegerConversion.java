import java.util.Scanner;
public class IntegerConversion {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter Int Value : ");
        String str = input.nextLine();
        // string to primitive datatype
        int i1 = Integer.parseInt(str);
        System.out.println("User Integer Input "+i1);
        // primitive data type objdatye
        int intobj = Integer.valueOf(i1);
        System.out.println(" Short Integer value : "+intobj);
        //string to object datatype
        int intstrobj = Integer.valueOf(str);
        System.out.println("Short String Object Value : "+intstrobj);
        // primitive datatype to string datatype
        String intstr = Integer.toString(i1);
        System.out.println("Short String value : "+intstr);
    }
}
