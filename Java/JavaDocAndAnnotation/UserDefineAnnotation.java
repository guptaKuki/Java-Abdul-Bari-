/*Built-in annotations can be categorized into two:
 * =>Applied to code(gives the hint to the compiler so that it avoids showing errors)
 * =>Applied to other annotations 
 * */


package JavaDocAndAnnotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//
//@Retention(RetentionPolicy.CLASS) //now this annotation will be there in class file too
//@Documented //give info about in java docs too
//@Target(value= {ElementType.METHOD , ElementType.LOCAL_VARIABLE})  //to mention the elements where it can be used
//@Inherited // inherit from parent to child class.
//@Repeatable//annotation can be used multiple times


@interface MyAnno{ //An interface  with @ is user define Annotation
	String name(); 
	String project();   // we can give as many variable as we want
	String date() default "Today";
	float version() default 13.0f;
	
}



//Annotations are useful for giving meta data to class or interface or a method.
// @MyAnno(name="Kuki", project="Java Core")
public class UserDefineAnnotation {

	@MyAnno(name="Kuki", project="Java Core")
	public static void main(String[] args) {
		

	}

}


/* In-Built Annotations:
  	Retention
  	Documented
  	Target
  	Inherited
  	Repeatable
 */