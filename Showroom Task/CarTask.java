package delnex4d;

public class CarTask {
	String carname;
	int modno;
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public int getModno() {
		return modno;
	}
	public void setModno(int modno) {
		this.modno = modno;
	}
	
	public CarTask(String carname, int modno) {
		super();
		this.carname = carname;
		this.modno = modno;
	}
	@Override
	public String toString() {
		return "CarTask [carname=" + carname + ", modno=" + modno + "]";
	}
 
}
