package uppg1;
import java.util.Random;

public class Die {
	Random r;

	public Die() {
		r = new Random();
	}

	public int roll() {
		return r.nextInt(6) + 1;
	}
}
