import modules.Encode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncodeTest {

    @Test
    public void newEncode_instantiatesCorrectly() {
        Encode test = new Encode("I am singing",2);
        assertEquals(true,test instanceof Encode);
    }

    @Test
    public void isInputString_checkIfInputIsString_string() {

        Encode testInput = new Encode("sheldon",1);
        assertEquals("sheldon",testInput.getYourWord());
    }

    @Test
    public void isInputInteger_InputFromUserIsNumber_integer() {
        Encode testInput = new Encode("sheldon",1);
        assertEquals(1,testInput.getYourKey());
    }

    @Test
    public void encodeYourWord_encryptTheInput_string()throws Exception {
        String output = "tifmepo";
        Encode testOutput = new Encode("a dog",1);
        assertEquals(output,testOutput.encodeYourWord("sheldon",1));
    }
}