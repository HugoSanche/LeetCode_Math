public class NumberStepsReduceNumberZero {
    public static void main(String[] args) {
        int n = 123;
        int sum = numberOfSteps2(n);
        System.out.println(sum);
    }
    public static int numberOfSteps(int num) {
        int res=0;
        for (int i=num; i>0;){
            res=res+1;
            if (i%2==0){
                i=i/2;
            }
            else{
                i--;
            }
        }
        return res;
    }
    public static int numberOfSteps2(int num) {
        int res=0;
        while(num>0){
            res=res+1;
            if (num%2==0){
                num=num/2;
            }
            else{
                num--;
            }
        }
        return res;
    }

}
