package Arrays.Basic;

public class MergeTwoArrays {
    private static int[] merge(int[] a,int[] b){
        int[] res=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length){
            res[k]=a[i];
            k++;i++;
        }
        while(j<b.length){
            res[k]=b[j];
            k++;j++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] ar1={2,1,1,2,3,4,4};
        int[] ar2={21,132,13,92,321,48,4};
        for(int i:merge(ar1, ar2)){
            System.out.println(i);
        }
    }
}
