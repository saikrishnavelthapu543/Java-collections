package Objectclassmethods;

public class Employee implements Cloneable{
	private int eid;
	private String ename;
	private String edesg;
	private location loc;
	public Employee(int eid, String ename, String edesg, location loc) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edesg = edesg;
		this.loc = loc;
	}
	public Employee(int eid, String ename, String edesg) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edesg = edesg;
	}
	public Employee() {
		super();
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
	public String getEdesg() {
		return edesg;
	}
	public void setEdesg(String edesg) {
		this.edesg = edesg;
	}
	public location getLoc() {
		return loc;
	}
	public void setLoc(location loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edesg=" + edesg + ", loc=" + loc + "]";
	}
	public Employee clone() throws CloneNotSupportedException
	{
		Employee emp=(Employee) super.clone();
		emp.loc=(location) loc.clone();
		return emp;
	}
	public void finalize()
	{
		 try {
			super.finalize();
			 System.out.println("finalize overrided from object class");
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
