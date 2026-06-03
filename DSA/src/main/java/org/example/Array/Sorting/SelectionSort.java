package org.example.Array.Sorting;


//todo:Note
// in Selection sort we pick the smallest element from an array
// and place it in the first index ... not swaping uneccesary
public class SelectionSort {


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


    //7 8 3 1 2 0

    public void selectionSort(){

        for (int i=0;i<arr.length-1;i++){
            int smallestIndex=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[smallestIndex]){
                    smallestIndex=j;
                }

            }

            //we can get an Element from Index
            //todo swap ch

            if (i ==smallestIndex){

                int temp=arr[i];
                arr[i]=arr[smallestIndex];
                arr[smallestIndex]=temp;
            }


        }

        flag=1;

    }


    //todo find  inefficiencies in the code




}
