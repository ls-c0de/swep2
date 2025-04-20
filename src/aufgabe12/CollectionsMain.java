package aufgabe12;

import java.util.Stack;

public class CollectionsMain {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		while (true) {
			int temp = InputTools.readInteger("Zahl eingeben: ");
			
			stack.push(temp); //Falls 0 auf dem Stack gewuenscht
			if (temp == 0) {
				break;
			}
			//stack.push(temp);
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("fertig!");
	}

}
