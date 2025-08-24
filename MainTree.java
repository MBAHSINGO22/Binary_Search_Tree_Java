package PERTEMUAN3;

public class MainTree {
	public static void main(String[] args) {
		Tree theTree = new Tree();

		theTree.add(42);
		theTree.add(21);
		theTree.add(38);
		theTree.add(27);
		theTree.add(71);
		theTree.add(82);
		theTree.add(55);
		theTree.add(63);
		theTree.add(6);
		theTree.add(2);
		theTree.add(40);
		theTree.add(12);

		System.out.println("Elemen-elemen yang ditambahkan ke Tree:");
		System.out.println("42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40, 12");

		findKey(theTree, 27);
		findKey(theTree, 100);
	}

	public static void findKey(Tree tree, int key) {
		TreeNode ditemukan = tree.getNode(key);
		if (ditemukan != null) {
			System.out.println("Node dengan key = " + key + " ditemukan.");
		} else {
			System.out.println("Node dengan key = " + key + " tidak ditemukan.");
		}
	}
}
