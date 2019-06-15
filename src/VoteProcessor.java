import java.util.ArrayList;

public class VoteProcessor {
	int popeScore;
	int snowScore;

	String calculateElectionWinner(ArrayList<String> votes) {
		for (String n : votes) {
			if (n.toUpperCase().contains("POPE FRANCIS")) {
				popeScore += 1;
			} else if (n.toUpperCase().contains("EDWARD SNOWDEN")) {
				snowScore += 1;
			}

		}
		System.out.println(snowScore);
		System.out.println(popeScore);
		if (popeScore > snowScore) {
			return "pope francis";
		} else if (popeScore == snowScore) {
			return "TIE";
		} else {
			return "edward snowden";
		}
	}

}
