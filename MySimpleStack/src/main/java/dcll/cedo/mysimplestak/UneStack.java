package dcll.cedo.mysimplestak;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class UneStack implements SimpleStack {
	ArrayList<String> laStack = new ArrayList<String>();
	
	public boolean isEmpty() {
		return laStack.isEmpty();
	}

	public int getSize() {
		return laStack.size();
	}

	@Override
	public void push(String item) {
		laStack.add(item);
	}

	@Override
	public String peek() throws EmptyStackException {
		return laStack.get(laStack.size());
	}

	@Override
	public String pop() throws EmptyStackException {
		String popRes = laStack.get(laStack.size());
		laStack.remove(laStack.size());
		return popRes;
	}

}
