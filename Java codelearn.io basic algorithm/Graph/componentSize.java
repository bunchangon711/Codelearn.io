import java.util.*;

public class componentSize {
    static void DFS(boolean[][] graph, int vertex, HashSet<Integer> connectedComponents){
        for(int j=0;j<graph.length;j++){
            if(graph[vertex][j] == true && !connectedComponents.contains(j)){
                connectedComponents.add(j);
                DFS(graph, j, connectedComponents);
            }
        }
    }
    static int answer(boolean[][] graph, int vertex){
        HashSet<Integer> connectedComponents = new HashSet<Integer>();
        connectedComponents.add(vertex);
        DFS(graph, vertex, connectedComponents);
        return connectedComponents.size();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] graph = new boolean[n][n];
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                graph[i][j] = sc.nextBoolean();
            }
        }
        int vertex = sc.nextInt();
        System.out.println(answer(graph, vertex));
        sc.close();
    }
}
