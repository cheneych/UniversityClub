package raymond.report;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.eclipse.birt.report.engine.api.EngineException;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;
import com.vaadin.annotations.Theme;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Grid;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.TextField;
import com.vaadin.ui.TreeGrid;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextArea;

import raymond.ui.standardgrid.StandardGridConfigurator;
import raymond.Test.*;
import raymond.TestDetails.Items;
import raymond.TestDetails.ItemsForm;
import raymond.TestHomePage.OrderDataService;
import raymond.TestReserve.RoomDataService;
import raymond.TestInfo.*;
import raymond.dataprovider.filter.Filter;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.external.org.slf4j.Logger;
import com.vaadin.external.org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
@Theme("mytheme")
public class FinalView extends TopBarView implements View {
	
	Label question = new Label("Would you like to generate pdf files and email? Click below!");
	Button yes = new Button("Yes, go ahead");
	Button no = new Button("Back home");
	TextArea info = new TextArea();
	
	public FinalView()  {
		init();
	}

	public void init()  {
		eventProcess();
		dataProcess();
		addComponents(no, question, yes, info);
	}

	private void eventProcess() {	
		question.addContextClickListener(e->{
			yes.setVisible(true);
		});
		
		yes.addClickListener(e->{
			String s = "pdf generated";
			try {
				ExecuteReport.main();
			} catch (Exception e1) {
				info.setValue("Error while generating pdf");
			}
			try {
				SendFileEmail.main();
			} catch (Exception e1) {
				info.setValue(s + "\n" + "Error while sending email");
			}
			info.setValue(s + "\n" + "mail sent");

			
		});
		
		no.addClickListener(e->{
			MyUI.navigateTo("home");
		});
	}

	private void dataProcess() {
	
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
	}
}

