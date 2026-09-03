class Solution {
    public int characterReplacement(String s, int k) {
        int maxfreq=0,left=0,maxlen=0;
        int[] freq=new int[26];
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
         freq[ch-'A']++;
         maxfreq=Math.max(maxfreq,freq[ch-'A']);
         int windowsize=right-left+1;
         if(windowsize-maxfreq>k){
            freq[s.charAt(left)-'A']--;
            left++;
            windowsize=right-left+1;
         }
maxlen=Math.max(maxlen,windowsize);

        }
        return maxlen;
    }
}