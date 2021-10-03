package com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.model;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Page {

	protected String title;

	protected String author;

	protected List<Item> content = Lists.newArrayList();

	public Page(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void add(Item item) {
		content.add(item);
	}

	public void output() {
		String filename = title + ".html";
		Writer writer = null;
		try {
			writer = new FileWriter(filename);
		    writer.write(this.makeHTML());
		    writer.flush();
		} catch (Exception e) {
		    e.printStackTrace();
		} finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public abstract String makeHTML();

}
