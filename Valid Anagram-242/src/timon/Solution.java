package timon;

public class Solution {
	public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] sr=new int[26];
        int[] tr=new int[26];
        
        for(int i=0;i<s.length();i++){
            sr[s.charAt(i)-'a']++;
            tr[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(sr[i]!=tr[i])
                return false;
        }
        return true;
    }
	public static void main(String[] args) {
		String s="abcd";
		String t="cbda";
		boolean r=isAnagram(s,t);
		System.out.println(r);
	}

}
