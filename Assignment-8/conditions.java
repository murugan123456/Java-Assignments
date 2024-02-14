class conditions{
    public static void main(String args[]){
      int i=0, oddsum=0, evensum=0 ;
      // sum of even and odd numbers using do while loop
      System.out.println("sum of even and odd numbers using do while loop");
        do{
            i+=1;
            if(i%2==0)
                evensum+=i;
            else
                oddsum+=i;
        } while(i<50);
        System.out.println("from 1 to 50 Odd sum value using do while loop = "+oddsum);
        System.out.println("from 1 to 50 even sum value using do while loop = "+evensum);
        System.out.println("*******************************************");
        System.out.println("sum of even and odd numbers using while loop");
    //sum of even and odd numbers using while loop
   int j=0,sumeven =0,sumodd=0;
    while(j<100){
        j+=1;
            if(j%2==0)
                sumeven+=j;
            else
                sumodd+=j;
    }
        System.out.println("from 1 to 100 Odd sum value using while loop = "+sumodd);
        System.out.println("from 1 to 100 even sum value using while loop = "+sumeven);
}
}