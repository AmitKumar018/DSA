package backTracking;

public class Ratmaze {
    static int[] dr={-1,+1,0,0};
    static int[] dc={0,0,+1,-1};
    static char[] dir={'u','d','r','l'};
    public static void recur(int[][] maze, int row,int col,int n,String path){
        if(col>=n || row>=n || col<0 || row<0){
            // matrix out of bound
            return;
        }
        // already visited or marked cell
        if(maze[row][col]==-1 || maze[row][col]==1){
            return;
        }
        // after getting the output
        if(row==n-1 && col==n-1) {
            System.out.println(path);
            return;
        }
        // visited cell=-1
        maze[row][col]=-1;
        for(int idx=0; idx<4; idx++){
            int newRow=row+dr[idx];
            int newCol=col+dc[idx];
            recur(maze,newRow,newCol,n,path+dir[idx]);

        }
        maze[row][col]=0;
    }
    public static void main(String[] args) {
        int[][] maze={{0,0,0,1},{0,0,0,1},{0,0,0,0},{0,1,1,0}};
        recur(maze,0,0,maze.length,"");
    }
    
}
