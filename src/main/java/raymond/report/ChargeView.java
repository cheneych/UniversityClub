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
import raymond.TestInfo.MoneyDataService;

@SuppressWarnings("serial")
@Theme("mytheme")
public class ChargeView extends TopBarView implements View {
	Label tit = new Label("Summaryof Charges");
	Grid<Money> charges = new Grid<Money>(Money.class);
	Button next = new Button("next");
	
	public ChargeView()  {
		init();
	}

	public void init()  {
		eventProcess();
		dataProcess();
		addComponents(tit, charges, next);
		setComponentAlignment(next, Alignment.MIDDLE_RIGHT);
	}

	private void eventProcess() {	
		next.addClickListener(e-> {
			MyUI.navigateTo("final");
		});
	}

	private void dataProcess() {
		charges.setColumns("desc", "charges", "srv_Chg", "other", "st_Tax", "tax2", 
	   			"tax3", "tax4", "tax5", "sub_Totals");
		charges.setSizeFull();
		int fid=(int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("fid_create");
		MoneyDataService moneyservice = new MoneyDataService(fid);
		charges.setDataProvider(moneyservice.getDataProvider());
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
	}
}

