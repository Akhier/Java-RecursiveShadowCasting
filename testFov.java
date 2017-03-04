public class testFov {
	public static void main(String[] args) {
		int width = 9, height = 9;
		Fov_RSC fov = new Fov_RSC(width, height);
		boolean[][] testmap = new boolean[width][height];
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				if(x == 0 || y == 0 || x == width - 1 || y == height - 1) {
					testmap[x][y] = false;
				} else {
					testmap[x][y] = true;
				}
			}
		}
		boolean[][] result = fov.Calculate_Sight(testmap, 4, 4, 4);
		String s = "";
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				if(result[x][y]) {
					if(testmap[x][y]) {
						s += ".";
					} else {
						s += "#";
					}
				} else {
					s += "▒";
				}
			}
			s += "\n";
		}
		System.out.print(s);
		/*
		 * Expected output
		 * ▒▒▒▒#▒▒▒▒
		 * ▒▒.....▒▒
		 * ▒.......▒
		 * ▒.......▒
		 * #.......#
		 * ▒.......▒
		 * ▒.......▒
		 * ▒▒.....▒▒
		 * ▒▒▒▒#▒▒▒▒
		 */
	}
}
