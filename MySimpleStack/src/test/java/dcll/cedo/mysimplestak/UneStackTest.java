package dcll.cedo.mysimplestak;

import junit.framework.TestCase;

public class UneStackTest extends TestCase {
	
	UneStack maStackDeTest;
	
	public UneStackTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		this.maStackDeTest = new UneStack();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testIsEmpty() {
		assert(this.maStackDeTest.isEmpty());
	}

	public void testGetSize() {
		assert(this.maStackDeTest.getSize()==0);
	}

	public void testPush() {
		this.maStackDeTest.push("Hello");
		assert(this.maStackDeTest.peek().equals("Hello"));
	}

	public void testPeek() { 
		assert(this.maStackDeTest.peek().equals("Hello"));
	}

	public void testPop() {	
		assert(this.maStackDeTest.pop().equals("Hello"));
		assert(this.maStackDeTest.pop().equals("Hello"));
		this.maStackDeTest.push("Coucou");
		this.maStackDeTest.push("Clement");
		this.maStackDeTest.push("Edouard");
		assert(this.maStackDeTest.pop().equals("Edouard"));
	}

}
