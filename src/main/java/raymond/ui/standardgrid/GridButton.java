package raymond.ui.standardgrid;

import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;

@SuppressWarnings("serial")
public class GridButton extends Button {
	
	private Grid<?> grid;
	
	public GridButton() {
		init();
	}
	
	public GridButton(String caption) {
		super(caption);
		init();
	}
	
	public GridButton(String caption, ClickListener listener) {
		super(caption, listener);
		init();
	}
	
	private void init() {
		addStyleName("borderless");
	}
	
	public Grid<?> getGrid() {
		return grid;
	}
	
	public void setGrid(Grid<?> table) {
		this.grid = table;
	}
	
}
