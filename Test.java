
public class Test
{

	public int test1()
	{
		Club club = new Club();
		Membership miembro1 = new Membership("Manuel", 2 , 1995 );
		Membership miembro2 = new Membership("Maria", 3 , 1995 );
		Membership miembro3 = new Membership("Jorge", 6 , 1995 );
		Membership miembro4 = new Membership("Benavides", 8 , 2015 );
		Membership miembro5 = new Membership("Bayon", 1 , 1684 );
		Membership miembro6 = new Membership("Miguel", 3 , 1995 );
		club.join(miembro1);
		club.join(miembro2);
		club.join(miembro3);
		club.join(miembro4);
		club.join(miembro5);
		club.join(miembro6);
		return club.joinedMonth(2);
		
	}
} 