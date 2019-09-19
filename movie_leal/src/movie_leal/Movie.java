/*Programmer:    Mario Leal
 *program class: movie
 *use:           child class of domain. has overloaded constructor.
 *               takes the name of movie, number of adults, and 
 *               number of children. also stores info into parameters
 *               and has multiple getters for said info. 
*/
package movie_leal;

public class Movie extends Domain{

	
	String nameOfMovie;
	int adults;
	int children;
	int total;
	
	Movie(){
		nameOfMovie=super.toString();
		adults = 0;
		children = 0;
		total = 0;
	}
	
	Movie(String name, int adult, int children){
		nameOfMovie = name;
		this.adults=adult;
		this.children = children;
		total = this.adults +this.children;
	}
	
	void price() {
		System.out.println("Total cost is $"+getTotal());
	}

	//the rest are just getter methods for all the variables
	
	public String getNameOfMovie() {
		return nameOfMovie;
	}

	public int getAdults() {
		return adults;
	}

	public int getChildren() {
		return children;
	}

	public int getTotal() {
		return total;
	}

	
	
	
	
}
