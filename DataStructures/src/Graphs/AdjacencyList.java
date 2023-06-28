package Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AdjacencyList {
	private int E;
	private int V;
	private LinkedList<Integer> adj[];

	public AdjacencyList(int nodes) {
		this.V = nodes;
		this.E = 0;
		this.adj = new LinkedList[nodes];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new LinkedList<>();
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		System.out.println(V + " " + E);
		for (int v = 0; v < V; v++) {

			System.out.print(v + ":");
			for (int w : adj[v]) {
				System.out.print(w + " ");

			}
			System.out.println();

		}

		return sb.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdjacencyList ad = new AdjacencyList(4);
		ad.addEdge(0, 1);
		ad.addEdge(0, 3);
		ad.addEdge(1, 2);
		ad.addEdge(3, 2);
		// ad.addEdge(2, 4);

		// ad.addEdge(, 0);
		System.out.println(ad);
		//ad.bfs(0);
		ad.dfs(0);

	}

	private void dfs(int i) {
		// TODO Auto-generated method stub
		boolean visited[] = new boolean[V];
		Stack<Integer> stack = new Stack<>();
		stack.push(i);
		while (!stack.isEmpty()) {
			int u = stack.pop();
			if (!visited[u]) {
				visited[u] = true;
				System.out.print(u+" ");
				for (int v : adj[u]) {
					if (!visited[v]) {
						stack.push(v);
						//visited[v] = true;
					}
				}

			}

		}

	}

	private void bfs(int i) {
		// TODO Auto-generated method stub

		boolean[] visited = new boolean[V];
		Queue<Integer> q = new LinkedList();
		visited[i] = true;
		q.offer(i);
		while (!q.isEmpty()) {
			int u = q.poll();
			System.out.print(u + " ");
			for (int v : adj[u]) {
				if (!visited[v]) {
					visited[v] = true;
					q.offer(v);
				}
			}
		}
	}

	public void addEdge(int u, int v) {
		// TODO Auto-generated method stub
		adj[u].add(v);
		adj[v].add(u);
		E++;

	}

}
