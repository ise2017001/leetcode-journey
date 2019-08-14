class TrieNode {
	public boolean isEnd;
	public TrieNode[] children = new TrieNode[26];
	public TrieNode() {}
}

public class Trie {
	private TrieNode root;
	public Trie() {
		root = new TrieNode();
	}

	public void insert(String word) {
		TrieNode explorer = root;
		for (int i = 0;i < word.length(); i++) {
			char c = word.charAt(i);
			if (explorer.children[c - 'a'] == null) {
				explorer.children[c - 'a'] = new TrieNode();
			}
			explorer = explorer.children[c - 'a'];
		}
		explorer.isEnd = true;
	}

	public boolean search (String word) {
		TrieNode explorer = root;
		for (int i = 0;i < word.length();i++) {
			char c = word.charAt(i);
			if (explorer.children[c - 'a'] == null) {
				return false;
			}
			explorer = explorer.children[c - 'a'];
		}
		return explorer.isEnd;
	}

	public boolean startsWith(String prefix) {
		TrieNode explorer = root;

		for (int i = 0;i < prefix.length();i++) {
			char c = prefix.charAt(i);
			if (explorer.children[c - 'a'] == null) {
				return false;
			}
			explorer = explorer.children[c - 'a'];
		}
		return true;
	}
}