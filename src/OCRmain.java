import java.util.Arrays;

public class OCRmain {
	public static void main(String[] args){
		ImgClass test_image = new ImgClass();
		int [][] test_array = test_image.cleanup();
		for(int[] element: test_array){
			System.out.println(Arrays.toString(element));
		}
	}
}
