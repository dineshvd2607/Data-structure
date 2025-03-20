import java.util.Scanner;
public class arrposition{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int insert=s.nextInt();
        int position=s.nextInt(); 
        int[] arr1=new int[n+1];
        for(int i=0,j=0;i<n+1;i++){
            if(i==position){
                arr1[i]=insert;
            }else{
                arr1[i]=arr[j++];
            }
        }
        for(int i=0;i<n+1;i++){
            System.out.print(arr1[i] + " ");
        }
    }
}