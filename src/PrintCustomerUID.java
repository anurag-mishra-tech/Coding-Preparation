

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintCustomerUID {
    public static void main(String[] args) throws IOException {
        String rootFolder = "C:\\Users\\anuragmishra\\Downloads\\DataMigrationActivity\\";

        //
        String srcfileName = "LPGNext_BPCLCustomer-ProtoType_10L.csv";

        String destfileName = "Test.csv";
        String srcfolderName = rootFolder;
        String destfolderName = rootFolder;
        Integer positionCount1 = 0;
        Integer positionCount2 = 8;
        String suffix = "";

        String separator = "~";
        String readFrom = srcfolderName + srcfileName;
        String writeTo = destfolderName + destfileName;

        try {
            StringBuilder sb;
            ArrayList<StringBuilder> array = new ArrayList<>();
            File myFile = new File(readFrom);
            Scanner myScanner = new Scanner(myFile);
            while (myScanner.hasNextLine()) {
                String line = myScanner.nextLine();
                String[] values = line.split(separator);
                if (!values[positionCount1].equalsIgnoreCase("NULL")) {
                    values[positionCount1] = values[positionCount1];
                }
               else{
                    values[positionCount1]  = values[positionCount2];
                }
                //System.out.println(Arrays.toString(values));
                sb = new StringBuilder();

                sb.append(values[positionCount1]);

                sb.append('\n');
                array.add(sb);
            }
            try (BufferedWriter writer = new BufferedWriter(
                    new FileWriter(writeTo))) {
                for (StringBuilder data : array) {
                    writer.write(data.toString());
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not generated");
            }
            System.out.println("File generated");
            myScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
