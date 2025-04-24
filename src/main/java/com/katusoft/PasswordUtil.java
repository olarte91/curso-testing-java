package com.katusoft;

import static com.katusoft.PasswordUtil.SecurityLevel.HIGH;
import static com.katusoft.PasswordUtil.SecurityLevel.LOW;
import static com.katusoft.PasswordUtil.SecurityLevel.MEDIUM;

public class PasswordUtil {
    public enum SecurityLevel{LOW, MEDIUM, HIGH};

    public static SecurityLevel assessPassword(String password){
        if(password.length() < 8){
            return LOW;
        }

        if(password.matches("[a-zA-Z]+")){
            return LOW;
        }

        if(password.matches("[a-zA-Z0-9]+")){
            return MEDIUM;
        }

        return HIGH;
    }
}
