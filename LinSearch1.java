
// WAP to demonstrate passing of 1-D array to a function to perform linear search.

public class LinSearch1 {
    public int search(int key, int[] a) {
        for (int i:a) {
            if (i == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a1 = {10, 20, 30, 50, 70, 90};
        int key = 50;
        LinSearch1 l = new LinSearch1();
        int result = l.search(key, a1);
        
        if (result != -1) {
            System.out.println(key + " is found at index " + result);
        } else {
            System.out.println(key + " is not found in the array.");
        }
    }
}
