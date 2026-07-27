class Solution {
    public char findTheDifference(String s, String t) {
       int n=s.length();int m=t.length();
       char res=0;
        for(int i=0;i<n;i++){
         
        res^= s.charAt(i);
        }
        for(int j=0;j<m;j++){
         
         res^=t.charAt(j);
        }
        return res;
    }
}