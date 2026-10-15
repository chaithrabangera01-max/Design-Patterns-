
package design;
interface Car{
	void manufacture();
	
}
class Swift implements Car{
	public void manufacture() {
		System.out.println("Yor swift is ready");
	}
}
class BMW implements Car{
	public void manufacture() {
		System.out.println("Your BMW is ready");
	}
}
class Carfactory{
	static Car carmanufacture(String carname) {
		if(carname.equals("Swift")) {
			return new Swift();
		}
		else if (carname.equals("BMW")){
			return new BMW();
			
		}else {
			throw new IllegalArgumentException("Unknown car type: " + carname);
}
	}
}
class Mainclasss{
	public static void main(String[] args) {
		try {
		Car a1= Carfactory.carmanufacture("BMW");
		a1.manufacture();
	}catch (IllegalArgumentException e) {
		System.out.println("Error occurred: " + e.getMessage());
	}
}
}
