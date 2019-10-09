package jb29.unit12;

public class Task01 {

	public static void main(String[] args) {
		
		Word header = new Word("Quote");
		Text text = new Text(header);
	

		Word word1 = new Word("There");
		Word word2 = new Word("is");
		Word word3 = new Word("only");
		Word word4 = new Word("one");
		Word word5 = new Word("way");
		Word word6 = new Word("to");
		Word word7 = new Word("avoid");
		Word word8 = new Word("criticism");


		Phrase phrase = new Phrase();
		phrase.addValue(word1);
		phrase.addValue(word2);
		phrase.addValue(word3);
		phrase.addValue(word4);
		phrase.addValue(word5);
		phrase.addValue(word6);
		phrase.addValue(word7);
		phrase.addValue(word8);

		text.addBody(phrase);

		System.out.println("Head: " + text.getHeader());
		System.out.println("Body: " + text.getBody());

	}

}
