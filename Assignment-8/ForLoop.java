public class ForLoop {
    public static void main(String[] args) {
        int i, threesum =0, foursum = 0, fivesum = 0;
        for(i=0;i<=100;i+=3){
        threesum+=i;
        }
        System.out.println("Total Sum 1 to 100 Divisible by 3 :" +threesum);
        for(i=0;i<=100;i+=4){
            foursum+=i;
        }
        System.out.println("Total Sum 1 to 100 Divisible by 4 :" +foursum);
        for(i=0;i<=100;i+=5){
            fivesum+=i;
        }
        System.out.println("Total Sum 1 to 100 Divisible by 5 :" +fivesum);
    }
}
