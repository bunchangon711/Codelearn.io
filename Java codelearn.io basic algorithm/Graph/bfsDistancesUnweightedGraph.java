import java.util.*;

public class bfsDistancesUnweightedGraph {
    static int bfsPath(boolean[][] graph, int vertex, int goal, int length, HashSet<Integer> checked, int[] minLength){
        if(goal == vertex){
            return length;
        }
        for(int j=0;j<graph.length;j++){
            if(graph[vertex][j] == true && !checked.contains(j)){
                checked.add(j);
                int tempLength = bfsPath(graph, j, goal, length+1, checked, minLength);
                if(tempLength != Integer.MAX_VALUE && (minLength[goal] == Integer.MAX_VALUE || tempLength < minLength[goal])){
                    minLength[goal] = tempLength;
                }
                checked.remove(j);
            }
        }
        return minLength[goal];
    }
    static int[] answer(boolean[][] graph, int vertex){
        int[] distance = new int[graph.length];
        int[] minLength = new int[graph.length];
        Arrays.fill(minLength, Integer.MAX_VALUE);
        HashSet<Integer> checked = new HashSet<Integer>();
        for(int goal=0;goal<graph.length;goal++){
            checked.clear();
            checked.add(vertex);
            int length = 0;
            distance[goal] = bfsPath(graph,vertex,goal,length,checked,minLength);
        }
        return distance;
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
        System.out.println(Arrays.toString(answer(graph, vertex)));
        sc.close();
    }
}
