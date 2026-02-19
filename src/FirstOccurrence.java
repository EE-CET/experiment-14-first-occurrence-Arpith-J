import java.util.Scanner;
public class FirstOccurrence {
        static Scanner sc = new Scanner(System.in);

        public static int[] arrInput(int n){
                int[] arr = new int[n]; 
                for(int i=0; i<n; i++){
                        arr[i] = sc.nextInt();
                }
                return arr;
        }

        public static int firstOccurence(int[] arr, int k){
                int pos = -1;
                for(int i = 0; i<arr.length; i++){
                        if(arr[i] == k){
                                pos = i+1;
                                break;
                        }
                }
                return pos;
        }
        // TODO: Read N and K
        // TODO: Read array elements
        // TODO: Find the position (1-based index) of the first occurrence of K
        // TODO: Print the position or -1 if not found
        public static void main(String[] args) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] arr = arrInput(n);
                System.out.println(firstOccurence(arr, k));
        }
}
