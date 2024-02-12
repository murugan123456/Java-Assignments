import java.util.Scanner;
public class MultipleClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input 1 : ");
        int input1 = sc.nextInt();
        System.out.println("Enter Input 2 : ");
        int input2 =sc.nextInt();
        Calculater total = new Calculater();
       int totoaladd= total.addition(input1, input2);
       float totaldiv= total.division(input1, input2);
       int totalmul=total.multiplication(input1, input2);
       int totalsub= total.substract(input1, input2);
      System.out.println("Addition Total : "+totoaladd);
      System.out.println("Division : "+totaldiv);
      System.out.println("Multiplication : "+totalmul);
      System.out.println("Substraction : "+totalsub);
    }
}
class Calculater{
    public int addition(int in1,int in2){
        int total = in1+in2;
        return total;
    }
    public float division(float in1,float in2){
        float divtotal = in1/in2;
        return divtotal;
    }
    public int multiplication(int in1,int in2){
        int multotal = in1*in2;
        return multotal;
    }
    public int substract(int in1,int in2){
        int subtotal = in1-in2;
        return subtotal;
    }
}