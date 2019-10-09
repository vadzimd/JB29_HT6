package jb29.unit12;

public class Text {

	private String header;
	private String body;

	public Text(Word word) {

		header = word.getValue();
	}

	public Text(Phrase phrase) {

		header = phrase.getValue();
	}

	public String getHeader() {

		return header;
	}

	public void addBody(Word word) {

		body += " " + word.getValue();
	}

	public void addBody(Phrase phrase) {

		if (body == null) {

			body = phrase.getValue();
		} else {
			body += " " + phrase.getValue();
		}
	}

	public String getBody() {

		return body;
	}

}
