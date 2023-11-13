package Main;

import java.util.ArrayList;

public abstract class DictionaryMethod {

    public abstract ArrayList<Word> getAllWords();
    /**
     * get all E-words in Dictionary as String Array.
     */

    public abstract ArrayList<String> getAllWordsTarget();
    /**
     * get all E-words in Dictionary as String Array.
     */
    public abstract String lookUpWord(String wordTarget);
    /**
     * look for wordTarget in Dictionary.
     * return explain || "404" if not found.
     */
    public abstract boolean insertWord(String wordTarget, String wordExplain);
    /**
     * insert word to Dictionary if not existed.
     */
    public abstract boolean deleteWord(String wordTarget);
    /**
     * delete a word from Dictionary.
     */
    public abstract boolean updateWordExplain(String wordTarget, String wordExplain);
    /**
     * update a word's explanation.
     */


}





















