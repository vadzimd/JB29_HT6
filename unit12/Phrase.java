package jb29.unit12;

public class Phrase {

	private String value;

	public void addValue(Word word) {

		if (value == null) {
			value = word.getValue();
		} else {
			value += " " + word.getValue();
		}

	}

	public String getValue() {

		return value;
	}

}
