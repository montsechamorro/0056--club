import java.util.ArrayList;
import java.util.Iterator;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{

    // Almacena los socios del club
    private ArrayList<Membership> socios;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        socios = new ArrayList<Membership>();

    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        socios.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return socios.size();
    }

    /**
     * Calcula el numero de socios que se dieron de alta en un mes determinado. 
     * El año no nos importa. En caso de que el parametro contenga un valor 
     * no valido se muestra por pantalla el error.
     * @param month El mes en el que estamos interesados
     * @return El numero de socios que se dieron de alta dicho mes
     */

    public int joinedMonth(int month)
    {
        int numeroMiembros = 0;

        if ((month > 0) && (month < 13))
        {
            for (Membership miembros : socios)
            {
                if (month == miembros.getMonth())
                {
                    numeroMiembros++;
                }
            }
        }
        else
        {
            System.out.println("El parametro introducido no es válido");
        }
        return numeroMiembros;
    }

    /** 
     * Todos los socios que se han dado de alta un determinado mes de un determinado año se
     * dan de baja. En caso de que el parametro month contenga un valor no valido se muestra 
     * por pantalla el error.
     * @param month El mes en el que estamos interesados
     * @param year El año en el que estamos interesados
     * @return Una coleccion con los socios que se han dado de baja del club
     */
    public ArrayList<Membership> purge(int month, int year)
    {
        ArrayList<Membership> eliminados = new ArrayList();

        if ((month > 0) && (month < 13))
        {
            // bucle que elimina del atributo miembros y añade a eliminados
           Iterator<Membership> it = socios.iterator();
           
			while (it.hasNext())
			{
				Membership miembro = it.next();
				
				if(miembro.getMonth() == month && miembro.getYear() == year)
				{
					eliminados.add(miembro);
					it.remove();
				}
			}
        }
        else
        {
            System.out.println("Los parametros introducidos no son validos");
        }
        return eliminados;
    }

}

