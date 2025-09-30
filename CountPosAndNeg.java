package Arrays.Basic;

public class CountPosAndNeg {
    private static void posNegCount(int[] a){
        int pos=0,neg=0;
        for(int i:a){
            if(i>=0)
                pos++;
            else{
                neg++;
            }
        }
        System.out.println(pos);
        System.out.println(neg);
    }
    public static void main(String[] args) {
        int[] a={2,1,-1,3,4,-12,7};
        posNegCount(a);
    }
}
