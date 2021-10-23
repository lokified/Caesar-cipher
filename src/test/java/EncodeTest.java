import modules.Encode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncodeTest {

    @Test
    public void isInputString_checkIfInputIsString_string() {
        String myString = "Sheldon";
        Encode testInput = new Encode();
        assertEquals(myString,testInput.isInputString("Sheldon"));
    }

    @Test
    public void isInputInteger_InputFromUserIsNumber_integer() {
        int myInteger = 1;
        Encode testInput = new Encode();
        assertEquals(myInteger,testInput.isInputInteger(1));
    }

    @Test
    public void encodeYourWord_encryptTheInput_string()throws Exception {
        String output = "tifmepo";
        int key = 1;
        Encode testOutput = new Encode();
        assertEquals(output,testOutput.encodeYourWord("sheldon",1));
    }
}