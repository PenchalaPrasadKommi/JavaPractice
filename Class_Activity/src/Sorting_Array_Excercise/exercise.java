package Sorting_Array_Excercise;

public class exercise {
    public static void main(String[] args) {

        int [] arr = new int [] {8,6,7,5,1,3};
        int temp = 0;

        System.out.println("Elements of Unsorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();

        System.out.println("Array elements sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array elements sorted in descending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int a[] = {9,7,6,4,2,10,13};
        System.out.println();
        System.out.println("Even numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i]+ " ");
            }
        }
        System.out.println();
        System.out.println("Odd numbers:");

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i]+ " ");
            }
        }
    }
}
