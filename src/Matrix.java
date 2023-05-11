import java.util.ArrayList;
public class Matrix {
	ArrayList<ArrayList<Double>> in;
	public Matrix(ArrayList<ArrayList<Double>> in) {
		this.in = in;
	}

	// should multiply the 1st index of in by Xn/X1 of each of the other indices of in
	public void triangulate() {
		for (int pivot = 0; pivot <in.size()-1; pivot++) {
			ArrayList<ArrayList<Double>> out = new ArrayList<>();
			ArrayList<Double> pivotRow = in.get(pivot);
			Double first = pivotRow.get(pivot);
			for (int l = 0; l < pivot + 1; l++) {
				out.add(in.get(l));
			}
			for (int k = pivot; k < in.size(); k++) {
				ArrayList<Double> cheese = in.get(k);
				if (cheese != pivotRow) {
					Double mul = cheese.get(pivot) / first; //factor to multiply firstRow by to then subtract from cheese
					ArrayList<Double> temp = new ArrayList<>(pivotRow);
					temp.replaceAll(aDouble -> aDouble * mul);
					for (int j = 0; j < temp.size(); j++) {
						temp.set(j, cheese.get(j) - temp.get(j));
					}
					out.add(temp);
				}
			}
			in = out;
		}
	}

	@Override
	public String toString(){ //override toString to make println() work
		return this.in.toString();
	}


}
