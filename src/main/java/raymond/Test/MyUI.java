package raymond.Test;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import raymond.TestDB.Pools;
import raymond.TestHomePage.HomeView;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@SuppressWarnings("serial")
@Theme("mytheme")
public class MyUI extends UI {
	
	public Navigator navigator; 
		
	@Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
    	navigator = new Navigator(this, layout);
    	setNavigator(navigator);
		navigator.addProvider(new RaymondNavigatorViewProvider());
		navigator.navigateTo("login"); 
        setContent(layout);  
    }
	
	public static void navigateTo(String viewName) {
		UI.getCurrent().getNavigator().navigateTo(viewName);
	}
	
	public static void navigateTo(String viewName, String uriFragment) {
		UI.getCurrent().getNavigator().navigateTo(viewName+"/"+uriFragment);
	}

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
