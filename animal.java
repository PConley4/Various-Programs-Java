public abstract class animal
{
	public void age()
	{
		
	}
	
	public void setname(String s)
	{
		this.name = s;
	}
	
	public String getname()
	{
		return this.name;
	}
	
	public void myage()
	{
		this.myage++;
	}
	
	public abstract boolean isdead()
	{
	}
	
	public abstract void makenoise();
	
	public void sleep(int i)
{
	try
	//try clause must be here
	{
		System.out.println ("Going to sleep...");
		Thread.sleep(i*1000);
	}
	catch (InterruptedException e)
	{
		System.out.println ("You should never see this.");
	}
}
	public void makenoise()
	{
	}
	
	}