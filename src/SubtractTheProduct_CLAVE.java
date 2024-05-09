
//1281. Subtract the Product and Sum of Digits of an Integer
//Solved
//Easy
//Topics
//Companies
//Hint
//Given an integer number n, return the difference between the product of its digits and the sum of its digits.
//
//
//Example 1:
//
//Input: n = 234
//Output: 15 
//Explanation:
//Product of digits = 2 * 3 * 4 = 24
//Sum of digits = 2 + 3 + 4 = 9
//Result = 24 - 9 = 15
//Example 2:
//
//Input: n = 4421
//Output: 21
//Explanation:
//Product of digits = 4 * 4 * 2 * 1 = 32
//Sum of digits = 4 + 4 + 2 + 1 = 11
//Result = 32 - 11 = 21
//

/*

 */

public class SubtractTheProduct_CLAVE {
    public static void main(String[] args) {
        int n = 234;

        int sum = subtractProductAndSum2(n);
        System.out.println(sum);
    }

    public static int subtractProductAndSum(int n) {
        String numbers = Integer.toString(n);
        int productOfDigits = 1;
        int sumOfDigits = 0;
        for (int i = 0; i < numbers.length(); i+=2) {
            productOfDigits = productOfDigits *Character.getNumericValue(numbers.charAt(i));
            sumOfDigits=sumOfDigits+Character.getNumericValue(numbers.charAt(i));
            if(numbers.length()>=i+2){
                productOfDigits=productOfDigits*Character.getNumericValue(numbers.charAt(i + 1));
                sumOfDigits=sumOfDigits+Character.getNumericValue(numbers.charAt(i+1));
            }
        }
        return productOfDigits - sumOfDigits;
    }

    public static int subtractProductAndSum2(int n) {
        //n=234
        int sum = 0, product = 1;
        while (n > 0) {

            //suma y multiplica el residuo
            sum += n % 10;
            product *= n % 10;

            //234/10=23
            //23/10=2.3
            //2.3/10=0 y se termina el bucle

            n /= 10;
            System.out.println("n /= 10 "+n);
        }
        return product - sum;
    }
}
