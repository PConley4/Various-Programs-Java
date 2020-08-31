public class student extends person{

	private double gpa;
	private int numcredits;
	
	public student(String name, String staddress, String phone, String emaddress){
		super(name,staddress,phone,emaddress);
	}
	
	public student(String name, String staddress, String phone, String emaddress, double gpa, int numcredits)
	{
		super(name,staddress,phone,emaddress);
		/*
		name = super.getname();
		staddress = super.getstaddress();
		phone = super.getphone();
		emaddress = super.getemaddress();
		*/
		this.gpa = gpa;
		this.numcredits = numcredits;

	}
	
	public double getgpa(){
		return this.gpa;
	}
	
	public int getnumcredits(){
		return this.numcredits;
	}
	
}
	