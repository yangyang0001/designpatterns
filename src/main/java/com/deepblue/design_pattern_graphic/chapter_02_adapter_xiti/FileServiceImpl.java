package com.deepblue.design_pattern_graphic.chapter_02_adapter_xiti;

import java.io.*;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class FileServiceImpl extends Properties implements FileService {

	@Override
	public void loadFile(String filePath) throws Exception {
		FileReader reader = null;
		try {
			reader = new FileReader(filePath);
			load(reader);
		} catch (Exception e) {
		    e.printStackTrace();
		} finally {
			if(reader != null) {
				reader.close();
			}
		}
	}

	@Override
	public void storeFile(String filePath, String comments) throws Exception {
		FileWriter writer = null;
		try {
			writer = new FileWriter(filePath);
			store(writer, comments);
		} catch (Exception e) {
		    e.printStackTrace();
		} finally {
			if(writer != null) {
				writer.close();
			}
		}
	}

	@Override
	public void setValue(String key, String value) {
		put(key, value);
	}

	public Object getValue(String key) {
		return get(key);
	}
}
