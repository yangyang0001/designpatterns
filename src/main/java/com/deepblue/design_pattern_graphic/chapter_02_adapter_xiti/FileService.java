package com.deepblue.design_pattern_graphic.chapter_02_adapter_xiti;

public interface FileService {

	public void loadFile(String filePath) throws Exception;

	public void storeFile(String filePath, String comments) throws Exception;

	public void setValue(String key, String value);

	public Object getValue(String key);
}
