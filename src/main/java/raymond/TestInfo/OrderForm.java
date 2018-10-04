package raymond.TestInfo;

import java.sql.SQLException;

import com.vaadin.data.Binder;
import com.vaadin.data.converter.StringToBigDecimalConverter;
import com.vaadin.data.converter.StringToDoubleConverter;
import com.vaadin.data.converter.StringToIntegerConverter;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.ui.Button;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.TextField;
import com.vaadin.ui.themes.ValoTheme;

import raymond.report.ReportView;

public class OrderForm extends FormLayout {
	private TextField name=new TextField("Name");
	private TextField chrg=new TextField("Price");
	private TextField qty=new TextField("Qty");
	private TextField total=new TextField("Total");

	private Button update = new Button("Update");
	private Button drop = new Button("drop");

	private Orderitems item;

	private InfoView dv;

	private Binder<Orderitems> binder=new Binder<>(Orderitems.class);

	public OrderForm(InfoView dv) {
		this.dv = dv;
		
		setSizeUndefined();
		
		name.setReadOnly(true); 
		chrg.setReadOnly(true);  
		total.setReadOnly(true); 
		HorizontalLayout h1=new HorizontalLayout();
		h1.addComponents(update,drop);
		addComponents(name,chrg,qty,total,h1);
		
		//add event
		update.addClickListener(e->{
			try {
				update();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		});
		
		drop.addClickListener(e->{
			try {
				drop();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		});
		
		binderInit();
		binder.bindInstanceFields(this); 
		
		//handle event  need sql scripts
/*		update.addClickListener(e->save());
		drop.addClickListener(e->drop()); */
		//quick tab
//		update.setClickShortcut(KeyCode.ENTER);
	}
	
	public OrderForm(ReportView reportView) {
		this.dv = dv;
		
		setSizeUndefined();
		
		name.setReadOnly(true); 
		chrg.setReadOnly(true);  
		total.setReadOnly(true); 
		HorizontalLayout h1=new HorizontalLayout();
		h1.addComponents(update,drop);
		addComponents(name,chrg,qty,total,h1);
		
		//add event
		update.addClickListener(e->{
			try {
				update();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		});
		
		drop.addClickListener(e->{
			try {
				drop();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		});
		
		binderInit();
		binder.bindInstanceFields(this); 
	}

	public void setItems(Orderitems item) {
		this.item = item;
		binder.setBean(item);
		setVisible(true);
	}
	
	public void update() throws SQLException {
		this.item.setTotal(this.item.getQty() * this.item.getCharge());
		dv.dataProvider.refreshAll();
		dropItemService service = new dropItemService();
		service.storeRow(this.item.getId(), this.item.getCharge(), this.item.getTotal(), this.item.getQty());
		System.out.println("update "+this.item.getId());
	}
	
	public void drop() throws SQLException {
		int id;
		dropItemService service = new dropItemService();
		if (this.item.getTimeid() == null) {
			id = this.item.getId();
			System.out.println("dropping based on item");
			service.dropRow(id, 0);
		}
		else {
			id = this.item.getTimeid();
			System.out.println("dropping based on time");
			service.dropRow(id, 1);
		}
	}

	public void binderInit() {
		binder.forField(name)
		.withNullRepresentation("")
		.bind(Orderitems::getItem, Orderitems::setItem);

		
		binder.forField(chrg)
		.withNullRepresentation("")
		.withConverter(
				new StringToDoubleConverter(""))
		.bind(Orderitems::getCharge, Orderitems::setCharge);

		binder.forField(qty)
		.withNullRepresentation("")
		.withConverter(
				new StringToIntegerConverter(""))
		.bind(Orderitems::getQty, Orderitems::setQty);

		binder.forField(total)
		.withNullRepresentation("")
		.withConverter(
				new StringToDoubleConverter(""))
		.bind(Orderitems::getTotal, Orderitems::setTotal);
	}
}