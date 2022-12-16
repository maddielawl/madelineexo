package com.madeline.madelineexo;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class SelectClassTest {
    public SelectClass myClass = new SelectClass();


    @Test
    void classSelectionTest()
    {
        assertNotEquals(myClass.chooseAClass(),"toto");
    }
}
