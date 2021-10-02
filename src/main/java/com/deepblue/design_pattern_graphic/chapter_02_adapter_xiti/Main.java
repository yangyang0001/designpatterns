package com.deepblue.design_pattern_graphic.chapter_02_adapter_xiti;

public class Main {

	public static void main(String[] args) throws Exception {
		String storePath = "D:\\study_workspace\\designpatterns\\src\\main\\java\\com\\deepblue\\design_pattern_graphic\\chapter_02_adapter_xiti\\newFile.txt";
		String loadPath  = "D:\\study_workspace\\designpatterns\\src\\main\\java\\com\\deepblue\\design_pattern_graphic\\chapter_02_adapter_xiti\\file.txt";

		FileService f = new FileServiceImpl();
		f.loadFile(loadPath);
		f.setValue("Hello", "World");
		f.setValue("Design", "Pattern");
		f.storeFile(storePath, "written by FileService");
	}

}
