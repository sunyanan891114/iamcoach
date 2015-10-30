
import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionOpration {
	public Integer[] collect_all_even(int[] a) {
		ArrayList<Integer> ls = new ArrayList<Integer>();
		for (int i : a) {
			if (i % 2 == 0)
				ls.add(i);
		}
		Integer[] test = new Integer[ls.size()];
		return (ls.toArray(test));
	}

	public int collect_last_element(int[] a) {
		return a[a.length - 1];
	}

	public Integer[] get_integer_interval_2_spec(int a, int b) {
		LinkedList<Integer> result = new LinkedList<Integer>();
		if(a == b){
			Integer[] temp = {a};
			return temp;
		}
		else if( a < b){
			for(int i = a ;i <= b;i++){
				if(i % 2 == 0)
					result.add(i);
			}
		}
		else{
			for(int i = a; i >= b;i--){
				if(i % 2 == 0)
					result.add(i);
			}
		}
		Integer[] test = new Integer[result.size()];
		return result.toArray(test);		
	}

	public static void main(String[] args) {
		CollectionOpration temp = new CollectionOpration();
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(temp.collect_all_even(a).length);
		System.out.println(temp.collect_last_element(a));
		System.out.println(temp.get_integer_interval_2_spec(1, 10).length);
	}

}
