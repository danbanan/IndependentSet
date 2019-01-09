
public class Utility {

	public static boolean[] find(Graph g) {
		
		boolean[] set = new boolean[g.size()];
		int max = g.size();
		
		if(max != 0) {
			
			while(!g.has(max)) {
				max--;
			}
			
			int i = 0;
			int j = 0;
			
			while(j < g.size() && max > 0) {
				Graph temp = g.remove(j);
				
				if(temp.has(max)) {
					g = temp;
				} else {
					set[i] = true;
					j++;
				}
				i++;
			}
			
		}
				
		return set;
	}
}
