package raymond.TestDetails;

import java.time.LocalDateTime;

import com.vaadin.data.Binder;
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

public class ListsForm extends FormLayout {
	private TextField des=new TextField("Description");
	private TextField ctg=new TextField("Category");
	private TextField start=new TextField("Start Time");
	private TextField end=new TextField("End Time");
	
	private Button delete=new Button("Delete");
	
	private Lists lists;
	
	private DetailsView dv;
	
	private Binder<Lists> binder=new Binder<>(Lists.class);
	
	public ListsForm(DetailsView dv) {
		this.dv = dv;
		setSizeUndefined();
		des.setReadOnly(true);
		ctg.setReadOnly(true);
		HorizontalLayout buttons = new HorizontalLayout(delete);
		addComponents(des,ctg,start,end,buttons);
		
		binder.bindInstanceFields(this); 
		delete.addClickListener(e->delete());
		delete.setClickShortcut(KeyCode.DELETE);
	}
	
	public void setLists(Lists lists) {
		this.lists =lists;
		binder.setBean(lists);
		setVisible(true);
	}
	
	public void delete() {
		int id=-1;
		for (Lists l:dv.lists) {
			if (l.getId()==lists.getId()) {
				id++;
				break;
			}
		}
		dv.lists.remove(id);
		dv.listGrid.setItems(dv.lists);
	}
}