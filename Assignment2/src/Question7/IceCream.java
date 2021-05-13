package Question7;

public class IceCream extends DessertItem{
	float quantity;
	public IceCream(float q) {
		quantity=q;
	}
	public float getCost() {
		float cost = quantity*3f*7;
		float taxamount=(5f/100f)*cost;
		float totalcost = cost + taxamount;
		return totalcost;
	}

}
