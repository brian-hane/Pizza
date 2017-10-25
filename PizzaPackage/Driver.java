/**
 * 
 */
package PizzaPackage;
import PizzaPackage.PizzaSize.Pizzasize;
/**
 * @author Brian Hane
 *
 */
public class Driver {

	public static void main(String[] args) {
		
		Pizza pizza = new Pizza();
		System.out.println("Order a pizza\n");
		System.out.println(pizza.getDescription());
		System.out.println("Changing my order\n");
		pizza.setSize(Pizzasize.medium.name());
		pizza.setPep(6);
		pizza.setBeef(2);
		pizza.setCheese(1);
		System.out.println(pizza.getDescription());
		// order a special pizza
		System.out.println("Order a special pizza");
		SpecialPizza specialPizza = new SpecialPizza();
		specialPizza.setSize(Pizzasize.large.name());
		specialPizza.setCheese(5);
		specialPizza.setBeef(3);
		specialPizza.setPep(2);
		System.out.println(specialPizza.bellsAndWhistles());
	
	
	}

}
