package com.iit.hw2;

import org.junit.Assert;
import org.junit.Test;

public class TestImprovedStringTokenizer {

    @Test
    public void testTokenString() {
        ImprovedStringTokenizer tokenizer = new ImprovedStringTokenizer("This class is easy");
        Assert.assertEquals(4, tokenizer.tokenString().length);
    }

    @Test
    public void testTokenStringLong() {
        ImprovedStringTokenizer tokenizer = new ImprovedStringTokenizer("IIT Chicago is in Bronzeville area of Illinois");
        Assert.assertEquals("Bronzeville", tokenizer.tokenString()[4]);
    }
}
