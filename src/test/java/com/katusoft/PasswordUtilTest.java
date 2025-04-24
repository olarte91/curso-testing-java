package com.katusoft;

import static org.junit.Assert.assertEquals;
import static com.katusoft.PasswordUtil.SecurityLevel.*;
import org.junit.Test;

public class PasswordUtilTest {

    @Test
    public void low_when_has_less_than_8_letters() {
        assertEquals(PasswordUtil.assessPassword("12AB*4"),LOW );
    }

    @Test
    public void low_when_has_only_letters() {
        assertEquals(PasswordUtil.assessPassword("1234567"), LOW);
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(PasswordUtil.assessPassword("abcd12345"), MEDIUM);
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        assertEquals(PasswordUtil.assessPassword("abcd12345!"), HIGH);
    }
    

}
