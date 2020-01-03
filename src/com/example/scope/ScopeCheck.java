package com.example.scope;

public class ScopeCheck {

    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck crested, publicVar = " + publicVar + ": privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }
}
