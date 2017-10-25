package PizzaPackage;
/**
 * Class containing SpecialPizza inherited from Pizza
 * @author Brian Hane
 *
 */
public class SpecialPizza extends Pizza{
	/**
	 * default constructor for special pizza
	 * @author Brian Hane
	 */
	public SpecialPizza(){
		numCheese = 1;
		numPepperoni=0;
		numBeef=0;
	}
	/**
	 * sets number of pepperoni
	 * @author Brian Hane
	 * @param pep - number of pepperoni
	 */
	@Override
	public void setPep(int pep){
		numPepperoni = pep;
	}
	/**
	 * sets number of cheese
	 * @author Brian Hane
	 * @param cheese - number of cheese
	 */
	@Override 
	public void setCheese(int cheese){
		numCheese = cheese;
	}
	/**
	 * sets number of beef
	 * @author Brian Hane
	 * @param beef - number of beef
	 */
	@Override 
	public void setBeef(int beef){
		numBeef = beef;
	}
	/**
	 * returns description of pizza and thank you message
	 * @author Brian Hane
	 * @return result - description and thank you message
	 */
	public String bellsAndWhistles(){
		String result ="";
		result = super.getDescription() + " thank you for ordering a special pizza";
		return result;
	}
	
}
