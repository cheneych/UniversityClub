package raymond.ui.standardgrid;

import java.util.LinkedHashMap;
import java.util.Map;

//import com.vaadin.data.Container;

import com.vaadin.data.Converter;

//import com.vaadin.ui.Field;
import com.vaadin.ui.Grid;
import com.vaadin.ui.renderers.Renderer;

public class StandardGridConfigurator {
	
	public class GridColumn {
		
		String propertyId;
		String headerCaption;
		Converter<?,?> converter = null;
		String styles;
		boolean required = false;
		boolean editable = false;
		int minimumWidth = 0;
		int maximumWidth = 0;
		int expandRatio = 1;
//		Field<?> editorField = null;
		Renderer<?> renderer = null;
		boolean hidden = false;
		
		
		public GridColumn() {
		}
		
		/**
		 * @param dbName
		 * @param displayName
		 */
		public GridColumn(String propertyId, String headerCaption) {
			setPropertyId(propertyId);
			setHeaderCaption(headerCaption);
		}
		
		/**
		 * @return the dbName
		 */
		public String getPropertyId() {
			return propertyId;
		}

		/**
		 * @param dbName the dbName to set
		 */
		public GridColumn setPropertyId(String dbName) {
			this.propertyId = dbName;
			return this;
		}

		/**
		 * @return the collapsed
		 */
		public boolean isHidden() {
			return hidden;
		}

		/**
		 * @param collapsed the collapsed to set
		 */
		public GridColumn setHidden(boolean hidden) {
			this.hidden = hidden;
			return this;
		}

		/**
		 * @return the styles
		 */
		public String getStyles() {
			return styles;
		}

		/**
		 * @param styles the styles to set
		 */
		public GridColumn setStyles(String styles) {
			this.styles = styles;
			return this;
		}

		/**
		 * @return the required
		 */
		public boolean isRequired() {
			return required;
		}

		/**
		 * @param required the required to set
		 */
		public GridColumn setRequired(boolean required) {
			this.required = required;
			return this;
		}

		public GridColumn setConverter(Converter<?,?> converter) {
			this.converter = converter;
			return this;
		}
		
		public Converter<?,?> getConverter() {
			return converter;
		}

		/**
		 * @return the editable
		 */
		public boolean isEditable() {
			return editable;
		}

		/**
		 * @param editable the editable to set
		 */
		public GridColumn setEditable(boolean editable) {
			this.editable = editable;
			return this;
		}

		/**
		 * @return the minimumWidth
		 */
		public int getMinimumWidth() {
			return minimumWidth;
		}

		/**
		 * @param minimumWidth the minimumWidth to set
		 */
		public GridColumn setMinimumWidth(int minimumWidth) {
			this.minimumWidth = minimumWidth;
			return this;
		}

		/**
		 * @return the maximumWidth
		 */
		public int getMaximumWidth() {
			return maximumWidth;
		}

		/**
		 * @param maximumWidth the maximumWidth to set
		 */
		public GridColumn setMaximumWidth(int maximumWidth) {
			this.maximumWidth = maximumWidth;
			return this;
		}

		/**
		 * @return the editorField
		 */
//		public Field<?> getEditorField() {
//			return editorField;
//		}

		/**
		 * @param editorField the editorField to set
		 */
//		public GridColumn setEditorField(Field<?> editorField) {
//			this.editorField = editorField;
//			return this;
//		}

		/**
		 * @return the headerCaption
		 */
		public String getHeaderCaption() {
			return headerCaption;
		}

		/**
		 * @param headerCaption the headerCaption to set
		 */
		public GridColumn setHeaderCaption(String headerCaption) {
			this.headerCaption = headerCaption;
			return this;
		}

		/**
		 * @return the expandRatio
		 */
		public int getExpandRatio() {
			return expandRatio;
		}

		/**
		 * @param expandRatio the expandRatio to set
		 */
		public GridColumn setExpandRatio(int expandRatio) {
			this.expandRatio = expandRatio;
			return this;
		}

		/**
		 * @return the renderer
		 */
		public Renderer<?> getRenderer() {
			return renderer;
		}

		/**
		 * @param renderer the renderer to set
		 */
		public GridColumn setRenderer(Renderer<?> renderer) {
			this.renderer = renderer;
			return this;
		}
		
	}
	
	LinkedHashMap<String, GridColumn> columns = new LinkedHashMap<String, GridColumn>();

	public StandardGridConfigurator() {
		super();
	}

	public void add(GridColumn column) {
		columns.put(column.propertyId, column);
	}

	@SuppressWarnings("rawtypes")
	public void configure(Grid<?> grid) {

		if (columns.size() > 0) {

			String[] propertyIds = columns.keySet().toArray(new String[columns.keySet().size()]);
			grid.setColumns(propertyIds);

			for (Map.Entry<String, GridColumn> entry : columns.entrySet()) {

				Grid.Column col = grid.getColumn(entry.getKey());
				GridColumn conf = entry.getValue();

				col.setCaption(conf.headerCaption);
				col.setMinimumWidth(conf.minimumWidth);
				col.setMaximumWidth(conf.maximumWidth);
				col.setExpandRatio(conf.expandRatio);
				col.setHidden(conf.hidden);
				
				// TODO Must use a binder in V8
/*
				col.setEditable(conf.editable);
				if (conf.converter != null) {
					col.setConverter(conf.converter);
				}
*/			
				// AbstractField is removed in V8
/*
				if (conf.editorField != null) {
					col.setEditorField(conf.editorField);
				}

*/
				
/*
				if (conf.renderer != null) {
					col.setRenderer(conf.renderer);
				}
*/

			}

		}

	}

}
