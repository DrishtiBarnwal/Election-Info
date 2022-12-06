import java.io.*;
import java.util.*;

public class Ballot {

	Candidate[] myBallot;
	
	public Ballot(String fileName) throws FileNotFoundException
	{
		Scanner reader= new Scanner(new File(fileName));
		int count = reader.nextInt();
		myBallot = new Candidate[count];
		int postion = 0;
		reader.useDelimiter(",|\r\n");
		while(reader.hasNext())
		{
			String name = reader.next();
			String office = reader.next();
			boolean elected = reader.nextBoolean();
			Candidate toAdd = new Candidate(name, office, elected);
			myBallot[postion] = toAdd;
			postion++;
		}
	}
	
	
	public Candidate[] getBallot()
	{
		return myBallot;
	}
}



