package com.g0405.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestButton {

    Button button;


    @BeforeEach
    public void setUp()  {
        button = new Button(10, "abc", "#171717", 10);

    }

    @Test
    public void testButtonChangeColor(){
        button.changeColor("#000000");
        assertEquals("#000000",button.getColor());
    }
}
