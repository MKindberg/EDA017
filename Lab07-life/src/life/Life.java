package life;

public class Life {
	private LifeBoard lb;

	public Life(LifeBoard lb) {
		this.lb = lb;
	}

	public void newGeneration() {
		lb.increaseGeneration();
		boolean temp[][] = new boolean[lb.getRows()][lb.getCols()];
		for (int r = 0; r < lb.getRows(); r++)
			for (int c = 0; c < lb.getCols(); c++) {
				if (lb.get(r, c) && (neighbours(r, c) == 2 || neighbours(r, c) == 3))
					temp[r][c] = true;
				if (lb.get(r, c) && (neighbours(r, c) > 3 || neighbours(r, c) < 2))
					temp[r][c] = false;
				if (neighbours(r, c) == 3)
					temp[r][c] = true;
			}
		for (int r = 0; r < lb.getRows(); r++)
			for (int c = 0; c < lb.getCols(); c++)
				lb.put(r, c, temp[r][c]);

	}

	public void flip(int row, int col) {
		lb.put(row, col, !lb.get(row, col));
	}

	private int neighbours(int row, int col) {
		int n = 0;
		for (int r = -1; r <= 1; r++)
			for (int c = -1; c <= 1; c++)
				if (lb.get(row + r, col + c))
					n++;
		if (lb.get(row, col))
			n--;
		return n;
	}
}
