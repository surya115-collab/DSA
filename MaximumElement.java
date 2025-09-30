package Arrays.Basic;

public class MaximumElement {
    public static void main(String[] args) {
        int[] arr={4,3,2,1,1,454,5};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println(max+" "+min);
    }
}
