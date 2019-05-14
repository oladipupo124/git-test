public class Car{
	private String color;
	private int lenght;
	private String model;
	private int numberofwheel;
	private boolean haswheel;

public void setcolor(String color) {
	this.color = color;
}
public String getcolor() {
	return color;
}

public void setlenght(int lenght) {
	this.lenght = lenght;
}
public int getlenght() {
	return lenght;
}

public void setmodel(String model) {
	this.model = model;
}
public String getmodel() {
	return model;
}

public void setnumberofwheel(int numberofwheel) {
	this.numberofwheel = numberofwheel;
}
public int getnumberofwheel() {
	return numberofwheel;
}
public void sethaswheel() {
	this.haswheel = true;
}
public boolean gethaswheel() {
	return haswheel;
}

public static void main(String[] args) {
	Car james = new Car();
	Car james2 = new Car();

	james.setcolor ("Brown");
	james.setlenght (10);
	james.setmodel ("MDV");
	james.setnumberofwheel (1);

	james2.setcolor ("Red");
	james2.setlenght (5);
	james2.setmodel ("MGV");
	james2.setnumberofwheel (3);

	System.out.print(james.getcolor ());
	System.out.print(james.getlenght ());
	System.out.print(james.getmodel ());
	System.out.print(james.getnumberofwheel ());

	System.out.print(james2.getcolor ());
	System.out.print(james2.getlenght ());
	System.out.print(james2.getmodel ());
	System.out.print(james2.getnumberofwheel ());

	System.out.print(james.getcolor());
}
}
	