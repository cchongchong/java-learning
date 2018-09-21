package test3;

public class Sort {
    public static void main(String[] args) {
		int[] array={23,45,1,98,43,15,9,5,85,66};
		//输出数组
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println("\n");
		//排序
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-1-i;j++){
				if(array[j]>array[j+1]){
					int temp = 0;
					temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		}
		//取后三位
		for(int i=array.length-1;i>array.length-4;i--){
			System.out.print(array[i]+" ");
		}
	}
}
