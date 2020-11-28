// Rotate Right 
package placementpractice;

public class RotateRightArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 3;
        System.out.println("Original Array:");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       for(int i = 0; i < n; i++){
            int last,j;
            last = arr[arr.length-1];
            for(j=arr.length-1; j>0;j--){
                arr[j] = arr[j-1];
            }
        arr[j] = last;
       }
        System.out.println("After rotate:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
