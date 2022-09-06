import java.util.Scanner;

public class BubbleSort {
	static void bubSort(int[] inp_arr) {  
        int arr_len = inp_arr.length;  
        int temp = 0;  
         for(int i=0; i < arr_len; i++){  
                 for(int j=1; j < (arr_len-i); j++){  
                          if(inp_arr[j-1] > inp_arr[j]){    
                                 temp = inp_arr[j-1];  
                                 inp_arr[j-1] = inp_arr[j];  
                                 inp_arr[j] = temp;  
                          }  
                          
                 }  
         }  
  
    } 

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No. Element in array:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];  
         
        for(int i=0; i < size; i++){  
                arr[i] = sc.nextInt();  
        }  
        System.out.println();  
          
        bubSort(arr);  
         
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }

	}

}