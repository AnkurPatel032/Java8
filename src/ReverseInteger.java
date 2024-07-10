public class ReverseInteger {
    public static int reverse(int x) {
        int reversed = 0;
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);

        while (x != 0) {   //123 ,12
            int pop = x % 10;//  3,2,1
            x /= 10; //12,1,0

            // Check for overflow
            if (reversed > (Integer.MAX_VALUE - pop) / 10) {
                return 0; // overflow condition
            }

            reversed = reversed * 10 + pop; //0*10+3=3//3*10+2=32//32*10+1=321
        }

        return reversed * sign; //321*-1
    }

    public static void main(String[] args) {
        int[] testCases = {123, -123, 120, 0, 1534236469};
        for (int x : testCases) {
            System.out.println("Input: " + x + ", Output: " + reverse(x));
        }
    }
}
