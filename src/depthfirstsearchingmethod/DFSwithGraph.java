package depthfirstsearchingmethod;

import java.util.*;

class DFSwithGraph {

	private int V;

	private LinkedList<Integer> adj[];

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private DFSwithGraph(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i=0; i<v; ++i)
			adj[i] = new LinkedList();
	}

	private void addEdge(int v, int w) {
		adj[v].add(w);
	}

	private void DFSUtil(int v,boolean visited[]){
		visited[v] = true;
		System.out.print(v+" ");

		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext())
		{
			int n = i.next();
			if (!visited[n])
				DFSUtil(n,visited);
		}
	}

	private void DFS(){
		boolean visited[] = new boolean[V];

		//		DFSUtil(v, visited);

		for (int i=0; i<V; ++i)
			if (visited[i] == false)
				DFSUtil(i, visited);
	}

	public static void main(String args[]){
		DFSwithGraph g = new DFSwithGraph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Depth First Traversal");

		g.DFS();
	}
}