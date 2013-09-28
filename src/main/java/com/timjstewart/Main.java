package com.timjstewart;

// FIXME soon
/**
 * <p>Main class.</p>
 *
 * @author tims
 * @version $Id: $Id
 */
public final class Main {
    // TODO fix NPE
    /**
     * <p>main.</p>
     *
     * @param args an array of {@link java.lang.String} objects.
     */
    public static void main(String[] args) {
	System.out.println("Hello, World!");
	for(final String arg : args) {
	    System.out.println(arg);
	}

	final String s = null;
	// FIXME before I crash
	s.length();
    }
}
