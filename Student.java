
package objectserialization;

import java.io.Serializable;

public class Student implements Serializable {
    private String Alphabet;
     
    
    public Student(String alphabet) {
        this.Alphabet = alphabet;
        
    }
    
    public String getAlphabet() {
        return this.Alphabet;
    }
    
    public String setName(String newAlphabet) {
        return (this.Alphabet = newAlphabet);
    }
    
   
    
    @Override
    public String toString() {
       return String.format("%s",this.Alphabet);
    }
    

}
