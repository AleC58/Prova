/*
 */
package edu.alec.provavaadin;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author alex.cazziolato
 */
@Title("Hello World")
@Theme("valo")

@Route("")
@PWA(name = "Project Base for Vaadin Flow", shortName = "Project Base")
public class MainView extends VerticalLayout {

	public MainView() {
		VerticalLayout todosList = new VerticalLayout(); // (1)
		TextField taskField = new TextField(); // (2)
		Button addButton = new Button("Add"); // (3)
	}
}
