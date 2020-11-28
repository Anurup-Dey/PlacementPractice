// Rotate Left 
package placementpractice;

public class RotareLeftArray {
    public static void main(String[] args) {
        int[] arr = {3,5,87,44,24};
        //int n = 3;
        System.out.println("Original Array:");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       // for(int i = 0; i < n; i++){
            int first,j;
            first = arr[0];
            for(j=0; j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
        arr[j] = first;
       // }
        System.out.println("After rotate:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
