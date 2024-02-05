import java.util.Scanner;
class IntMethod {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of Int 1:");
        int i1 =sc.nextInt();
        System.out.println("Enter value of Int 2:");
        int i2 =sc.nextInt();
        IntMethod myclassobj = new IntMethod();
        myclassobj.total(i1,i2); 
    }
    public void total(int input1,int input2){
        byte Inttotal =(byte)(input1 + input2); // type casting only convert the integer data type to byte data type
        long LongIntTotal = input1 + input2; // without type casting the output will be showed because the long is greater than int
        short ShortIntTotal  =(short)(input1 + input2); //type casting only convert the integer data type to short data type
        float FloatIntTotal = input1 + input2; // without type casting the output will be showed because the float is greater than int
        float DoubleIntTotal = input1 + input2; // without type casting the output will be showed because the Double is greater than int
        System.out.println("Byte Int Value = "+Inttotal);
        System.out.println("Long Int Value = "+LongIntTotal);
        System.out.println("Short Int Value = "+ShortIntTotal);
        System.out.println("Float Int Value = "+FloatIntTotal);
        System.out.println("Double Int Value = "+DoubleIntTotal);
    }
}