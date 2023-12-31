package org.vaadin.example;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and use @Route
 * annotation to announce it in a URL as a Spring managed bean. Use the @PWA
 * annotation make the application installable on phones, tablets and some
 * desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every browser
 * tab/window.
 */
@Route("")
@PWA(name = "vaadin14-binder-validation-demo", shortName = "Vaadin14 App", description = "This is an example Vaadin application.", enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class ValidationView extends VerticalLayout {

  private TextField name;
  private TextField address;
  private Person person;
  private BeanValidationBinder<Person> binder;

  public ValidationView() {
    add(new H1("Vaadin 14 Validation Demo"));
    name = new TextField("Name");
    address = new TextField("Address");
    person = new Person();
    binder = new BeanValidationBinder<>(Person.class);
    binder.setBean(person);
    binder.bindInstanceFields(this);
    add(name, address);
  }
}
