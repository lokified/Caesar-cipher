import org.junit.Test;
import static org.junit.Assert.*;

public class DecodeTest {

    @Test
    public void newDecode_instantiatesCorrectly() {
        Decode test = new Decode("sdff jjhhs");
        assertEquals(true,test instanceof Decode);
    }

    @Test
    public void isInputString_checkIfInputIsString_string() {
        Decode testInput = new Decode("tifmepo");
        assertEquals(true,testInput.getYourWord() instanceof String);
    }

    @Test
    public void decodeEncryption_ifResultIsString_String() {
        String decrypted = "sheldon";
        Decode testOutput = new Decode("tifmepo");
        assertEquals(decrypted,testOutput.decodeEncryption("tifmepo",1));
    }
}