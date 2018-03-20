import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String path = "result.txt";
		Arithmetic ar = new Arithmetic();
		int n = Integer.parseInt(args[0]);
		 try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(path));
			bw.write("201571030131");
			bw.newLine();
			
			for(int i = 0 ; i<n ; ){
				String str = ar.getString();
				String result = ar.dealEquation(ar.toSuffix(str));
				if(result!=null){
					 bw.write(str + "=" + result);
					 bw.newLine();
					 i++;
				}				
			}
			bw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
