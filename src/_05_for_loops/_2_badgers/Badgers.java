package _05_for_loops._2_badgers;

public class Badgers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int loop=0; loop < 2; loop ++) {
			for (int animal=0; animal < 12; animal++) {
				System.out.print("Badger");
				if(animal != 11) {
					System.out.print(", ");
				} else {
					System.out.println();
				}

			}
			for (int plant=0; plant < 2; plant +=1) {
				System.out.print("Mushroom");
				if(plant !=1) {
					System.out.print(", ");
				} else {
					System.out.println();
					System.out.println();
				}
			}
		}
		System.out.println("A Snake!!!");
	}
}
