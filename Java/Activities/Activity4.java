package Activities;

public class Activity4 {

    static void sort(int[] numArray){
        int n = numArray.length;
        for (int i = 1; i < n; ++i) {
            int key = numArray[i];
            int j = i - 1;
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && numArray[j] > key) {
                numArray[j + 1] = numArray[j];
                j = j - 1;
            }
            numArray[j + 1] = key;
        }
    }

    static void printarray(int[] numArray){
        for (int x:numArray){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int[] numArray = {4,3,2,10,12,1,5,6,4};
        sort(numArray);
        printarray(numArray);

    }
}
