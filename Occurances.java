package Arrays.Basic;

public class Occurances {
    public static void main(String[] args) {
        int[] a={4,2,2,3,4,5,56};
        int c=0,target=2;
        for(int i:a){
            if(i==target)
                c++;
        }
        System.out.println(c);
    }
}
