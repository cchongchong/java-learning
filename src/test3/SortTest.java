package test3;

import java.util.Arrays;

public class SortTest {
	public static void main(String[] args) {
		int[] a={8,3,5,9,12,5,87,36,9,1,8,0,5};
		System.out.println(Arrays.toString(a));
		quickSort(a);
		System.out.println(Arrays.toString(a));
		for(int i=a.length-1;i>a.length-4;i--){
			System.out.print(a[i]+" ");
		}
	}
	public static void quickSort(int[] a){
		quickSort(a, 0, a.length-1);
	}
    public static void quickSort(int a[],int low,int high){
    	//method exit
    	if(low>high){
    		return;
    	}
    	//sava
    	int i=low;
    	int j=high;
    	int key=a[low];
    	//once
    	while(i<j){
    		//right->lift
    		while(i<j && a[j]>=key){
    			j--;
    		}
    		//lift->right
    		while(i<j && a[i]<=key){
    			i++;
    		}
    		//swap
    		if(i<j){
    			int p=a[i];
    			a[i]=a[j];
    			a[j]=p;
    		}
    	}
    	//swap key
    	int p=a[i];
    	a[i]=a[low];
    	a[low]=p;
    	//left array
    	quickSort(a, low, i-1);
    	//right array
    	quickSort(a, i+1, high);
    }
}
