package lz77;

public class triplet {
	private int offset, len;
	private char nextC;
	triplet(int offset, int len, char nextC){
		this.offset = offset;
		this.len = len;
		this.nextC = nextC;
	}
	public int getOffset() {
		return offset;
	}
	public int getLen() {
		return len;
	}
	public char getNextC() {
		return nextC;
	}
        @Override
	public String toString() {
		return("<"+offset+", "+len+", ("+nextC+")>");
	}
}
