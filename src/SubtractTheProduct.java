public class SubtractTheProduct {
    public static void main(String[] args) {
        int n = 234;

        int sum = subtractProductAndSum(n);
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
}
