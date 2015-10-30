
import java.util.ArrayList;

public class CollectionOpration {
	public Object[] collect_all_even(int[] a) {
		ArrayList<Integer> ls = new ArrayList<Integer>();
		for (int i : a) {
			if (i % 2 == 0)
				ls.add(i);
		}
		return (ls.toArray());
	}

	public int collect_last_element(int[] a) {
		return a[a.length - 1];
	}

	public int[] get_integer_interval_2_spec(int a, int b) {
		
	}

	public static void main(String[] args) {
		CollectionOpration temp = new CollectionOpration();
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(temp.collect_all_even(a).length);
	}

}
