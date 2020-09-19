package test.CaesarCipherEncryptor;

import main.CaesarCipherEncryptor.CaesarCipherEncryptor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CaesarCipherEncryptorTest {
    int key = 2;
    @Test
    public void TestCase1() {
        assertTrue(CaesarCipherEncryptor.caesarCypherEncryptor("xyz", key).equals("zab"));
    }

    @Test
    public void TestCase2() {
        assertEquals(CaesarCipherEncryptor.getNewLetter('z', key),'b');
    }
}