import java.io.*;

public class MergeFile{

    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("result.txt");

        BufferedReader br1 = new BufferedReader(new FileReader("c.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("d.txt"));

        String line1 = br1.readLine();
        String line2 = br2.readLine();

        while ( line1 != null || line2 != null){

            if ( line1 != null){

                pw.println(line1);
                line1 = br1.readLine();

            }

            if ( line2 != null){

                pw.println(line2);
                line2 = br2.readLine();

            }

        }

        System.out.println("Merging c.txt and d.txt into result.txt");
        System.out.println("\nTask Completed.\n");
        
        pw.flush();

        br1.close();
        br2.close();
        pw.close();

    }

}