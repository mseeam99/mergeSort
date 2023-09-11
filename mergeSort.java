//Implementation of Merge Sort in Java

class mergeSort {
    
    public static void devide(int arr[] , int l , int r){
        if(l>=r){
            return; 
        }
        int m = l + (r-l)/2;
        devide(arr,l,m);
        devide(arr,m+1,r);
        conquer(arr,l,m,r);
    }
    
    public static void print_array(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
    
     public static void conquer(int arr[], int l, int m, int r){
         int merged[] = new int[r-l+1];
         int idx1 = l;
         int idx2 = m+1;
         int x = 0;
         while(idx1 <= m && idx2 <=r){
             if(arr[idx1] <= arr[idx2]){
                 merged[x++] = arr[idx1++];
             }else{
                 merged[x++] = arr[idx2++];
             }
         }
         while(idx1<=m){
             merged[x++] = arr[idx1++];
         }
          while(idx2<=r){
             merged[x++] = arr[idx2++];
         }
         
         for(int i=0,j=l; i<merged.length ; i++, j++){
             arr[j] = merged[i];
         }
    }
    
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length-1;
        devide(arr, 0 , n);
        print_array(arr);
    }

}