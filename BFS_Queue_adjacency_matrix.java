package selfstudy;
import java.util.*;
import java.io.*;
public class BFS_Queue_adjacency_matrix {
	static int a,b;
	static int [][] array;
	static int num_of_vertex, num_of_edge;
	static StringTokenizer st;
	static boolean [] visited;

	static void BFS_Method(int start, boolean [] c, int[][] a) {
		LinkedList<Integer> qu = new LinkedList<Integer>();
		qu.add(start);
		c[start] = true;
		while(!qu.isEmpty()) {
			int now = qu.remove();
			System.out.print(now + " ");
			for(int i=1; i<=num_of_vertex; i++) {
				if(a[now][i]==0 || c[i]) continue;
				qu.add(i);
				c[i]=true;
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> qu = new LinkedList<Integer>();
		
		num_of_vertex = Integer.parseInt(br.readLine());
		num_of_edge = Integer.parseInt(br.readLine());
		visited = new boolean[num_of_vertex+1];
		int Start = sc.nextInt();
		array = new int [num_of_vertex+1][num_of_vertex+1];
		for(int i =0; i<num_of_edge; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			a =  Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			array[a][b]=1;
			array[b][a]=1;
		}
		BFS_Method(Start, visited, array);
		
		
	}
}
