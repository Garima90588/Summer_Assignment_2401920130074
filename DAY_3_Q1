class Solution {
    public void moveZeroes(int[] arr) {
       
      /*  for(int i=0;i<nums.length;i++)
        {
            int swap=0;
            for(int j=0;j<nums.length-i-1;j++)
            {
                if(nums[j]== 0 && nums[j+1] !=0)
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swap=1;
                }
            }
            if(swap==0)
               break;
        }*/

         ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr2.add(arr[i]);
            }
        }
        
        int n=arr.length - arr2.size();
        while(n!=0)
        {
            arr2.add(0);
            n--;
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr2.get(i);
        }
        
    }
}
