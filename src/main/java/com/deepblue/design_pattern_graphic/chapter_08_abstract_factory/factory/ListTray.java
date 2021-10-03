package com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.factory;

import com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.model.Item;
import com.deepblue.design_pattern_graphic.chapter_08_abstract_factory.model.Tray;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Iterator;

@Data
@ToString
public class ListTray extends Tray {

	public ListTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<li>\n");
		buffer.append(caption + "\n");
		buffer.append("<ul>\n");

		Iterator iterator = tray.iterator();
		while(iterator.hasNext()) {
			Item item = (Item) iterator.next();
			buffer.append(item.makeHTML());
		}

		buffer.append("</li>\n");
		buffer.append("</ul>\n");
		return buffer.toString();
	}
}
