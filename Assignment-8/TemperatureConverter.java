import java.util.Scanner;
public class TemperatureConverter {
     static double temparature;
     static String unit; 
    public static void main(String args[]){

    TemperatureConverter temp = new TemperatureConverter();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Temparature : ");
    temparature = sc.nextDouble();
    System.out.print("Enter Unit: "); 
    Scanner Str = new Scanner(System.in); 
    unit = Str.nextLine();
    

    if(unit.equals("C"))
    {
        double fah =  temp.ConvertToFahrenheit(temparature);
        System.out.println(temparature+" Celcious is Equal to "+fah+" Fahrenheit");
    }
    else if(unit.equals("F"))
    {
       double cel = temp.ConvertToCelcious(temparature);
        System.out.println(temparature+" degree Fahrenheit is equla to " +cel+ " degree Celcious");
    }  
    else
    {
        System.out.println("invalid unit ");
    }
}
 public double ConvertToFahrenheit(double temp1){
    double Fahrenheit = (temp1*(9/5))+32;
    return Fahrenheit;
 }
 public double ConvertToCelcious(double temp2){
    double celcious = (temp2-32)/1.8;
    return celcious;
 }
}
