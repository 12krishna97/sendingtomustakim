package polymerphism;

public class Driver {
	public static void main(String[] args) {
		// passing super class refrenace to super class so not considerd as upcasting
		Card c1 = new Card();
		SwipingMachine s = new SwipingMachine();
		s.swipe(c1);
		
		//upcasting achived (c=c2)
		CreditCard c2 = new CreditCard();
		s.swipe(c2);
		
		//upacsting achived (c=d1)
		DebitCard d1 = new DebitCard();
		s.swipe(d1);
	}

}
