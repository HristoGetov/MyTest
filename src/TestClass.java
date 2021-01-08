import java.util.*;
public class TestClass {


    static class A {

        static boolean exists(int[] ints, int k) {
            if (binarySearch(ints, k) != -1 ) {
                return true;
            }else {
                return false;
            }
        }

        public static int binarySearch(int[] arr, int elementToSearch) {
            int firstIndex = 0;
            int lastIndex = arr.length;
            if(lastIndex<firstIndex){return -1;}
            else {
                while (firstIndex < lastIndex) {
                    int middleIndex = (firstIndex + lastIndex) / 2;
                    if (arr[middleIndex] == elementToSearch) {
                        return middleIndex;
                    } else if (arr[middleIndex] < elementToSearch)
                        firstIndex = middleIndex + 1;
                    else if (arr[middleIndex] > elementToSearch)
                        lastIndex = middleIndex - 1;
                }
            }
                return -1;


        }


        public static void main(String[] args) {
            int[] ints = {-9, 14, 37, 102};
            System.out.println(A.exists(ints, 102)); // true
            System.out.println(A.exists(ints, 36)); // false

       /*     int index = binarySearch(new int[]{-9, 14, 37, 102},102);
            System.out.println(index);*/

        }

    }
}
