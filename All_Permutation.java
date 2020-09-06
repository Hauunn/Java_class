package selfstudy;
import java.util.*;
public class All_Permutation {
	public static boolean All_perm(int [] arr) {
		int i = arr.length-1;
		while(i>0 && arr[i-1]>=arr[i]) {
			i--;
		}
		if(i<=0) {
			return false;
		}
		int j = arr.length-1;
		while(arr[j]<=arr[i-1]) {
			j--;
		}
		int temp = arr[i-1];
		arr[i-1] = arr[j];
		arr[j]=temp;
		
		j = arr.length-1;
		while(i<j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i = i+1;
			j = j-1;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=i+1;
		}
		do {
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
			}
			System.out.println();
		}while(All_perm(arr));
	}
}

