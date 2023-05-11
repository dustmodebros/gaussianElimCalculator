import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		ArrayList<Double> temp1 = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, -1.0));
		ArrayList<Double> temp2 = new ArrayList<>(Arrays.asList(2.0, 3.0, 4.0, 4.0, 5.0));
		ArrayList<Double> temp3 = new ArrayList<>(Arrays.asList(-2.0, 2.0, 4.0, 4.0, -2.0));
		ArrayList<Double> temp4 = new ArrayList<>(Arrays.asList(2.0, -2.0, -4.0, -3.0, 4.0));
		ArrayList<ArrayList<Double>> temp = new ArrayList<>(Arrays.asList(temp1,temp2,temp3, temp4));
		Matrix mat = new Matrix(temp);
		System.out.println(mat);
		mat.triangulate();
		System.out.println(mat);
	}
}