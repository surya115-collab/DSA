package Arrays.Basic;

public class RemoveDuplSorted {
    private static int optimised(int[] a){
        if(a.length==0)
            return 0;
        int i=0,count=0;
        for(int j=1;j<a.length;j++){
            if(a[i]!=a[j]){
                i++;
                count++;
                a[i]=a[j];
            }
        }   
        return count+1;
    }
    private static int removeDuplicates(int[] a){
        if(a.length==0)
            return 0;
        int i=0,j=1,count=1;
        while(i<a.length && j<a.length){
            if(a[i]==a[j])
                j++;
            else{
                a[i+1]=a[j];
                count++;
                i++;
                j++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4};
        int k = optimised(arr);
        System.out.println("Unique length = " + k);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
