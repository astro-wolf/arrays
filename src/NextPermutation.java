/**
 * Created by Vishwas on 13-03-2018.
 * <p>
 * https://leetcode.com/problems/next-permutation/description/
 */
public class NextPermutation {

    public static void main(String[] args) {
        NextPermutation nextPermutation = new NextPermutation();
        nextPermutation.nextPermutation(new int[]{1, 3, 2});
    }

    public void nextPermutation(int[] num) {
        int n=num.length;
        if(n<2)
            return;
        int index=n-1;
        while(index>0){
            if(num[index-1]<num[index])
                break;
            index--;
        }
        if(index==0){
            reverseSort(num,0,n-1);
            return;
        }
        else{
            int val=num[index-1];
            int j=n-1;
            while(j>=index){
                if(num[j]>val)
                    break;
                j--;
            }
            swap(num,j,index-1);
            reverseSort(num,index,n-1);
            return;
        }
    }

    public void swap(int[] num, int i, int j){
        int temp=0;
        temp=num[i];
        num[i]=num[j];
        num[j]=temp;
    }

    public void reverseSort(int[] num, int start, int end){
        if(start>end)
            return;
        for(int i=start;i<=(end+start)/2;i++)
            swap(num,i,start+end-i);
    }

//    public int[] nextPermutation(int[] nums) {
//        if (nums == null || nums.length < 2)
//            return nums;
//        for (int idx = nums.length - 1; idx > 0; idx--) {
//            if (nums[idx - 1] < nums[idx]) {
//                nums[idx - 1] = nums[idx] + nums[idx - 1];
//                nums[idx] = nums[idx - 1] - nums[idx];
//                nums[idx - 1] = nums[idx - 1] - nums[idx];
//                return nums;
//            }
//        }
//        int left = 0, right = nums.length - 1;
//        while (left < right) {
//            nums[left] = nums[right] + nums[left];
//            nums[right] = nums[left] - nums[right];
//            nums[left] = nums[left] - nums[right];
//            left++;
//            right--;
//        }
//        return nums;
//    }
}
