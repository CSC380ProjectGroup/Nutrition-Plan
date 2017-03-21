import java.util.*;

/**
* Class representing a single food object
* @author Brandon
*/

public class FoodObject {

// Global variables
	public String name, type; // name and type of food
	public int cal; // calories
	public ArrayList<String> alg; // list of ingredients concerning allergies
	public int quantity; // quantity of that food object

// Constructor
	public FoodObject() {
		name = null;
		type = null;
		cal = 0;
		alg = new ArrayList<String>();
		quantity = 0;
	}

// Parameterized Constructor
	public FoodObject(String n, String t, int c, ArrayList<String> a, int q) {
		name = n;
		type = t;
		cal = c;
		alg = a;
		quantity = q;
	}

// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCal() {
		return cal;
	}

	public void setCal(int cal) {
		this.cal = cal;
	}

	public ArrayList<String> getAlg() {
		return alg;
	}

	public void setAlg(ArrayList<String> alg) {
		this.alg = alg;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		
	} 

// Methods
	// check for valid calorie value
	public boolean checkCal(int x) {
		if (x < 0)
			return false;
		else
			return true;
	}

	// check if food contains allergies
	public boolean checkAlg() {
		if (this.alg.isEmpty()) {
			return false;
		} else
			return true;
	}

	// adjust total calories based on amount of servings
	public void adjustCal(int s) {
		this.setCal(cal *= s);
	}

}
