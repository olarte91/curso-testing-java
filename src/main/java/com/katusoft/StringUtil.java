package com.katusoft;

import java.util.function.BiFunction;

public class StringUtil {
    static BiFunction<String, Integer, String> repetirString = (s, t) -> {
        if (t < 0) {
            throw new IllegalArgumentException("El número de repeticiones debe ser mayor o igual a 0.");
         }
        return s.repeat(t).toUpperCase(); 
    };
    
}
