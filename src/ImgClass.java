
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class ImgClass {
//
	private NumFiles number_files = new NumFiles();
	double[][] imgMatrix = ReadMatrix();
//

	
	public double[][] ReadMatrix() {
		String filename = JOptionPane.showInputDialog("Enter The file to be read");
		File fl = new File(filename);
		double matrix[][] = new double[0][0];
		try {
			Scanner fn = new Scanner(fl);
			int row = 0;
			while (fn.hasNext()) {
				row ++;
				fn.nextLine();
			}
			fn.close();
			matrix = new double[row][];
			Scanner f2 = new Scanner(fl);
			row = 0;
			while (f2.hasNext()) {
				String line = f2.nextLine();
				System.out.println(line);
				String[] numarr = line.split(" ");
				int x = numarr.length;
				double[] arr = new double[x];
				matrix[row]= arr;
				for (int i = 0; i<numarr.length;i++){
					matrix[row][i] = Double.parseDouble(numarr[i]);
				}
				row++;
			}
			f2.close();
	    } catch (FileNotFoundException e) {
	        System.out.println("Error opening file. Please make sure that you have your text file in the same folder as the NumFiles.class");
	        System.exit(0);
	    }
		return matrix;
}

	public int[][] cleanup() {
	int column_length = imgMatrix.length;
	int row_length = imgMatrix[0].length;
	int [][] return_arr = new int[column_length][row_length];
	int row_ind = 0;
	for(int i = 0; i < column_length;i++){
		row_ind = 0;
		for(double element: imgMatrix[i]){
			if(element >= .5){
				return_arr[i][row_ind] = 1;
			}
			else{
				return_arr[i][row_ind] = 0;
			}
			row_ind += 1;
		}
	}
	return return_arr;
}

	public String FindBestMatch() {
	//...
}
	public double compareMatrices( int[][] num) {
		double [] matching_scores = new double[10];
		int num_row = num.length;
		int num_columns = num[0].length;
		int unique_vertical = num_row - 13 + 1;
		int unique_horizontal = num_columns - 13 + 1;
		for(int counter = 0; counter < 9; counter++){
			for(int row_count = 0; row_count < unique_vertical; row_count++){
				for(int i = row_count; i < row_count + 13; i++){
					for()
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
