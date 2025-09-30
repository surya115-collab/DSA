package Arrays.Basic;

public class ArrayReverse {
    private static void bruteForce(int[] a){
        int[] res=new int[a.length];
        int j=0;
        for(int i=a.length-1;i>=0;i--){
            res[j]=a[i];
            j++;
        }
        for(int ele:res)
            System.out.print(ele);
    }
    private static void optimized(int[] a){
        int l=0,r=a.length-1;
        while(l<r){
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
        for(int i:a)
            System.out.print(i+" ");
    }
    public static void main(String[] args) {
        int[] arr={3,4,2,5,1};
        //bruteForce(arr);
        optimized(arr);
    }
}
