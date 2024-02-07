import java.util.Scanner;

public class Method {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Tamil Mark : ");
        int Tamil=input.nextInt();
        System.out.println("Enter English Mark : ");
        int English=input.nextInt();
        System.out.println("Enter Maths Mark : ");
        int Maths=input.nextInt();
        System.out.println("Enter Science Mark : ");
        int Science=input.nextInt();
        System.out.println("Enter Social Mark : ");
        int Social=input.nextInt();
        Method total = new Method(); //IntMethod myclassobj = new IntMethod();
        int Marks = total.Addition(Tamil,English,Maths,Science,Social);
        System.out.println("Total Marks = "+Marks);
        float avgmarks = total.average(Marks);
        System.out.println("Average Mark = "+avgmarks);
    }
    public int Addition(int mark1, int mark2, int mark3, int mark4,int mark5){
        int totalMarks = mark1+mark2+mark3+mark4+mark5;
        return totalMarks;
    }
    public float average(float TotalMarks){
        float AvgMark = TotalMarks/5;
        return AvgMark;
    }
    
}