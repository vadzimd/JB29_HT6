package jb29.unit12;

public class Task03 {

	public static void main(String[] args) throws Exception {

		FlowerList flowers = new FlowerList();
		PackagingList packagings = new PackagingList();

		Bouquet bouqet = new Bouquet();

		Flower roseRed = new Flower("rose", "red", 30, 5.50, 5);
		Flower roseWhite = new Flower("rose", "white", 50, 10.50, 5);

		Packaging craftPaper = new Packaging("craft paper", "paper", "grey", 1, 1.5);
		Packaging ribbon = new Packaging("ribbon", "silk", "violet", 1, 0.5);

		flowers.add(roseRed);
		flowers.add(roseWhite);

		packagings.add(craftPaper);
		packagings.add(ribbon);

		bouqet.add(flowers, packagings);

		System.out.println(bouqet.toString());
	}

}
