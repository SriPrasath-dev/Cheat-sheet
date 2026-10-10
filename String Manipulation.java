class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a=s.length();
        int len=0;
        int max=0;
        String res="";
        for(int i=0;i<a;i++)
        {
            char ch=(s.charAt(i));
            if(res.indexOf(ch)==-1)
            {
            res+=ch;
            len=res.length();
            if(len>max)
            max=len;
            }
            else
            {
            res=res.substring(res.indexOf(ch)+1)+ch;
            }

        }
        return max;
    }
}
