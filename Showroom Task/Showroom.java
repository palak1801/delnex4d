package delnex4d;

import java.util.ArrayList;

public class Showroom {
	String sname;
	int showno;
	ArrayList<CarTask> cartask;
	
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getShowno() {
		return showno;
	}

	public void setShowno(int showno) {
		this.showno = showno;
	}

	public ArrayList<CarTask> getCartask() {
		return cartask;
	}

	public void setCartask(ArrayList<CarTask> cartask) {
		this.cartask = cartask;
	}

	public Showroom(String sname, int showno, ArrayList<CarTask> cartask) {
		super();
		this.sname = sname;
		this.showno = showno;
		this.cartask = cartask;
	}

	@Override
	public String toString() {
		return "Showroom [sname=" + sname + ", showno=" + showno + ", cartask=" + cartask + "]";
	} 	

}
