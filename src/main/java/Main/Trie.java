package Main;

public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    private class TrieNode {
        private TrieNode[] children;
        private boolean isWord;

        public TrieNode() {
            this.children = new TrieNode[26];
            this.isWord = false;
        }
    }

    public static void insert(String word) {

    }

    public static void delete(String target) {

    }
}
