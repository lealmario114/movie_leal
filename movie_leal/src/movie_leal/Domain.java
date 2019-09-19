/*Programmer:    Mario Leal
 *program class: Domain
 *use:           super class that has one parameter, name
 *               and one method, toStirng. 
*/
package movie_leal;

public class Domain {

	
	//domain class that has one parameter and one toStirng()
	String name;
	
	Domain(){
		name =" No Name ";
	}

	@Override
	public String toString() {
		return "Domain [name=" + name + "]";
	}
	
}
