package timon;

public class Solution {
	public void quicksort(int[] nums, int low, int high){
        if(high<=low){
            return;
        }
        int i=low,j=high,indx=i;
        boolean flag=false;
        while(i<j){
            if(!flag){
                if(nums[i]>nums[j]){
                    flag=true;
                    int t=nums[j];
                    nums[j]=nums[i];
                    nums[i]=t;
                    indx=j;
                }
                else{
                    j--;
                }
            }else{
                if(nums[i]>nums[j]){
                    flag=false;
                    int t=nums[j];
                    nums[j]=nums[i];
                    nums[i]=t;
                    indx=i;
                }else{
                    i++;
                }
            }
        }
        quicksort(nums,low,indx-1);
        quicksort(nums,indx+1,high);
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        int len=nums1.length>nums2.length? nums1.length:nums2.length;
        final int[] r=new int[len];
        quicksort(nums1,0,nums1.length-1);
        quicksort(nums2,0,nums2.length-1);
        int i=0,j=0,k=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }else{
                if(nums1[i]>nums2[j]){
                    j++;
                }else{
                    if(k==0||r[k-1]!=nums1[i]){
                        r[k]=nums1[i];
                        k++;
                        
                    }
                    i++;
                    j++;
                    
                }
            }
        }
        final int[] result=new int[k];
        for(int m=0;m<k;m++)
            result[m]=r[m];
        return result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
