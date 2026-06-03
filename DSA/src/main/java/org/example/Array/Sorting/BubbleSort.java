package org.example.Array.Sorting;

import sun.rmi.runtime.Log;

public class BubbleSort {

   private int arr[]={7,8,3,1,2,0};
    private int flag=0;
   public void printArr(){
        if (flag==0){

            System.out.println("Existing Array");
            for (int i:arr) {
                System.out.print(i+" ");
            }
        }else{
            System.out.println("Sorted Array");
            for (int i:arr) {
                System.out.print(i+",");
            }
        }
    }

   public void bubbleSort(){
       for (int j=0;j<arr.length-1;j++){

           for (int i=0;i<arr.length-1;i++){
               if (arr[i]>arr[i+1]){
                   int temp=arr[i];
                   arr[i]=arr[i+1];
                   arr[i+1]=temp;
               }
               flag=1;
           }
       }






    }


}
