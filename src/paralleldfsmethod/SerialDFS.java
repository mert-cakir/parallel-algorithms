package paralleldfsmethod;

import java.util.Stack;

public class SerialDFS implements Runnable{
	private boolean[] visited;
	private Graph graph;
	private Stack<Integer> stack;
	private int beginNode;
	public SerialDFS(int size,boolean[] visited,int beginPoint){
		graph = new Graph(size,visited,1);
		this.visited = visited;
		stack = new Stack<>();
		beginNode = beginPoint;
	}
	@Override
	public void run() {
		for(int i = 0;i<graph.getSize();i++){
			visited[i] = false;
		}
		stack.push(beginNode);
		while(!stack.isEmpty()){
			int node = stack.pop();
			if(visited[node]==false){
				visited[node] = true;
				for(int i = 0; i<graph.getSize(); i++){
					if(node==i)continue;
					if(graph.isNeighbour(node, i) && visited[i]==false){
						stack.push(i);
					}
				}
			}
		} 
	}
}