
public class FruitTree extends Tree{
	private int youngFruit;
	private int ripeFruit;
	private boolean isCollected;
	private boolean isFlowering;
	
	public FruitTree(){
		// For a new tree
		super();
		youngFruit = 0;
		ripeFruit = 0;
		isCollected = false;
		isFlowering = false;
	}
	
	public FruitTree(int age, int daysWatered, boolean startDisease){
		// For a sapling that has grown some, but still doesn't Flower or Bear Fruit.
		super(age, startDisease,daysWatered);
		youngFruit = 0;
		ripeFruit = 0;
		isCollected = false;
		isFlowering = false;
	}
	
	public FruitTree(int age, int daysWatered, boolean startDisease, int startYoungFruit, int startRipeFruit){
		// For a tree that blooms and bears fruit
		super(age, startDisease, daysWatered);
		youngFruit = startYoungFruit;
		ripeFruit = startRipeFruit;
		isCollected = false;
		isFlowering = true;
	}
	
	public int getYoungFruit(){
		return youngFruit;
	}
	public int getRipeFruit(){
		return ripeFruit;
	}
	public boolean isCollected(){
		return isCollected;
	}
	public boolean isFlowering(){
		return isFlowering;
	}
	
	public void collect(){
		ripeFruit = 0;
		isCollected = true;
	}
	public void grow(){
		super.grow();
		if(isFlowering){
			isCollected = false;
			youngFruit += Math.round(10.0*Math.random());
		}
	}
	public void nextDay(){
		super.nextDay();
		double ripen = youngFruit*0.2*Math.random();
		ripeFruit += Math.round(ripen);
		youngFruit -= Math.round(ripen);
	}
}
