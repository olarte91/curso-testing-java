package com.katusoft;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilTest {
    @Test
    public void repeat_string_once(){
        assertEquals(StringUtil.repetirString.apply("hola", 1), "HOLA");
    }

    @Test
    public void repeat_string_multiple_times(){
        assertEquals(StringUtil.repetirString.apply("hola", 3), "HOLAHOLAHOLA");
    }

    @Test
    public void repeat_string_zero_times(){
        assertEquals(StringUtil.repetirString.apply("hola", 0), "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times(){
        assertEquals(StringUtil.repetirString.apply("hola", -1), "");
    }

}
