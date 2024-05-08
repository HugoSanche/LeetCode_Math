//Input: a = 1, b = 20
//Output: 19
//Explanation: All the numbers in the range [1, 20] have unique digits except 11. Hence, the answer is 19.

//Input: a = 9, b = 19
//Output: 10
//Explanation: All the numbers in the range [9, 19] have unique digits except 11. Hence, the answer is 10.

public class CountNumbersWithUniqueDigitsII {
    public static void main(String[] args) {
        int n=80;
        int m=120;

        int sum=CountNumbersWithUniqueDigits(n,m);
        System.out.println(sum);
    }
    public static int CountNumbersWithUniqueDigits(int n, int m) {
        int count = 0;
        for (int i = n; i <= m; i++) {
            if (i > 10) {
                String number = String.valueOf(i);
                int x = 1;
                for (int j = 1; j < number.length(); j++) {
                    if (number.charAt(j - 1) == number.charAt(j)) {
                        x++;
                    }
                }
                if (number.length() == x) {
                    count--;
                }
            }
            count++;
        }
        return count;
    }
}
