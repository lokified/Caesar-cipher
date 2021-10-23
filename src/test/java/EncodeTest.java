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
}