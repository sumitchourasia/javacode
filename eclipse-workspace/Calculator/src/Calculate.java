public class Calculate {

	public static void main(String[] args) {

		String name1 = new String("abc");
		String name2 = name1;
		String name3 = new String("abc");

		System.out.println("==>" + name1);// abc
		System.out.println("==>" + name2);// abc
		System.out.println("==>" + name3);// abc

		System.out.println("++>" + (name1 == name2));// true//true//true
		System.out.println("++>" + (name1 == name3));// true//true//false

		System.out.println("-->" + name1.equals(name2));// true//false
		System.out.println("-->" + name1.equals(name3));// true//false

		// System.out.println(Calculator.power(10, 6));
		// System.out.println("==>" + Math.pow(10, 6));

	}

}
