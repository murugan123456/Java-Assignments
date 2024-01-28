public class Addition {
    public static void main(String args[]) {
        String b2=args[0];
        String s2=args[1];
        String i2=args[2];
        String l2=args[3];
        String f2=args[4];
        String d2=args[5];
        byte b1= Byte.parseByte(b2);
        short s1=Short.parseShort(s2);
        int i1=Integer.parseInt(i2);
        long l1=Long.parseLong(l2);
        float f1=Float.parseFloat(f2);
        double d1=Double.parseDouble(d2);
        // addition of byte int short long double float and Average of all data types;
        System.out.println("Addition of User Input's = "+((b1+s1+i1+l1+f1+d1)/5));
    }
}