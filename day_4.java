public class day_4 {
    public static void main(String []args){
        int d = 1;
        int arr[] ={1 ,2 ,3, 4, 5, 6, 7};

        rotatearray(arr,d);

        for (int i =0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
    static void rotatearray(int arr[], int d){
        int n = arr.length;
        d%=n;
        int temp[] = new int [n];
        for(int i=0;i<n-d;i++){
            temp[i] = arr[d+i];
        }
        for(int i =0;i<d;i++){
            temp[n-d+i] = arr[i];
        }
        for(int i =0;i<n;i++){
            arr[i] = temp[i];
        }
    }
}