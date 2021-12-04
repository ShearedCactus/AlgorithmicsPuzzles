package PaintingSnake;

public class Main {

	public static void main(String[] args) {
		
		int n = 5; // 5^2 = 4-4-4-3-3-2-2-1-1-1 or 5-4-4-3-3-2-2-1-1
		
		PrintSnake(n);
		
	}
	
	public static void PrintSnake(int n) {
		int[][] result = generateSnake(n);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(result[j][i] + "\t");
			}
			System.out.println();
		}
	}
	
	public static int[][] generateSnake(int n) {
		int[][] snake = new int[n][n];
		int deep = 0;
		int x = -1;
		int y = 0;
		int distance = 0;
		for (int i = 1; i <= 2*n; i++) {
			for (int j = 0; j < n-i/2; j++) {
				distance++;
				switch (deep%4) {
				case 0:
					x++;
					snake[x][y] = distance;
					break;
				case 1:
					y++;
					snake[x][y] = distance;
					break;
				case 2:
					x--;
					snake[x][y] = distance;
					break;
				case 3:
					y--;
					snake[x][y] = distance;
					break;
				}
			}
			deep++;
		}
		return snake;
	}

}
