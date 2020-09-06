package selfstudy;
import java.io.*;
import java.util.*;

public class BFS_Queue_adjacency_list {
	static int a,b;
	static int [][] array;
	static int num_of_vertex, num_of_edge;
	static StringTokenizer st;
	static boolean [] visited;

	static void BFS_Method(int v, LinkedList<Integer>[] a, boolean[] visited) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[v] = true;
		queue.add(v);
		
		while(queue.size() !=0) {
			v = queue.poll();
			System.out.print(v + " ");
			
			Iterator<Integer> iter = a[v].listIterator();
			while(iter.hasNext()) {
				int k = iter.next();
				if(!visited[k]) {
					visited[k] = true;
					queue.add(k);
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		num_of_vertex = Integer.parseInt(br.readLine());
		num_of_edge = Integer.parseInt(br.readLine());
		visited = new boolean[num_of_vertex+1];
		int Start = sc.nextInt();
		LinkedList<Integer>[] qu = new LinkedList[num_of_vertex+1];
		for(int i =0; i<=num_of_vertex; i++) {
			qu[i] = new LinkedList<Integer>();
		}
		
		for(int i =0; i<num_of_edge; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			a =  Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			qu[a].add(b);
			qu[b].add(a);
		}
		for(int i=1; i<=num_of_vertex; i++) {
			Collections.sort(qu[i]);
		}
		BFS_Method(Start, qu, visited);	
	}
}

