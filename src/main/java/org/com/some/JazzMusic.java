package org.com.some;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {

    @Override
    public String getSong() {
        return "Take five";
    }
}
