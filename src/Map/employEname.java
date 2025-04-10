package Map;

import java.util.Comparator;

public class employEname  implements Comparator<employee>{

	 @Override
	    public int compare(employee o1, employee o2) {
	        // Compare employee names lexicographically
	        return o1.getEname().compareTo(o2.getEname());
	    }

}
