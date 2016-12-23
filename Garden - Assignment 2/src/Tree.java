
public class Tree {
	
	private int age;
	private boolean disease;
	private int daysWatered;
	
	public Tree(){
		// For planting a new tree
		age = 0;
		disease = false;
		daysWatered = 0;
	}
	
	public Tree(int startAge, boolean startDisease, int startDaysWatered){
		// For planting a sapling that has already aged some or adding a previously unrecorded tree
		age = startAge;
		disease = startDisease;
		daysWatered = startDaysWatered;
	}
	
	public int getAge(){
		return age;
	}
	public int getDaysWatered(){
		return daysWatered;
	}
	public boolean isDiseased(){
		return disease;
	}
	public void water(){
		daysWatered = 0;
	}
	public void nextDay(){
		daysWatered++;
	}
	public void grow(){
		age++;
	}
}