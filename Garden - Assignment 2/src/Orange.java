
public class Orange extends FruitTree{
	private String orangeSpecies;
	
	/*
	 * The Constructors are the same as the Superclass,
	 * Except they ask which species of orange grows.
	 * Only one species can grow on one tree, so naming the species is the only necessary change.
	 */
	public Orange(String nameSpecies){
		super();
		orangeSpecies = nameSpecies;
	}
	public Orange(int age, int daysWatered, boolean startDisease, String nameSpecies){
		super(age, daysWatered, startDisease);
		orangeSpecies = nameSpecies;
	}
	public Orange(int age, int daysWatered, boolean startDisease, int startYoungFruit, int startRipeFruit, String nameSpecies){
		super(age, daysWatered, startDisease);
		orangeSpecies = nameSpecies;
	}
	
	public String getSpecies(){
		return orangeSpecies;
	}
}
