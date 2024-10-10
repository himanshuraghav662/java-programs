public class PSpair {
    public static void main(String args[]){
        int[] arr={9,8,3,-7,3,9};
        int small=arr[0];
        int small1=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
         if(arr[i]<small){
            small1=small;
            small=arr[i];
         }
         else if(arr[i]<small1)
         small1=arr[i];
        }
       int ans=small*small1;
        System.out.println("ans is "+ans);
    }
}
