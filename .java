public class bubblesorting{

public static void bubblesorting(int arr[]){
  for(int turn=0;turn<arr.length-1;turn++){
    for(int j=0;j<arr.length-1+turn;j++){
          if(arr[j]>arr[j+1]){
          //swap
          int temp=arr[j];
            arr[j]=arr[j+1];
          arr[j+1]=temp;
          
        }
      }
    }
  }
public static void printarr(int arr[]){
   for(int i = 0 ;i<arr.length;i++){
   System.out.print(arr[i]+" ");
   } System.out.println()
}
public static void main(Strings args[]){
int arr[]={9,6,5,8,7,4,3,2,1,0};
bubblesort(arr);
printarr(arr);

}
}
