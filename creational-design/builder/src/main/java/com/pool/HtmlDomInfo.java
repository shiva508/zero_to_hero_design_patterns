package com.pool;

public class HtmlDomInfo {
    public static void main(String[] args) {
        HtmlDom build = new HtmlDom.HtmlDomBuilder().title("").build();
        HtmlDom build1 = HtmlDom.builder().title("A").build();
        System.out.println(build1.hashCode());
        HtmlDom build2 = HtmlDom.builder().title("B").build();
        System.out.println(build2.hashCode());
    }
}
