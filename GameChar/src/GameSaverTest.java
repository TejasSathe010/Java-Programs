import java.io.*;


public class GameSaverTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		GameCharacter one = new GameCharacter(50,"Elf",new String[]{"bow","sword","dust"});
		GameCharacter two = new GameCharacter(150,"Troll",new String[]{"Bare Hand","Big X"});
		GameCharacter three = new GameCharacter(250,"Magician",new String[]{"Spells","invisibility"});
		
		FileOutputStream F = new FileOutputStream("Game.ser");
		try {
			ObjectOutputStream O = new ObjectOutputStream(F);
			O.writeObject(one);
			O.writeObject(two);
			O.writeObject(three);

			System.out.println("First " + one.getType());
			System.out.println("Second " + two.getType());
			System.out.println("Three " + three.getType());
			O.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		one = null;
		two = null;
		three = null;
		
		
		FileInputStream J = new FileInputStream("Game.ser");
		try {
			ObjectInputStream K = new ObjectInputStream(J);
			try {
				one =(GameCharacter) K.readObject();
				two =(GameCharacter) K.readObject();
				three =(GameCharacter) K.readObject();
				System.out.println("First Restore " + one.getType());
				System.out.println("Second Restore " + two.getType());
				System.out.println("Three Restore " + three.getType());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			K.close();
			J.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
