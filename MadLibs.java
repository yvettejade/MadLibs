
public class MadLibs {

	public static void main(String[] args) {
		//0. Give variable names for each of the arraylists below and create Madlibs stories.
		ArrayList<String> nouns =  new ArrayList<String>();
		ArrayList<String> verbs =  new ArrayList<String>();
		ArrayList<String> adjs =  new ArrayList<String>();
		ArrayList<String> advs =  new ArrayList<String>();
		//1. Read a nouns.txt file and store its list of nouns into an arraylist.
		BufferedReader nounReader = new BufferedReader(new FileReader("nouns.txt"));
 		while (nounReader.ready()) { 			
 			nouns.add(nounReader.readLine());
 		}
		nounReader.close();

		//2. Read a verbs.txt file and store its list of verbs into an arraylist.
		FileReader fr = new FileReader("verbs.txt"); 
		BufferedReader verbBuffer = new BufferedReader(fr);

		String current = verbBuffer.readLine();

		while(current != null)
		{
			verbs.add(current);
			current = verbBuffer.readLine();
		}
		verbBuffer.close();
		//3. Read an adjectives.txt file and store its list of adjectives into an arraylist.
		
		//4. Read an adverbs.txt file and store its list of adverbs into an arraylist.
		
		FileReader adv = new FileReader("adv.txt"); 
		BufferedReader advBuffer = new BufferedReader(adv);

		String current = advBuffer.readLine();

		while(current != null)
		{
			adv.add(current);
			current = advBuffer.readLine();
		}
		advBuffer.close();			

		//5. Prompt user for the name of a file containing a MadLibs story.
		// Read the story from that file and write it to System.out, but replacing each instance of
		// <<NOUN>>, <<VERB>>, etc. with a randomly chosen word from the corresponding list.

	}

}
