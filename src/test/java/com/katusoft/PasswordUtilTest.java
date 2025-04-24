package com.katusoft;

import static org.junit.Assert.assertEquals;
import static com.katusoft.PasswordUtil.SecurityLevel.*;
import org.junit.Test;

public class PasswordUtilTest {

    @Test
    public void low_when_has_less_than_8_letters() {
        assertEquals(LOW, PasswordUtil.assessPassword("12AB*4"));
    }

    @Test
    public void low_when_has_only_letters() {
        assertEquals(LOW, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcd12345"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        assertEquals(HIGH, PasswordUtil.assessPassword("abcd12345!"));
    }
    

}
