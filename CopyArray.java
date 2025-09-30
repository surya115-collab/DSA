package Arrays.Basic;

public class CopyArray {
    private static int[] arrayCopy(int[] a){
        int[] copy=new int[a.length];
        for(int i=0;i<a.length;i++){
            copy[i]=a[i];
        }
        return copy;
    }
    public static void main(String[] args) {
        int[] a={2,1,-1,3,4,-12,7};
        for(int i:arrayCopy(a)){
            System.out.println(i);
        }
    }
}
