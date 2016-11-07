import java.util.ArrayList;

public class Sulotion {
	/*
        Sort nums using merge method,not the best sulotion, just for practicing
    */
	public int[] aux;
    public void sort(int[] nums){
        aux=new int[nums.length];
        sort(nums,0,nums.length-1);
    }
    public void sort(int[] nums, int low, int high){
        if(low>=high) return;
        int mid=(high+low)/2;
        sort(nums, low, mid);
        sort(nums, mid+1, high);
        merge(nums,low,mid,high);
        return;
    }
    public void merge(int[] nums, int low, int mid, int high){
        for(int i=low;i<=high;i++){
            aux[i]=nums[i];
        }
        int k=low,j=mid+1;
        for(int i=low;i<=high;i++){
        	if(k>mid) nums[i]=aux[j++];
        	else if(j>high) nums[i]=aux[k++];
        	else if(aux[k]<aux[j]) nums[i]=aux[k++];
        	else nums[i]=aux[j++];
        }
    }
    
	public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int i=0,j=0,count=0;
        sort(nums1);
        sort(nums2);
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]) i++;
            else{
                if(nums1[i]>nums2[j]) j++;
                else{
                    list.add(nums1[i]);
                    count++;
                    j++;
                    i++;
                }
            }
        }
        int[] result = new int[count];int k=0;
        for(Integer a:list)
        	result[k++]=a.intValue();
        return result;
    }

}
