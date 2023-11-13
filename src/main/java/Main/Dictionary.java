package Main;

import java.util.ArrayList;

public class Dictionary extends DictionaryMethod{

    ArrayList<Word> dictionary = new ArrayList<>();


    @Override
    public ArrayList<Word> getAllWords() {
        return dictionary;
    }

    @Override
    public ArrayList<String> getAllWordsTarget() {
        ArrayList<String> wTargets = new ArrayList<>();
        for (Word word : dictionary) {
            String target = word.getWord_target();
            wTargets.add(target);
        }
        return wTargets;
    }

    @Override
    public String lookUpWord(String wordTarget) {
        for (Word w : dictionary) {
            if(w.getWord_target().equals(wordTarget)) {
                return w.getWord_explain();
            }
        }
        return "undefined";
    }

    @Override
    public boolean insertWord(String wordTarget, String wordExplain) {
        for (Word w : dictionary) {
            if(w.getWord_target().equals(wordTarget)) {
                return false;
            }
        }
        Word word = new Word(wordTarget, wordExplain);
        dictionary.add(word);
        return true;
    }

    @Override
    public boolean deleteWord(String wordTarget) {
        for (int i = 0; i < dictionary.size(); ++i) {
            if (dictionary.get(i).getWord_target().equals(wordTarget)) {
                dictionary.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateWordExplain(String wordTarget, String wordExplain) {
        for (Word w : dictionary) {
            if (w.getWord_target().equals(wordTarget)) {
                w.setWord_explain(wordExplain);
                return true;
            }
        }
        return false;
    }
}
