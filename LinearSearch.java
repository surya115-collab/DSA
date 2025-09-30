package Arrays.Basic;

public class LinearSearch {
    private static int searchLinear(int[] a,int target){
        for(int i:a){
            if(i==target)
                return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={3,2,1,4,5,66};
        int target=90;
        System.out.println(searchLinear(a, target));
        

    }
}
