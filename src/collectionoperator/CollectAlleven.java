package collectionoperator;

import java.util.ArrayList;

public class CollectAlleven {
	public Object[] collect_all_even(int[] a){
		ArrayList<Integer> ls = new ArrayList<Integer>();
		for(int i : a){
			if( i % 2 == 0)
				ls.add(i);
		}
		return (ls.toArray());
	}
	public static void main(String[] args) {
		int[]a = {1,2,3,4,5,6,7,8};
		CollectAlleven test = new CollectAlleven();
		for(Object temp:test.collect_all_even(a))
			System.out.println(temp);
	}
}
