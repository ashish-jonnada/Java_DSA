package Java_DSA.functions_and_methods;

import java.util.Arrays;

public class changeValue {
    static void main(String[] args) {
        int[] array={10,20,60,9,73,100};
        changevalue(array);
        System.out.println(Arrays.toString(array));
    }
    static void changevalue(int [] arr){
        arr[0]=99;

    }
}
