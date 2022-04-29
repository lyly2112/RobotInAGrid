import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RobotInAGrid {

	static void findPath(int[][] grid, ArrayList<Position> off) {

		Set<Position> visited = new HashSet<Position>();
		Position current = new Position(0, 0);
		visit(grid, off, visited, current);
	}

	static void visit(int[][] grid, ArrayList<Position> off, Set<Position> visited, Position current) {

		Position right = new Position(current.r, current.c + 1);
		Position down = new Position(current.r + 1, current.c);

		if (!off.contains(right) && current.c < grid.length - 1 && !visited.contains(right)) {
			visit(grid, off, visited, right);
			visited.add(right);
		}
		if (!off.contains(down) && current.r < grid.length - 1 && !visited.contains(down)) {
			visit(grid, off, visited, down);
			visited.add(down);
		}
		if (current.equals(new Position(grid.length - 1, grid.length - 1))) {
			System.out.println("Got to the right bottom corner");
		}
	}

	public static void main(String[] args) {

		int[][] grid = { 
				{ 1, 1, 1, 1 }, 
				{ 1, 0, 1, 1 }, 
				{ 1, 1, 0, 0 }, 
				{ 0, 1, 1, 1 } 
				};

		ArrayList<Position> off = new ArrayList<Position>();

		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid.length; c++) {
				if (grid[r][c] == 0) {
					off.add(new Position(r, c));
				}
			}
		}
		findPath(grid, off);
	}
}