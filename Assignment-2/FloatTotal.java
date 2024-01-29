public class FloatTotal{
    public static void main(String args[]){
        String input1=args[0];
        String input2=args[1];
        String input3=args[2];
        String input4=args[3];
        String input5=args[4];
        float f1=Float.parseFloat(input1);
        float f2=Float.parseFloat(input2);
        float f3=Float.parseFloat(input3);
        float f4=Float.parseFloat(input4);
        float f5=Float.parseFloat(input5);
        System.out.println("Float Total = "+((f1+f2+f3+f4+f5)/5));
    }
}