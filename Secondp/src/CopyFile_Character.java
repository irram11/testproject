import java.io.*;
public class CopyFile_Character{

   public static void main(String args[]) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     System.out.print(" Enter Input File: ");
     String inputFile = br.readLine();
     System.out.print(" Enter Output File :");
     String outputFile = br.readLine();
     
     
	   
	  FileReader in = null;
      FileWriter out = null;

      try {
    	  // C:\Training\Basic\SAMPLES3\input.txt
    	  // C:\Training\Basic\SAMPLES3\output.txt
    	  
       //  in = new FileReader("C:\\Training\\Basic\\SAMPLES3\\input.txt");
    
        // out = new FileWriter("C:\\Training\\Basic\\SAMPLES3\\output.txt");
         
         in = new FileReader(inputFile);
         out = new FileWriter(outputFile);
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
         System.out.println(" File Copied!!!!!!!! ");
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}