package com.sda.lesson6;

public class SomeClass {
    int val = 50;
    String str = "default";

    public SomeClass(){
        this(100);
    }

    public SomeClass(int val){
        this.val = val;

    }

    public SomeClass(String str){
        this();
        this.str = "some-value";
    }

    public SomeClass(int val, String str){
        this(str);
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;

    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }



}
