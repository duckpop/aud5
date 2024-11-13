import java.util.*;

//max proizvod

//public class main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        int maxProductIterative = maxProductIterative(arr);
//        int maxProductRecursive = maxProductRecursive(arr, 1, 1, arr[0], 0);
//
//        System.out.println(maxProductIterative);
//        System.out.println(maxProductRecursive);
//    }
//
//    // Iterative method to find maximum product
//    public static int maxProductIterative(int[] arr) {
//        int maxProduct = arr[0];
//        int minProduct = arr[0];
//        int result = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < 0) {
//                // Swap maxProduct and minProduct
//                int temp = maxProduct;
//                maxProduct = minProduct;
//                minProduct = temp;
//            }
//
//            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
//            minProduct = Math.min(arr[i], minProduct * arr[i]);
//            result = Math.max(result, maxProduct);
//        }
//
//        return result;
//    }
//
//    // Recursive method to find maximum product
//    public static int maxProductRecursive(int[] arr, int max, int min, int returnValue, int i) {
//        if (i == arr.length) {
//            return returnValue;
//        }
//
//        if (arr[i] < 0) {
//            // Swap max and min when encountering a negative number
//            int temp = max;
//            max = min;
//            min = temp;
//        }
//
//        max = Math.max(arr[i], max * arr[i]);
//        min = Math.min(arr[i], min * arr[i]);
//        returnValue = Math.max(returnValue, max);
//
//        return maxProductRecursive(arr, max, min, returnValue, i + 1);
//    }
//}

//kvadrati

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.print(function(n));
//    }
//
//    public static int function(int a){
//        int [] arr = new int[a+1];
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = 1000000000;
//        }
//        arr[0] = 0;
//        for (int i = 1; i < arr.length; i++){
//            for (int j = 1; j*j <= i; j++){
//                arr[i] = Math.min(arr[i], arr[i-j*j]+1);
//            }
//        }
//        return arr[a];
//    }
//}

// 1  0 -2 -4 -4
// 0 -1 -2 -2  0
// 0  0 -1  0  2
// 0  0  0  1  2
// 0  0  0  0  1

//kec i nula

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.println(function(s));
//    }
//
//    public static int function(String s){
//        int [][]matrix = new int[s.length()][s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) == '1') matrix[0][i] = 1;
//            else if(s.charAt(i) == '0') matrix[0][i] = -1;
//        }
//
//        int x = 1;
//        int z = 1;
//        for (int i = 1; i < s.length(); i++) {
//            int y = z;
//            x=1;
//            for (int j = i; j < s.length(); j++) {
//                matrix[x][y] = matrix[0][y] + matrix[x-1][y-1];
//                x++;
//                y++;
//            }
//            z++;
//        }
//
//        int count = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = 0; j < s.length(); j++) {
//                if(matrix[i][j] == 1) count++;
//            }
//        }
//        return count;
//    }
//}