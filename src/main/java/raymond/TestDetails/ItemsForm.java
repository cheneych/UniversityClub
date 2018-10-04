package raymond.TestDetails;

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

public class ItemsForm extends FormLayout {
	private TextField servitemname=new TextField("Name");
	private TextField servitemchrg=new TextField("Price");
	private TextField qty=new TextField("Qty");
	private TextField total=new TextField("Total");

	private Button save=new Button("Save");

	private Items item;

	private DetailsView dv;

	private Binder<Items> binder=new Binder<>(Items.class);

	public ItemsForm(DetailsView dv) {
		this.dv = dv;
		
		setSizeUndefined();
		
		servitemname.setReadOnly(true);
		servitemchrg.setReadOnly(true);
		total.setReadOnly(true);
		
		addComponents(servitemname,servitemchrg,qty,total,save);
		
		binderInit();
		binder.bindInstanceFields(this); 
		
		save.addClickListener(e->save());
		save.setClickShortcut(KeyCode.ENTER);
	}
	
	public void setItems(Items item) {
		this.item = item;
		binder.setBean(item);
		setVisible(true);
	}
	public void save() {
		Double dPrice=Double.parseDouble(this.servitemchrg.getValue());
		int dQty=Integer.parseInt(this.qty.getValue());
		Double sum=dPrice*dQty;
		this.total.setValue(String.valueOf(sum));
		dv.update();
	}

	public void binderInit() {
		binder.forField(servitemchrg)
		.withConverter(
				new StringToBigDecimalConverter(""))
		.bind(Items::getServitemchrg, Items::setServitemchrg);

		binder.forField(qty)
		.withConverter(
				new StringToIntegerConverter(""))
		.bind(Items::getQty, Items::setQty);

		binder.forField(total)
		.withConverter(
				new StringToDoubleConverter(""))
		.bind(Items::getTotal, Items::setTotal);
	}
}