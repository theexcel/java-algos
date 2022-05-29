import java.util.Arrays;

public class Algos2 {

    int int2dArray[][];

    public Algos2(int noRows, int noColumns){
        int2dArray = new int[noRows][noColumns];
        for(int row = 0; row < int2dArray.length; row++){
            for(int col = 0; col < int2dArray[row].length; col++){
                int2dArray[row][col] = Integer.MIN_VALUE;
            }
        }

    }
public void insertValueInTheArray(int row, int col, int value){
        try {
            if(int2dArray[row][col] == Integer.MIN_VALUE){
                int2dArray[row][col] = value;
                System.out.println("Number has been inserted");
            } else{
                System.out.println("A value has been inserted");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid number");
        }
    System.out.println(Arrays.deepToString(int2dArray));
}

public void traverse2dArray(){
        int counter = 1;
        for (int row = 0; row < int2dArray.length; row++){
            for(int col = 0; col < int2dArray[row].length; col++){
                System.out.println(int2dArray[row][col] + " looped " + (counter++) + " times");
            }
        }
}

    public static void main(String[] args){
        Algos2 cc = new Algos2(2,2);
        cc.insertValueInTheArray(0,1, 9);
        cc.traverse2dArray();

    }
}
