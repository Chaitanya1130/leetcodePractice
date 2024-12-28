public class swapTwoArrays {
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5};
        int []arr2={6,7,8,9,10};
        System.out.println(arr1[0]);
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr1[i]+arr2[i];
            arr2[i]=arr1[i]-arr2[i];
            arr1[i]=arr1[i]-arr2[i];
        }
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr2[i]+arr1[i];
            arr1[i]=arr2[i]-arr1[i];
            arr2[i]=arr2[i]-arr1[i];
        }
        for(int i=0;i< arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        for(int i=0;i< arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
