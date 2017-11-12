package src2;

import libs.Input;

public class Ascii {

	public static void main(String[] args) {
	    for (int i = 0; i < 650 + 26; i++)
	    {
	        Input.print((char) i + " is " + i + "\n");
	    }

	}

}
