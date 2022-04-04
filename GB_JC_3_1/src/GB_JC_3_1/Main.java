package GB_JC_3_1;

import java.util.Arrays;

class arrayBox<Type>{
    private Type[] arr;

    public arrayBox(Type... arr) {
        this.arr = arr;
    }

    public void swap(int i, int j) {
        Type temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public String toString() {
        return "our array is: "  + Arrays.toString(arr);
    }
}

public class Main {
    public static void main(String[] args) {
        // swap for INT
        arrayBox<Integer> doSwap = new arrayBox(1,1,222,1,1,1,1,1,1,333,1);
        System.out.println("Before swap " + doSwap);
        doSwap.swap(2,9);
        System.out.println("After swap " + doSwap);
    }
}