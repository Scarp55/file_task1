package file_task_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static StringBuilder text = new StringBuilder();

	static String path = "//home//scarp55//games//";
	static String dir_src = path + "src";
	static String dir_res = path + "res";
	static String dir_savegames = path + "savegames";
	static String dir_temp = path + "temp";
	static String dir_main = path + "src//main";
	static String dir_test = path + "src//test";
	static String file_Main = path + "src//main//Main.java";
	static String file_Utils = path + "src//main//Utils.java";
	static String dir_drawables = path + "res//drawables";
	static String dir_vectors = path + "res//vectors";
	static String dir_icons = path + "res//icons";
	static String file_Temp = path + "temp//temp.txt";

	public static void main(String[] args) {

		dir(dir_src);
		dir(dir_res);
		dir(dir_savegames);
		dir(dir_temp);
		dir(dir_main);
		dir(dir_test);
		file(file_Main);
		file(file_Utils);
		dir(dir_drawables);
		dir(dir_vectors);
		dir(dir_icons);
		file(file_Temp);
		write(file_Temp, text.toString());

	}

	public static void write(String string, String text) {
		try (FileWriter writer = new FileWriter(string)) {
			writer.write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void dir(String string) {
		File file = new File(string);
		if (file.mkdir()) {
			text.append("Каталог " + file.getName() + " успешно создан\n");
		} else {
			text.append("Каталог " + file.getName() + " не создан\n");
		}
	}

	public static void file(String string) {
		File file = new File(string);
		try {
			if (file.createNewFile()) {
				text.append("Файл " + file.getName() + " успешно создан\n");
			} else {
				text.append("Файл " + file.getName() + " не создан\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
