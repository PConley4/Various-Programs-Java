public class employee extends person{

	private double salary;
	private double hiredate;
	
	public employee(String name, String staddress, String phone, String emaddress){
		super(name,staddress,phone,emaddress);
	}
		
	public employee(String name, String staddress, String phone, String emaddress, double salary, double hiredate)
	{
		super(name,staddress,phone,emaddress);
		/*
		name = super.getname();
		staddress = super.getstaddress();
		phone = super.getphone();
		emaddress = super.getemaddress();
		*/
		this.salary = salary;
		this.hiredate = hiredate;
		
	}
		
	public double getsalary(){
		return this.salary;
		}
		
	public double gethiredate(){
		return this.hiredate;
		}
	}