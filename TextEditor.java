/**
 * 
 */
package com.setter;

/**
 * @author SURYA
 *
 */
public class TextEditor {
	
	private SpellChecker spellChecker;

	/**
	 * 
	 */
	public TextEditor() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the spellChecker
	 */
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	/**
	 * @param spellChecker the spellChecker to set
	 */
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setspellchecker");
		this.spellChecker = spellChecker;
	}

	public void spellCheck()
	{
		spellChecker.checkSpelling();
	}
	
	

}
