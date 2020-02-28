package arrayPractice;

/* Save this in a file called Main.java to compile and test it */

/* 
   Example file showing how to write a program that reads
   input from `input.txt` in the current directory
   and writes output to `output.txt` in the current directory
*/

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */

public class Split {
	
	 static class AppData {
		private String app;
		private String api;
		private int ver;
		public String getApp() {
			return app;
		}
		public void setApp(String app) {
			this.app = app;
		}
		public String getApi() {
			return api;
		}
		public void setApi(String api) {
			this.api = api;
		}
		public int getVer() {
			return ver;
		}
		public void setVer(int ver) {
			this.ver = ver;
		}
		
	}
    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        int numLines = 0;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));

            /* Here we can read in the input file */
            /* In this example, we're reading all the lines of file
               `input.txt` and then ignoring them. 
               You should modify this part of the
               program to read and process the input as desired */
            ArrayList<AppData> list = new ArrayList<>();
            while(in.hasNextLine()) {
                String line = in.nextLine();
                Split.AppData app = new Split.AppData();
                int old = 0;
                String appS = "";
                int count =0;
                if (!line.isEmpty()) {
                	String[] split = (String[])line.split(",");
                	app.setApp(split[0]);
                	app.setApi(split[1]);
                	int v = Integer.parseInt(split[2].substring(split[2].indexOf('v')+1));
                	app.setVer(v);
                	list.add(app);
                }
                AppData[][] appA = new AppData[10][10];
                	for(AppData data:list) {
                		for(AppData data2:list) {
                			if(data.getApi().equals(data2.getApi())) {
                				if(data.getVer() > data2.ver ) {
                					old = data2.ver;
                					appS = data2.getApp();
                				}
                				else {
                					old = data.ver;
                				}
                					
                			} 
                		}
                		if(old>0) {
                			
                		}
                	}
                    numLines++;
            }

            /* In this example, we're writing `num_lines` to
               the file `output.txt`.
               You should modify this part of the
               program to write the desired output */
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            output.println("" + numLines);
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
