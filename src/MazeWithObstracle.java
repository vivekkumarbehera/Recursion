public class MazeWithObstracle{
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        path("", maze, 0, 0   );
    }

    public static void path(String p, boolean[][] maze, int r, int c) {
        // Base case: reached destination
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        // If cell is blocked, return
        if (!maze[r][c]) {
            return;
        }

        // Mark current cell as visited
        maze[r][c] = false;

        // Move Down
        if (r < maze.length - 1) {
            path(p + 'D', maze, r + 1, c);
        }

        // Move Right
        if (c < maze[0].length - 1) {
            path(p + 'R', maze, r, c + 1);
        }

        // Move Up
        if (r > 0) {
            path(p + 'U', maze, r - 1, c);
        }

        // Move Left
        if (c > 0) {
            path(p + 'L', maze, r, c - 1);
        }

        // Backtrack: unmark current cell
        maze[r][c] = true;
    }
}