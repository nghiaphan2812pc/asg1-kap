package application;

import java.util.ArrayList;

public class Dictionary {
	private ArrayList<Word> dictionary;

	public Dictionary(ArrayList<Word> dictionary) {
		this.dictionary = dictionary;
	}

	public Dictionary() {
		this(new ArrayList<Word>());
	}

	public ArrayList<Word> getDictionary() {
		return dictionary;
	}

	public void setDictionary(ArrayList<Word> dictionary) {
		this.dictionary = dictionary;
	}

	public int getLength() {
		return this.dictionary.size();
	}

	public void addNewWorld(Word word) {
		this.getDictionary().add(word);
	}

}
