package timon;

public class Solution {
	
	public void sortColors(int[] nums) {
        final int[] red = new int[nums.length];
        final int[] blue = new int[nums.length];
        final int[] white = new int[nums.length];
        int[] counts = new int[3];
        int r=0,b=0,w=0;
        for(int i=0;i<nums.length;i++){
            switch(nums[i]){
                case 0:
                    red[r++]=nums[i];
                    counts[0]++;
                    break;
                case 1:
                    white[w++]=nums[i];
                    counts[1]++;
                    break;
                case 2:
                    blue[b++]=nums[i];
                    counts[2]++;
                    break;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i<counts[0]) nums[i]=0;
            else{
            if(i<counts[0]+counts[1]) nums[i]=1;
            else nums[i]=2;
            }
        }
    }
	
	public static void main(String[] args) {
		
	}
}
