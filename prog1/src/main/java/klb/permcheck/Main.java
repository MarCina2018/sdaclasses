package klb.permcheck;

public class Main {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int size = A.length;
        // i:0,1,2,.. size-1
        //   1,2,3,...size

        int[] temp = new int[size];
        // jeśli intA[i]==1 to oznacza ze natrafilismy na liczbe i+1

        for (int i = 0; i < size; i++) {
            if (A[i] > size || A[i] < 1) { // jesli trafiłem na liczbe wiekrzą niz rozmiar tablicy to 0 bo niemozbyc
                return 0;
            }
            // czy kolejny element z tablicy a niewystąpił wczesniej?
            if (temp[A[i] - 1] == 1) {
                return 0;
            } else {
                temp[A[i]-1]=1;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

    }
}
