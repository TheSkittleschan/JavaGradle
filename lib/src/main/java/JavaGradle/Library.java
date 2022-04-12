/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package JavaGradle;
import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Library {
	private static final Logger logger = LogManager.getLogger("Library");
	private String myString;
	
	public Library(String myString) {
		this.myString = myString;
	}
	
	public void updateString() {
	    this.myString = myString.toLowerCase();
	    logger.info("myString={}", myString);
	}
	
	public void changeString() {
		this.myString = myString.toUpperCase();
	}
	
	
    public boolean someLibraryMethod() {
        return true;
    }

	public String getString() {
		return myString;
	}

    @Override
    public int hashCode() {
	return Objects.hash(myString);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Library other = (Library) obj;
	return Objects.equals(myString, other.myString);
    }

    @Override
    public String toString() {
	return "Library [myString=" + myString + "]";
    }

	
    
    
}
