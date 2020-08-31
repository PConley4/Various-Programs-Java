public class person
{
	private String name;
	private String staddress;
	private String phone;
	private String emaddress;
	
	
	public person(String name, String staddress, String phone, String emaddress){
		this.name = name;
		this.staddress = staddress;
		this.phone = phone;
		this.emaddress = emaddress;
	}

	public String getname(){
		return this.name;
	}
	
	public String getstaddress() {
		return this.staddress;
	}
	
	public String getphone() {
		return this.phone;
	}
	
	 public String getemaddress(){
		 return this.emaddress;
	}
	 
}
	