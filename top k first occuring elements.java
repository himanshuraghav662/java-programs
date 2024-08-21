class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int[] arr=new int[k];
        arr[0]=nums[0];
        int t=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
         if(count==k){
            return arr;
         }
         else if(nums[i]!=t){
        arr[count]=nums[i];
        t=nums[i];
        count++;
         }
         else{
            continue;
         }
        }
        return arr;
    }
}
