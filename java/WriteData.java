import java.io.*;
 public class WriteData {
    public static void main(String[] args)
            throws IOException
    {
        int i;
        // create a fileoutputstream object
        FileOutputStream fout = new FileOutputStream("eg.txt",true);

        // we need to transfer this string to files
        String st = "Hello World";

        char ch[] = st.toCharArray();
        for (i = 0; i < st.length(); i++) {

            // we will write the string by writing each
            // character one by one to file
            fout.write(ch[i]);
        }

        // by doing fout.close() all the changes which have
        // been made till now in RAM had been now saved to
        // hard disk
        fout.close();
    }
}
