package com.iit.hw2;

import java.util.StringTokenizer;

public class ImprovedStringTokenizer extends StringTokenizer {
    public ImprovedStringTokenizer(String str) {
        super(str);
    }

    public String[] tokenString() {
        int tokenSize = countTokens();
        String[] returnStrArray = new String[tokenSize];
        for (int i = 0; i < tokenSize; i++) {
            returnStrArray[i] = nextToken();
        }
        return returnStrArray;
    }
}
