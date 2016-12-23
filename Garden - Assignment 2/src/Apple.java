
public class Apple extends FruitTree{
	private String appleSpecies;
	
	/*
	 * The Constructors are the same as the Superclass,
	 * Except they ask which species of apple grows.
	 * Only one species can grow on one tree, so naming the species is the only necessary change.
	 */
	public Apple(String nameSpecies){
		super();
		appleSpecies = nameSpecies;
	}
	public Apple(int age, int daysWatered, boolean startDisease, String nameSpecies){
		super(age, daysWatered, startDisease);
		appleSpecies = nameSpecies;
	}
	public Apple(int age, int daysWatered, boolean startDisease, int startYoungFruit, int startRipeFruit, String nameSpecies){
		super(age, daysWatered, startDisease);
		appleSpecies = nameSpecies;
	}
	
	public String getSpecies(){
		return appleSpecies;
	}
}
