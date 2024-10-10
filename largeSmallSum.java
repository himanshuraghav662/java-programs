public class EOsum {
    public static void main(String args[]){
      //  Scanner sc =new Scanner(System.in);
        int[] arr={1,8,0,2,3,5,6};
        int odd=Integer.MAX_VALUE;
        int even=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(i%2==0 && arr[i]>even)
            even=arr[i];
            else if(i%2!=0 && arr[i]<odd)
            odd=arr[i];
        }
        int odd1=Integer.MAX_VALUE;
        int even1=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(i%2==0 && arr[i]>even1 && arr[i]<even)
            even1=arr[i];
            else if(i%2!=0 && arr[i]<odd1 && arr[i]>odd)
            odd1=arr[i];
        }
        int ans=odd1+even1;
        System.out.println("ans is "+ans);
    }
}
