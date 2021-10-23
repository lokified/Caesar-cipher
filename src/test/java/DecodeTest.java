import org.junit.Test;
import static org.junit.Assert.*;

public class DecodeTest {

    @Test
    public void isInputString_checkIfInputIsString_string() {
        String myString = "sheldon";
        Decode testInput = new Decode();
        assertEquals(myString,testInput.isInputString("sheldon"));
    }

    @Test
    public void decodeEncryption_ifResultIsString_String() {
        String decrypted = "sheldon";
        Decode testOutput = new Decode();
        assertEquals(decrypted,testOutput.decodeEncryption("tifmepo",1));
    }
}