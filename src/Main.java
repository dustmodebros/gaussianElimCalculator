import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		ArrayList<Double> temp1 = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, -1.0, 77.0));
		ArrayList<Double> temp2 = new ArrayList<>(Arrays.asList(2.0, 3.0, 4.0, 4.0, 5.0, -53.0));
		ArrayList<Double> temp3 = new ArrayList<>(Arrays.asList(-2.0, 2.0, 4.0, 4.0, -2.0, 86.0));
		ArrayList<Double> temp4 = new ArrayList<>(Arrays.asList(2.0, -2.0, -4.0, -3.0, 4.0, -117.0));
		ArrayList<Double> temp5 = new ArrayList<>(Arrays.asList(2.0, -2.0, -14.0, -3.0, 6.0, -211.0));
		ArrayList<ArrayList<Double>> temp = new ArrayList<>(Arrays.asList(temp1, temp2, temp3, temp4, temp5));
		Matrix mat = new Matrix(temp);
		mat.triangulate();
		System.out.println(mat.returnAnswers());
	}
}