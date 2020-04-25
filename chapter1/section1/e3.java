package section1;

public class e3 {
	public static void main(String[] args) {
		if (args.length != 3) {
			return;
		}
		
		if (Integer.parseInt(args[0]) == Integer.parseInt(args[1]) && Integer.parseInt(args[1]) == Integer.parseInt(args[2])) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
	}
}