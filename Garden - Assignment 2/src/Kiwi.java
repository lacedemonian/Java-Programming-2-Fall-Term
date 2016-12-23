
public class Kiwi extends FruitTree{
	
	/*
	 * The Constructors are the same as the Superclass,
	 * The Kiwi doesn't have unique species names. So it will return "Common Kiwi" when asked.
	 */
	public Kiwi(){
		super();
	}
	public Kiwi(int age, int daysWatered, boolean startDisease){
		super(age, daysWatered, startDisease);
	}
	public Kiwi(int age, int daysWatered, boolean startDisease, int startYoungFruit, int startRipeFruit){
		super(age, daysWatered, startDisease);
	}
	
	public String getSpecies(){
		return "Common Kiwi";
	}
}
