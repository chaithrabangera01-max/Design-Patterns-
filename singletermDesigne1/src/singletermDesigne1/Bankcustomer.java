package singletermDesigne1;


class ICIC_bank{
	private int bal=50000;
	
	static ICIC_bank a1;
	
	private ICIC_bank() {
		
	}
	public static ICIC_bank getInstance() {
		if(a1==null) {
			a1=new ICIC_bank();
			
		}
		return a1;
	}
}

public class Bankcustomer {
	public static void main(String[] args) {
		ICIC_bank bnglr_branch=ICIC_bank.getInstance();
		System.out.println(bnglr_branch);
		
		ICIC_bank mgluru=ICIC_bank.getInstance();
		System.out.println(mgluru);
	}
	

}
