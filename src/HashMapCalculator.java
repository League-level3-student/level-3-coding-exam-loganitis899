import java.util.HashMap;

public class HashMapCalculator {
	
	int commonKeyValuePairs(HashMap one, HashMap two) {
int common=0;
		for(int i=0;i<one.size();i++) {
			for(int f=0;f<two.size();f++) {
				if(one.get(i).equals(two.get(f))){
					common+=1;
				}
			}
		}
		
		
		return common;
}
}
