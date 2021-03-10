package Sorting_Array_Excercise;

public class exercise2 {
    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        System.out.println("Reversed array : \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }

    public static void main(String[] args)
    {
        int [] arr = {1,2,3,4,5};
        reverse(arr, arr.length);
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println();
        System.out.println("Sum of the elements in the above array: " + sum);
    }

}
