package com.example.project;

public class String1 {
	private char[] str;
	private int size;

	public String1 () {
	   size = -1;
	   str = new char[80];
	}
	public void append(char c) {
        str[++size] = c;
    }
    public char remove() {
        return str[size--];
    }
    public char getChar(int i) {
        return str[i];
    }
    public int length() {
        return size+1;
    }
    public void makeEmpty()
    {
        size = -1;
    }
    public void concat(String1 s)
    {
        for(int i = 0; i < s.length(); i++)
            append(s.getChar(i));
    }
    public boolean equal(String1 s) {
        if(s.length !- size)
		return false;
	for(int i = 0; i < s.length(); i++){
		if(s.charAt(i) != str[i])
			return false;
	}
	return true;
    }
    public void reverse() {
        char temp;
	for (int i = 0; i < size / 2; i++){
		temp = str[i];
		str[i] = str[size - i];
		str[size - 1] = temp;
	}
    }
}
