import java.util.*;
public class UserInput {
    public static void main(String args[]) {
     Scanner marks=new Scanner(System.in);
     float mark1=marks.nextFloat();
     System.out.println("Enter the mark 1 : "+mark1);
     float mark2=marks.nextFloat();
     System.out.println("Enter the mark 2 : "+mark2);
     float mark3=marks.nextFloat();
     System.out.println("Enter the mark 3: "+mark3);
     float mark4=marks.nextFloat();
     System.out.println("Enter the mark 4 : "+mark4);
     float mark5=marks.nextFloat();
     System.out.println("Enter the mark 5 : "+mark5);
     float total =mark1+mark2+mark3+mark4+mark5;
     System.out.println("Total marks = "+total);
     System.out.println("Average Mark is : "+(total/5));
    }
}