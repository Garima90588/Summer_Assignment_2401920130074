lass Solution {
    public int compress(char[] chars) {

        int i = 0;          // read pointer
        int write = 0;      // write pointer

        while(i < chars.length) {

            char current = chars[i];
            int count = 0;

            // count group size
            while(i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            // write character
            chars[write++] = current;

            // write count if > 1
            if(count > 1) {
                String num = String.valueOf(count);
                for(char c : num.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
       
    }
}
