package Arrays.Basic;
public class SumOfElements{
    public static void main(String[] args) {
        int[] arr={3,2,2,1,1,3,4,5};
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        System.out.println(sum);
        System.out.println((double)sum/arr.length);
    }
}