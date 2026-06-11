class Solution {
    public String reverseWords(String s) {
        String [] word = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(String ele: word)
        {
            StringBuilder rev = new StringBuilder(ele);
            ans.append(rev.reverse()).append(" ");
        }
        return ans.toString().trim();
        
    }
}
