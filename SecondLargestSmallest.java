package Arrays.Basic;

public class SecondLargestSmallest {
    private static void secondSmallest(int [] a){
        int min=a[0],min2=Integer.MAX_VALUE;
        for(int i:a){
            if(i<min){
                min2=min;
                min=i;
            }
            else if(i<min2 && i!=min)
                min2=i;
        }
        System.out.println(min2);
    }
    private static void secondLargeest(int[] a){
        int max=a[0],max2=a[0];
        for(int i:a){
            if(i>max){
                max2=max;
                max=i;
            }
            else if(i>max2 && i!=max)
                max2=i;
        }
        System.out.println(max2);
    }
    public static void main(String[] args) {
        int[] a={2,4,7,3,910,34};
        secondLargeest(a);
        secondSmallest(a);
    }
}
