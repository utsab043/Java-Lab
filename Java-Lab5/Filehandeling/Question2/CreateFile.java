import java.io.FileWriter;
import java.io.IOException;
class CreateFile{
    public static void main(String[] args) throws IOException {
        String stringC="aa\nbb\ncc";
        String stringD="11\n22\n33";
        System.out.println("\nContent of c.txt:\n");
        System.out.println(stringC);
        System.out.println("\nContent d.txt:\n");
        System.out.println(stringD);
        FileWriter fc = new FileWriter("c.txt");
        FileWriter fd = new FileWriter("d.txt");
        for (int i=0; i< stringC.length();i++)
        {
        fc.write(stringC.charAt(i));
        }
        for (int i=0; i< stringD.length();i++)
        {
        fd.write(stringD.charAt(i));
        }
        fc.close();
        fd.close();
    }

}    