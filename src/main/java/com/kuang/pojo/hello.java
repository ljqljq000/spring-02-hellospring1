package com.kuang.pojo;

public class hello {
    private String str;

    public String getStr() {
        return str;
    }
    //依靠这个set注入值，被spring托管了
    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
