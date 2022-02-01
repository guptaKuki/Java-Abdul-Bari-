// To Create our own Java Documentation.

/** @author Kuki
 * @version 9.1
 * @since 2019
 */


package JavaDocAndAnnotation;

/**
 * 
 * @author Kuki
 *Class For Library book.
 */
public class Book {

	/**
	 * @value 10 as Default value
	 */
	static int i=10;
	
	/**
	 * Parameterized Constructor
	 * @param s Book name
	 */
	public Book(String s) {
	}
	
	/**
	 * Issue a book to a student
	 * @param roll Roll number of a student
	 * @throws Exception If book is not available ,throws an Exception
	 */
	public void issue(int roll)throws Exception{
		
	}
	
	/**
	 * Check if book is available
	 * @param str  Name of book
	 * @return If book is available return true else false
	 */
	public boolean available(String str) {
		return true;
		}
	
	/**
	 * Get book Id
	 * @param id Book Id number
	 * @return Returns Book Name
	 */
	public String getName( int id) {
		return "";
	}
}
