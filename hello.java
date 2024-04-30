public class hello {
    public static void main(String[] var0) {
        
        
        byte var1 = 9;
        double var2 = (int) var1;



        System.out.println(var1);
        System.out.println(var2);
        char letter = 'a';
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum2;
        int sum4 = ++sum3;
        System.out.println(letter);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));
        String fname = "john";
        String lname = "mactavish";
        System.out.println(fname.concat(lname));
        /*
         * = x = 5 x = 5
         * += x += 3 x = x + 3
         * -= x -= 3 x = x - 3
         * = x *= 3 x = x * 3
         * /= x /= 3 x = x / 3
         * %= x %= 3 x = x % 3
         * &= x &= 3 x = x & 3
         * |= x |= 3 x = x | 3
         * ^= x ^= 3 x = x ^ 3
         * >>= x >>= 3 x = x >> 3
         * <<= x <<= 3 x = x << 3
         */
    }
};
