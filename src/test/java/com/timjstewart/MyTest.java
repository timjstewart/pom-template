package com.timjstewart;

import org.junit.*;

public class MyTest {

    @Test public void test1() {
	String[] args = { "Foo" };
	Main.main(args);

	String s = null;
	s.length();
    }

}
