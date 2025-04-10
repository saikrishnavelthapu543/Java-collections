package Objectclassmethods;

public class location  implements Cloneable{
	private String area;
	private String district;
	@Override
	public String toString() {
		return "location [area=" + area + ", district=" + district + "]";
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public location(String area, String district) {
		super();
		this.area = area;
		this.district = district;
	}
	public Object clone() throws CloneNotSupportedException
	{
				return super.clone();
	}

}
