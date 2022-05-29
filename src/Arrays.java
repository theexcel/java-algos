//implement a

public class Arrays {
int[] arr;

public Arrays(int sizeOfArray){
    arr = new int[sizeOfArray];
    for (int i = 0; i < arr.length; i++){
        arr[i] = Integer.MIN_VALUE;
    }
}

public void insertMethod(int location, int valueToInsert){
    try{
        if(arr[location] == Integer.MIN_VALUE){
            arr[location] = valueToInsert;
            System.out.println("Value has been inserted");
        } else {
            System.out.println("Already has a value");
        }
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Invalid index");
    }
//    System.out.println(java.util.Arrays.toString(arr));
}

public void traverseArray(){
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i]);
    }
}

public void searchArray(int a){
    for(int i = 0; i < arr.length; i++){
        if(arr[i] == a){
            System.out.println("\n The index of the value was found at index " + i);
            return;
        }
    } System.out.println("Value is not found tho");
}

public void deleteValue(int indexOfVal){
    try{
    arr[indexOfVal] = Integer.MIN_VALUE;
        System.out.println("Successfully deleted the value");
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("The value provided is not in the range of array");
    }
}

public static void main(String[] args){
   Arrays excel = new Arrays(6);
   excel.insertMethod(0, 1);
  excel.insertMethod(1,2);
   excel.insertMethod(2,3);
    excel.insertMethod(3,4);
    excel.insertMethod(4,5);
    excel.insertMethod(5,6);
    excel.traverseArray();
    excel.searchArray(5);


}


}
