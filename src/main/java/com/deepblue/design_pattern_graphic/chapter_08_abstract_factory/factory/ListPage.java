package com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.factory;

import com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.model.Item;
import com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.model.Page;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Iterator;

@Data
@AllArgsConstructor
@ToString
public class ListPage extends Page {

	public ListPage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head><title>" + title + "</title></head>\n");
		buffer.append("<body>\n");
		buffer.append("<h1>" + title + "</h1>");
		buffer.append("<ul>\n");

		Iterator iterator = content.iterator();
		while(iterator.hasNext()) {
			Item item = (Item) iterator.next();
			buffer.append(item.makeHTML());
		}

		buffer.append("</ul>\n");
		buffer.append("<hr><address>" + author + "</address>");
		buffer.append("</body></html>\n");

		return buffer.toString();
	}
}
