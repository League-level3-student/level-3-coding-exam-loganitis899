import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapCalculator {

	int commonKeyValuePairs(HashMap<String, String> one, HashMap<String, String> two) {
		int common = 0;
		for (int i = 0; i < one.size(); i++) {
			// System.out.println(one.size());
			for (int p = 0; p < two.size(); p++) {
				// System.out.println(two.size());
				ArrayList<String> keysTwo = new ArrayList<String>();
				keysTwo.addAll(two.keySet());
				ArrayList<String> keysOne = new ArrayList<String>();
				keysOne.addAll(one.keySet());

				ArrayList<String> valuesTwo = new ArrayList<String>();
				valuesTwo.addAll(two.values());
				ArrayList<String> valuesOne = new ArrayList<String>();
				valuesOne.addAll(one.values());
				if (keysTwo.get(p).equals(keysOne.get(i)) && valuesTwo.get(p).equals(valuesOne.get(i))) {
					common += 1;
					System.out.println(keysTwo.get(p));
					System.out.println(keysOne.get(i));

				}

			}//ioweiuwnefinawefnefiwen
		}

		return common;
	}
}
