package it.unibo.pslab.oop.p17lambda.optional;

public class UsePerson {

	public static void main(String[] args) {
		
		final Person p1 = new Person("Mario");
		final Person p2 = new Person("Gino");
		p1.setPartner(p2);
		
		IO.println(p1.getName()+" "+
						   p1.getPartner().isPresent()+" "+
						   p1.getPartnerName());
		// Mario true Optional[Gino]
		
		IO.println(p2.getName()+" "+
		                   p2.getPartner().isPresent()+" "+
		                   p2.getPartnerName());
		// Gino false Optional.empty
	}

}
