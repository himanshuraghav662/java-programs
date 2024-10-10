import java.util.*;
public class DOsum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int sum1=0;
       int sum2=0;
       for(int i=1;i<=m;i++){
        if(i%n==0)
        sum1+=i;
        else
        sum2+=i;
       }
       int ans=Math.abs(sum1-sum2);
       System.out.println("ans is "+ans);
       sc.close();
    }
}
