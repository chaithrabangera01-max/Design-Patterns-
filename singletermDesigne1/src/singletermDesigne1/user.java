package singletermDesigne1;


class Insta{
	private static Insta login;//cresting the class Insta and reference variable login
	
	private Insta() {//making constructor as private
		System.out.println("User loged in");
	}
	
	//giving indirect access 
	public static Insta getInstance() {
		if(login==null) {
			login=new Insta();
		}
		return login;
	}
	
}



public class user {
	public static void main(String[] args) {
		Insta i1=Insta.getInstance();
		
		System.out.println(i1);
		
		Insta i2=Insta.getInstance();
		
		System.out.println(i2);
		
		
		
	}

}
