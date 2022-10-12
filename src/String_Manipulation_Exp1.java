

public class String_Manipulation_Exp1 {

	public static void main(String[] args) {
		String input = "AB CD EF GH IJ";
		//output="CD AB GH EF IJ"
		String[] newarr = input.split(" ");

		String res = "";

		for (int i = 0; i < newarr.length - 1; i+=2) {
			res = res + newarr[i + 1] + " " + newarr[i] + " ";
		}

		if (newarr.length % 2 != 0)
			res = res + newarr[newarr.length - 1];
		System.out.println(res);

	}
}
