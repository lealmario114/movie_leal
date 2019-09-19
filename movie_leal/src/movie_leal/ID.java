/*Programmer:    Mario Leal
 *program class: ID
 *use:           child class of Movie. takes the info and passes it to movie
 *               only has serial, cost, and movie as variables. and is what 
 *               the demo class calls the toString method from. also stores 
 *               the serial by just incrementing by one when this class is used. 
*/

package movie_leal;

public class ID extends Movie{

	int serial;
	int cost;
	String movie;
	
	//constructor
	public ID() {
		super();
		serial = 0;
		cost = 0;
		// TODO Auto-generated constructor stub
	}

	//overloaded constructor
	public ID(String name, int adult, int children) {
		super(name, adult, children);
		serial++;
		cost = super.getTotal();
		movie = super.getNameOfMovie();
		// TODO Auto-generated constructor stub
	}

	//toString
	@Override
	public String toString() {
		return "ID [serial= " + serial + ", cost= $" + cost + ", movie= " + movie + "]";
	}
	

	
	
}
