package BuildingZiggurat;

public class Main {

	public static void main(String[] args) {
		
		int n = 5; // n = number of floors in ziggurat
		
		printZiggurat(n);
		
	}
	
	public static void printZiggurat(int n) {
		int[][] ziggurat = new int[n*2-1][n*2-1];
		int[] distance = new int[4];
		
		for (int i = 0; i < n*2-1; i++) {
			distance[0] = i;
			distance[2] = n*2-2-i;
			for (int j = 0; j < n*2-1; j++) {
				distance[1] = j;
				distance[3] = n*2-2-j;
				ziggurat[i][j] = getLowerNumber(distance);
				System.out.print(ziggurat[i][j]+1 + " ");
			}
			System.out.println();
		}
	}
	
	public static int getLowerNumber(int a[]) {
		int result = a[0];
		for (int i: a) {
			if (i < result) result = i;
		}
		return result;
	}
}
