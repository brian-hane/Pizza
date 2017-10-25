package PizzaPackage;
/**
 * Pizza class 
 * @author Brian Hane
 *
 */
public class Pizza {
	private String size;
	protected int numCheese;
	protected int numPepperoni;
	protected int numBeef;
	/**default constructor for pizza
	 * @author Brian Hane
	 */
	public Pizza(){
		size ="medium";
		numCheese = 1;
		numPepperoni=0;
		numBeef=0;
	}
	/**
	 * constructor for pizza given parameters
	 * @author Brian Hane
	 * @param sizePizza - size of pizza
	 * @param cheese - number cheese toppings
	 * @param pep - number pepperoni toppings
	 * @param beef- number beef toppings
	 */
	public Pizza(String sizePizza,int cheese, int pep, int beef){
		size = sizePizza;
		if((cheese<=2)||(pep <=2)||(beef<=2)){
		numCheese = cheese;
		numPepperoni = pep;
		numBeef = beef;
		}
	}
	/**
	 * Calculates and returns cost of pizza
	 * @author Brian Hane
	 * @return cost - calculated cost of pizza
	 */
	public double calcCost(){
		double cost=0;
		int numTops;
		int costTops;
		if(size.equalsIgnoreCase("Small")){//switch case
			cost =10;
		}else if(size.equalsIgnoreCase("Medium")){
			cost =12;
		}else if(size.equalsIgnoreCase("Large")){
			cost = 14;
		}
		numTops = numCheese + numPepperoni+ numBeef;
		costTops = numTops*2;
		cost+=costTops;
		return cost;
	}
	/**Returns size and toppings of pizza
	 * @author Brian Hane
	 * @return description - Size and toppings of pizza
	 */
	public String getDescription(){
		String description="";
		description = ("Size: "+ size + "\t"+"Cheese: "+ numCheese + "\t"+"Pepperoni: "+numPepperoni +"\t"+"Beef: "+numBeef);
		return description;
	}
	/**
	 * Validates if cheese is between 0-2 and sets it
	 * @author Brian Hane
	 * @param cheese - number of cheese
	 */
	public void setCheese(int cheese){
		if ((cheese<=2)&&(cheese>=0)){
			numCheese = cheese;	
		}
	}
	/**
	 * returns number of cheese
	 * @author Brian Hane
	 * @return numCheese - number of cheese
	 */
	public int getCheese(){
		return numCheese;
	}
	/**
	 * sets number of pepperoni, validates if 0-2
	 * @author Brian Hane
	 * @param pep - number of pepperoni
	 */
	public void setPep(int pep){
		if((pep<=2)&&(pep>=0)){
			numPepperoni = pep;
		}
	}
	/**
	 * returns number of pepperoni
	 * @author Brian Hane
	 * @return pep- number of pepperoni
	 */
	public int getPep(){
		return numPepperoni;
	}
	/**
	 * sets number of beef toppings, validates 0-2
	 * @author Brian Hane
	 * @param beef- number of beef
	 */
	public void setBeef(int beef){
		if ((beef<=2)&&(beef>=0)){
			numBeef = beef;
		}
	}
	/**
	 * returns number of beef toppings
	 * @author Brian Hane
	 * @return numBeef - number of beef toppings
	 */
	public int getBeef(){
		return numBeef;
	}
	/**
	 * sets pizza size
	 * @author Brian Hane
	 * @param PizzaSize - size of pizza
	 */
	public void setSize (String PizzaSize){
		this.size = PizzaSize;
	}
}