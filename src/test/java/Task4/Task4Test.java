package Task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void isValidStr() {
        boolean a=Task4.isValidStr("'(', ['{'},] {'}', ')' '[' і ']'");
        assertTrue(a);

    }
}