
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class SplitDomestic {

	public static void main(String[] args) {

		long linesWritten = 0;
		long linesPerSplit = 100000;
		int count = 1;
		int filno = 31;
		String inputFilePath = "C:\\Users\\anuragmishra\\Downloads\\DataMigrationActivity\\DomesticConnection_New\\LPGNext_DomesticConnection-"+filno+".csv";
		String outputFolderPath = "C:\\Users\\anuragmishra\\Downloads\\DataMigrationActivity\\LPGNext_DomesticConnection\\";
		try {
			File inputFile = new File(inputFilePath);
			InputStream inputFileStream = new BufferedInputStream(new FileInputStream(inputFile));
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputFileStream));

			String line = reader.readLine();

			String fileName = inputFile.getName();
			String outfileName = outputFolderPath + "\\" + "LPGNext_DomesticConnection";

			while (line != null) {
				File outFile = new File(outfileName + "-" + filno + "-" + count + ".csv");
				Writer writer = new OutputStreamWriter(new FileOutputStream(outFile));

				while (line != null) {
					writer.write(line);
					writer.write(10);
					System.out.println(line);
					line = reader.readLine();
					linesWritten++;
					if (linesWritten >= linesPerSplit) {
						break;
					}

				}

				writer.close();
				linesWritten = 0;// next file
				count++;// next file count
			}

			reader.close();
			System.out.println("File generated");
		} catch (Exception e) {
			System.out.println("File not generated");
			e.printStackTrace();
		}
	}
}
