import java.io.*;
public class GameCharacter implements Serializable{
	int power;
	String type;
	String[] weapons;
	
	GameCharacter(int p,String t,String[] w){
		this.power = p;
		this.type = t;
		this.weapons = w;
	}

	public int getPower() {
		return power;
	}
	
	public String getType() {
		return type;
	}
	
	public String getWeapons() {
		String weaponlist = "";
		for(int x=0;x<weapons.length;x++) {
			weaponlist += weapons[x] + "";
		}
		return weaponlist;
	}

}
