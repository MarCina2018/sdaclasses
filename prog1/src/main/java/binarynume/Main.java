package binarynume;

public class Main {
    public static void main(String[] args) {
    int[] intArray1 = {1, -1, 0, 2};
    int[] intArray2 = {3, 5, 1, -2};
    System.out.println(checkSum(intArray1));


}

    public static boolean checkSum(int[] intArray) {
        int firstIndex = intArray[0];
        int lastIndex = intArray[intArray.length-1];
        int sum = firstIndex + lastIndex;

        for (int i = 1; i < intArray.length - 1; i++) {
            if (sum == intArray[i]) {
                return true;
            }
        }
        return false;
    }
}
