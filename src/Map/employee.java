package Map;
import java.util.Objects;
public class employee  implements Comparable<employee>{

	private int eid;
	private String ename;
	private int esal;
	public employee(int eid, String ename, int esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(eid, ename, esal);
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals method");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employee other = (employee) obj;
		return eid == other.eid && Objects.equals(ename, other.ename) && esal == other.esal;
	}
	@Override
	public String toString() {
		return "employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	@Override
	public int compareTo(employee o) {
		return Integer.compare(this.getEsal(), o.getEsal());
	}
	@Override
	public void finalize()
	{
		System.out.println("finalize method");
	}
	
	
}
