package com.madeline.madelineexo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class stringrepeatTest {

    public stringrepeat string = new stringrepeat();

    @Test
    void repeat() {

        String[] test = { "toto" , "titi" , "tata" };
        assertFalse(stringrepeat.repeat(test).isEmpty());

    }
}