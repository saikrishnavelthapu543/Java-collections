package Map;

import java.util.Comparator;

public class employeeeid  implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		
		return Integer.compare(o1.getEid(), o2.getEid());
	}

}
