package spelling;

import java.util.TreeSet;

/**
 * @author UC San Diego Intermediate MOOC team
 *
 */
public class DictionaryBST implements Dictionary 
{
   private TreeSet<String> dict = new TreeSet<String>();
	
   
   
    // TODO: Implement the dictionary interface using a TreeSet.  
 	// You'll need a constructor here
	
    
    /** Add this word to the dictionary.  Convert it to lowercase first
     * for the assignment requirements.
     * @param word The word to add
     * @return true if the word was added to the dictionary 
     * (it wasn't already there). */
    public boolean addWord(String word) {
    	String Word = word.toLowerCase();
        
    	if(dict.contains(word)) {    	
    	return false;
    }
    	else {
    		dict.add(Word);
    		return true;
    	}
    }
    /** Return the number of words in the dictionary */
    public int size()
    {
    	// TODO: Implement this method
        return dict.size();
    }

    /** Is this a word according to this dictionary? */
    public boolean isWord(String s) {
    	String Word = s.toLowerCase();
        
    	if (dict.contains(Word)) {
    		return true;
    	}
    	
    	else {
    		return false;
    	}
    	
    }

}
