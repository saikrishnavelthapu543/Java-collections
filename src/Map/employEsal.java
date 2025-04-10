package Map;

import java.util.Comparator;

public class employEsal implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getEsal(), o2.getEsal());
	}
	

}
