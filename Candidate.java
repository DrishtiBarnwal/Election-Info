
public class Candidate {

	private String name;
	private String runningFor;
	private boolean elected;
	
	public Candidate(String n, String r, boolean e)
	{
		name = n;
		runningFor = r;
		elected = e;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getRace()
	{
		return runningFor;
	}
	
	public void changeStatus(boolean a)
	{
		elected = a;
	}

	public String platform()
	{
		return "***INTERESTING SNIPPET HERE***";
	}
	
	public String toString()
	{
		return "Name: " + name + "\n" + "Office running for: " + runningFor + "\n";
	}
	
}
