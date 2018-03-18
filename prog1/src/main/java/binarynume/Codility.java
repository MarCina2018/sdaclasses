package binarynume;

public class Codility {
    public static void main(String[] args) {

        System.out.println(solution(37));


    }

    public static int solution(int N) {
        // write your code in Java SE 8

        String binaryValue = Integer.toBinaryString(N);
        int numbersOfzeros = 0;
        int maxZeros = 0;

        for (int i = 0; i < binaryValue.length(); i++) {
            char O = '0';
            if (binaryValue.charAt(i) == O ) {
                numbersOfzeros += 1;

                if(numbersOfzeros > maxZeros) { // kaczymy zerowy ciąg i moge sprawdzic czy długość tego ciagu jest więkrza niz długość najdłuższego dotychczasowego
                    maxZeros = numbersOfzeros;
                }
            }else {
                numbersOfzeros = 0; // zerujemy gdzy jest 1 pl pamietaj o nawiasach ma sie wykonac w pierwszym if
            }


        }
        return maxZeros;
    }
}
