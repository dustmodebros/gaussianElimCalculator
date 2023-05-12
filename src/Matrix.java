import java.util.ArrayList;
public class Matrix {
	ArrayList<ArrayList<Double>> in;
	public Matrix(ArrayList<ArrayList<Double>> in) {
		this.in = in;
	}

	public void triangulate() { //triangulates :)
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

	public ArrayList<Double> returnAnswers(){
		ArrayList<Double> out = new ArrayList<>();
		ArrayList<Double> last = in.get(in.size()-1);
		for (int i = 0; i < last.size()-2; i++) {
			out.add(0.0);
		}
		out.add(last.size()-2, last.get(last.size()-1)/last.get(last.size()-2));
		for (int j=out.size()-2; j>=0; j--) { //iterate through the arrays from bottom to top
			ArrayList<Double> current = in.get(j);
			for (int i = 0; i < out.size(); i++) {
				current.set(out.size(),current.get(out.size())-(current.get(i)*out.get(i)));
			}
			out.set(j, current.get(out.size())/current.get(j));
		}
		return out;
	}

	@Override
	public String toString(){ //override toString to make println() work
		return this.in.toString();
	}


}
