import java.util.Arrays;

public class MissingNumber {


    public void missingNumMethod(int[] a){
        int totalNum = 0;
        int arrNum = 0;
        for(int i: a){
            totalNum += (i);
//            arrNum += a[i];
        }
        System.out.println(totalNum);
    }

    public static void main(String[] args){
        int[] intArray = {1,2,3,4,5,6,8,9,10};
        MissingNumber cc = new MissingNumber();
        cc.missingNumMethod(intArray);
    }
}
