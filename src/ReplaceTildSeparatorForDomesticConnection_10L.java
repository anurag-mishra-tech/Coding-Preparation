
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReplaceTildSeparatorForDomesticConnection_10L {
	public static void main(String[] args) throws IOException {

		int fileNo = 31;
		Integer positionCount1 = 0;
		Integer positionCount2 = 1;
		Integer positionCount3 = 2;
		Integer positionCount4 = 3;
		Integer positionCount5 = 8;
		Integer positionCount6 = 9;
		String rootFolder = "C:\\Users\\anuragmishra\\Downloads\\DataMigrationActivity\\";
		String srcfileName = "LPGNext_DomesticConnection-ProtoType_10L.csv";

		for (int j = 0; j < 1; j++) {
			fileNo = fileNo + j;

			String srcfolderName = rootFolder;
			String destfolderName = rootFolder + "DomesticConnection_New\\";
			String destfileName = "LPGNext_DomesticConnection-" + fileNo + ".csv";
			String suffix = "_temp" + fileNo;
			String commaseparator = ",";
			String tildeseparator = "~";
			String readFrom = srcfolderName + srcfileName;
			String writeTo = destfolderName + destfileName;

			try {
				StringBuilder sb;
				ArrayList<StringBuilder> array = new ArrayList<>();
				File myFile = new File(readFrom);
				Scanner myScanner = new Scanner(myFile);
				while (myScanner.hasNextLine()) {
					String line = myScanner.nextLine();
					String[] values = line.split(commaseparator);
					if (!values[positionCount1].equalsIgnoreCase("NULL")) {
						values[positionCount1] = values[positionCount1] + suffix;
					}
					if (!values[positionCount2].equalsIgnoreCase("NULL")) {
						values[positionCount2] = values[positionCount2] + suffix;
					}
					if (!values[positionCount3].equalsIgnoreCase("NULL")) {
						values[positionCount3] = values[positionCount3] + suffix;
					}
					if (!values[positionCount4].equalsIgnoreCase("NULL")) {
						values[positionCount4] = values[positionCount4] + suffix;
					}

					if (!values[positionCount5].equalsIgnoreCase("NULL") || !values[positionCount5].isEmpty()) {
						values[positionCount5] = values[positionCount5] + suffix;
					}

					if (!values[positionCount6].equalsIgnoreCase("NULL") || !values[positionCount6].isEmpty()) {
						values[positionCount6] = values[positionCount6] + suffix;
					}

					System.out.println(Arrays.toString(values));
					sb = new StringBuilder();

					for (int i = 0; i < values.length; i++) {
						sb.append(values[i]);
						if (i < values.length - 1) {
							sb.append(tildeseparator);
						}
					}
					sb.append('\n');
					array.add(sb);
				}
				try (BufferedWriter writer = new BufferedWriter(new FileWriter(writeTo))) {
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
}
