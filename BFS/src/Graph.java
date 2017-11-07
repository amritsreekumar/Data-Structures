
import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
	int V;
	LinkedList<Integer> adj[];
	Graph(int v) {
		V=v;
		adj = new LinkedList[v];
		for(int i = 0;i<v;++i) {
			adj[i] = new LinkedList();
		}	
	}
	public void addint(int a, int b) {
		adj[a].add(b);
	}
	public void BFS(int s) {
			Boolean visited[] = new Boolean[V];
			LinkedList<Integer> queue = new LinkedList<Integer>();
			visited[s] = true;
			queue.add(s);
			while(queue.size() != 0) { 
				s = queue.poll();
				System.out.println(s);
			}
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
	}
}
