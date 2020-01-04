package delnex4d;

import java.util.ArrayList;
import java.util.HashMap;

public class ShowroomTask {
public static void main(String[] args) {
		CarTask ct1=new CarTask("Maruti", 101);
		CarTask ct2=new CarTask("Audi", 102);
		CarTask ct3=new CarTask("Toyota", 103);
		CarTask ct4=new CarTask("Bmw", 104);
		CarTask ct5=new CarTask("Ferrari", 105);
		ArrayList<CarTask> show1=new ArrayList<>();
		show1.add(ct1);
		show1.add(ct2);
		show1.add(ct3);
		ArrayList<CarTask> show2=new ArrayList<>();
		show2.add(ct4);
		show2.add(ct5);
		
		HashMap<Integer, Showroom> car=new HashMap<Integer, Showroom>();
		Showroom room1=new Showroom("Hyd",1,show1);
		Showroom room2=new Showroom("Bangalore",2,show2);
		car.put(room1.getShowno(), room1);
		car.put(room2.getShowno(), room2);
		
		Showroom getCars=car.get(1);

		System.out.println("1"+room1.getShowno()+getCars.cartask);
		Showroom getCars1=car.get(2);
		System.out.println("2"+getCars1.cartask);


		

}
}
