import java.util.*;
import java.io.*;
public class MadLibs {

	public static void main(String[] args) throws IOException{
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
		BufferedReader buffer = new BufferedReader(fr);

		String current = buffer.readLine();

		while(current != null)
		{
			verbs.add(current);
			current = buffer.readLine();
		}
		
		//3. Read an adjectives.txt file and store its list of adjectives into an arraylist.
		fr = new FileReader("adjectives.txt");
		buffer = new BufferedReader(fr);

		current = buffer.readLine();

		while(current != null){
			adjs.add(current);
			current = buffer.readLine();
		}
		buffer.close();

		
		//4. Read an adverbs.txt file and store its list of adverbs into an arraylist.
		
		FileReader adv = new FileReader("adverbs.txt"); 
		BufferedReader advBuffer = new BufferedReader(adv);

		String current1 = advBuffer.readLine();

		while(current1 != null)
		{
			advs.add(current1);
			current1 = advBuffer.readLine();
		}
		advBuffer.close();			

		//5. Prompt user for the name of a file containing a MadLibs story.
		// Read the story from that file and write it to System.out, but replacing each instance of
		// <<NOUN>>, <<VERB>>, etc. with a randomly chosen word from the corresponding list.

		System.out.println("Please give us a name of a file: ");
		Scanner keyboard = new Scanner(System.in);
		String fileName = keyboard.nextLine();
		BufferedReader storyReader = new BufferedReader(new FileReader(fileName));
		
		String story = "";
		int inputCharNum = storyReader.read();
		while(inputCharNum != -1) {
			story += (char)inputCharNum;
			inputCharNum = storyReader.read();
		}
		storyReader.close();
		
		int nounRandom = (int)(Math.random()*nouns.size());
		int verbRandom = (int)(Math.random()*verbs.size());
		int adjRandom = (int)(Math.random()*adjs.size());
		int advRandom = (int)(Math.random()*advs.size());
		
		String randomNoun = nouns.get(nounRandom);
		String randomVerb = verbs.get(verbRandom);
		String randomAdj = adjs.get(adjRandom);
		String randomAdv = advs.get(advRandom);
		
		int nounLoc = story.indexOf("<<NOUN>>");
		story = story.substring(0, nounLoc) + randomNoun + story.substring(nounLoc + 8);
		int verbLoc = story.indexOf("<<VERB>>");
		story = story.substring(0, verbLoc) + randomVerb + story.substring(verbLoc + 8);
		int adjLoc = story.indexOf("<<ADJECTIVE>>");
		story = story.substring(0, adjLoc) + randomAdj + story.substring(adjLoc + 13);
		int advLoc = story.indexOf("<<ADVERB>>");
		story = story.substring(0, advLoc) + randomAdv + story.substring(advLoc + 10);

		System.out.println(story);
	}

}
