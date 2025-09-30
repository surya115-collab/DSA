package Arrays.Basic;

public class EvenOddPrintingSeperately {
    private static void oddEven(int[] a){
        String even="",odd="";
        for(int i:a){
            if(i%2==0)
                even+=i+" ";
            else{
                odd+=i+" ";
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
    public static void main(String[] args) {
        int[] a={3,2,1,4,5,66};
        oddEven(a);
    }
}
