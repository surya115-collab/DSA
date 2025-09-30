package Arrays.Basic;

public class SortedOrNot {
    private static boolean isSorted(int[] a){
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a={4,5,6,7,8,9,1};
        System.out.println(isSorted(a));
    }
}
