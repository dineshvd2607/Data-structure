import java.util.Scanner;
public class array1
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=s.nextInt();
		}
        int insert=s.nextInt();
		int[] arr1=new int[n+1];
        for(int i=0;i<n;i++){
		    arr1[i+1]=arr[i];
		}
        arr1[0]=insert;
        for(int i=0;i<n+1;i++){
		    System.out.print(arr1[i]+" ");
		}
}
}