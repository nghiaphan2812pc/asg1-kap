package application;

public class DictionaryCommandline {
	private DictionaryManager dictionaryManager;
	

	public DictionaryCommandline(DictionaryManager dictionaryManager) {
		this.dictionaryManager = dictionaryManager;
	}

	public DictionaryCommandline() {
		this.dictionaryManager = new DictionaryManager();
	}

	public DictionaryManager getDictionaryManager() {
		return dictionaryManager;
	}

	public void setDictionaryManager(DictionaryManager dictionaryManager) {
		this.dictionaryManager = dictionaryManager;
	}

	public void dictionaryBasic() {
		this.dictionaryManager.insertFromCommandline();
		this.dictionaryManager.showAllWord();
	}
	
	public static void main (String [] args) {
		DictionaryCommandline dictionaryCommandline = new DictionaryCommandline();
		dictionaryCommandline.dictionaryBasic();

	}
	
	
	

}
