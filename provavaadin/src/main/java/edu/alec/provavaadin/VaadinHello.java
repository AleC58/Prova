/*
 */
package edu.alec.provavaadin;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author alex.cazziolato
 */
@SpringUI
@Title("Hello World")
@Theme("valo")

public class VaadinHello extends UI {
	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout uiContent = new VerticalLayout();
		uiContent.addComponent(new Button("Hello", e -> Notification.show("world")));
		setContent(uiContent);
	}

}
