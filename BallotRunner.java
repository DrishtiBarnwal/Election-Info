import java.io.*;
import java.util.Arrays;

public class BallotRunner {

	public static void main(String[] args) throws FileNotFoundException
	{
		Ballot midterms = new Ballot("VotingInfo.txt");
		Candidate[] upForElection = midterms.getBallot();
		System.out.println(Arrays.toString(upForElection));
	}

}
