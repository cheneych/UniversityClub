package com.vaadin.client.metadata;

public class ConnectorBundleLoaderImpl extends com.vaadin.client.metadata.ConnectorBundleLoader {
  public void init() {
    addAsyncBlockLoader(new AsyncBundleLoader("__eager", new String[] {"com.vaadin.server.AbstractJavaScriptExtension","com.vaadin.ui.renderers.ButtonRenderer","com.vaadin.ui.renderers.ImageRenderer","com.vaadin.ui.renderers.AbstractJavaScriptRenderer","com.vaadin.data.provider.DataCommunicator","com.vaadin.data.provider.HierarchicalDataCommunicator","com.vaadin.ui.Grid.Column","com.vaadin.ui.renderers.ComponentRenderer","com.vaadin.ui.renderers.DateRenderer","com.vaadin.ui.Grid.DetailsManager","com.vaadin.ui.components.grid.EditorImpl","com.vaadin.ui.Grid","com.vaadin.ui.components.grid.GridDragSource","com.vaadin.ui.components.grid.GridDropTarget","com.vaadin.ui.renderers.LocalDateRenderer","com.vaadin.ui.renderers.LocalDateTimeRenderer","com.vaadin.ui.components.grid.MultiSelectionModelImpl","com.vaadin.ui.components.grid.NoSelectionModel","com.vaadin.ui.renderers.NumberRenderer","com.vaadin.ui.renderers.ProgressBarRenderer","com.vaadin.ui.components.grid.SingleSelectionModelImpl","com.vaadin.ui.renderers.TextRenderer","com.vaadin.ui.components.grid.TreeGridDragSource","com.vaadin.ui.components.grid.TreeGridDropTarget","com.vaadin.ui.Tree.TreeRenderer","com.vaadin.ui.renderers.HtmlRenderer","com.vaadin.ui.Tree.TreeMultiSelectionModel","com.vaadin.server.BrowserWindowOpener","com.vaadin.ui.dnd.DragSourceExtension","com.vaadin.ui.dnd.DropTargetExtension","com.vaadin.server.FileDownloader","com.vaadin.ui.dnd.FileDropTarget","com.vaadin.server.Responsive","com.vaadin.ui.JavaScript","com.vaadin.ui.AbstractJavaScriptComponent","com.vaadin.ui.AbsoluteLayout","com.vaadin.ui.Accordion","com.vaadin.ui.Audio","com.vaadin.ui.BrowserFrame","com.vaadin.ui.Button","com.vaadin.ui.CheckBox","com.vaadin.ui.ComboBox","com.vaadin.ui.Composite","com.vaadin.ui.CssLayout","com.vaadin.ui.CustomComponent","com.vaadin.ui.CustomField","com.vaadin.ui.CustomLayout","com.vaadin.ui.AbstractLocalDateField","com.vaadin.ui.AbstractLocalDateTimeField","com.vaadin.ui.InlineDateField","com.vaadin.ui.InlineDateTimeField","com.vaadin.ui.DateField","com.vaadin.ui.DateTimeField","com.vaadin.ui.DragAndDropWrapper","com.vaadin.ui.Embedded","com.vaadin.ui.Flash","com.vaadin.ui.FormLayout","com.vaadin.ui.GridLayout","com.vaadin.ui.Image","com.vaadin.ui.Label","com.vaadin.ui.Link","com.vaadin.ui.ListSelect","com.vaadin.ui.LoginForm","com.vaadin.ui.MenuBar","com.vaadin.ui.NativeButton","com.vaadin.ui.NativeSelect","com.vaadin.ui.Notification","com.vaadin.ui.CheckBoxGroup","com.vaadin.ui.RadioButtonGroup","com.vaadin.ui.HorizontalLayout","com.vaadin.ui.VerticalLayout","com.vaadin.ui.Panel","com.vaadin.ui.PasswordField","com.vaadin.ui.PopupView","com.vaadin.ui.ProgressBar","com.vaadin.ui.Slider","com.vaadin.ui.HorizontalSplitPanel","com.vaadin.ui.VerticalSplitPanel","com.vaadin.ui.TabSheet","com.vaadin.ui.TextArea","com.vaadin.ui.TextField","com.vaadin.ui.TreeGrid","com.vaadin.ui.TwinColSelect","com.vaadin.ui.UI","com.vaadin.ui.Upload","com.vaadin.ui.Video","com.vaadin.ui.Window","fi.jasoft.simplecalendar.SimpleCalendar",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setSuperClass(java.lang.Object.class, null);
            store.setSuperClass(java.util.AbstractMap.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, java.lang.Object.class);
            store.setSuperClass(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class, java.lang.Object.class);
            store.setSuperClass(org.vaadin.addon.calendar.client.ui.schedule.CalTime.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.dnd.criteria.Criterion.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.dnd.FileParameters.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.MouseEventDetails.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.ui.PageState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.dnd.criteria.Payload.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.SectionState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.SectionState.CellState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.SectionState.RowState.class, java.lang.Object.class);
            store.setSuperClass(org.vaadin.addon.calendar.client.ui.schedule.SelectionRange.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.communication.SharedState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.tabsheet.TabState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.ui.UIState.LocaleData.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.ui.UIState.LocaleServiceState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.ui.UIState.PushConfigurationState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState.class, java.lang.Object.class);
            store.setSuperClass(com.vaadin.shared.AbstractComponentState.class, com.vaadin.shared.communication.SharedState.class);
            store.setSuperClass(com.vaadin.shared.extension.abstractlisting.AbstractListingExtensionState.class, com.vaadin.shared.communication.SharedState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.renderers.AbstractRendererState.class, com.vaadin.shared.communication.SharedState.class);
            store.setSuperClass(com.vaadin.shared.ui.BrowserWindowOpenerState.class, com.vaadin.shared.communication.SharedState.class);
            store.setSuperClass(com.vaadin.shared.extension.datacommunicator.DataCommunicatorState.class, com.vaadin.shared.communication.SharedState.class);
            store.setSuperClass(com.vaadin.shared.ui.dnd.DragSourceState.class, com.vaadin.shared.communication.SharedState.class);
            store.setSuperClass(com.vaadin.shared.ui.dnd.DropTargetState.class, com.vaadin.shared.communication.SharedState.class);
            store.setSuperClass(com.vaadin.shared.extension.filedownloader.FileDownloaderState.class, com.vaadin.shared.communication.SharedState.class);
            store.setSuperClass(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, com.vaadin.shared.communication.SharedState.class);
            store.setSuperClass(com.vaadin.shared.ui.notification.NotificationState.class, com.vaadin.shared.communication.SharedState.class);
            store.setSuperClass(com.vaadin.shared.extension.responsive.ResponsiveState.class, com.vaadin.shared.communication.SharedState.class);
            store.setSuperClass(com.vaadin.shared.ui.AbstractComponentContainerState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.AbstractEmbeddedState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.AbstractGridExtensionState.class, com.vaadin.shared.extension.abstractlisting.AbstractListingExtensionState.class);
            store.setSuperClass(com.vaadin.shared.ui.AbstractMediaState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.AbstractSingleComponentContainerState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.renderers.ClickableRendererState.class, com.vaadin.shared.ui.grid.renderers.AbstractRendererState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.renderers.ComponentRendererState.class, com.vaadin.shared.ui.grid.renderers.AbstractRendererState.class);
            store.setSuperClass(com.vaadin.shared.ui.dnd.FileDropTargetState.class, com.vaadin.shared.ui.dnd.DropTargetState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.GridDragSourceState.class, com.vaadin.shared.ui.dnd.DragSourceState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.GridDropTargetState.class, com.vaadin.shared.ui.dnd.DropTargetState.class);
            store.setSuperClass(java.util.HashMap.class, java.util.AbstractMap.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.renderers.HtmlRendererState.class, com.vaadin.shared.ui.grid.renderers.AbstractRendererState.class);
            store.setSuperClass(com.vaadin.shared.ui.JavaScriptComponentState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.JavaScriptExtensionState.class, com.vaadin.shared.ui.grid.renderers.AbstractRendererState.class);
            store.setSuperClass(com.vaadin.shared.ui.label.LabelState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.link.LinkState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.popupview.PopupViewState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.renderers.ProgressBarRendererState.class, com.vaadin.shared.ui.grid.renderers.AbstractRendererState.class);
            store.setSuperClass(com.vaadin.shared.ui.TabIndexState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.renderers.TextRendererState.class, com.vaadin.shared.ui.grid.renderers.AbstractRendererState.class);
            store.setSuperClass(com.vaadin.shared.ui.tree.TreeRendererState.class, com.vaadin.shared.ui.grid.renderers.AbstractRendererState.class);
            store.setSuperClass(com.vaadin.shared.ui.upload.UploadState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setSuperClass(com.vaadin.shared.AbstractFieldState.class, com.vaadin.shared.ui.TabIndexState.class);
            store.setSuperClass(com.vaadin.shared.ui.AbstractLayoutState.class, com.vaadin.shared.ui.AbstractComponentContainerState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.AbstractSelectionModelState.class, com.vaadin.shared.ui.grid.AbstractGridExtensionState.class);
            store.setSuperClass(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.class, com.vaadin.shared.ui.AbstractComponentContainerState.class);
            store.setSuperClass(com.vaadin.shared.ui.audio.AudioState.class, com.vaadin.shared.ui.AbstractMediaState.class);
            store.setSuperClass(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, com.vaadin.shared.ui.AbstractEmbeddedState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.renderers.ButtonRendererState.class, com.vaadin.shared.ui.grid.renderers.ClickableRendererState.class);
            store.setSuperClass(com.vaadin.shared.ui.button.ButtonState.class, com.vaadin.shared.ui.TabIndexState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.ColumnState.class, com.vaadin.shared.ui.grid.AbstractGridExtensionState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.renderers.DateRendererState.class, com.vaadin.shared.ui.grid.renderers.TextRendererState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.DetailsManagerState.class, com.vaadin.shared.ui.grid.AbstractGridExtensionState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.editor.EditorState.class, com.vaadin.shared.ui.grid.AbstractGridExtensionState.class);
            store.setSuperClass(com.vaadin.shared.ui.embedded.EmbeddedState.class, com.vaadin.shared.ui.AbstractEmbeddedState.class);
            store.setSuperClass(com.vaadin.shared.ui.flash.FlashState.class, com.vaadin.shared.ui.AbstractEmbeddedState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.renderers.ImageRendererState.class, com.vaadin.shared.ui.grid.renderers.ClickableRendererState.class);
            store.setSuperClass(com.vaadin.shared.ui.image.ImageState.class, com.vaadin.shared.ui.AbstractEmbeddedState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.renderers.LocalDateRendererState.class, com.vaadin.shared.ui.grid.renderers.TextRendererState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.renderers.LocalDateTimeRendererState.class, com.vaadin.shared.ui.grid.renderers.TextRendererState.class);
            store.setSuperClass(com.vaadin.shared.ui.loginform.LoginFormState.class, com.vaadin.shared.ui.AbstractSingleComponentContainerState.class);
            store.setSuperClass(com.vaadin.shared.ui.menubar.MenuBarState.class, com.vaadin.shared.ui.TabIndexState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.renderers.NumberRendererState.class, com.vaadin.shared.ui.grid.renderers.TextRendererState.class);
            store.setSuperClass(com.vaadin.shared.ui.panel.PanelState.class, com.vaadin.shared.ui.AbstractSingleComponentContainerState.class);
            store.setSuperClass(com.vaadin.shared.ui.tabsheet.TabsheetState.class, com.vaadin.shared.ui.AbstractComponentContainerState.class);
            store.setSuperClass(com.vaadin.shared.ui.treegrid.TreeGridDragSourceState.class, com.vaadin.shared.ui.grid.GridDragSourceState.class);
            store.setSuperClass(com.vaadin.shared.ui.treegrid.TreeGridDropTargetState.class, com.vaadin.shared.ui.grid.GridDropTargetState.class);
            store.setSuperClass(com.vaadin.shared.ui.ui.UIState.class, com.vaadin.shared.ui.AbstractSingleComponentContainerState.class);
            store.setSuperClass(com.vaadin.shared.ui.video.VideoState.class, com.vaadin.shared.ui.AbstractMediaState.class);
            store.setSuperClass(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, com.vaadin.shared.ui.AbstractLayoutState.class);
            store.setSuperClass(com.vaadin.shared.ui.datefield.AbstractDateFieldState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.abstractlisting.AbstractListingState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, com.vaadin.shared.ui.AbstractLayoutState.class);
            store.setSuperClass(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.accordion.AccordionState.class, com.vaadin.shared.ui.tabsheet.TabsheetState.class);
            store.setSuperClass(com.vaadin.shared.ui.checkbox.CheckBoxState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.csslayout.CssLayoutState.class, com.vaadin.shared.ui.AbstractLayoutState.class);
            store.setSuperClass(com.vaadin.shared.ui.customfield.CustomFieldState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, com.vaadin.shared.ui.AbstractLayoutState.class);
            store.setSuperClass(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, com.vaadin.shared.ui.AbstractLayoutState.class);
            store.setSuperClass(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.MultiSelectionModelState.class, com.vaadin.shared.ui.grid.AbstractSelectionModelState.class);
            store.setSuperClass(com.vaadin.shared.ui.button.NativeButtonState.class, com.vaadin.shared.ui.button.ButtonState.class);
            store.setSuperClass(com.vaadin.shared.ui.progressindicator.ProgressBarState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(fi.jasoft.simplecalendar.shared.SimpleCalendarState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.SingleSelectionModelState.class, com.vaadin.shared.ui.grid.AbstractSelectionModelState.class);
            store.setSuperClass(com.vaadin.shared.ui.slider.SliderState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.class);
            store.setSuperClass(com.vaadin.shared.ui.window.WindowState.class, com.vaadin.shared.ui.panel.PanelState.class);
            store.setSuperClass(com.vaadin.shared.ui.abstractmultiselect.AbstractMultiSelectState.class, com.vaadin.shared.ui.abstractlisting.AbstractListingState.class);
            store.setSuperClass(com.vaadin.shared.ui.AbstractSingleSelectState.class, com.vaadin.shared.ui.abstractlisting.AbstractListingState.class);
            store.setSuperClass(com.vaadin.shared.ui.datefield.AbstractTextualDateFieldState.class, com.vaadin.shared.ui.datefield.AbstractDateFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.orderedlayout.FormLayoutState.class, com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class);
            store.setSuperClass(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class);
            store.setSuperClass(com.vaadin.shared.ui.textarea.TextAreaState.class, com.vaadin.shared.ui.textfield.AbstractTextFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.textfield.TextFieldState.class, com.vaadin.shared.ui.textfield.AbstractTextFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.tree.TreeMultiSelectionModelState.class, com.vaadin.shared.ui.grid.MultiSelectionModelState.class);
            store.setSuperClass(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class);
            store.setSuperClass(com.vaadin.shared.ui.optiongroup.CheckBoxGroupState.class, com.vaadin.shared.ui.abstractmultiselect.AbstractMultiSelectState.class);
            store.setSuperClass(com.vaadin.shared.ui.combobox.ComboBoxState.class, com.vaadin.shared.ui.AbstractSingleSelectState.class);
            store.setSuperClass(com.vaadin.shared.ui.grid.GridState.class, com.vaadin.shared.ui.AbstractSingleSelectState.class);
            store.setSuperClass(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, com.vaadin.shared.ui.datefield.AbstractTextualDateFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.listselect.ListSelectState.class, com.vaadin.shared.ui.abstractmultiselect.AbstractMultiSelectState.class);
            store.setSuperClass(com.vaadin.shared.ui.nativeselect.NativeSelectState.class, com.vaadin.shared.ui.AbstractSingleSelectState.class);
            store.setSuperClass(com.vaadin.shared.ui.passwordfield.PasswordFieldState.class, com.vaadin.shared.ui.textfield.TextFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.optiongroup.RadioButtonGroupState.class, com.vaadin.shared.ui.AbstractSingleSelectState.class);
            store.setSuperClass(com.vaadin.shared.ui.datefield.TextualDateFieldState.class, com.vaadin.shared.ui.datefield.AbstractTextualDateFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, com.vaadin.shared.ui.abstractmultiselect.AbstractMultiSelectState.class);
            store.setSuperClass(com.vaadin.shared.ui.datefield.LocalDateFieldState.class, com.vaadin.shared.ui.datefield.TextualDateFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.datefield.LocalDateTimeFieldState.class, com.vaadin.shared.ui.datefield.TextualDateFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.treegrid.TreeGridState.class, com.vaadin.shared.ui.grid.GridState.class);
            store.setClass("com.vaadin.server.AbstractJavaScriptExtension", com.vaadin.client.JavaScriptExtension.class);
            store.setClass("com.vaadin.ui.renderers.ButtonRenderer", com.vaadin.client.connectors.ButtonRendererConnector.class);
            store.setClass("com.vaadin.ui.renderers.ImageRenderer", com.vaadin.client.connectors.ImageRendererConnector.class);
            store.setClass("com.vaadin.ui.renderers.AbstractJavaScriptRenderer", com.vaadin.client.connectors.JavaScriptRendererConnector.class);
            store.setClass("com.vaadin.data.provider.DataCommunicator", com.vaadin.client.connectors.data.DataCommunicatorConnector.class);
            store.setClass("com.vaadin.data.provider.HierarchicalDataCommunicator", com.vaadin.client.connectors.data.HierarchicalDataCommunicatorConnector.class);
            store.setClass("com.vaadin.ui.Grid.Column", com.vaadin.client.connectors.grid.ColumnConnector.class);
            store.setClass("com.vaadin.ui.renderers.ComponentRenderer", com.vaadin.client.connectors.grid.ComponentRendererConnector.class);
            store.setClass("com.vaadin.ui.renderers.DateRenderer", com.vaadin.client.connectors.grid.DateRendererConnector.class);
            store.setClass("com.vaadin.ui.Grid.DetailsManager", com.vaadin.client.connectors.grid.DetailsManagerConnector.class);
            store.setClass("com.vaadin.ui.components.grid.EditorImpl", com.vaadin.client.connectors.grid.EditorConnector.class);
            store.setClass("com.vaadin.ui.Grid", com.vaadin.client.connectors.grid.GridConnector.class);
            store.setClass("com.vaadin.ui.components.grid.GridDragSource", com.vaadin.client.connectors.grid.GridDragSourceConnector.class);
            store.setClass("com.vaadin.ui.components.grid.GridDropTarget", com.vaadin.client.connectors.grid.GridDropTargetConnector.class);
            store.setClass("com.vaadin.ui.renderers.LocalDateRenderer", com.vaadin.client.connectors.grid.LocalDateRendererConnector.class);
            store.setClass("com.vaadin.ui.renderers.LocalDateTimeRenderer", com.vaadin.client.connectors.grid.LocalDateTimeRendererConnector.class);
            store.setClass("com.vaadin.ui.components.grid.MultiSelectionModelImpl", com.vaadin.client.connectors.grid.MultiSelectionModelConnector.class);
            store.setClass("com.vaadin.ui.components.grid.NoSelectionModel", com.vaadin.client.connectors.grid.NoSelectionModelConnector.class);
            store.setClass("com.vaadin.ui.renderers.NumberRenderer", com.vaadin.client.connectors.grid.NumberRendererConnector.class);
            store.setClass("com.vaadin.ui.renderers.ProgressBarRenderer", com.vaadin.client.connectors.grid.ProgressBarRendererConnector.class);
            store.setClass("com.vaadin.ui.components.grid.SingleSelectionModelImpl", com.vaadin.client.connectors.grid.SingleSelectionModelConnector.class);
            store.setClass("com.vaadin.ui.renderers.TextRenderer", com.vaadin.client.connectors.grid.TextRendererConnector.class);
            store.setClass("com.vaadin.ui.components.grid.TreeGridDragSource", com.vaadin.client.connectors.grid.TreeGridDragSourceConnector.class);
            store.setClass("com.vaadin.ui.components.grid.TreeGridDropTarget", com.vaadin.client.connectors.grid.TreeGridDropTargetConnector.class);
            store.setClass("com.vaadin.ui.Tree.TreeRenderer", com.vaadin.client.connectors.grid.TreeRendererConnector.class);
            store.setClass("com.vaadin.ui.renderers.HtmlRenderer", com.vaadin.client.connectors.grid.UnsafeHtmlRendererConnector.class);
            store.setClass("com.vaadin.ui.Tree.TreeMultiSelectionModel", com.vaadin.client.connectors.tree.TreeMultiSelectionModelConnector.class);
            store.setClass("com.vaadin.server.BrowserWindowOpener", com.vaadin.client.extensions.BrowserWindowOpenerConnector.class);
            store.setClass("com.vaadin.ui.dnd.DragSourceExtension", com.vaadin.client.extensions.DragSourceExtensionConnector.class);
            store.setClass("com.vaadin.ui.dnd.DropTargetExtension", com.vaadin.client.extensions.DropTargetExtensionConnector.class);
            store.setClass("com.vaadin.server.FileDownloader", com.vaadin.client.extensions.FileDownloaderConnector.class);
            store.setClass("com.vaadin.ui.dnd.FileDropTarget", com.vaadin.client.extensions.FileDropTargetConnector.class);
            store.setClass("com.vaadin.server.Responsive", com.vaadin.client.extensions.ResponsiveConnector.class);
            store.setClass("com.vaadin.ui.JavaScript", com.vaadin.client.extensions.javascriptmanager.JavaScriptManagerConnector.class);
            store.setClass("com.vaadin.ui.AbstractJavaScriptComponent", com.vaadin.client.ui.JavaScriptComponentConnector.class);
            store.setClass("com.vaadin.ui.AbsoluteLayout", com.vaadin.client.ui.absolutelayout.AbsoluteLayoutConnector.class);
            store.setClass("com.vaadin.ui.Accordion", com.vaadin.client.ui.accordion.AccordionConnector.class);
            store.setClass("com.vaadin.ui.Audio", com.vaadin.client.ui.audio.AudioConnector.class);
            store.setClass("com.vaadin.ui.BrowserFrame", com.vaadin.client.ui.browserframe.BrowserFrameConnector.class);
            store.setClass("com.vaadin.ui.Button", com.vaadin.client.ui.button.ButtonConnector.class);
            store.setClass("com.vaadin.ui.CheckBox", com.vaadin.client.ui.checkbox.CheckBoxConnector.class);
            store.setClass("com.vaadin.ui.ComboBox", com.vaadin.client.ui.combobox.ComboBoxConnector.class);
            store.setClass("com.vaadin.ui.Composite", com.vaadin.client.ui.composite.CompositeConnector.class);
            store.setClass("com.vaadin.ui.CssLayout", com.vaadin.client.ui.csslayout.CssLayoutConnector.class);
            store.setClass("com.vaadin.ui.CustomComponent", com.vaadin.client.ui.customcomponent.CustomComponentConnector.class);
            store.setClass("com.vaadin.ui.CustomField", com.vaadin.client.ui.customfield.CustomFieldConnector.class);
            store.setClass("com.vaadin.ui.CustomLayout", com.vaadin.client.ui.customlayout.CustomLayoutConnector.class);
            store.setClass("com.vaadin.ui.AbstractLocalDateField", com.vaadin.client.ui.datefield.DateFieldConnector.class);
            store.setClass("com.vaadin.ui.AbstractLocalDateTimeField", com.vaadin.client.ui.datefield.DateTimeFieldConnector.class);
            store.setClass("com.vaadin.ui.InlineDateField", com.vaadin.client.ui.datefield.InlineDateFieldConnector.class);
            store.setClass("com.vaadin.ui.InlineDateTimeField", com.vaadin.client.ui.datefield.InlineDateTimeFieldConnector.class);
            store.setClass("com.vaadin.ui.DateField", com.vaadin.client.ui.datefield.PopupDateFieldConnector.class);
            store.setClass("com.vaadin.ui.DateTimeField", com.vaadin.client.ui.datefield.PopupDateTimeFieldConnector.class);
            store.setClass("com.vaadin.ui.DragAndDropWrapper", com.vaadin.client.ui.draganddropwrapper.DragAndDropWrapperConnector.class);
            store.setClass("com.vaadin.ui.Embedded", com.vaadin.client.ui.embedded.EmbeddedConnector.class);
            store.setClass("com.vaadin.ui.Flash", com.vaadin.client.ui.flash.FlashConnector.class);
            store.setClass("com.vaadin.ui.FormLayout", com.vaadin.client.ui.formlayout.FormLayoutConnector.class);
            store.setClass("com.vaadin.ui.GridLayout", com.vaadin.client.ui.gridlayout.GridLayoutConnector.class);
            store.setClass("com.vaadin.ui.Image", com.vaadin.client.ui.image.ImageConnector.class);
            store.setClass("com.vaadin.ui.Label", com.vaadin.client.ui.label.LabelConnector.class);
            store.setClass("com.vaadin.ui.Link", com.vaadin.client.ui.link.LinkConnector.class);
            store.setClass("com.vaadin.ui.ListSelect", com.vaadin.client.ui.listselect.ListSelectConnector.class);
            store.setClass("com.vaadin.ui.LoginForm", com.vaadin.client.ui.loginform.LoginFormConnector.class);
            store.setClass("com.vaadin.ui.MenuBar", com.vaadin.client.ui.menubar.MenuBarConnector.class);
            store.setClass("com.vaadin.ui.NativeButton", com.vaadin.client.ui.nativebutton.NativeButtonConnector.class);
            store.setClass("com.vaadin.ui.NativeSelect", com.vaadin.client.ui.nativeselect.NativeSelectConnector.class);
            store.setClass("com.vaadin.ui.Notification", com.vaadin.client.ui.notification.NotificationConnector.class);
            store.setClass("com.vaadin.ui.CheckBoxGroup", com.vaadin.client.ui.optiongroup.CheckBoxGroupConnector.class);
            store.setClass("com.vaadin.ui.RadioButtonGroup", com.vaadin.client.ui.optiongroup.RadioButtonGroupConnector.class);
            store.setClass("com.vaadin.ui.HorizontalLayout", com.vaadin.client.ui.orderedlayout.HorizontalLayoutConnector.class);
            store.setClass("com.vaadin.ui.VerticalLayout", com.vaadin.client.ui.orderedlayout.VerticalLayoutConnector.class);
            store.setClass("com.vaadin.ui.Panel", com.vaadin.client.ui.panel.PanelConnector.class);
            store.setClass("com.vaadin.ui.PasswordField", com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class);
            store.setClass("com.vaadin.ui.PopupView", com.vaadin.client.ui.popupview.PopupViewConnector.class);
            store.setClass("com.vaadin.ui.ProgressBar", com.vaadin.client.ui.progressbar.ProgressBarConnector.class);
            store.setClass("com.vaadin.ui.Slider", com.vaadin.client.ui.slider.SliderConnector.class);
            store.setClass("com.vaadin.ui.HorizontalSplitPanel", com.vaadin.client.ui.splitpanel.HorizontalSplitPanelConnector.class);
            store.setClass("com.vaadin.ui.VerticalSplitPanel", com.vaadin.client.ui.splitpanel.VerticalSplitPanelConnector.class);
            store.setClass("com.vaadin.ui.TabSheet", com.vaadin.client.ui.tabsheet.TabsheetConnector.class);
            store.setClass("com.vaadin.ui.TextArea", com.vaadin.client.ui.textarea.TextAreaConnector.class);
            store.setClass("com.vaadin.ui.TextField", com.vaadin.client.ui.textfield.TextFieldConnector.class);
            store.setClass("com.vaadin.ui.TreeGrid", com.vaadin.client.ui.treegrid.TreeGridConnector.class);
            store.setClass("com.vaadin.ui.TwinColSelect", com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class);
            store.setClass("com.vaadin.ui.UI", com.vaadin.client.ui.ui.UIConnector.class);
            store.setClass("com.vaadin.ui.Upload", com.vaadin.client.ui.upload.UploadConnector.class);
            store.setClass("com.vaadin.ui.Video", com.vaadin.client.ui.video.VideoConnector.class);
            store.setClass("com.vaadin.ui.Window", com.vaadin.client.ui.window.WindowConnector.class);
            store.setClass("fi.jasoft.simplecalendar.SimpleCalendar", fi.jasoft.simplecalendar.shared.SimpleCalendarConnector.class);
            store.setConstructor(com.vaadin.client.JavaScriptExtension.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.JavaScriptExtension.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.ButtonRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.ButtonRendererConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.ImageRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.ImageRendererConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.JavaScriptRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.JavaScriptRendererConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.data.DataCommunicatorConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.data.DataCommunicatorConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.data.HierarchicalDataCommunicatorConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.data.HierarchicalDataCommunicatorConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.ColumnConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.ColumnConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.ComponentRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.ComponentRendererConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.DateRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.DateRendererConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.DetailsManagerConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.DetailsManagerConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.EditorConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.EditorConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.GridConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.GridConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.GridDragSourceConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.GridDragSourceConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.GridDropTargetConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.GridDropTargetConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.LocalDateRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.LocalDateRendererConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.LocalDateTimeRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.LocalDateTimeRendererConnector.class);
              }
            });
            load0();
          }
          private void load0() {
            store.setConstructor(com.vaadin.client.connectors.grid.MultiSelectionModelConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.MultiSelectionModelConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.NoSelectionModelConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.NoSelectionModelConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.NumberRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.NumberRendererConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.ProgressBarRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.ProgressBarRendererConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.SingleSelectionModelConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.SingleSelectionModelConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.TextRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.TextRendererConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.TreeGridDragSourceConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.TreeGridDragSourceConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.TreeGridDropTargetConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.TreeGridDropTargetConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.TreeRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.TreeRendererConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.UnsafeHtmlRendererConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.UnsafeHtmlRendererConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.grid.UnsafeHtmlRendererConnector.UnsafeHtmlRenderer.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.grid.UnsafeHtmlRendererConnector.UnsafeHtmlRenderer.class);
              }
            });
            store.setConstructor(com.vaadin.client.connectors.tree.TreeMultiSelectionModelConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.connectors.tree.TreeMultiSelectionModelConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.extensions.BrowserWindowOpenerConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.extensions.BrowserWindowOpenerConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.extensions.DragSourceExtensionConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.extensions.DragSourceExtensionConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.extensions.DropTargetExtensionConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.extensions.DropTargetExtensionConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.extensions.FileDownloaderConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.extensions.FileDownloaderConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.extensions.FileDropTargetConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.extensions.FileDropTargetConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.extensions.ResponsiveConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.extensions.ResponsiveConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.extensions.javascriptmanager.JavaScriptManagerConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.extensions.javascriptmanager.JavaScriptManagerConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.renderers.ButtonRenderer.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.renderers.ButtonRenderer.class);
              }
            });
            store.setConstructor(com.vaadin.client.renderers.ImageRenderer.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.renderers.ImageRenderer.class);
              }
            });
            store.setConstructor(com.vaadin.client.renderers.ProgressBarRenderer.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.renderers.ProgressBarRenderer.class);
              }
            });
            store.setConstructor(com.vaadin.client.renderers.TextRenderer.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.renderers.TextRenderer.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.JavaScriptComponentConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.JavaScriptComponentConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VAbsoluteLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VAbsoluteLayout.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VAccordion.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VAccordion.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VBrowserFrame.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VBrowserFrame.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VButton.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VButton.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VCheckBox.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VCheckBox.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VCheckBoxGroup.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VCheckBoxGroup.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VComboBox.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VComboBox.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VCssLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VCssLayout.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VCustomComponent.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VCustomComponent.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VCustomField.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VCustomField.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VCustomLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VCustomLayout.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VDateFieldCalendar.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VDateFieldCalendar.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VDateTimeFieldCalendar.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VDateTimeFieldCalendar.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VDragAndDropWrapper.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VDragAndDropWrapper.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VEmbedded.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VEmbedded.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VFlash.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VFlash.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VFormLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VFormLayout.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VGridLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VGridLayout.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VHorizontalLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VHorizontalLayout.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VImage.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VImage.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VLabel.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VLabel.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VLink.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VLink.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VListSelect.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VListSelect.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VMenuBar.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VMenuBar.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VNativeButton.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VNativeButton.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VNativeSelect.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VNativeSelect.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VPanel.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VPanel.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VPasswordField.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VPasswordField.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VPopupCalendar.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VPopupCalendar.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VPopupTimeCalendar.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VPopupTimeCalendar.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VPopupView.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VPopupView.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VProgressBar.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VProgressBar.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VRadioButtonGroup.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VRadioButtonGroup.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VSlider.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VSlider.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VSplitPanelHorizontal.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VSplitPanelHorizontal.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VSplitPanelVertical.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VSplitPanelVertical.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VTabsheet.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VTabsheet.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VTextArea.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VTextArea.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VTextField.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VTextField.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VTwinColSelect.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VTwinColSelect.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VUI.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VUI.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VUnknownComponent.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VUnknownComponent.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VUpload.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VUpload.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VVerticalLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VVerticalLayout.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VVideo.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VVideo.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VWindow.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VWindow.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.absolutelayout.AbsoluteLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.absolutelayout.AbsoluteLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.accordion.AccordionConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.accordion.AccordionConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.audio.AudioConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.audio.AudioConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.browserframe.BrowserFrameConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.browserframe.BrowserFrameConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.button.ButtonConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.button.ButtonConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.checkbox.CheckBoxConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.checkbox.CheckBoxConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.combobox.ComboBoxConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.combobox.ComboBoxConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.composite.CompositeConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.composite.CompositeConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.csslayout.CssLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.csslayout.CssLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.customcomponent.CustomComponentConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.customcomponent.CustomComponentConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.customfield.CustomFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.customfield.CustomFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.customlayout.CustomLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.customlayout.CustomLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.datefield.DateFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.datefield.DateFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.datefield.DateTimeFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.datefield.DateTimeFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.datefield.InlineDateFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.datefield.InlineDateFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.datefield.InlineDateTimeFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.datefield.InlineDateTimeFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.datefield.PopupDateFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.datefield.PopupDateFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.datefield.PopupDateTimeFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.datefield.PopupDateTimeFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.draganddropwrapper.DragAndDropWrapperConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.draganddropwrapper.DragAndDropWrapperConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.embedded.EmbeddedConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.embedded.EmbeddedConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.flash.FlashConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.flash.FlashConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.formlayout.FormLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.formlayout.FormLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.gridlayout.GridLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.gridlayout.GridLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.image.ImageConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.image.ImageConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.label.LabelConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.label.LabelConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.link.LinkConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.link.LinkConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.listselect.ListSelectConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.listselect.ListSelectConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.loginform.LoginFormConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.loginform.LoginFormConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.loginform.VLoginForm.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.loginform.VLoginForm.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.menubar.MenuBarConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.menubar.MenuBarConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.nativebutton.NativeButtonConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.nativebutton.NativeButtonConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.notification.NotificationConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.notification.NotificationConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.optiongroup.CheckBoxGroupConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.optiongroup.CheckBoxGroupConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.optiongroup.RadioButtonGroupConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.optiongroup.RadioButtonGroupConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.orderedlayout.HorizontalLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.orderedlayout.HorizontalLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.orderedlayout.VerticalLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.orderedlayout.VerticalLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.panel.PanelConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.panel.PanelConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.popupview.PopupViewConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.popupview.PopupViewConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.progressbar.ProgressBarConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.progressbar.ProgressBarConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.slider.SliderConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.slider.SliderConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.splitpanel.HorizontalSplitPanelConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.splitpanel.HorizontalSplitPanelConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.splitpanel.VerticalSplitPanelConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.splitpanel.VerticalSplitPanelConnector.class);
              }
            });
            load1();
          }
          private void load1() {
            store.setConstructor(com.vaadin.client.ui.tabsheet.TabsheetConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.tabsheet.TabsheetConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.textarea.TextAreaConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.textarea.TextAreaConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.textfield.TextFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.textfield.TextFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.treegrid.TreeGridConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.treegrid.TreeGridConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.ui.UIConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.ui.UIConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.upload.UploadConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.upload.UploadConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.video.VideoConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.video.VideoConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.window.WindowConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.window.WindowConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.widget.treegrid.TreeGrid.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.widget.treegrid.TreeGrid.class);
              }
            });
            store.setConstructor(com.vaadin.client.widgets.Grid.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.widgets.Grid.class);
              }
            });
            store.setConstructor(com.vaadin.shared.AbstractComponentState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.AbstractComponentState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.JavaScriptExtensionState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.JavaScriptExtensionState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.MouseEventDetails.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.MouseEventDetails.class);
              }
            });
            store.setConstructor(com.vaadin.shared.communication.SharedState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.communication.SharedState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.extension.datacommunicator.DataCommunicatorState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.extension.datacommunicator.DataCommunicatorState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.extension.filedownloader.FileDownloaderState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.extension.filedownloader.FileDownloaderState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.extension.responsive.ResponsiveState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.extension.responsive.ResponsiveState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.BrowserWindowOpenerState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.BrowserWindowOpenerState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.JavaScriptComponentState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.JavaScriptComponentState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.accordion.AccordionState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.accordion.AccordionState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.audio.AudioState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.audio.AudioState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.browserframe.BrowserFrameState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.button.ButtonState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.button.ButtonState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.button.NativeButtonState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.button.NativeButtonState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.checkbox.CheckBoxState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.checkbox.CheckBoxState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.combobox.ComboBoxState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.combobox.ComboBoxState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.csslayout.CssLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.csslayout.CssLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.customfield.CustomFieldState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.customfield.CustomFieldState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.customlayout.CustomLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.datefield.InlineDateFieldState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.datefield.LocalDateFieldState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.datefield.LocalDateFieldState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.datefield.LocalDateTimeFieldState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.datefield.LocalDateTimeFieldState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.dnd.DragSourceState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.dnd.DragSourceState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.dnd.DropTargetState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.dnd.DropTargetState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.dnd.FileDropTargetState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.dnd.FileDropTargetState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.dnd.FileParameters.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.dnd.FileParameters.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.dnd.criteria.Criterion.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.dnd.criteria.Criterion.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.dnd.criteria.Payload.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.dnd.criteria.Payload.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.embedded.EmbeddedState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.embedded.EmbeddedState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.flash.FlashState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.flash.FlashState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.ColumnState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.ColumnState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.DetailsManagerState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.DetailsManagerState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.GridDragSourceState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.GridDragSourceState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.GridDropTargetState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.GridDropTargetState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.GridState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.GridState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.MultiSelectionModelState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.MultiSelectionModelState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.SectionState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.SectionState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.SectionState.CellState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.SectionState.CellState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.SectionState.RowState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.SectionState.RowState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.SingleSelectionModelState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.SingleSelectionModelState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.editor.EditorState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.editor.EditorState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.renderers.ButtonRendererState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.renderers.ButtonRendererState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.renderers.ComponentRendererState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.renderers.ComponentRendererState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.renderers.DateRendererState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.renderers.DateRendererState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.renderers.HtmlRendererState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.renderers.HtmlRendererState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.renderers.ImageRendererState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.renderers.ImageRendererState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.renderers.LocalDateRendererState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.renderers.LocalDateRendererState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.renderers.LocalDateTimeRendererState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.renderers.LocalDateTimeRendererState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.renderers.NumberRendererState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.renderers.NumberRendererState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.renderers.ProgressBarRendererState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.renderers.ProgressBarRendererState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.grid.renderers.TextRendererState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.grid.renderers.TextRendererState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.gridlayout.GridLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.image.ImageState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.image.ImageState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.label.LabelState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.label.LabelState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.link.LinkState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.link.LinkState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.listselect.ListSelectState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.listselect.ListSelectState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.loginform.LoginFormState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.loginform.LoginFormState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.menubar.MenuBarState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.menubar.MenuBarState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.nativeselect.NativeSelectState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.nativeselect.NativeSelectState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.notification.NotificationState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.notification.NotificationState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.optiongroup.CheckBoxGroupState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.optiongroup.CheckBoxGroupState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.optiongroup.RadioButtonGroupState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.optiongroup.RadioButtonGroupState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.orderedlayout.FormLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.orderedlayout.FormLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.panel.PanelState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.panel.PanelState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.passwordfield.PasswordFieldState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.passwordfield.PasswordFieldState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.popupview.PopupViewState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.popupview.PopupViewState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.progressindicator.ProgressBarState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.progressindicator.ProgressBarState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.slider.SliderState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.slider.SliderState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.tabsheet.TabState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.tabsheet.TabState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.tabsheet.TabsheetState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.tabsheet.TabsheetState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.textarea.TextAreaState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.textarea.TextAreaState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.textfield.TextFieldState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.textfield.TextFieldState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.tree.TreeMultiSelectionModelState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.tree.TreeMultiSelectionModelState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.tree.TreeRendererState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.tree.TreeRendererState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.treegrid.TreeGridDragSourceState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.treegrid.TreeGridDragSourceState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.treegrid.TreeGridDropTargetState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.treegrid.TreeGridDropTargetState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.treegrid.TreeGridState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.treegrid.TreeGridState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.ui.PageState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.ui.PageState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.ui.UIState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.ui.UIState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.ui.UIState.LocaleData.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.ui.UIState.LocaleData.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.ui.UIState.LocaleServiceState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.ui.UIState.LocaleServiceState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.ui.UIState.PushConfigurationState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.ui.UIState.PushConfigurationState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.upload.UploadState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.upload.UploadState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.video.VideoState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.video.VideoState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.window.WindowState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.window.WindowState.class);
              }
            });
            store.setConstructor(fi.jasoft.simplecalendar.client.SimpleCalendarWidget.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(fi.jasoft.simplecalendar.client.SimpleCalendarWidget.class);
              }
            });
            load2();
          }
          private void load2() {
            store.setConstructor(fi.jasoft.simplecalendar.shared.SimpleCalendarConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(fi.jasoft.simplecalendar.shared.SimpleCalendarConnector.class);
              }
            });
            store.setConstructor(fi.jasoft.simplecalendar.shared.SimpleCalendarState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(fi.jasoft.simplecalendar.shared.SimpleCalendarState.class);
              }
            });
            store.setConstructor(java.util.HashMap.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(java.util.HashMap.class);
              }
            });
            store.setConstructor(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class);
              }
            });
            store.setConstructor(org.vaadin.addon.calendar.client.ui.schedule.CalTime.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(org.vaadin.addon.calendar.client.ui.schedule.CalTime.class);
              }
            });
            store.setConstructor(org.vaadin.addon.calendar.client.ui.schedule.SelectionRange.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(org.vaadin.addon.calendar.client.ui.schedule.SelectionRange.class);
              }
            });
            store.setReturnType(com.vaadin.client.JavaScriptExtension.class, "getState", new Type(com.vaadin.shared.JavaScriptExtensionState.class));
            store.setReturnType(com.vaadin.client.connectors.ButtonRendererConnector.class, "getRenderer", new Type(com.vaadin.client.renderers.ButtonRenderer.class));
            store.setReturnType(com.vaadin.client.connectors.ButtonRendererConnector.class, "getState", new Type(com.vaadin.shared.ui.grid.renderers.ButtonRendererState.class));
            store.setReturnType(com.vaadin.client.connectors.ImageRendererConnector.class, "getRenderer", new Type(com.vaadin.client.renderers.ImageRenderer.class));
            store.setReturnType(com.vaadin.client.connectors.ImageRendererConnector.class, "getState", new Type(com.vaadin.shared.ui.grid.renderers.ImageRendererState.class));
            store.setReturnType(com.vaadin.client.connectors.JavaScriptRendererConnector.class, "getState", new Type(com.vaadin.shared.JavaScriptExtensionState.class));
            store.setReturnType(com.vaadin.client.connectors.data.DataCommunicatorConnector.class, "getState", new Type(com.vaadin.shared.extension.datacommunicator.DataCommunicatorState.class));
            store.setReturnType(com.vaadin.client.connectors.data.HierarchicalDataCommunicatorConnector.class, "getState", new Type(com.vaadin.shared.extension.datacommunicator.DataCommunicatorState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.ColumnConnector.class, "getState", new Type(com.vaadin.shared.ui.grid.ColumnState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.ComponentRendererConnector.class, "getState", new Type(com.vaadin.shared.ui.grid.renderers.ComponentRendererState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.DateRendererConnector.class, "getRenderer", new Type(com.vaadin.client.renderers.TextRenderer.class));
            store.setReturnType(com.vaadin.client.connectors.grid.DateRendererConnector.class, "getState", new Type(com.vaadin.shared.ui.grid.renderers.DateRendererState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.DetailsManagerConnector.class, "getState", new Type(com.vaadin.shared.ui.grid.DetailsManagerState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.EditorConnector.class, "getState", new Type(com.vaadin.shared.ui.grid.editor.EditorState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.GridConnector.class, "getWidget", new Type("com.vaadin.client.widgets.Grid", new Type[] {new Type(elemental.json.JsonObject.class), }));
            store.setReturnType(com.vaadin.client.connectors.grid.GridConnector.class, "getState", new Type(com.vaadin.shared.ui.grid.GridState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.GridDragSourceConnector.class, "getState", new Type(com.vaadin.shared.ui.grid.GridDragSourceState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.GridDropTargetConnector.class, "getState", new Type(com.vaadin.shared.ui.grid.GridDropTargetState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.LocalDateRendererConnector.class, "getRenderer", new Type(com.vaadin.client.renderers.TextRenderer.class));
            store.setReturnType(com.vaadin.client.connectors.grid.LocalDateRendererConnector.class, "getState", new Type(com.vaadin.shared.ui.grid.renderers.LocalDateRendererState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.LocalDateTimeRendererConnector.class, "getRenderer", new Type(com.vaadin.client.renderers.TextRenderer.class));
            store.setReturnType(com.vaadin.client.connectors.grid.LocalDateTimeRendererConnector.class, "getState", new Type(com.vaadin.shared.ui.grid.renderers.LocalDateTimeRendererState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.MultiSelectionModelConnector.class, "getState", new Type(com.vaadin.shared.ui.grid.MultiSelectionModelState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.NoSelectionModelConnector.class, "getState", new Type(com.vaadin.shared.communication.SharedState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.NumberRendererConnector.class, "getRenderer", new Type(com.vaadin.client.renderers.TextRenderer.class));
            store.setReturnType(com.vaadin.client.connectors.grid.NumberRendererConnector.class, "getState", new Type(com.vaadin.shared.ui.grid.renderers.NumberRendererState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.ProgressBarRendererConnector.class, "getRenderer", new Type(com.vaadin.client.renderers.ProgressBarRenderer.class));
            store.setReturnType(com.vaadin.client.connectors.grid.ProgressBarRendererConnector.class, "getState", new Type(com.vaadin.shared.ui.grid.renderers.ProgressBarRendererState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.SingleSelectionModelConnector.class, "getState", new Type(com.vaadin.shared.ui.grid.SingleSelectionModelState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.TextRendererConnector.class, "getRenderer", new Type(com.vaadin.client.renderers.TextRenderer.class));
            store.setReturnType(com.vaadin.client.connectors.grid.TextRendererConnector.class, "getState", new Type(com.vaadin.shared.ui.grid.renderers.TextRendererState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.TreeGridDragSourceConnector.class, "getState", new Type(com.vaadin.shared.ui.treegrid.TreeGridDragSourceState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.TreeGridDropTargetConnector.class, "getState", new Type(com.vaadin.shared.ui.treegrid.TreeGridDropTargetState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.TreeRendererConnector.class, "getState", new Type(com.vaadin.shared.ui.tree.TreeRendererState.class));
            store.setReturnType(com.vaadin.client.connectors.grid.UnsafeHtmlRendererConnector.class, "getRenderer", new Type(com.vaadin.client.connectors.grid.UnsafeHtmlRendererConnector.UnsafeHtmlRenderer.class));
            store.setReturnType(com.vaadin.client.connectors.grid.UnsafeHtmlRendererConnector.class, "getState", new Type(com.vaadin.shared.ui.grid.renderers.HtmlRendererState.class));
            store.setReturnType(com.vaadin.client.connectors.tree.TreeMultiSelectionModelConnector.class, "getState", new Type(com.vaadin.shared.ui.tree.TreeMultiSelectionModelState.class));
            store.setReturnType(com.vaadin.client.extensions.BrowserWindowOpenerConnector.class, "getState", new Type(com.vaadin.shared.ui.BrowserWindowOpenerState.class));
            store.setReturnType(com.vaadin.client.extensions.DragSourceExtensionConnector.class, "getState", new Type(com.vaadin.shared.ui.dnd.DragSourceState.class));
            store.setReturnType(com.vaadin.client.extensions.DropTargetExtensionConnector.class, "getState", new Type(com.vaadin.shared.ui.dnd.DropTargetState.class));
            store.setReturnType(com.vaadin.client.extensions.FileDownloaderConnector.class, "getState", new Type(com.vaadin.shared.extension.filedownloader.FileDownloaderState.class));
            store.setReturnType(com.vaadin.client.extensions.FileDropTargetConnector.class, "getState", new Type(com.vaadin.shared.ui.dnd.FileDropTargetState.class));
            store.setReturnType(com.vaadin.client.extensions.ResponsiveConnector.class, "getState", new Type(com.vaadin.shared.extension.responsive.ResponsiveState.class));
            store.setReturnType(com.vaadin.client.extensions.javascriptmanager.JavaScriptManagerConnector.class, "getState", new Type(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class));
            store.setReturnType(com.vaadin.client.ui.JavaScriptComponentConnector.class, "getState", new Type(com.vaadin.shared.ui.JavaScriptComponentState.class));
            store.setReturnType(com.vaadin.client.ui.UnknownComponentConnector.class, "getWidget", new Type(com.vaadin.client.ui.VUnknownComponent.class));
            store.setReturnType(com.vaadin.client.ui.UnknownComponentConnector.class, "getState", new Type(com.vaadin.shared.AbstractComponentState.class));
            store.setReturnType(com.vaadin.client.ui.UnknownExtensionConnector.class, "getState", new Type(com.vaadin.shared.communication.SharedState.class));
            store.setReturnType(com.vaadin.client.ui.absolutelayout.AbsoluteLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VAbsoluteLayout.class));
            store.setReturnType(com.vaadin.client.ui.absolutelayout.AbsoluteLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.accordion.AccordionConnector.class, "getWidget", new Type(com.vaadin.client.ui.VAccordion.class));
            store.setReturnType(com.vaadin.client.ui.accordion.AccordionConnector.class, "getState", new Type(com.vaadin.shared.ui.accordion.AccordionState.class));
            store.setReturnType(com.vaadin.client.ui.audio.AudioConnector.class, "getState", new Type(com.vaadin.shared.ui.audio.AudioState.class));
            store.setReturnType(com.vaadin.client.ui.browserframe.BrowserFrameConnector.class, "getWidget", new Type(com.vaadin.client.ui.VBrowserFrame.class));
            store.setReturnType(com.vaadin.client.ui.browserframe.BrowserFrameConnector.class, "getState", new Type(com.vaadin.shared.ui.browserframe.BrowserFrameState.class));
            store.setReturnType(com.vaadin.client.ui.button.ButtonConnector.class, "getWidget", new Type(com.vaadin.client.ui.VButton.class));
            store.setReturnType(com.vaadin.client.ui.button.ButtonConnector.class, "getState", new Type(com.vaadin.shared.ui.button.ButtonState.class));
            store.setReturnType(com.vaadin.client.ui.checkbox.CheckBoxConnector.class, "getWidget", new Type(com.vaadin.client.ui.VCheckBox.class));
            store.setReturnType(com.vaadin.client.ui.checkbox.CheckBoxConnector.class, "getState", new Type(com.vaadin.shared.ui.checkbox.CheckBoxState.class));
            store.setReturnType(com.vaadin.client.ui.combobox.ComboBoxConnector.class, "getWidget", new Type(com.vaadin.client.ui.VComboBox.class));
            store.setReturnType(com.vaadin.client.ui.combobox.ComboBoxConnector.class, "getState", new Type(com.vaadin.shared.ui.combobox.ComboBoxState.class));
            store.setReturnType(com.vaadin.client.ui.composite.CompositeConnector.class, "getState", new Type(com.vaadin.shared.AbstractComponentState.class));
            store.setReturnType(com.vaadin.client.ui.csslayout.CssLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VCssLayout.class));
            store.setReturnType(com.vaadin.client.ui.csslayout.CssLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.csslayout.CssLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.customcomponent.CustomComponentConnector.class, "getWidget", new Type(com.vaadin.client.ui.VCustomComponent.class));
            store.setReturnType(com.vaadin.client.ui.customcomponent.CustomComponentConnector.class, "getState", new Type(com.vaadin.shared.AbstractComponentState.class));
            store.setReturnType(com.vaadin.client.ui.customfield.CustomFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VCustomField.class));
            store.setReturnType(com.vaadin.client.ui.customfield.CustomFieldConnector.class, "getState", new Type(com.vaadin.shared.ui.customfield.CustomFieldState.class));
            store.setReturnType(com.vaadin.client.ui.customlayout.CustomLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VCustomLayout.class));
            store.setReturnType(com.vaadin.client.ui.customlayout.CustomLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.customlayout.CustomLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.datefield.DateFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VPopupCalendar.class));
            store.setReturnType(com.vaadin.client.ui.datefield.DateFieldConnector.class, "getState", new Type(com.vaadin.shared.ui.datefield.LocalDateFieldState.class));
            store.setReturnType(com.vaadin.client.ui.datefield.DateTimeFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VPopupTimeCalendar.class));
            store.setReturnType(com.vaadin.client.ui.datefield.DateTimeFieldConnector.class, "getState", new Type(com.vaadin.shared.ui.datefield.LocalDateTimeFieldState.class));
            store.setReturnType(com.vaadin.client.ui.datefield.InlineDateFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VDateFieldCalendar.class));
            store.setReturnType(com.vaadin.client.ui.datefield.InlineDateFieldConnector.class, "getState", new Type(com.vaadin.shared.ui.datefield.InlineDateFieldState.class));
            store.setReturnType(com.vaadin.client.ui.datefield.InlineDateTimeFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VDateTimeFieldCalendar.class));
            store.setReturnType(com.vaadin.client.ui.datefield.InlineDateTimeFieldConnector.class, "getState", new Type(com.vaadin.shared.ui.datefield.InlineDateFieldState.class));
            store.setReturnType(com.vaadin.client.ui.datefield.PopupDateFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VPopupCalendar.class));
            store.setReturnType(com.vaadin.client.ui.datefield.PopupDateFieldConnector.class, "getState", new Type(com.vaadin.shared.ui.datefield.LocalDateFieldState.class));
            store.setReturnType(com.vaadin.client.ui.datefield.PopupDateTimeFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VPopupTimeCalendar.class));
            store.setReturnType(com.vaadin.client.ui.datefield.PopupDateTimeFieldConnector.class, "getState", new Type(com.vaadin.shared.ui.datefield.LocalDateTimeFieldState.class));
            store.setReturnType(com.vaadin.client.ui.draganddropwrapper.DragAndDropWrapperConnector.class, "getWidget", new Type(com.vaadin.client.ui.VDragAndDropWrapper.class));
            store.setReturnType(com.vaadin.client.ui.draganddropwrapper.DragAndDropWrapperConnector.class, "getState", new Type(com.vaadin.shared.AbstractComponentState.class));
            store.setReturnType(com.vaadin.client.ui.embedded.EmbeddedConnector.class, "getWidget", new Type(com.vaadin.client.ui.VEmbedded.class));
            store.setReturnType(com.vaadin.client.ui.embedded.EmbeddedConnector.class, "getState", new Type(com.vaadin.shared.ui.embedded.EmbeddedState.class));
            store.setReturnType(com.vaadin.client.ui.flash.FlashConnector.class, "getWidget", new Type(com.vaadin.client.ui.VFlash.class));
            store.setReturnType(com.vaadin.client.ui.flash.FlashConnector.class, "getState", new Type(com.vaadin.shared.ui.flash.FlashState.class));
            store.setReturnType(com.vaadin.client.ui.formlayout.FormLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VFormLayout.class));
            store.setReturnType(com.vaadin.client.ui.formlayout.FormLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.orderedlayout.FormLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.gridlayout.GridLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VGridLayout.class));
            store.setReturnType(com.vaadin.client.ui.gridlayout.GridLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.gridlayout.GridLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.image.ImageConnector.class, "getWidget", new Type(com.vaadin.client.ui.VImage.class));
            store.setReturnType(com.vaadin.client.ui.image.ImageConnector.class, "getState", new Type(com.vaadin.shared.ui.image.ImageState.class));
            store.setReturnType(com.vaadin.client.ui.label.LabelConnector.class, "getWidget", new Type(com.vaadin.client.ui.VLabel.class));
            store.setReturnType(com.vaadin.client.ui.label.LabelConnector.class, "getState", new Type(com.vaadin.shared.ui.label.LabelState.class));
            store.setReturnType(com.vaadin.client.ui.link.LinkConnector.class, "getWidget", new Type(com.vaadin.client.ui.VLink.class));
            store.setReturnType(com.vaadin.client.ui.link.LinkConnector.class, "getState", new Type(com.vaadin.shared.ui.link.LinkState.class));
            store.setReturnType(com.vaadin.client.ui.listselect.ListSelectConnector.class, "getWidget", new Type(com.vaadin.client.ui.VListSelect.class));
            store.setReturnType(com.vaadin.client.ui.listselect.ListSelectConnector.class, "getState", new Type(com.vaadin.shared.ui.listselect.ListSelectState.class));
            store.setReturnType(com.vaadin.client.ui.loginform.LoginFormConnector.class, "getWidget", new Type(com.vaadin.client.ui.loginform.VLoginForm.class));
            store.setReturnType(com.vaadin.client.ui.loginform.LoginFormConnector.class, "getState", new Type(com.vaadin.shared.ui.loginform.LoginFormState.class));
            store.setReturnType(com.vaadin.client.ui.menubar.MenuBarConnector.class, "getWidget", new Type(com.vaadin.client.ui.VMenuBar.class));
            store.setReturnType(com.vaadin.client.ui.menubar.MenuBarConnector.class, "getState", new Type(com.vaadin.shared.ui.menubar.MenuBarState.class));
            store.setReturnType(com.vaadin.client.ui.nativebutton.NativeButtonConnector.class, "getWidget", new Type(com.vaadin.client.ui.VNativeButton.class));
            store.setReturnType(com.vaadin.client.ui.nativebutton.NativeButtonConnector.class, "getState", new Type(com.vaadin.shared.ui.button.NativeButtonState.class));
            store.setReturnType(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, "getWidget", new Type(com.vaadin.client.ui.VNativeSelect.class));
            store.setReturnType(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, "getState", new Type(com.vaadin.shared.ui.nativeselect.NativeSelectState.class));
            store.setReturnType(com.vaadin.client.ui.notification.NotificationConnector.class, "getState", new Type(com.vaadin.shared.ui.notification.NotificationState.class));
            store.setReturnType(com.vaadin.client.ui.optiongroup.CheckBoxGroupConnector.class, "getWidget", new Type(com.vaadin.client.ui.VCheckBoxGroup.class));
            store.setReturnType(com.vaadin.client.ui.optiongroup.CheckBoxGroupConnector.class, "getState", new Type(com.vaadin.shared.ui.optiongroup.CheckBoxGroupState.class));
            store.setReturnType(com.vaadin.client.ui.optiongroup.RadioButtonGroupConnector.class, "getWidget", new Type(com.vaadin.client.ui.VRadioButtonGroup.class));
            store.setReturnType(com.vaadin.client.ui.optiongroup.RadioButtonGroupConnector.class, "getState", new Type(com.vaadin.shared.ui.optiongroup.RadioButtonGroupState.class));
            store.setReturnType(com.vaadin.client.ui.orderedlayout.HorizontalLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VHorizontalLayout.class));
            store.setReturnType(com.vaadin.client.ui.orderedlayout.HorizontalLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.orderedlayout.VerticalLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VVerticalLayout.class));
            store.setReturnType(com.vaadin.client.ui.orderedlayout.VerticalLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.panel.PanelConnector.class, "getWidget", new Type(com.vaadin.client.ui.VPanel.class));
            store.setReturnType(com.vaadin.client.ui.panel.PanelConnector.class, "getState", new Type(com.vaadin.shared.ui.panel.PanelState.class));
            store.setReturnType(com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VPasswordField.class));
            store.setReturnType(com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class, "getState", new Type(com.vaadin.shared.ui.passwordfield.PasswordFieldState.class));
            store.setReturnType(com.vaadin.client.ui.popupview.PopupViewConnector.class, "getWidget", new Type(com.vaadin.client.ui.VPopupView.class));
            store.setReturnType(com.vaadin.client.ui.popupview.PopupViewConnector.class, "getState", new Type(com.vaadin.shared.ui.popupview.PopupViewState.class));
            store.setReturnType(com.vaadin.client.ui.progressbar.ProgressBarConnector.class, "getWidget", new Type(com.vaadin.client.ui.VProgressBar.class));
            store.setReturnType(com.vaadin.client.ui.progressbar.ProgressBarConnector.class, "getState", new Type(com.vaadin.shared.ui.progressindicator.ProgressBarState.class));
            store.setReturnType(com.vaadin.client.ui.slider.SliderConnector.class, "getWidget", new Type(com.vaadin.client.ui.VSlider.class));
            store.setReturnType(com.vaadin.client.ui.slider.SliderConnector.class, "getState", new Type(com.vaadin.shared.ui.slider.SliderState.class));
            store.setReturnType(com.vaadin.client.ui.splitpanel.HorizontalSplitPanelConnector.class, "getWidget", new Type(com.vaadin.client.ui.VSplitPanelHorizontal.class));
            store.setReturnType(com.vaadin.client.ui.splitpanel.HorizontalSplitPanelConnector.class, "getState", new Type(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class));
            store.setReturnType(com.vaadin.client.ui.splitpanel.VerticalSplitPanelConnector.class, "getWidget", new Type(com.vaadin.client.ui.VSplitPanelVertical.class));
            store.setReturnType(com.vaadin.client.ui.splitpanel.VerticalSplitPanelConnector.class, "getState", new Type(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class));
            store.setReturnType(com.vaadin.client.ui.tabsheet.TabsheetConnector.class, "getWidget", new Type(com.vaadin.client.ui.VTabsheet.class));
            store.setReturnType(com.vaadin.client.ui.tabsheet.TabsheetConnector.class, "getState", new Type(com.vaadin.shared.ui.tabsheet.TabsheetState.class));
            store.setReturnType(com.vaadin.client.ui.textarea.TextAreaConnector.class, "getWidget", new Type(com.vaadin.client.ui.VTextArea.class));
            store.setReturnType(com.vaadin.client.ui.textarea.TextAreaConnector.class, "getState", new Type(com.vaadin.shared.ui.textarea.TextAreaState.class));
            store.setReturnType(com.vaadin.client.ui.textfield.TextFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VTextField.class));
            store.setReturnType(com.vaadin.client.ui.textfield.TextFieldConnector.class, "getState", new Type(com.vaadin.shared.ui.textfield.TextFieldState.class));
            store.setReturnType(com.vaadin.client.ui.treegrid.TreeGridConnector.class, "getWidget", new Type(com.vaadin.client.widget.treegrid.TreeGrid.class));
            store.setReturnType(com.vaadin.client.ui.treegrid.TreeGridConnector.class, "getState", new Type(com.vaadin.shared.ui.treegrid.TreeGridState.class));
            store.setReturnType(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class, "getWidget", new Type(com.vaadin.client.ui.VTwinColSelect.class));
            store.setReturnType(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class, "getState", new Type(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class));
            store.setReturnType(com.vaadin.client.ui.ui.UIConnector.class, "getWidget", new Type(com.vaadin.client.ui.VUI.class));
            store.setReturnType(com.vaadin.client.ui.ui.UIConnector.class, "getState", new Type(com.vaadin.shared.ui.ui.UIState.class));
            store.setReturnType(com.vaadin.client.ui.upload.UploadConnector.class, "getWidget", new Type(com.vaadin.client.ui.VUpload.class));
            store.setReturnType(com.vaadin.client.ui.upload.UploadConnector.class, "getState", new Type(com.vaadin.shared.ui.upload.UploadState.class));
            store.setReturnType(com.vaadin.client.ui.video.VideoConnector.class, "getWidget", new Type(com.vaadin.client.ui.VVideo.class));
            store.setReturnType(com.vaadin.client.ui.video.VideoConnector.class, "getState", new Type(com.vaadin.shared.ui.video.VideoState.class));
            store.setReturnType(com.vaadin.client.ui.window.WindowConnector.class, "getWidget", new Type(com.vaadin.client.ui.VWindow.class));
            store.setReturnType(com.vaadin.client.ui.window.WindowConnector.class, "getState", new Type(com.vaadin.shared.ui.window.WindowState.class));
            store.setReturnType(fi.jasoft.simplecalendar.shared.SimpleCalendarConnector.class, "getWidget", new Type(fi.jasoft.simplecalendar.client.SimpleCalendarWidget.class));
            store.setReturnType(fi.jasoft.simplecalendar.shared.SimpleCalendarConnector.class, "getState", new Type(fi.jasoft.simplecalendar.shared.SimpleCalendarState.class));
            store.setInvoker(com.vaadin.client.connectors.grid.AbstractSelectionModelConnector.class, "onSelectionAllowedChange",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.AbstractSelectionModelConnector::onSelectionAllowedChange(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.ColumnConnector.class, "updateAssistiveCaption",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.ColumnConnector::updateAssistiveCaption(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.ColumnConnector.class, "updateCaption",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.ColumnConnector::updateCaption(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.ColumnConnector.class, "updateEditable",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.ColumnConnector::updateEditable(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.ColumnConnector.class, "updateExpandRatio",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.ColumnConnector::updateExpandRatio(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.ColumnConnector.class, "updateHandleWidgetEvents",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.ColumnConnector::updateHandleWidgetEvents(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.ColumnConnector.class, "updateHidable",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.ColumnConnector::updateHidable(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.ColumnConnector.class, "updateHidden",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.ColumnConnector::updateHidden(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.ColumnConnector.class, "updateHidingToggleCaption",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.ColumnConnector::updateHidingToggleCaption(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.ColumnConnector.class, "updateMaxWidth",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.ColumnConnector::updateMaxWidth(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.ColumnConnector.class, "updateMinWidth",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.ColumnConnector::updateMinWidth(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.ColumnConnector.class, "updateMinimumWidthFromContent",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.ColumnConnector::updateMinimumWidthFromContent(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.ColumnConnector.class, "updateRenderer",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.ColumnConnector::updateRenderer(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.ColumnConnector.class, "updateResizable",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.ColumnConnector::updateResizable(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.ColumnConnector.class, "updateSortable",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.ColumnConnector::updateSortable(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.ColumnConnector.class, "updateTooltipContentMode",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.ColumnConnector::updateTooltipContentMode(*)();
                return null;
              }-*/;
            });
            load3();
          }
          private void load3() {
            store.setInvoker(com.vaadin.client.connectors.grid.ColumnConnector.class, "updateWidth",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.ColumnConnector::updateWidth(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.EditorConnector.class, "updateBuffered",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.EditorConnector::updateBuffered(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.EditorConnector.class, "updateCancelCaption",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.EditorConnector::updateCancelCaption(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.EditorConnector.class, "updateEnabled",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.EditorConnector::updateEnabled(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.EditorConnector.class, "updateSaveCaption",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.EditorConnector::updateSaveCaption(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.GridConnector.class, "updateColumnResizeMode",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.GridConnector::updateColumnResizeMode(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.GridConnector.class, "updateRowHeight",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.GridConnector::updateRowHeight(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.GridConnector.class, "updateSortOrder",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.GridConnector::updateSortOrder(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.MultiSelectionModelConnector.class, "onSelectAllCheckboxStateUpdates",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.MultiSelectionModelConnector::onSelectAllCheckboxStateUpdates(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.SingleSelectionModelConnector.class, "updateDeselectAllowed",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.SingleSelectionModelConnector::updateDeselectAllowed(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.connectors.grid.TreeRendererConnector.class, "updateContentMode",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.connectors.grid.TreeRendererConnector::updateContentMode(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.extensions.DragSourceExtensionConnector.class, "prefetchDragImage",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.extensions.DragSourceExtensionConnector::prefetchDragImage(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.AbstractComponentConnector::setErrorLevel(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.AbstractComponentConnector::handleContextClickListenerChange(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.VAccordion.class, "setTabCaptionsAsHtml",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VAccordion) target).setTabCaptionsAsHtml((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VAccordion.class, "setTabIndex",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VAccordion) target).setTabIndex((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VCheckBoxGroup.class, "setHtmlContentAllowed",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VCheckBoxGroup) target).setHtmlContentAllowed((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VComboBox.class, "setAllowNewItems",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VComboBox) target).setAllowNewItems((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VComboBox.class, "setPageLength",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VComboBox) target).setPageLength((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VComboBox.class, "setPlaceholder",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VComboBox) target).setPlaceholder((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VComboBox.class, "setSuggestionPopupWidth",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VComboBox) target).setSuggestionPopupWidth((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VComboBox.class, "setTextInputAllowed",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VComboBox) target).setTextInputAllowed((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VListSelect.class, "setRows",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VListSelect) target).setRows((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VNativeSelect.class, "setVisibleItemCount",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VNativeSelect) target).setVisibleItemCount((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VPasswordField.class, "setMaxLength",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VPasswordField) target).setMaxLength((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VPasswordField.class, "setPlaceholder",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VPasswordField) target).setPlaceholder((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VPasswordField.class, "setText",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VPasswordField) target).setText((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VPopupCalendar.class, "setPlaceholder",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VPopupCalendar) target).setPlaceholder((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VPopupTimeCalendar.class, "setPlaceholder",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VPopupTimeCalendar) target).setPlaceholder((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VRadioButtonGroup.class, "setHtmlContentAllowed",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VRadioButtonGroup) target).setHtmlContentAllowed((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VTabsheet.class, "setTabCaptionsAsHtml",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VTabsheet) target).setTabCaptionsAsHtml((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VTabsheet.class, "setTabIndex",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VTabsheet) target).setTabIndex((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VTextArea.class, "setMaxLength",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VTextArea) target).setMaxLength((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VTextArea.class, "setPlaceholder",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VTextArea) target).setPlaceholder((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VTextArea.class, "setRows",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VTextArea) target).setRows((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VTextArea.class, "setText",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VTextArea) target).setText((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VTextArea.class, "setWordWrap",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VTextArea) target).setWordWrap((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VTextField.class, "setMaxLength",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VTextField) target).setMaxLength((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VTextField.class, "setPlaceholder",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VTextField) target).setPlaceholder((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VTextField.class, "setText",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VTextField) target).setText((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VTwinColSelect.class, "setRows",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VTwinColSelect) target).setRows((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.button.ButtonConnector.class, "onResourceChange",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.button.ButtonConnector::onResourceChange(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.button.ButtonConnector.class, "setCaption",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.button.ButtonConnector::setCaption(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.button.ButtonConnector.class, "setClickShortcut",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.button.ButtonConnector::setClickShortcut(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.button.ButtonConnector.class, "setIconAltText",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.button.ButtonConnector::setIconAltText(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.checkbox.CheckBoxConnector.class, "sinkContextClickEvent",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.checkbox.CheckBoxConnector::sinkContextClickEvent(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.combobox.ComboBoxConnector.class, "onEmptySelectionCaptionChange",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.combobox.ComboBoxConnector::onEmptySelectionCaptionChange(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.combobox.ComboBoxConnector.class, "onSelectionChange",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.combobox.ComboBoxConnector::onSelectionChange(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.datefield.AbstractTextualDateConnector.class, "onTimeZoneJSONChange",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.datefield.AbstractTextualDateConnector::onTimeZoneJSONChange(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.datefield.TextualDateConnector.class, "dateStylesUpdated",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.datefield.TextualDateConnector::dateStylesUpdated(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.listselect.ListSelectConnector.class, "updateReadOnly",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.listselect.ListSelectConnector::updateReadOnly(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.listselect.ListSelectConnector.class, "updateTabIndex",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.listselect.ListSelectConnector::updateTabIndex(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.menubar.MenuBarConnector.class, "updateEnabled",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.menubar.MenuBarConnector::updateEnabled(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.menubar.MenuBarConnector.class, "updateTabIndex",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.menubar.MenuBarConnector::updateTabIndex(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, "onEmptySelectionCaptionChange",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.nativeselect.NativeSelectConnector::onEmptySelectionCaptionChange(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, "updateSelectedItem",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.nativeselect.NativeSelectConnector::updateSelectedItem(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, "updateTabIndex",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.nativeselect.NativeSelectConnector::updateTabIndex(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, "updateWidgetReadOnly",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.nativeselect.NativeSelectConnector::updateWidgetReadOnly(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.optiongroup.RadioButtonGroupConnector.class, "updateSelectedItem",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.optiongroup.RadioButtonGroupConnector::updateSelectedItem(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.optiongroup.RadioButtonGroupConnector.class, "updateWidgetReadOnly",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.optiongroup.RadioButtonGroupConnector::updateWidgetReadOnly(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.textfield.AbstractTextFieldConnector.class, "updateReadOnly",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.textfield.AbstractTextFieldConnector::updateReadOnly(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.textfield.AbstractTextFieldConnector.class, "updateValueChangeMode",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.textfield.AbstractTextFieldConnector::updateValueChangeMode(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.textfield.AbstractTextFieldConnector.class, "updateValueChangeTimeout",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.textfield.AbstractTextFieldConnector::updateValueChangeTimeout(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.treegrid.TreeGridConnector.class, "updateHierarchyRendererStyleName",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.treegrid.TreeGridConnector::updateHierarchyRendererStyleName(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.treegrid.TreeGridConnector.class, "updateHierarchyColumn",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.treegrid.TreeGridConnector::updateHierarchyColumn(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class, "updateCaptions",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.twincolselect.TwinColSelectConnector::updateCaptions(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class, "updateReadOnly",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.twincolselect.TwinColSelectConnector::updateReadOnly(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class, "updateTabIndex",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.twincolselect.TwinColSelectConnector::updateTabIndex(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.ui.UIConnector.class, "onThemeChange",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.ui.UIConnector::onThemeChange(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.widget.treegrid.TreeGrid.class, "setColumnReorderingAllowed",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.widget.treegrid.TreeGrid) target).setColumnReorderingAllowed((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.widget.treegrid.TreeGrid.class, "setFrozenColumnCount",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.widget.treegrid.TreeGrid) target).setFrozenColumnCount((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.widget.treegrid.TreeGrid.class, "setHeightByRows",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.widget.treegrid.TreeGrid) target).setHeightByRows((java.lang.Double) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.widget.treegrid.TreeGrid.class, "setHeightMode",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.widget.treegrid.TreeGrid) target).setHeightMode((com.vaadin.shared.ui.grid.HeightMode) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.widgets.Grid.class, "setColumnReorderingAllowed",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.widgets.Grid) target).setColumnReorderingAllowed((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.widgets.Grid.class, "setFrozenColumnCount",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.widgets.Grid) target).setFrozenColumnCount((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.widgets.Grid.class, "setHeightByRows",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.widgets.Grid) target).setHeightByRows((java.lang.Double) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.widgets.Grid.class, "setHeightMode",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.widgets.Grid) target).setHeightMode((com.vaadin.shared.ui.grid.HeightMode) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.data.DataCommunicatorClientRpc.class, "insertRows",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.data.DataCommunicatorClientRpc) target).insertRows((java.lang.Integer) params[0], (java.lang.Integer) params[1]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.data.DataCommunicatorClientRpc.class, "removeRows",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.data.DataCommunicatorClientRpc) target).removeRows((java.lang.Integer) params[0], (java.lang.Integer) params[1]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.data.DataCommunicatorClientRpc.class, "reset",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.data.DataCommunicatorClientRpc) target).reset((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.data.DataCommunicatorClientRpc.class, "setData",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.data.DataCommunicatorClientRpc) target).setData((java.lang.Integer) params[0], com.vaadin.client.communication.JsonDecoder.<elemental.json.JsonArray>obj2jso(params[1]));
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.data.DataCommunicatorClientRpc.class, "updateData",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.data.DataCommunicatorClientRpc) target).updateData(com.vaadin.client.communication.JsonDecoder.<elemental.json.JsonArray>obj2jso(params[0]));
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.data.DataProviderRpc.class, "insertRowData",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.data.DataProviderRpc) target).insertRowData((java.lang.Integer) params[0], (java.lang.Integer) params[1]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.data.DataProviderRpc.class, "removeRowData",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.data.DataProviderRpc) target).removeRowData((java.lang.Integer) params[0], (java.lang.Integer) params[1]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.data.DataProviderRpc.class, "resetDataAndSize",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.data.DataProviderRpc) target).resetDataAndSize((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.data.DataProviderRpc.class, "setRowData",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.data.DataProviderRpc) target).setRowData((java.lang.Integer) params[0], com.vaadin.client.communication.JsonDecoder.<elemental.json.JsonArray>obj2jso(params[1]));
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.data.DataProviderRpc.class, "updateRowData",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.data.DataProviderRpc) target).updateRowData(com.vaadin.client.communication.JsonDecoder.<elemental.json.JsonArray>obj2jso(params[0]));
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.extension.javascriptmanager.ExecuteJavaScriptRpc.class, "executeJavaScript",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.extension.javascriptmanager.ExecuteJavaScriptRpc) target).executeJavaScript((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.MediaControl.class, "pause",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.MediaControl) target).pause();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.MediaControl.class, "play",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.MediaControl) target).play();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.combobox.ComboBoxClientRpc.class, "newItemNotAdded",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.combobox.ComboBoxClientRpc) target).newItemNotAdded((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.dnd.FileDropTargetClientRpc.class, "sendUploadUrl",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.dnd.FileDropTargetClientRpc) target).sendUploadUrl((java.util.Map) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.grid.GridClientRpc.class, "recalculateColumnWidths",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.grid.GridClientRpc) target).recalculateColumnWidths();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.grid.GridClientRpc.class, "scrollToEnd",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.grid.GridClientRpc) target).scrollToEnd();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.grid.GridClientRpc.class, "scrollToRow",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.grid.GridClientRpc) target).scrollToRow((java.lang.Integer) params[0], (com.vaadin.shared.ui.grid.ScrollDestination) params[1]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.grid.GridClientRpc.class, "scrollToStart",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.grid.GridClientRpc) target).scrollToStart();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.grid.editor.EditorClientRpc.class, "bind",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.grid.editor.EditorClientRpc) target).bind((java.lang.Integer) params[0]);
                return null;
              }
            });
            load4();
          }
          private void load4() {
            store.setInvoker(com.vaadin.shared.ui.grid.editor.EditorClientRpc.class, "cancel",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.grid.editor.EditorClientRpc) target).cancel();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.grid.editor.EditorClientRpc.class, "confirmBind",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.grid.editor.EditorClientRpc) target).confirmBind((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.grid.editor.EditorClientRpc.class, "confirmSave",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.grid.editor.EditorClientRpc) target).confirmSave((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.grid.editor.EditorClientRpc.class, "setErrorMessage",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.grid.editor.EditorClientRpc) target).setErrorMessage((java.lang.String) params[0], (java.util.List) params[1]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.richtextarea.RichTextAreaClientRpc.class, "selectAll",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.richtextarea.RichTextAreaClientRpc) target).selectAll();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.tabsheet.TabsheetClientRpc.class, "revertToSharedStateSelection",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.tabsheet.TabsheetClientRpc) target).revertToSharedStateSelection();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.textfield.AbstractTextFieldClientRpc.class, "selectAll",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldClientRpc) target).selectAll();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.textfield.AbstractTextFieldClientRpc.class, "selectRange",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldClientRpc) target).selectRange((java.lang.Integer) params[0], (java.lang.Integer) params[1]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.treegrid.FocusRpc.class, "focusCell",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.treegrid.FocusRpc) target).focusCell((java.lang.Integer) params[0], (java.lang.Integer) params[1]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.treegrid.TreeGridClientRpc.class, "clearPendingExpands",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.treegrid.TreeGridClientRpc) target).clearPendingExpands();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.treegrid.TreeGridClientRpc.class, "setCollapsed",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.treegrid.TreeGridClientRpc) target).setCollapsed((java.util.List) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.treegrid.TreeGridClientRpc.class, "setExpanded",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.treegrid.TreeGridClientRpc) target).setExpanded((java.util.List) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.ui.DebugWindowClientRpc.class, "reportLayoutProblems",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.ui.DebugWindowClientRpc) target).reportLayoutProblems((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.ui.PageClientRpc.class, "initializeMobileHtml5DndPolyfill",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.ui.PageClientRpc) target).initializeMobileHtml5DndPolyfill();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.ui.PageClientRpc.class, "reload",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.ui.PageClientRpc) target).reload();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.ui.ScrollClientRpc.class, "setScrollLeft",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.ui.ScrollClientRpc) target).setScrollLeft((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.ui.ScrollClientRpc.class, "setScrollTop",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.ui.ScrollClientRpc) target).setScrollTop((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.ui.UIClientRpc.class, "uiClosed",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.ui.UIClientRpc) target).uiClosed((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.upload.UploadClientRpc.class, "submitUpload",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.upload.UploadClientRpc) target).submitUpload();
                return null;
              }
            });
            store.setInvoker(org.vaadin.addon.calendar.client.CalendarClientRpc.class, "scroll",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((org.vaadin.addon.calendar.client.CalendarClientRpc) target).scroll((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setParamTypes(com.vaadin.shared.ContextClickRpc.class, "contextClick", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.communication.FieldRpc.BlurServerRpc.class, "blur", new Type[] {});
            store.setParamTypes(com.vaadin.shared.communication.FieldRpc.FocusAndBlurServerRpc.class, "blur", new Type[] {});
            store.setParamTypes(com.vaadin.shared.communication.FieldRpc.FocusAndBlurServerRpc.class, "focus", new Type[] {});
            store.setParamTypes(com.vaadin.shared.communication.FieldRpc.FocusServerRpc.class, "focus", new Type[] {});
            store.setParamTypes(com.vaadin.shared.data.DataCommunicatorClientRpc.class, "insertRows", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.data.DataCommunicatorClientRpc.class, "removeRows", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.data.DataCommunicatorClientRpc.class, "reset", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.data.DataCommunicatorClientRpc.class, "setData", new Type[] {new Type(java.lang.Integer.class), new Type(elemental.json.JsonArray.class), });
            store.setParamTypes(com.vaadin.shared.data.DataCommunicatorClientRpc.class, "updateData", new Type[] {new Type(elemental.json.JsonArray.class), });
            store.setParamTypes(com.vaadin.shared.data.DataProviderRpc.class, "insertRowData", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.data.DataProviderRpc.class, "removeRowData", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.data.DataProviderRpc.class, "resetDataAndSize", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.data.DataProviderRpc.class, "setRowData", new Type[] {new Type(java.lang.Integer.class), new Type(elemental.json.JsonArray.class), });
            store.setParamTypes(com.vaadin.shared.data.DataProviderRpc.class, "updateRowData", new Type[] {new Type(elemental.json.JsonArray.class), });
            store.setParamTypes(com.vaadin.shared.data.DataRequestRpc.class, "dropRows", new Type[] {new Type(elemental.json.JsonArray.class), });
            store.setParamTypes(com.vaadin.shared.data.DataRequestRpc.class, "requestRows", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.data.selection.GridMultiSelectServerRpc.class, "deselect", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.data.selection.GridMultiSelectServerRpc.class, "deselectAll", new Type[] {});
            store.setParamTypes(com.vaadin.shared.data.selection.GridMultiSelectServerRpc.class, "select", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.data.selection.GridMultiSelectServerRpc.class, "selectAll", new Type[] {});
            store.setParamTypes(com.vaadin.shared.data.selection.MultiSelectServerRpc.class, "updateSelection", new Type[] {new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }), new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }), });
            store.setParamTypes(com.vaadin.shared.data.selection.SelectionServerRpc.class, "deselect", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.data.selection.SelectionServerRpc.class, "select", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.extension.javascriptmanager.ExecuteJavaScriptRpc.class, "executeJavaScript", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.ClickRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.LayoutClickRpc.class, "layoutClick", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), new Type(com.vaadin.shared.Connector.class), });
            store.setParamTypes(com.vaadin.shared.ui.MediaControl.class, "pause", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.MediaControl.class, "play", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.WindowOrderRpc.class, "windowOrderChanged", new Type[] {new Type("java.util.Map", new Type[] {new Type(java.lang.Integer.class), new Type(com.vaadin.shared.Connector.class), }), });
            store.setParamTypes(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutServerRpc.class, "layoutClick", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), new Type(com.vaadin.shared.Connector.class), });
            store.setParamTypes(com.vaadin.shared.ui.button.ButtonServerRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.button.ButtonServerRpc.class, "disableOnClick", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.checkbox.CheckBoxServerRpc.class, "setChecked", new Type[] {new Type(java.lang.Boolean.class), new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.colorpicker.ColorPickerGradientServerRpc.class, "select", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.colorpicker.ColorPickerGridServerRpc.class, "refresh", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.colorpicker.ColorPickerGridServerRpc.class, "select", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.colorpicker.ColorPickerServerRpc.class, "openPopup", new Type[] {new Type(java.lang.Boolean.class), });
            store.setParamTypes(com.vaadin.shared.ui.combobox.ComboBoxClientRpc.class, "newItemNotAdded", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.combobox.ComboBoxServerRpc.class, "createNewItem", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.combobox.ComboBoxServerRpc.class, "setFilter", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.csslayout.CssLayoutServerRpc.class, "layoutClick", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), new Type(com.vaadin.shared.Connector.class), });
            store.setParamTypes(com.vaadin.shared.ui.datefield.AbstractDateFieldServerRpc.class, "blur", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.datefield.AbstractDateFieldServerRpc.class, "focus", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.datefield.AbstractDateFieldServerRpc.class, "update", new Type[] {new Type(java.lang.String.class), new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.Integer.class), }), });
            store.setParamTypes(com.vaadin.shared.ui.dnd.DragSourceRpc.class, "dragEnd", new Type[] {new Type(com.vaadin.shared.ui.dnd.DropEffect.class), });
            store.setParamTypes(com.vaadin.shared.ui.dnd.DragSourceRpc.class, "dragStart", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.dnd.DropTargetRpc.class, "drop", new Type[] {new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }), new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), }), new Type(java.lang.String.class), new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.dnd.FileDropTargetClientRpc.class, "sendUploadUrl", new Type[] {new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), }), });
            store.setParamTypes(com.vaadin.shared.ui.dnd.FileDropTargetRpc.class, "drop", new Type[] {new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.ui.dnd.FileParameters.class), }), });
            store.setParamTypes(com.vaadin.shared.ui.dnd.FileDropTargetRpc.class, "poll", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.draganddropwrapper.DragAndDropWrapperServerRpc.class, "poll", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.embedded.EmbeddedServerRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.GridClientRpc.class, "recalculateColumnWidths", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.grid.GridClientRpc.class, "scrollToEnd", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.grid.GridClientRpc.class, "scrollToRow", new Type[] {new Type(java.lang.Integer.class), new Type(com.vaadin.shared.ui.grid.ScrollDestination.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.GridClientRpc.class, "scrollToStart", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.grid.GridDragSourceRpc.class, "dragEnd", new Type[] {new Type(com.vaadin.shared.ui.dnd.DropEffect.class), new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }), });
            store.setParamTypes(com.vaadin.shared.ui.grid.GridDragSourceRpc.class, "dragStart", new Type[] {new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }), });
            store.setParamTypes(com.vaadin.shared.ui.grid.GridDropTargetRpc.class, "drop", new Type[] {new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }), new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), }), new Type(java.lang.String.class), new Type(java.lang.String.class), new Type(com.vaadin.shared.ui.grid.DropLocation.class), new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.GridServerRpc.class, "columnResized", new Type[] {new Type(java.lang.String.class), new Type(java.lang.Double.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.GridServerRpc.class, "columnVisibilityChanged", new Type[] {new Type(java.lang.String.class), new Type(java.lang.Boolean.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.GridServerRpc.class, "columnsReordered", new Type[] {new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }), new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }), });
            store.setParamTypes(com.vaadin.shared.ui.grid.GridServerRpc.class, "contextClick", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.String.class), new Type(java.lang.String.class), new Type(com.vaadin.shared.ui.grid.GridConstants.Section.class), new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.GridServerRpc.class, "itemClick", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.GridServerRpc.class, "sort", new Type[] {new Type(java.lang.String[].class), new Type(com.vaadin.shared.data.sort.SortDirection[].class), new Type(java.lang.Boolean.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.editor.EditorClientRpc.class, "bind", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.editor.EditorClientRpc.class, "cancel", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.grid.editor.EditorClientRpc.class, "confirmBind", new Type[] {new Type(java.lang.Boolean.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.editor.EditorClientRpc.class, "confirmSave", new Type[] {new Type(java.lang.Boolean.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.editor.EditorClientRpc.class, "setErrorMessage", new Type[] {new Type(java.lang.String.class), new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }), });
            store.setParamTypes(com.vaadin.shared.ui.grid.editor.EditorServerRpc.class, "bind", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.editor.EditorServerRpc.class, "cancel", new Type[] {new Type(java.lang.Boolean.class), });
            store.setParamTypes(com.vaadin.shared.ui.grid.editor.EditorServerRpc.class, "save", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.grid.renderers.RendererClickRpc.class, "click", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.gridlayout.GridLayoutServerRpc.class, "layoutClick", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), new Type(com.vaadin.shared.Connector.class), });
            store.setParamTypes(com.vaadin.shared.ui.image.ImageServerRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.loginform.LoginFormRpc.class, "submitCompleted", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.notification.NotificationServerRpc.class, "closed", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutServerRpc.class, "layoutClick", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), new Type(com.vaadin.shared.Connector.class), });
            store.setParamTypes(com.vaadin.shared.ui.panel.PanelServerRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.popupview.PopupViewServerRpc.class, "setPopupVisibility", new Type[] {new Type(java.lang.Boolean.class), });
            store.setParamTypes(com.vaadin.shared.ui.progressindicator.ProgressIndicatorServerRpc.class, "poll", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.richtextarea.RichTextAreaClientRpc.class, "selectAll", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.richtextarea.RichTextAreaServerRpc.class, "setText", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.slider.SliderServerRpc.class, "valueChanged", new Type[] {new Type(java.lang.Double.class), });
            store.setParamTypes(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelRpc.class, "setSplitterPosition", new Type[] {new Type(java.lang.Float.class), });
            store.setParamTypes(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelRpc.class, "splitterClick", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.tabsheet.TabsheetClientRpc.class, "revertToSharedStateSelection", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.tabsheet.TabsheetServerRpc.class, "closeTab", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.tabsheet.TabsheetServerRpc.class, "setSelected", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.textarea.TextAreaServerRpc.class, "setHeight", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.textarea.TextAreaServerRpc.class, "setWidth", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.textfield.AbstractTextFieldClientRpc.class, "selectAll", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.textfield.AbstractTextFieldClientRpc.class, "selectRange", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.textfield.AbstractTextFieldServerRpc.class, "setText", new Type[] {new Type(java.lang.String.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.treegrid.FocusParentRpc.class, "focusParent", new Type[] {new Type(java.lang.String.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.treegrid.FocusRpc.class, "focusCell", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.treegrid.NodeCollapseRpc.class, "setNodeCollapsed", new Type[] {new Type(java.lang.String.class), new Type(java.lang.Integer.class), new Type(java.lang.Boolean.class), new Type(java.lang.Boolean.class), });
            store.setParamTypes(com.vaadin.shared.ui.treegrid.TreeGridClientRpc.class, "clearPendingExpands", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.treegrid.TreeGridClientRpc.class, "setCollapsed", new Type[] {new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }), });
            store.setParamTypes(com.vaadin.shared.ui.treegrid.TreeGridClientRpc.class, "setExpanded", new Type[] {new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }), });
            store.setParamTypes(com.vaadin.shared.ui.treegrid.TreeGridDropTargetRpc.class, "drop", new Type[] {new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }), new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), }), new Type(java.lang.String.class), new Type(java.lang.String.class), new Type(java.lang.Integer.class), new Type(java.lang.Boolean.class), new Type(com.vaadin.shared.ui.grid.DropLocation.class), new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.DebugWindowClientRpc.class, "reportLayoutProblems", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.DebugWindowServerRpc.class, "analyzeLayouts", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.ui.DebugWindowServerRpc.class, "showServerDebugInfo", new Type[] {new Type(com.vaadin.shared.Connector.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.DebugWindowServerRpc.class, "showServerDesign", new Type[] {new Type(com.vaadin.shared.Connector.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.PageClientRpc.class, "initializeMobileHtml5DndPolyfill", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.ui.PageClientRpc.class, "reload", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.ui.ScrollClientRpc.class, "setScrollLeft", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.ScrollClientRpc.class, "setScrollTop", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.UIClientRpc.class, "uiClosed", new Type[] {new Type(java.lang.Boolean.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.UIServerRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.UIServerRpc.class, "poll", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.ui.UIServerRpc.class, "popstate", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.UIServerRpc.class, "resize", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.UIServerRpc.class, "scroll", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.upload.UploadClientRpc.class, "submitUpload", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.upload.UploadServerRpc.class, "change", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.upload.UploadServerRpc.class, "poll", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.window.WindowServerRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.window.WindowServerRpc.class, "windowModeChanged", new Type[] {new Type(com.vaadin.shared.ui.window.WindowMode.class), });
            store.setParamTypes(com.vaadin.shared.ui.window.WindowServerRpc.class, "windowMoved", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(fi.jasoft.simplecalendar.shared.DateValueChangeRpc.class, "selected", new Type[] {new Type("java.util.Set", new Type[] {new Type(java.util.Date.class), }), });
            store.setParamTypes(org.vaadin.addon.calendar.client.CalendarClientRpc.class, "scroll", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(org.vaadin.addon.calendar.client.CalendarServerRpc.class, "actionOnEmptyCell", new Type[] {new Type(java.lang.String.class), new Type(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class), new Type(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class), });
            store.setParamTypes(org.vaadin.addon.calendar.client.CalendarServerRpc.class, "actionOnItem", new Type[] {new Type(java.lang.String.class), new Type(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class), new Type(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(org.vaadin.addon.calendar.client.CalendarServerRpc.class, "backward", new Type[] {});
            store.setParamTypes(org.vaadin.addon.calendar.client.CalendarServerRpc.class, "dateClick", new Type[] {new Type(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class), });
            store.setParamTypes(org.vaadin.addon.calendar.client.CalendarServerRpc.class, "forward", new Type[] {});
            store.setParamTypes(org.vaadin.addon.calendar.client.CalendarServerRpc.class, "itemClick", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(org.vaadin.addon.calendar.client.CalendarServerRpc.class, "itemMove", new Type[] {new Type(java.lang.Integer.class), new Type(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class), });
            store.setParamTypes(org.vaadin.addon.calendar.client.CalendarServerRpc.class, "itemResize", new Type[] {new Type(java.lang.Integer.class), new Type(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class), new Type(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class), });
            store.setParamTypes(org.vaadin.addon.calendar.client.CalendarServerRpc.class, "rangeSelect", new Type[] {new Type(org.vaadin.addon.calendar.client.ui.schedule.SelectionRange.class), });
            store.setParamTypes(org.vaadin.addon.calendar.client.CalendarServerRpc.class, "scroll", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(org.vaadin.addon.calendar.client.CalendarServerRpc.class, "weekClick", new Type[] {new Type(java.lang.String.class), });
            store.setProxyHandler(com.vaadin.shared.ContextClickRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ContextClickRpc() {
                  public void contextClick(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ContextClickRpc.class).getMethod("contextClick"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.communication.FieldRpc.BlurServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.communication.FieldRpc.BlurServerRpc() {
                  public void blur() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.communication.FieldRpc.BlurServerRpc.class).getMethod("blur"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.communication.FieldRpc.FocusAndBlurServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.communication.FieldRpc.FocusAndBlurServerRpc() {
                  public void blur() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.communication.FieldRpc.FocusAndBlurServerRpc.class).getMethod("blur"), new Object [] {});
                  }
                  public void focus() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.communication.FieldRpc.FocusAndBlurServerRpc.class).getMethod("focus"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.communication.FieldRpc.FocusServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.communication.FieldRpc.FocusServerRpc() {
                  public void focus() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.communication.FieldRpc.FocusServerRpc.class).getMethod("focus"), new Object [] {});
                  }
                };
              }
            });
            load5();
          }
          private void load5() {
            store.setProxyHandler(com.vaadin.shared.data.DataRequestRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.data.DataRequestRpc() {
                  public void dropRows(elemental.json.JsonArray p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.data.DataRequestRpc.class).getMethod("dropRows"), new Object [] {p0, });
                  }
                  public void requestRows(int p0, int p1, int p2, int p3) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.data.DataRequestRpc.class).getMethod("requestRows"), new Object [] {p0, p1, p2, p3, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.data.selection.GridMultiSelectServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.data.selection.GridMultiSelectServerRpc() {
                  public void deselect(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.data.selection.GridMultiSelectServerRpc.class).getMethod("deselect"), new Object [] {p0, });
                  }
                  public void deselectAll() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.data.selection.GridMultiSelectServerRpc.class).getMethod("deselectAll"), new Object [] {});
                  }
                  public void select(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.data.selection.GridMultiSelectServerRpc.class).getMethod("select"), new Object [] {p0, });
                  }
                  public void selectAll() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.data.selection.GridMultiSelectServerRpc.class).getMethod("selectAll"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.data.selection.MultiSelectServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.data.selection.MultiSelectServerRpc() {
                  public void updateSelection(java.util.Set p0, java.util.Set p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.data.selection.MultiSelectServerRpc.class).getMethod("updateSelection"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.data.selection.SelectionServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.data.selection.SelectionServerRpc() {
                  public void deselect(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.data.selection.SelectionServerRpc.class).getMethod("deselect"), new Object [] {p0, });
                  }
                  public void select(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.data.selection.SelectionServerRpc.class).getMethod("select"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.ClickRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.ClickRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ClickRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.LayoutClickRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.LayoutClickRpc() {
                  public void layoutClick(com.vaadin.shared.MouseEventDetails p0, com.vaadin.shared.Connector p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.LayoutClickRpc.class).getMethod("layoutClick"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.WindowOrderRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.WindowOrderRpc() {
                  public void windowOrderChanged(java.util.Map p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.WindowOrderRpc.class).getMethod("windowOrderChanged"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutServerRpc() {
                  public void layoutClick(com.vaadin.shared.MouseEventDetails p0, com.vaadin.shared.Connector p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutServerRpc.class).getMethod("layoutClick"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.button.ButtonServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.button.ButtonServerRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.button.ButtonServerRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                  public void disableOnClick() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.button.ButtonServerRpc.class).getMethod("disableOnClick"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.checkbox.CheckBoxServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.checkbox.CheckBoxServerRpc() {
                  public void setChecked(boolean p0, com.vaadin.shared.MouseEventDetails p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.checkbox.CheckBoxServerRpc.class).getMethod("setChecked"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.colorpicker.ColorPickerGradientServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.colorpicker.ColorPickerGradientServerRpc() {
                  public void select(int p0, int p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientServerRpc.class).getMethod("select"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.colorpicker.ColorPickerGridServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.colorpicker.ColorPickerGridServerRpc() {
                  public void refresh() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.colorpicker.ColorPickerGridServerRpc.class).getMethod("refresh"), new Object [] {});
                  }
                  public void select(int p0, int p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.colorpicker.ColorPickerGridServerRpc.class).getMethod("select"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.colorpicker.ColorPickerServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.colorpicker.ColorPickerServerRpc() {
                  public void openPopup(boolean p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.colorpicker.ColorPickerServerRpc.class).getMethod("openPopup"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.combobox.ComboBoxServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.combobox.ComboBoxServerRpc() {
                  public void createNewItem(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.combobox.ComboBoxServerRpc.class).getMethod("createNewItem"), new Object [] {p0, });
                  }
                  public void setFilter(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.combobox.ComboBoxServerRpc.class).getMethod("setFilter"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.csslayout.CssLayoutServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.csslayout.CssLayoutServerRpc() {
                  public void layoutClick(com.vaadin.shared.MouseEventDetails p0, com.vaadin.shared.Connector p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.csslayout.CssLayoutServerRpc.class).getMethod("layoutClick"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.datefield.AbstractDateFieldServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.datefield.AbstractDateFieldServerRpc() {
                  public void blur() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.datefield.AbstractDateFieldServerRpc.class).getMethod("blur"), new Object [] {});
                  }
                  public void focus() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.datefield.AbstractDateFieldServerRpc.class).getMethod("focus"), new Object [] {});
                  }
                  public void update(java.lang.String p0, java.util.Map p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.datefield.AbstractDateFieldServerRpc.class).getMethod("update"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.dnd.DragSourceRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.dnd.DragSourceRpc() {
                  public void dragEnd(com.vaadin.shared.ui.dnd.DropEffect p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.dnd.DragSourceRpc.class).getMethod("dragEnd"), new Object [] {p0, });
                  }
                  public void dragStart() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.dnd.DragSourceRpc.class).getMethod("dragStart"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.dnd.DropTargetRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.dnd.DropTargetRpc() {
                  public void drop(java.util.List p0, java.util.Map p1, java.lang.String p2, com.vaadin.shared.MouseEventDetails p3) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.dnd.DropTargetRpc.class).getMethod("drop"), new Object [] {p0, p1, p2, p3, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.dnd.FileDropTargetRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.dnd.FileDropTargetRpc() {
                  public void drop(java.util.Map p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.dnd.FileDropTargetRpc.class).getMethod("drop"), new Object [] {p0, });
                  }
                  public void poll() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.dnd.FileDropTargetRpc.class).getMethod("poll"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.draganddropwrapper.DragAndDropWrapperServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.draganddropwrapper.DragAndDropWrapperServerRpc() {
                  public void poll() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.draganddropwrapper.DragAndDropWrapperServerRpc.class).getMethod("poll"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.embedded.EmbeddedServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.embedded.EmbeddedServerRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.embedded.EmbeddedServerRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.grid.GridDragSourceRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.grid.GridDragSourceRpc() {
                  public void dragEnd(com.vaadin.shared.ui.dnd.DropEffect p0, java.util.List p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.GridDragSourceRpc.class).getMethod("dragEnd"), new Object [] {p0, p1, });
                  }
                  public void dragStart(java.util.List p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.GridDragSourceRpc.class).getMethod("dragStart"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.grid.GridDropTargetRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.grid.GridDropTargetRpc() {
                  public void drop(java.util.List p0, java.util.Map p1, java.lang.String p2, java.lang.String p3, com.vaadin.shared.ui.grid.DropLocation p4, com.vaadin.shared.MouseEventDetails p5) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.GridDropTargetRpc.class).getMethod("drop"), new Object [] {p0, p1, p2, p3, p4, p5, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.grid.GridServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.grid.GridServerRpc() {
                  public void columnResized(java.lang.String p0, double p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.GridServerRpc.class).getMethod("columnResized"), new Object [] {p0, p1, });
                  }
                  public void columnVisibilityChanged(java.lang.String p0, boolean p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.GridServerRpc.class).getMethod("columnVisibilityChanged"), new Object [] {p0, p1, });
                  }
                  public void columnsReordered(java.util.List p0, java.util.List p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.GridServerRpc.class).getMethod("columnsReordered"), new Object [] {p0, p1, });
                  }
                  public void contextClick(int p0, java.lang.String p1, java.lang.String p2, com.vaadin.shared.ui.grid.GridConstants.Section p3, com.vaadin.shared.MouseEventDetails p4) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.GridServerRpc.class).getMethod("contextClick"), new Object [] {p0, p1, p2, p3, p4, });
                  }
                  public void itemClick(java.lang.String p0, java.lang.String p1, com.vaadin.shared.MouseEventDetails p2) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.GridServerRpc.class).getMethod("itemClick"), new Object [] {p0, p1, p2, });
                  }
                  public void sort(java.lang.String[] p0, com.vaadin.shared.data.sort.SortDirection[] p1, boolean p2) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.GridServerRpc.class).getMethod("sort"), new Object [] {p0, p1, p2, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.grid.editor.EditorServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.grid.editor.EditorServerRpc() {
                  public void bind(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.editor.EditorServerRpc.class).getMethod("bind"), new Object [] {p0, });
                  }
                  public void cancel(boolean p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.editor.EditorServerRpc.class).getMethod("cancel"), new Object [] {p0, });
                  }
                  public void save() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.editor.EditorServerRpc.class).getMethod("save"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.grid.renderers.RendererClickRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.grid.renderers.RendererClickRpc() {
                  public void click(java.lang.String p0, java.lang.String p1, com.vaadin.shared.MouseEventDetails p2) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.grid.renderers.RendererClickRpc.class).getMethod("click"), new Object [] {p0, p1, p2, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.gridlayout.GridLayoutServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.gridlayout.GridLayoutServerRpc() {
                  public void layoutClick(com.vaadin.shared.MouseEventDetails p0, com.vaadin.shared.Connector p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.gridlayout.GridLayoutServerRpc.class).getMethod("layoutClick"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.image.ImageServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.image.ImageServerRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.image.ImageServerRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.loginform.LoginFormRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.loginform.LoginFormRpc() {
                  public void submitCompleted() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.loginform.LoginFormRpc.class).getMethod("submitCompleted"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.notification.NotificationServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.notification.NotificationServerRpc() {
                  public void closed() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.notification.NotificationServerRpc.class).getMethod("closed"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutServerRpc() {
                  public void layoutClick(com.vaadin.shared.MouseEventDetails p0, com.vaadin.shared.Connector p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutServerRpc.class).getMethod("layoutClick"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.panel.PanelServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.panel.PanelServerRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.panel.PanelServerRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.popupview.PopupViewServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.popupview.PopupViewServerRpc() {
                  public void setPopupVisibility(boolean p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.popupview.PopupViewServerRpc.class).getMethod("setPopupVisibility"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.progressindicator.ProgressIndicatorServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.progressindicator.ProgressIndicatorServerRpc() {
                  public void poll() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorServerRpc.class).getMethod("poll"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.richtextarea.RichTextAreaServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.richtextarea.RichTextAreaServerRpc() {
                  public void setText(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.richtextarea.RichTextAreaServerRpc.class).getMethod("setText"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.slider.SliderServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.slider.SliderServerRpc() {
                  public void valueChanged(double p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.slider.SliderServerRpc.class).getMethod("valueChanged"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.splitpanel.AbstractSplitPanelRpc() {
                  public void setSplitterPosition(float p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelRpc.class).getMethod("setSplitterPosition"), new Object [] {p0, });
                  }
                  public void splitterClick(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelRpc.class).getMethod("splitterClick"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.tabsheet.TabsheetServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.tabsheet.TabsheetServerRpc() {
                  public void closeTab(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.tabsheet.TabsheetServerRpc.class).getMethod("closeTab"), new Object [] {p0, });
                  }
                  public void setSelected(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.tabsheet.TabsheetServerRpc.class).getMethod("setSelected"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.textarea.TextAreaServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.textarea.TextAreaServerRpc() {
                  public void setHeight(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.textarea.TextAreaServerRpc.class).getMethod("setHeight"), new Object [] {p0, });
                  }
                  public void setWidth(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.textarea.TextAreaServerRpc.class).getMethod("setWidth"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.textfield.AbstractTextFieldServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.textfield.AbstractTextFieldServerRpc() {
                  public void setText(java.lang.String p0, int p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.textfield.AbstractTextFieldServerRpc.class).getMethod("setText"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.treegrid.FocusParentRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.treegrid.FocusParentRpc() {
                  public void focusParent(java.lang.String p0, int p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.treegrid.FocusParentRpc.class).getMethod("focusParent"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.treegrid.NodeCollapseRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.treegrid.NodeCollapseRpc() {
                  public void setNodeCollapsed(java.lang.String p0, int p1, boolean p2, boolean p3) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.treegrid.NodeCollapseRpc.class).getMethod("setNodeCollapsed"), new Object [] {p0, p1, p2, p3, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.treegrid.TreeGridDropTargetRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.treegrid.TreeGridDropTargetRpc() {
                  public void drop(java.util.List p0, java.util.Map p1, java.lang.String p2, java.lang.String p3, java.lang.Integer p4, java.lang.Boolean p5, com.vaadin.shared.ui.grid.DropLocation p6, com.vaadin.shared.MouseEventDetails p7) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.treegrid.TreeGridDropTargetRpc.class).getMethod("drop"), new Object [] {p0, p1, p2, p3, p4, p5, p6, p7, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.ui.DebugWindowServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.ui.DebugWindowServerRpc() {
                  public void analyzeLayouts() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ui.DebugWindowServerRpc.class).getMethod("analyzeLayouts"), new Object [] {});
                  }
                  public void showServerDebugInfo(com.vaadin.shared.Connector p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ui.DebugWindowServerRpc.class).getMethod("showServerDebugInfo"), new Object [] {p0, });
                  }
                  public void showServerDesign(com.vaadin.shared.Connector p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ui.DebugWindowServerRpc.class).getMethod("showServerDesign"), new Object [] {p0, });
                  }
                };
              }
            });
            load6();
          }
          private void load6() {
            store.setProxyHandler(com.vaadin.shared.ui.ui.UIServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.ui.UIServerRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ui.UIServerRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                  public void poll() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ui.UIServerRpc.class).getMethod("poll"), new Object [] {});
                  }
                  public void popstate(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ui.UIServerRpc.class).getMethod("popstate"), new Object [] {p0, });
                  }
                  public void resize(int p0, int p1, int p2, int p3) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ui.UIServerRpc.class).getMethod("resize"), new Object [] {p0, p1, p2, p3, });
                  }
                  public void scroll(int p0, int p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ui.UIServerRpc.class).getMethod("scroll"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.upload.UploadServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.upload.UploadServerRpc() {
                  public void change(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.upload.UploadServerRpc.class).getMethod("change"), new Object [] {p0, });
                  }
                  public void poll() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.upload.UploadServerRpc.class).getMethod("poll"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.window.WindowServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.window.WindowServerRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.window.WindowServerRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                  public void windowModeChanged(com.vaadin.shared.ui.window.WindowMode p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.window.WindowServerRpc.class).getMethod("windowModeChanged"), new Object [] {p0, });
                  }
                  public void windowMoved(int p0, int p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.window.WindowServerRpc.class).getMethod("windowMoved"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(fi.jasoft.simplecalendar.shared.DateValueChangeRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new fi.jasoft.simplecalendar.shared.DateValueChangeRpc() {
                  public void selected(java.util.Set p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(fi.jasoft.simplecalendar.shared.DateValueChangeRpc.class).getMethod("selected"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(org.vaadin.addon.calendar.client.CalendarServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new org.vaadin.addon.calendar.client.CalendarServerRpc() {
                  public void actionOnEmptyCell(java.lang.String p0, org.vaadin.addon.calendar.client.ui.schedule.CalDate p1, org.vaadin.addon.calendar.client.ui.schedule.CalDate p2) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(org.vaadin.addon.calendar.client.CalendarServerRpc.class).getMethod("actionOnEmptyCell"), new Object [] {p0, p1, p2, });
                  }
                  public void actionOnItem(java.lang.String p0, org.vaadin.addon.calendar.client.ui.schedule.CalDate p1, org.vaadin.addon.calendar.client.ui.schedule.CalDate p2, int p3) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(org.vaadin.addon.calendar.client.CalendarServerRpc.class).getMethod("actionOnItem"), new Object [] {p0, p1, p2, p3, });
                  }
                  public void backward() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(org.vaadin.addon.calendar.client.CalendarServerRpc.class).getMethod("backward"), new Object [] {});
                  }
                  public void dateClick(org.vaadin.addon.calendar.client.ui.schedule.CalDate p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(org.vaadin.addon.calendar.client.CalendarServerRpc.class).getMethod("dateClick"), new Object [] {p0, });
                  }
                  public void forward() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(org.vaadin.addon.calendar.client.CalendarServerRpc.class).getMethod("forward"), new Object [] {});
                  }
                  public void itemClick(int p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(org.vaadin.addon.calendar.client.CalendarServerRpc.class).getMethod("itemClick"), new Object [] {p0, });
                  }
                  public void itemMove(int p0, org.vaadin.addon.calendar.client.ui.schedule.CalDate p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(org.vaadin.addon.calendar.client.CalendarServerRpc.class).getMethod("itemMove"), new Object [] {p0, p1, });
                  }
                  public void itemResize(int p0, org.vaadin.addon.calendar.client.ui.schedule.CalDate p1, org.vaadin.addon.calendar.client.ui.schedule.CalDate p2) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(org.vaadin.addon.calendar.client.CalendarServerRpc.class).getMethod("itemResize"), new Object [] {p0, p1, p2, });
                  }
                  public void rangeSelect(org.vaadin.addon.calendar.client.ui.schedule.SelectionRange p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(org.vaadin.addon.calendar.client.CalendarServerRpc.class).getMethod("rangeSelect"), new Object [] {p0, });
                  }
                  public void scroll(int p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(org.vaadin.addon.calendar.client.CalendarServerRpc.class).getMethod("scroll"), new Object [] {p0, });
                  }
                  public void weekClick(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(org.vaadin.addon.calendar.client.CalendarServerRpc.class).getMethod("weekClick"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setMethodAttribute(com.vaadin.shared.data.DataProviderRpc.class, "insertRowData", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LAYOUT);
            store.setMethodAttribute(com.vaadin.shared.data.DataProviderRpc.class, "removeRowData", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LAYOUT);
            store.setMethodAttribute(com.vaadin.shared.data.DataProviderRpc.class, "setRowData", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LAYOUT);
            store.setMethodAttribute(com.vaadin.shared.data.DataProviderRpc.class, "updateRowData", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LAYOUT);
            store.setMethodAttribute(com.vaadin.shared.data.DataRequestRpc.class, "dropRows", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.DELAYED);
            store.setMethodAttribute(com.vaadin.shared.data.DataRequestRpc.class, "dropRows", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LOADING_INDICATOR);
            store.setMethodAttribute(com.vaadin.shared.data.DataRequestRpc.class, "requestRows", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LOADING_INDICATOR);
            store.setMethodAttribute(com.vaadin.shared.ui.MediaControl.class, "pause", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LAYOUT);
            store.setMethodAttribute(com.vaadin.shared.ui.MediaControl.class, "play", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LAYOUT);
            store.setMethodAttribute(com.vaadin.shared.ui.checkbox.CheckBoxServerRpc.class, "setChecked", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.DELAYED);
            store.setMethodAttribute(com.vaadin.shared.ui.progressindicator.ProgressIndicatorServerRpc.class, "poll", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LOADING_INDICATOR);
            store.setMethodAttribute(com.vaadin.shared.ui.ui.ScrollClientRpc.class, "setScrollLeft", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LAYOUT);
            store.setMethodAttribute(com.vaadin.shared.ui.ui.ScrollClientRpc.class, "setScrollTop", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LAYOUT);
            store.setMethodAttribute(com.vaadin.shared.ui.ui.UIServerRpc.class, "poll", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.DELAYED);
            store.setMethodAttribute(com.vaadin.shared.ui.ui.UIServerRpc.class, "poll", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.LAST_ONLY);
            store.setMethodAttribute(com.vaadin.shared.ui.ui.UIServerRpc.class, "poll", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.NO_LOADING_INDICATOR);
            store.setMethodAttribute(com.vaadin.shared.ui.ui.UIServerRpc.class, "resize", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.DELAYED);
            store.setMethodAttribute(com.vaadin.shared.ui.ui.UIServerRpc.class, "resize", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.LAST_ONLY);
            store.setMethodAttribute(com.vaadin.shared.ui.ui.UIServerRpc.class, "scroll", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.DELAYED);
            store.setMethodAttribute(com.vaadin.shared.ui.ui.UIServerRpc.class, "scroll", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.LAST_ONLY);
            store.setMethodAttribute(org.vaadin.addon.calendar.client.CalendarServerRpc.class, "scroll", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.DELAYED);
            store.setMethodAttribute(org.vaadin.addon.calendar.client.CalendarServerRpc.class, "scroll", com.vaadin.client.metadata.TypeDataStore.MethodAttribute.LAST_ONLY);
            loadJsBundle(store);
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "alignment", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class, "alignmentBitmask", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.MultiSelectionModelState.class, "allSelected", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "allowNewItems", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "altKey", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "altText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "altText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractEmbeddedState.class, "alternateText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.PushConfigurationState.class, "alwaysUseXhrForServerRequests", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "am", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "archive", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "archive", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.ColumnState.class, "assistiveCaption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "assistivePostfix", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "assistivePrefix", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "assistiveTabStop", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "assistiveTabStopBottomText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "assistiveTabStopTopText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "autoplay", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "bodyRowHeight", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.editor.EditorState.class, "buffered", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "button", new Type(com.vaadin.shared.MouseEventDetails.MouseButton.class));
            store.setPropertyType(com.vaadin.shared.JavaScriptExtensionState.class, "callbackNames", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.JavaScriptComponentState.class, "callbackNames", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.grid.editor.EditorState.class, "cancelCaption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.ColumnState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.notification.NotificationState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "captionAsHtml", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.SectionState.RowState.class, "cellGroups", new Type("java.util.Map", new Type[] {new Type(com.vaadin.shared.ui.grid.SectionState.CellState.class), new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }), }));
            store.setPropertyType(com.vaadin.shared.ui.grid.SectionState.RowState.class, "cells", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.ui.grid.SectionState.CellState.class), }));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "centered", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "checked", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "childCss", new Type("java.util.Map", new Type[] {new Type(com.vaadin.shared.Connector.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "childData", new Type("java.util.Map", new Type[] {new Type(com.vaadin.shared.Connector.class), new Type(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class), }));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "childData", new Type("java.util.HashMap", new Type[] {new Type(com.vaadin.shared.Connector.class), new Type(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class), }));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "childLocations", new Type("java.util.Map", new Type[] {new Type(com.vaadin.shared.Connector.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "classId", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "classId", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "clickShortcutKeyCode", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "clientX", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "clientY", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "closable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "closable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState.class, "closeTimeout", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "codebase", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "codebase", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "codetype", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "codetype", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "colExpand", new Type(float[].class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "column1", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "column2", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.editor.EditorState.class, "columnFields", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.grid.SectionState.CellState.class, "columnId", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "columnOrder", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "columnReorderingAllowed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "columnResizeMode", new Type(com.vaadin.shared.ui.grid.ColumnResizeMode.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "columns", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "componentError", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "componentErrorLevel", new Type(com.vaadin.shared.ui.ErrorLevel.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.SectionState.CellState.class, "connector", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "connectorToCssPosition", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "contentDescription", new Type(com.vaadin.shared.Connector[].class));
            store.setPropertyType(com.vaadin.shared.ui.label.LabelState.class, "contentMode", new Type(com.vaadin.shared.ui.ContentMode.class));
            store.setPropertyType(com.vaadin.shared.ui.dnd.DropTargetState.class, "criteria", new Type("java.util.List", new Type[] {new Type(com.vaadin.shared.ui.dnd.criteria.Criterion.class), }));
            store.setPropertyType(com.vaadin.shared.ui.dnd.DropTargetState.class, "criteriaMatch", new Type(com.vaadin.shared.ui.dnd.criteria.Criterion.Match.class));
            store.setPropertyType(com.vaadin.shared.ui.dnd.DropTargetState.class, "criteriaScript", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "ctrlKey", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "currentFilterText", new Type(java.lang.String.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class, "d", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.dnd.DragSourceState.class, "data", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "dateFormat", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.AbstractDateFieldState.class, "dateStyles", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "dayNames", new Type(java.lang.String[].class));
            store.setPropertyType(com.vaadin.shared.ui.grid.SectionState.RowState.class, "defaultHeader", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.notification.NotificationState.class, "delay", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.notification.NotificationState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "descriptionContentMode", new Type(com.vaadin.shared.ui.ContentMode.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "descriptionContentMode", new Type(com.vaadin.shared.ui.ContentMode.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.TextualDateFieldState.class, "descriptionForAssistiveDevices", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.SingleSelectionModelState.class, "deselectAllowed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState.class, "dialogGracePeriod", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState.class, "dialogModal", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState.class, "dialogText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState.class, "dialogTextGaveUp", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "disableOnClick", new Type(java.lang.Boolean.class));
            store.setPropertyType(fi.jasoft.simplecalendar.shared.SimpleCalendarState.class, "disabledDates", new Type("java.util.List", new Type[] {new Type(java.util.Date.class), }));
            store.setPropertyType(fi.jasoft.simplecalendar.shared.SimpleCalendarState.class, "disabledMonthdays", new Type("java.util.List", new Type[] {new Type(java.lang.Integer.class), }));
            store.setPropertyType(fi.jasoft.simplecalendar.shared.SimpleCalendarState.class, "disabledWeekdays", new Type("java.util.List", new Type[] {new Type(fi.jasoft.simplecalendar.shared.Weekday.class), }));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "draggable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.dnd.DropTargetState.class, "dropEffect", new Type(com.vaadin.shared.ui.dnd.DropEffect.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridDropTargetState.class, "dropMode", new Type(com.vaadin.shared.ui.grid.DropMode.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridDropTargetState.class, "dropThreshold", new Type(java.lang.Integer.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.ui.schedule.SelectionRange.class, "e", new Type(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.ui.schedule.SelectionRange.class, "eMin", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.ColumnState.class, "editable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.dnd.DragSourceState.class, "effectAllowed", new Type(com.vaadin.shared.ui.dnd.EffectAllowed.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "embedParams", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "emptySelectionAllowed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.nativeselect.NativeSelectState.class, "emptySelectionAllowed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "emptySelectionCaption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.nativeselect.NativeSelectState.class, "emptySelectionCaption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "enableMobileHTML5DnD", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.communication.SharedState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(fi.jasoft.simplecalendar.shared.SimpleCalendarState.class, "endDate", new Type(java.util.Date.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.ui.schedule.SelectionRange.class, "endDay", new Type(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "errorLevel", new Type(com.vaadin.shared.ui.ErrorLevel.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.ColumnState.class, "expandRatio", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class, "expandRatio", new Type(java.lang.Float.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "explicitColRatios", new Type("java.util.Set", new Type[] {new Type(java.lang.Integer.class), }));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "explicitRowRatios", new Type("java.util.Set", new Type[] {new Type(java.lang.Integer.class), }));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "features", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.class, "firstChild", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "firstDayOfWeek", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState.class, "firstDelay", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.customfield.CustomFieldState.class, "focusDelegate", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "footer", new Type(com.vaadin.shared.ui.grid.SectionState.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "footerRowHeight", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.AbstractDateFieldState.class, "format", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "frozenColumnCount", new Type(java.lang.Integer.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.ui.schedule.CalTime.class, "h", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.ColumnState.class, "handleWidgetEvents", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "hasDescriptions", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.PageState.class, "hasResizeListeners", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "header", new Type(com.vaadin.shared.ui.grid.SectionState.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "headerRowHeight", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "heightByRows", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "heightMode", new Type(com.vaadin.shared.ui.grid.HeightMode.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.ColumnState.class, "hidable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.ColumnState.class, "hidden", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "hideEmptyRowsAndColumns", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.popupview.PopupViewState.class, "hideOnMouseOut", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.ColumnState.class, "hidingToggleCaption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.treegrid.TreeGridState.class, "hierarchyColumnId", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "hourMinuteDelimiter", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.SectionState.CellState.class, "html", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.popupview.PopupViewState.class, "html", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "htmlContentAllowed", new Type(java.lang.Boolean.class));
            load7();
          }
          private void load7() {
            store.setPropertyType(com.vaadin.shared.ui.grid.renderers.ButtonRendererState.class, "htmlContentAllowed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.notification.NotificationState.class, "htmlContentAllowed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.CheckBoxGroupState.class, "htmlContentAllowed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.RadioButtonGroupState.class, "htmlContentAllowed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "iconAltText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "iconAltText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.upload.UploadState.class, "immediateMode", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressBarState.class, "indeterminate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.ColumnState.class, "internalId", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "key", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "leftColumnCaption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.AbstractDateFieldState.class, "lenient", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "loadingIndicatorConfiguration", new Type(com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.AbstractDateFieldState.class, "locale", new Type(java.lang.String.class));
            store.setPropertyType(fi.jasoft.simplecalendar.shared.SimpleCalendarState.class, "locale", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleServiceState.class, "localeData", new Type("java.util.List", new Type[] {new Type(com.vaadin.shared.ui.ui.UIState.LocaleData.class), }));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "localeServiceState", new Type(com.vaadin.shared.ui.ui.UIState.LocaleServiceState.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "locked", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.loginform.LoginFormState.class, "loginButtonConnector", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.ui.loginform.LoginFormState.class, "loginResource", new Type(com.vaadin.shared.communication.URLReference.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "loop", new Type(java.lang.Boolean.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class, "m", new Type(java.lang.Integer.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.ui.schedule.CalTime.class, "m", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "marginsBitmask", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "marginsBitmask", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "maxLength", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "maxPosition", new Type(java.lang.Float.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "maxPositionUnit", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "maxValue", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.ColumnState.class, "maxWidth", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState.class, "maxWidth", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "metaKey", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.dnd.FileParameters.class, "mime", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "mimeType", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "minPosition", new Type(java.lang.Float.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "minPositionUnit", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "minValue", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.ColumnState.class, "minWidth", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.ColumnState.class, "minimumWidthFromContent", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "modal", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.tree.TreeRendererState.class, "mode", new Type(com.vaadin.shared.ui.ContentMode.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.PushConfigurationState.class, "mode", new Type(com.vaadin.shared.communication.PushMode.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "monthNames", new Type(java.lang.String[].class));
            store.setPropertyType(fi.jasoft.simplecalendar.shared.SimpleCalendarState.class, "multiselect", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "muted", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.dnd.FileParameters.class, "name", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "name", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "name", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, "names", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "notificationConfigurations", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration.class), }));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration.class, "notificationRole", new Type(com.vaadin.shared.ui.ui.NotificationRole.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState.class, "openDelay", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "orientation", new Type(com.vaadin.shared.ui.slider.SliderOrientation.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "overlayContainerLabel", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "pageLength", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "pageState", new Type(com.vaadin.shared.ui.ui.PageState.class));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "parameters", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "parameters", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.PushConfigurationState.class, "parameters", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.datefield.AbstractDateFieldState.class, "parsable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.loginform.LoginFormState.class, "passwordFieldConnector", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.ui.dnd.DragSourceState.class, "payload", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.ui.dnd.criteria.Payload.class), }));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "placeholder", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.TextualDateFieldState.class, "placeholder", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "placeholder", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "pm", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "pollInterval", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.notification.NotificationState.class, "position", new Type(com.vaadin.shared.Position.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "position", new Type(java.lang.Float.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "positionReversed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "positionUnit", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "positionX", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "positionY", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration.class, "postfix", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration.class, "prefix", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "preload", new Type(com.vaadin.shared.ui.PreloadMode.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "pushConfiguration", new Type(com.vaadin.shared.ui.ui.UIState.PushConfigurationState.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.PushConfigurationState.class, "pushUrl", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState.class, "quickOpenDelay", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState.class, "quickOpenTimeout", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.AbstractDateFieldState.class, "rangeEnd", new Type(java.util.Date.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.AbstractDateFieldState.class, "rangeStart", new Type(java.util.Date.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState.class, "reconnectAttempts", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "reconnectDialogConfiguration", new Type(com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState.class, "reconnectInterval", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.communication.SharedState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "relativeX", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "relativeY", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.ColumnState.class, "renderer", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "required", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.ColumnState.class, "resizable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "resizable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "resizeLazy", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "resolution", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.AbstractDateFieldState.class, "resolutions", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.Integer.class), }));
            store.setPropertyType(com.vaadin.shared.communication.SharedState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "rightColumnCaption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "role", new Type(com.vaadin.shared.ui.window.WindowRole.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "row1", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "row2", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "rowDescriptionContentMode", new Type(com.vaadin.shared.ui.ContentMode.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "rowExpand", new Type(float[].class));
            store.setPropertyType(com.vaadin.shared.ui.grid.SectionState.class, "rows", new Type("java.util.List", new Type[] {new Type(com.vaadin.shared.ui.grid.SectionState.RowState.class), }));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "rows", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.listselect.ListSelectState.class, "rows", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "rows", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "rows", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.JavaScriptExtensionState.class, "rpcInterfaces", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }), }));
            store.setPropertyType(com.vaadin.shared.ui.JavaScriptComponentState.class, "rpcInterfaces", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }), }));
            store.setPropertyType(org.vaadin.addon.calendar.client.ui.schedule.CalTime.class, "s", new Type(java.lang.Integer.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.ui.schedule.SelectionRange.class, "s", new Type(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.ui.schedule.SelectionRange.class, "sMin", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.editor.EditorState.class, "saveCaption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "scrollLeft", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "scrollToSelectedItem", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "scrollTop", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.class, "secondChild", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState.class, "secondDelay", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.MultiSelectionModelState.class, "selectAllCheckBoxVisible", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "selected", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "selectedItemCaption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "selectedItemIcon", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractSingleSelectState.class, "selectedItemKey", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.AbstractSelectionModelState.class, "selectionAllowed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "shiftKey", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "shortDayNames", new Type(java.lang.String[].class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "shortMonthNames", new Type(java.lang.String[].class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "showControls", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.AbstractDateFieldState.class, "showISOWeekNumbers", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.dnd.FileParameters.class, "size", new Type(java.lang.Long.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "sortColumns", new Type(java.lang.String[].class));
            store.setPropertyType(com.vaadin.shared.ui.grid.GridState.class, "sortDirs", new Type(com.vaadin.shared.data.sort.SortDirection[].class));
            store.setPropertyType(com.vaadin.shared.ui.grid.ColumnState.class, "sortable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "sourceTypes", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "sources", new Type("java.util.List", new Type[] {new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "spacing", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "spacing", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.class, "splitterState", new Type(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "standby", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "standby", new Type(java.lang.String.class));
            store.setPropertyType(fi.jasoft.simplecalendar.shared.SimpleCalendarState.class, "startDate", new Type(java.util.Date.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.ui.schedule.SelectionRange.class, "startDay", new Type(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressBarState.class, "state", new Type(java.lang.Float.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.SectionState.CellState.class, "styleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.SectionState.RowState.class, "styleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.notification.NotificationState.class, "styleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "styleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "suggestionPopupWidth", new Type(java.lang.String.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class, "t", new Type(org.vaadin.addon.calendar.client.ui.schedule.CalTime.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "tabCaptionsAsHtml", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.TabIndexState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "tabs", new Type("java.util.List", new Type[] {new Type(com.vaadin.shared.ui.tabsheet.TabState.class), }));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "tabsVisible", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "target", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "target", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "targetBorder", new Type(com.vaadin.shared.ui.BorderStyle.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "targetHeight", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "targetWidth", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "templateContents", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "templateName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.SectionState.CellState.class, "text", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.label.LabelState.class, "text", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "text", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.TextualDateFieldState.class, "textFieldEnabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "textInputAllowed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "theme", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState.class, "thirdDelay", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.AbstractDateFieldState.class, "timeZoneJSON", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.PageState.class, "title", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "tooltipConfiguration", new Type(com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.ColumnState.class, "tooltipContentMode", new Type(com.vaadin.shared.ui.ContentMode.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.LocaleData.class, "twelveHourClock", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "type", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "type", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.SectionState.CellState.class, "type", new Type(com.vaadin.shared.ui.grid.GridStaticCellType.class));
            store.setPropertyType(com.vaadin.shared.ui.dnd.DragSourceState.class, "types", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "uriFragment", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.loginform.LoginFormState.class, "userNameFieldConnector", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "value", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "valueChangeMode", new Type(com.vaadin.shared.ui.ValueChangeMode.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "valueChangeTimeout", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.SectionState.class, "visible", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabState.class, "visible", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.nativeselect.NativeSelectState.class, "visibleItemCount", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.grid.ColumnState.class, "width", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "windowMode", new Type(com.vaadin.shared.ui.window.WindowMode.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "wordWrap", new Type(java.lang.Boolean.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class, "y", new Type(java.lang.Integer.class));
            store.setSerializerFactory(com.vaadin.shared.MouseEventDetails.MouseButton.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.MouseEventDetails.MouseButton>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.MouseEventDetails.MouseButton value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.MouseEventDetails.MouseButton castedValue = (com.vaadin.shared.MouseEventDetails.MouseButton) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.MouseEventDetails.MouseButton deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("LEFT".equals(enumIdentifier)) {
                      return com.vaadin.shared.MouseEventDetails.MouseButton.LEFT;
                    }
                    if ("RIGHT".equals(enumIdentifier)) {
                      return com.vaadin.shared.MouseEventDetails.MouseButton.RIGHT;
                    }
                    if ("MIDDLE".equals(enumIdentifier)) {
                      return com.vaadin.shared.MouseEventDetails.MouseButton.MIDDLE;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.Position.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.Position>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.Position value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.Position castedValue = (com.vaadin.shared.Position) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.Position deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("TOP_LEFT".equals(enumIdentifier)) {
                      return com.vaadin.shared.Position.TOP_LEFT;
                    }
                    if ("TOP_CENTER".equals(enumIdentifier)) {
                      return com.vaadin.shared.Position.TOP_CENTER;
                    }
                    if ("TOP_RIGHT".equals(enumIdentifier)) {
                      return com.vaadin.shared.Position.TOP_RIGHT;
                    }
                    if ("MIDDLE_LEFT".equals(enumIdentifier)) {
                      return com.vaadin.shared.Position.MIDDLE_LEFT;
                    }
                    if ("MIDDLE_CENTER".equals(enumIdentifier)) {
                      return com.vaadin.shared.Position.MIDDLE_CENTER;
                    }
                    if ("MIDDLE_RIGHT".equals(enumIdentifier)) {
                      return com.vaadin.shared.Position.MIDDLE_RIGHT;
                    }
                    if ("BOTTOM_LEFT".equals(enumIdentifier)) {
                      return com.vaadin.shared.Position.BOTTOM_LEFT;
                    }
                    if ("BOTTOM_CENTER".equals(enumIdentifier)) {
                      return com.vaadin.shared.Position.BOTTOM_CENTER;
                    }
                    if ("BOTTOM_RIGHT".equals(enumIdentifier)) {
                      return com.vaadin.shared.Position.BOTTOM_RIGHT;
                    }
                    if ("ASSISTIVE".equals(enumIdentifier)) {
                      return com.vaadin.shared.Position.ASSISTIVE;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.communication.PushMode.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.communication.PushMode>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.communication.PushMode value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.communication.PushMode castedValue = (com.vaadin.shared.communication.PushMode) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.communication.PushMode deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("DISABLED".equals(enumIdentifier)) {
                      return com.vaadin.shared.communication.PushMode.DISABLED;
                    }
                    if ("MANUAL".equals(enumIdentifier)) {
                      return com.vaadin.shared.communication.PushMode.MANUAL;
                    }
                    if ("AUTOMATIC".equals(enumIdentifier)) {
                      return com.vaadin.shared.communication.PushMode.AUTOMATIC;
                    }
                    return null;
                  }
                };
              }
            });
            load8();
          }
          private void load8() {
            store.setSerializerFactory(com.vaadin.shared.communication.URLReference.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.communication.URLReference_Serializer.class);
              }
            });
            store.setSerializerFactory(com.vaadin.shared.data.sort.SortDirection.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.data.sort.SortDirection>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.data.sort.SortDirection value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.data.sort.SortDirection castedValue = (com.vaadin.shared.data.sort.SortDirection) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.data.sort.SortDirection deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("ASCENDING".equals(enumIdentifier)) {
                      return com.vaadin.shared.data.sort.SortDirection.ASCENDING;
                    }
                    if ("DESCENDING".equals(enumIdentifier)) {
                      return com.vaadin.shared.data.sort.SortDirection.DESCENDING;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.BorderStyle.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.BorderStyle>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.BorderStyle value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.BorderStyle castedValue = (com.vaadin.shared.ui.BorderStyle) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.BorderStyle deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("NONE".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.BorderStyle.NONE;
                    }
                    if ("MINIMAL".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.BorderStyle.MINIMAL;
                    }
                    if ("DEFAULT".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.BorderStyle.DEFAULT;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.ContentMode.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.ContentMode>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.ContentMode value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.ContentMode castedValue = (com.vaadin.shared.ui.ContentMode) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.ContentMode deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("TEXT".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.ContentMode.TEXT;
                    }
                    if ("PREFORMATTED".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.ContentMode.PREFORMATTED;
                    }
                    if ("HTML".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.ContentMode.HTML;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.ErrorLevel.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.ErrorLevel>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.ErrorLevel value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.ErrorLevel castedValue = (com.vaadin.shared.ui.ErrorLevel) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.ErrorLevel deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("INFO".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.ErrorLevel.INFO;
                    }
                    if ("WARNING".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.ErrorLevel.WARNING;
                    }
                    if ("ERROR".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.ErrorLevel.ERROR;
                    }
                    if ("CRITICAL".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.ErrorLevel.CRITICAL;
                    }
                    if ("SYSTEM".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.ErrorLevel.SYSTEM;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.PreloadMode.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.PreloadMode>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.PreloadMode value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.PreloadMode castedValue = (com.vaadin.shared.ui.PreloadMode) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.PreloadMode deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("AUTO".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.PreloadMode.AUTO;
                    }
                    if ("METADATA".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.PreloadMode.METADATA;
                    }
                    if ("NONE".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.PreloadMode.NONE;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.ValueChangeMode.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.ValueChangeMode>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.ValueChangeMode value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.ValueChangeMode castedValue = (com.vaadin.shared.ui.ValueChangeMode) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.ValueChangeMode deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("BLUR".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.ValueChangeMode.BLUR;
                    }
                    if ("EAGER".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.ValueChangeMode.EAGER;
                    }
                    if ("TIMEOUT".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.ValueChangeMode.TIMEOUT;
                    }
                    if ("LAZY".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.ValueChangeMode.LAZY;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.dnd.DropEffect.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.dnd.DropEffect>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.dnd.DropEffect value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.dnd.DropEffect castedValue = (com.vaadin.shared.ui.dnd.DropEffect) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.dnd.DropEffect deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("COPY".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.dnd.DropEffect.COPY;
                    }
                    if ("MOVE".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.dnd.DropEffect.MOVE;
                    }
                    if ("LINK".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.dnd.DropEffect.LINK;
                    }
                    if ("NONE".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.dnd.DropEffect.NONE;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.dnd.EffectAllowed.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.dnd.EffectAllowed>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.dnd.EffectAllowed value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.dnd.EffectAllowed castedValue = (com.vaadin.shared.ui.dnd.EffectAllowed) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.dnd.EffectAllowed deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("NONE".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.dnd.EffectAllowed.NONE;
                    }
                    if ("COPY".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.dnd.EffectAllowed.COPY;
                    }
                    if ("MOVE".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.dnd.EffectAllowed.MOVE;
                    }
                    if ("LINK".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.dnd.EffectAllowed.LINK;
                    }
                    if ("COPY_MOVE".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.dnd.EffectAllowed.COPY_MOVE;
                    }
                    if ("COPY_LINK".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.dnd.EffectAllowed.COPY_LINK;
                    }
                    if ("LINK_MOVE".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.dnd.EffectAllowed.LINK_MOVE;
                    }
                    if ("ALL".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.dnd.EffectAllowed.ALL;
                    }
                    if ("UNINITIALIZED".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.dnd.EffectAllowed.UNINITIALIZED;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.dnd.criteria.Criterion.Match.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.dnd.criteria.Criterion.Match>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.dnd.criteria.Criterion.Match value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.dnd.criteria.Criterion.Match castedValue = (com.vaadin.shared.ui.dnd.criteria.Criterion.Match) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.dnd.criteria.Criterion.Match deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("ANY".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.dnd.criteria.Criterion.Match.ANY;
                    }
                    if ("ALL".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.dnd.criteria.Criterion.Match.ALL;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.grid.ColumnResizeMode.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.grid.ColumnResizeMode>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.grid.ColumnResizeMode value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.grid.ColumnResizeMode castedValue = (com.vaadin.shared.ui.grid.ColumnResizeMode) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.grid.ColumnResizeMode deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("ANIMATED".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.ColumnResizeMode.ANIMATED;
                    }
                    if ("SIMPLE".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.ColumnResizeMode.SIMPLE;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.grid.DropLocation.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.grid.DropLocation>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.grid.DropLocation value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.grid.DropLocation castedValue = (com.vaadin.shared.ui.grid.DropLocation) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.grid.DropLocation deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("ON_TOP".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.DropLocation.ON_TOP;
                    }
                    if ("ABOVE".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.DropLocation.ABOVE;
                    }
                    if ("BELOW".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.DropLocation.BELOW;
                    }
                    if ("EMPTY".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.DropLocation.EMPTY;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.grid.DropMode.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.grid.DropMode>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.grid.DropMode value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.grid.DropMode castedValue = (com.vaadin.shared.ui.grid.DropMode) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.grid.DropMode deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("BETWEEN".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.DropMode.BETWEEN;
                    }
                    if ("ON_TOP".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.DropMode.ON_TOP;
                    }
                    if ("ON_TOP_OR_BETWEEN".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.DropMode.ON_TOP_OR_BETWEEN;
                    }
                    if ("ON_GRID".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.DropMode.ON_GRID;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.grid.GridConstants.Section.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.grid.GridConstants.Section>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.grid.GridConstants.Section value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.grid.GridConstants.Section castedValue = (com.vaadin.shared.ui.grid.GridConstants.Section) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.grid.GridConstants.Section deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("HEADER".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.GridConstants.Section.HEADER;
                    }
                    if ("BODY".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.GridConstants.Section.BODY;
                    }
                    if ("FOOTER".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.GridConstants.Section.FOOTER;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.grid.GridStaticCellType.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.grid.GridStaticCellType>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.grid.GridStaticCellType value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.grid.GridStaticCellType castedValue = (com.vaadin.shared.ui.grid.GridStaticCellType) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.grid.GridStaticCellType deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("TEXT".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.GridStaticCellType.TEXT;
                    }
                    if ("HTML".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.GridStaticCellType.HTML;
                    }
                    if ("WIDGET".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.GridStaticCellType.WIDGET;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.grid.HeightMode.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.grid.HeightMode>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.grid.HeightMode value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.grid.HeightMode castedValue = (com.vaadin.shared.ui.grid.HeightMode) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.grid.HeightMode deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("CSS".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.HeightMode.CSS;
                    }
                    if ("ROW".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.HeightMode.ROW;
                    }
                    if ("UNDEFINED".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.HeightMode.UNDEFINED;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.grid.ScrollDestination.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.grid.ScrollDestination>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.grid.ScrollDestination value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.grid.ScrollDestination castedValue = (com.vaadin.shared.ui.grid.ScrollDestination) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.grid.ScrollDestination deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("ANY".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.ScrollDestination.ANY;
                    }
                    if ("START".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.ScrollDestination.START;
                    }
                    if ("MIDDLE".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.ScrollDestination.MIDDLE;
                    }
                    if ("END".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.grid.ScrollDestination.END;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.slider.SliderOrientation.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.slider.SliderOrientation>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.slider.SliderOrientation value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.slider.SliderOrientation castedValue = (com.vaadin.shared.ui.slider.SliderOrientation) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.slider.SliderOrientation deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("HORIZONTAL".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.slider.SliderOrientation.HORIZONTAL;
                    }
                    if ("VERTICAL".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.slider.SliderOrientation.VERTICAL;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.ui.NotificationRole.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.ui.NotificationRole>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.ui.NotificationRole value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.ui.NotificationRole castedValue = (com.vaadin.shared.ui.ui.NotificationRole) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.ui.NotificationRole deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("ALERT".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.ui.NotificationRole.ALERT;
                    }
                    if ("STATUS".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.ui.NotificationRole.STATUS;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.window.WindowMode.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.window.WindowMode>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.window.WindowMode value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.window.WindowMode castedValue = (com.vaadin.shared.ui.window.WindowMode) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.window.WindowMode deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("NORMAL".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.window.WindowMode.NORMAL;
                    }
                    if ("MAXIMIZED".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.window.WindowMode.MAXIMIZED;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.window.WindowRole.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.window.WindowRole>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.ui.window.WindowRole value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.window.WindowRole castedValue = (com.vaadin.shared.ui.window.WindowRole) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public com.vaadin.shared.ui.window.WindowRole deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("ALERTDIALOG".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.window.WindowRole.ALERTDIALOG;
                    }
                    if ("DIALOG".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.window.WindowRole.DIALOG;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(fi.jasoft.simplecalendar.shared.Weekday.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<fi.jasoft.simplecalendar.shared.Weekday>() {
                  public elemental.json.JsonValue serialize(fi.jasoft.simplecalendar.shared.Weekday value, com.vaadin.client.ApplicationConnection connection) {
                    fi.jasoft.simplecalendar.shared.Weekday castedValue = (fi.jasoft.simplecalendar.shared.Weekday) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public fi.jasoft.simplecalendar.shared.Weekday deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("SUNDAY".equals(enumIdentifier)) {
                      return fi.jasoft.simplecalendar.shared.Weekday.SUNDAY;
                    }
                    if ("MONDAY".equals(enumIdentifier)) {
                      return fi.jasoft.simplecalendar.shared.Weekday.MONDAY;
                    }
                    if ("TUESDAY".equals(enumIdentifier)) {
                      return fi.jasoft.simplecalendar.shared.Weekday.TUESDAY;
                    }
                    if ("WEDNESDAY".equals(enumIdentifier)) {
                      return fi.jasoft.simplecalendar.shared.Weekday.WEDNESDAY;
                    }
                    if ("THURSDAY".equals(enumIdentifier)) {
                      return fi.jasoft.simplecalendar.shared.Weekday.THURSDAY;
                    }
                    if ("FRIDAY".equals(enumIdentifier)) {
                      return fi.jasoft.simplecalendar.shared.Weekday.FRIDAY;
                    }
                    if ("SATURDAY".equals(enumIdentifier)) {
                      return fi.jasoft.simplecalendar.shared.Weekday.SATURDAY;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(java.util.Date.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.communication.Date_Serializer.class);
              }
            });
            store.setSerializerFactory(com.vaadin.shared.Connector[].class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.Connector[]>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.Connector[] value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.Connector[] castedValue = (com.vaadin.shared.Connector[]) value;
                    elemental.json.JsonArray values = elemental.json.Json.createArray();
                    for (int i = 0; i < castedValue.length; i++) {
                      values.set(i, com.vaadin.client.communication.JsonEncoder.encode(castedValue[i],new Type(com.vaadin.shared.Connector.class), connection));
                    }
                    return values;
                  }
                  public com.vaadin.shared.Connector[] deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    elemental.json.JsonArray jsonArray = (elemental.json.JsonArray)jsonValue;
                    com.vaadin.shared.Connector[] value = new com.vaadin.shared.Connector[jsonArray.length()];
                    for (int i = 0 ; i < value.length; i++) {
                      value[i] = (com.vaadin.shared.Connector) com.vaadin.client.communication.JsonDecoder.decodeValue(new Type(com.vaadin.shared.Connector.class), jsonArray.get(i), null, connection);
                    }
                    return value;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.data.sort.SortDirection[].class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.data.sort.SortDirection[]>() {
                  public elemental.json.JsonValue serialize(com.vaadin.shared.data.sort.SortDirection[] value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.data.sort.SortDirection[] castedValue = (com.vaadin.shared.data.sort.SortDirection[]) value;
                    elemental.json.JsonArray values = elemental.json.Json.createArray();
                    for (int i = 0; i < castedValue.length; i++) {
                      values.set(i, com.vaadin.client.communication.JsonEncoder.encode(castedValue[i],new Type(com.vaadin.shared.data.sort.SortDirection.class), connection));
                    }
                    return values;
                  }
                  public com.vaadin.shared.data.sort.SortDirection[] deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    elemental.json.JsonArray jsonArray = (elemental.json.JsonArray)jsonValue;
                    com.vaadin.shared.data.sort.SortDirection[] value = new com.vaadin.shared.data.sort.SortDirection[jsonArray.length()];
                    for (int i = 0 ; i < value.length; i++) {
                      value[i] = (com.vaadin.shared.data.sort.SortDirection) com.vaadin.client.communication.JsonDecoder.decodeValue(new Type(com.vaadin.shared.data.sort.SortDirection.class), jsonArray.get(i), null, connection);
                    }
                    return value;
                  }
                };
              }
            });
            store.setSerializerFactory(float[].class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<float[]>() {
                  public elemental.json.JsonValue serialize(float[] value, com.vaadin.client.ApplicationConnection connection) {
                    float[] castedValue = (float[]) value;
                    elemental.json.JsonArray values = elemental.json.Json.createArray();
                    for (int i = 0; i < castedValue.length; i++) {
                      values.set(i, com.vaadin.client.communication.JsonEncoder.encode(castedValue[i],new Type(java.lang.Float.class), connection));
                    }
                    return values;
                  }
                  public float[] deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    elemental.json.JsonArray jsonArray = (elemental.json.JsonArray)jsonValue;
                    float[] value = new float[jsonArray.length()];
                    for (int i = 0 ; i < value.length; i++) {
                      value[i] = (java.lang.Float) com.vaadin.client.communication.JsonDecoder.decodeValue(new Type(java.lang.Float.class), jsonArray.get(i), null, connection);
                    }
                    return value;
                  }
                };
              }
            });
            store.setSerializerFactory(java.lang.String[].class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<java.lang.String[]>() {
                  public elemental.json.JsonValue serialize(java.lang.String[] value, com.vaadin.client.ApplicationConnection connection) {
                    java.lang.String[] castedValue = (java.lang.String[]) value;
                    elemental.json.JsonArray values = elemental.json.Json.createArray();
                    for (int i = 0; i < castedValue.length; i++) {
                      values.set(i, com.vaadin.client.communication.JsonEncoder.encode(castedValue[i],new Type(java.lang.String.class), connection));
                    }
                    return values;
                  }
                  public java.lang.String[] deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    elemental.json.JsonArray jsonArray = (elemental.json.JsonArray)jsonValue;
                    java.lang.String[] value = new java.lang.String[jsonArray.length()];
                    for (int i = 0 ; i < value.length; i++) {
                      value[i] = (java.lang.String) com.vaadin.client.communication.JsonDecoder.decodeValue(new Type(java.lang.String.class), jsonArray.get(i), null, connection);
                    }
                    return value;
                  }
                };
              }
            });
            load9();
          }
          private void load9() {
            store.setPresentationType(com.vaadin.client.connectors.ButtonRendererConnector.class, java.lang.String.class);
            store.setPresentationType(com.vaadin.client.connectors.ImageRendererConnector.class, java.lang.String.class);
            store.setPresentationType(com.vaadin.client.connectors.JavaScriptRendererConnector.class, java.lang.Object.class);
            store.setPresentationType(com.vaadin.client.connectors.grid.ComponentRendererConnector.class, java.lang.String.class);
            store.setPresentationType(com.vaadin.client.connectors.grid.DateRendererConnector.class, java.lang.String.class);
            store.setPresentationType(com.vaadin.client.connectors.grid.LocalDateRendererConnector.class, java.lang.String.class);
            store.setPresentationType(com.vaadin.client.connectors.grid.LocalDateTimeRendererConnector.class, java.lang.String.class);
            store.setPresentationType(com.vaadin.client.connectors.grid.NumberRendererConnector.class, java.lang.String.class);
            store.setPresentationType(com.vaadin.client.connectors.grid.ProgressBarRendererConnector.class, java.lang.Double.class);
            store.setPresentationType(com.vaadin.client.connectors.grid.TextRendererConnector.class, java.lang.String.class);
            store.setPresentationType(com.vaadin.client.connectors.grid.TreeRendererConnector.class, java.lang.String.class);
            store.setPresentationType(com.vaadin.client.connectors.grid.UnsafeHtmlRendererConnector.class, java.lang.String.class);
            store.setDelegateToWidget(com.vaadin.shared.ui.accordion.AccordionState.class, "tabCaptionsAsHtml", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.accordion.AccordionState.class, "tabIndex", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.combobox.ComboBoxState.class, "allowNewItems", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.combobox.ComboBoxState.class, "pageLength", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.combobox.ComboBoxState.class, "placeholder", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.combobox.ComboBoxState.class, "suggestionPopupWidth", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.combobox.ComboBoxState.class, "textInputAllowed", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.datefield.LocalDateFieldState.class, "placeholder", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.datefield.LocalDateTimeFieldState.class, "placeholder", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.grid.GridState.class, "columnReorderingAllowed", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.grid.GridState.class, "frozenColumnCount", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.grid.GridState.class, "heightByRows", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.grid.GridState.class, "heightMode", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.listselect.ListSelectState.class, "rows", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.nativeselect.NativeSelectState.class, "visibleItemCount", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.optiongroup.CheckBoxGroupState.class, "htmlContentAllowed", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.optiongroup.RadioButtonGroupState.class, "htmlContentAllowed", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.passwordfield.PasswordFieldState.class, "maxLength", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.passwordfield.PasswordFieldState.class, "placeholder", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.passwordfield.PasswordFieldState.class, "text", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "tabCaptionsAsHtml", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "tabIndex", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.textarea.TextAreaState.class, "maxLength", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.textarea.TextAreaState.class, "placeholder", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.textarea.TextAreaState.class, "rows", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.textarea.TextAreaState.class, "text", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.textarea.TextAreaState.class, "wordWrap", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.textfield.TextFieldState.class, "maxLength", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.textfield.TextFieldState.class, "placeholder", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.textfield.TextFieldState.class, "text", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.treegrid.TreeGridState.class, "columnReorderingAllowed", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.treegrid.TreeGridState.class, "frozenColumnCount", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.treegrid.TreeGridState.class, "heightByRows", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.treegrid.TreeGridState.class, "heightMode", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "rows", "");
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.ColumnConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateAssistiveCaption", new String[] {"assistiveCaption", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.ColumnConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateCaption", new String[] {"caption", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.ColumnConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateEditable", new String[] {"editable", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.ColumnConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateExpandRatio", new String[] {"expandRatio", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.ColumnConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateHandleWidgetEvents", new String[] {"handleWidgetEvents", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.ColumnConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateHidable", new String[] {"hidable", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.ColumnConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateHidden", new String[] {"hidden", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.ColumnConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateHidingToggleCaption", new String[] {"hidingToggleCaption", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.ColumnConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateMaxWidth", new String[] {"maxWidth", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.ColumnConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateMinWidth", new String[] {"minWidth", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.ColumnConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateMinimumWidthFromContent", new String[] {"minimumWidthFromContent", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.ColumnConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateRenderer", new String[] {"renderer", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.ColumnConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateResizable", new String[] {"resizable", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.ColumnConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateSortable", new String[] {"sortable", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.ColumnConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateTooltipContentMode", new String[] {"tooltipContentMode", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.ColumnConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateWidth", new String[] {"width", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.EditorConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateBuffered", new String[] {"buffered", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.EditorConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateCancelCaption", new String[] {"cancelCaption", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.EditorConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateEnabled", new String[] {"enabled", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.EditorConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateSaveCaption", new String[] {"saveCaption", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.GridConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.GridConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.GridConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateColumnResizeMode", new String[] {"columnResizeMode", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.GridConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateRowHeight", new String[] {"bodyRowHeight", "headerRowHeight", "footerRowHeight", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.GridConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateSortOrder", new String[] {"sortColumns", "sortDirs", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.GridDragSourceConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.extensions.DragSourceExtensionConnector.class, "prefetchDragImage", new String[] {"resources", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.MultiSelectionModelConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.connectors.grid.AbstractSelectionModelConnector.class, "onSelectionAllowedChange", new String[] {"selectionAllowed", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.MultiSelectionModelConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("onSelectAllCheckboxStateUpdates", new String[] {"selectAllCheckBoxVisible", "allSelected", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.SingleSelectionModelConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.connectors.grid.AbstractSelectionModelConnector.class, "onSelectionAllowedChange", new String[] {"selectionAllowed", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.SingleSelectionModelConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateDeselectAllowed", new String[] {"deselectAllowed", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.TreeGridDragSourceConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.extensions.DragSourceExtensionConnector.class, "prefetchDragImage", new String[] {"resources", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.grid.TreeRendererConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateContentMode", new String[] {"mode", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.tree.TreeMultiSelectionModelConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.connectors.grid.AbstractSelectionModelConnector.class, "onSelectionAllowedChange", new String[] {"selectionAllowed", }));
            store.addOnStateChangeMethod(com.vaadin.client.connectors.tree.TreeMultiSelectionModelConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.connectors.grid.MultiSelectionModelConnector.class, "onSelectAllCheckboxStateUpdates", new String[] {"selectAllCheckBoxVisible", "allSelected", }));
            store.addOnStateChangeMethod(com.vaadin.client.extensions.DragSourceExtensionConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("prefetchDragImage", new String[] {"resources", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.JavaScriptComponentConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.JavaScriptComponentConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.absolutelayout.AbsoluteLayoutConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.absolutelayout.AbsoluteLayoutConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.accordion.AccordionConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.accordion.AccordionConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.audio.AudioConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.audio.AudioConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.browserframe.BrowserFrameConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.browserframe.BrowserFrameConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.button.ButtonConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.button.ButtonConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.button.ButtonConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("onResourceChange", new String[] {"resources", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.button.ButtonConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("setCaption", new String[] {"caption", "captionAsHtml", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.button.ButtonConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("setClickShortcut", new String[] {"clickShortcutKeyCode", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.button.ButtonConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("setIconAltText", new String[] {"iconAltText", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.checkbox.CheckBoxConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.checkbox.CheckBoxConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.checkbox.CheckBoxConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("sinkContextClickEvent", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.combobox.ComboBoxConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("onEmptySelectionCaptionChange", new String[] {"emptySelectionCaption", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.combobox.ComboBoxConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("onSelectionChange", new String[] {"selectedItemKey", "selectedItemCaption", "selectedItemIcon", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.combobox.ComboBoxConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.combobox.ComboBoxConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.composite.CompositeConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.composite.CompositeConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.csslayout.CssLayoutConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.csslayout.CssLayoutConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.customcomponent.CustomComponentConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.customcomponent.CustomComponentConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.customfield.CustomFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.customfield.CustomFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.customlayout.CustomLayoutConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.customlayout.CustomLayoutConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.DateFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.datefield.AbstractTextualDateConnector.class, "onTimeZoneJSONChange", new String[] {"timeZoneJSON", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.DateFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.DateFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.datefield.TextualDateConnector.class, "dateStylesUpdated", new String[] {"dateStyles", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.DateFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.DateTimeFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.datefield.AbstractTextualDateConnector.class, "onTimeZoneJSONChange", new String[] {"timeZoneJSON", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.DateTimeFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.DateTimeFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.datefield.TextualDateConnector.class, "dateStylesUpdated", new String[] {"dateStyles", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.DateTimeFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.InlineDateFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.InlineDateFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.InlineDateTimeFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.InlineDateTimeFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.PopupDateFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.datefield.AbstractTextualDateConnector.class, "onTimeZoneJSONChange", new String[] {"timeZoneJSON", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.PopupDateFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.PopupDateFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.datefield.TextualDateConnector.class, "dateStylesUpdated", new String[] {"dateStyles", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.PopupDateFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.PopupDateTimeFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.datefield.AbstractTextualDateConnector.class, "onTimeZoneJSONChange", new String[] {"timeZoneJSON", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.PopupDateTimeFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.PopupDateTimeFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.datefield.TextualDateConnector.class, "dateStylesUpdated", new String[] {"dateStyles", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.datefield.PopupDateTimeFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.draganddropwrapper.DragAndDropWrapperConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.draganddropwrapper.DragAndDropWrapperConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.embedded.EmbeddedConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.embedded.EmbeddedConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.flash.FlashConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.flash.FlashConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.formlayout.FormLayoutConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.formlayout.FormLayoutConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.gridlayout.GridLayoutConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.gridlayout.GridLayoutConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.image.ImageConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.image.ImageConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.label.LabelConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.label.LabelConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.link.LinkConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            load10();
          }
          private void load10() {
            store.addOnStateChangeMethod(com.vaadin.client.ui.link.LinkConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.listselect.ListSelectConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.listselect.ListSelectConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.listselect.ListSelectConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateReadOnly", new String[] {"readOnly", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.listselect.ListSelectConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateTabIndex", new String[] {"tabIndex", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.loginform.LoginFormConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.loginform.LoginFormConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.menubar.MenuBarConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.menubar.MenuBarConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.menubar.MenuBarConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateEnabled", new String[] {"enabled", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.menubar.MenuBarConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateTabIndex", new String[] {"tabIndex", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.nativebutton.NativeButtonConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.nativebutton.NativeButtonConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("onEmptySelectionCaptionChange", new String[] {"emptySelectionCaption", "emptySelectionAllowed", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateSelectedItem", new String[] {"selectedItemKey", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateTabIndex", new String[] {"tabIndex", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateWidgetReadOnly", new String[] {"readOnly", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.optiongroup.CheckBoxGroupConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.optiongroup.CheckBoxGroupConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.optiongroup.RadioButtonGroupConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.optiongroup.RadioButtonGroupConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.optiongroup.RadioButtonGroupConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateSelectedItem", new String[] {"selectedItemKey", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.optiongroup.RadioButtonGroupConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateWidgetReadOnly", new String[] {"readOnly", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.orderedlayout.HorizontalLayoutConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.orderedlayout.HorizontalLayoutConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.orderedlayout.VerticalLayoutConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.orderedlayout.VerticalLayoutConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.panel.PanelConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.panel.PanelConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.textfield.AbstractTextFieldConnector.class, "updateReadOnly", new String[] {"readOnly", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.textfield.AbstractTextFieldConnector.class, "updateValueChangeMode", new String[] {"valueChangeMode", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.textfield.AbstractTextFieldConnector.class, "updateValueChangeTimeout", new String[] {"valueChangeTimeout", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.popupview.PopupViewConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.popupview.PopupViewConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.progressbar.ProgressBarConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.progressbar.ProgressBarConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.slider.SliderConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.slider.SliderConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.splitpanel.HorizontalSplitPanelConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.splitpanel.HorizontalSplitPanelConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.splitpanel.VerticalSplitPanelConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.splitpanel.VerticalSplitPanelConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.tabsheet.TabsheetConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.tabsheet.TabsheetConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.textarea.TextAreaConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.textarea.TextAreaConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.textfield.AbstractTextFieldConnector.class, "updateReadOnly", new String[] {"readOnly", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.textarea.TextAreaConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.textfield.AbstractTextFieldConnector.class, "updateValueChangeMode", new String[] {"valueChangeMode", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.textarea.TextAreaConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.textfield.AbstractTextFieldConnector.class, "updateValueChangeTimeout", new String[] {"valueChangeTimeout", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.textarea.TextAreaConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.textfield.TextFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.textfield.TextFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.textfield.AbstractTextFieldConnector.class, "updateReadOnly", new String[] {"readOnly", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.textfield.TextFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.textfield.AbstractTextFieldConnector.class, "updateValueChangeMode", new String[] {"valueChangeMode", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.textfield.TextFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.textfield.AbstractTextFieldConnector.class, "updateValueChangeTimeout", new String[] {"valueChangeTimeout", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.textfield.TextFieldConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.treegrid.TreeGridConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.treegrid.TreeGridConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateHierarchyRendererStyleName", new String[] {"primaryStyleName", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.treegrid.TreeGridConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.treegrid.TreeGridConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.connectors.grid.GridConnector.class, "updateColumnResizeMode", new String[] {"columnResizeMode", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.treegrid.TreeGridConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateHierarchyColumn", new String[] {"hierarchyColumnId", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.treegrid.TreeGridConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.connectors.grid.GridConnector.class, "updateRowHeight", new String[] {"bodyRowHeight", "headerRowHeight", "footerRowHeight", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.treegrid.TreeGridConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.connectors.grid.GridConnector.class, "updateSortOrder", new String[] {"sortColumns", "sortDirs", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateCaptions", new String[] {"leftColumnCaption", "rightColumnCaption", "caption", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateReadOnly", new String[] {"readOnly", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateTabIndex", new String[] {"tabIndex", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.ui.UIConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.ui.UIConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.ui.UIConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("onThemeChange", new String[] {"theme", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.upload.UploadConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.upload.UploadConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.video.VideoConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.video.VideoConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.window.WindowConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.window.WindowConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(fi.jasoft.simplecalendar.shared.SimpleCalendarConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(fi.jasoft.simplecalendar.shared.SimpleCalendarConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
          }
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::alignment = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::alignment);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::class, 'alignment', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData::alignmentBitmask = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData::alignmentBitmask);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData::class, 'alignmentBitmask', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.MultiSelectionModelState::allSelected = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.MultiSelectionModelState::allSelected);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.MultiSelectionModelState::class, 'allSelected', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.combobox.ComboBoxState::allowNewItems = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.combobox.ComboBoxState::allowNewItems);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.combobox.ComboBoxState::class, 'allowNewItems', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setAltKey(Z)(value.@java.lang.Boolean::booleanValue()());
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.MouseEventDetails::isAltKey()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'altKey', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.AbstractMediaState::altText = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.AbstractMediaState::altText;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.AbstractMediaState::class, 'altText', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.embedded.EmbeddedState::altText = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.embedded.EmbeddedState::altText;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.embedded.EmbeddedState::class, 'altText', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.AbstractEmbeddedState::alternateText = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.AbstractEmbeddedState::alternateText;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.AbstractEmbeddedState::class, 'alternateText', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.PushConfigurationState::alwaysUseXhrForServerRequests = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.ui.UIState.PushConfigurationState::alwaysUseXhrForServerRequests);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.PushConfigurationState::class, 'alwaysUseXhrForServerRequests', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::am = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::am;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'am', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.embedded.EmbeddedState::archive = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.embedded.EmbeddedState::archive;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.embedded.EmbeddedState::class, 'archive', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.flash.FlashState::archive = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.flash.FlashState::archive;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.flash.FlashState::class, 'archive', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.ColumnState::assistiveCaption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.ColumnState::assistiveCaption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.ColumnState::class, 'assistiveCaption', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::assistivePostfix = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.window.WindowState::assistivePostfix;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'assistivePostfix', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::assistivePrefix = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.window.WindowState::assistivePrefix;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'assistivePrefix', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::assistiveTabStop = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.window.WindowState::assistiveTabStop);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'assistiveTabStop', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::assistiveTabStopBottomText = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.window.WindowState::assistiveTabStopBottomText;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'assistiveTabStopBottomText', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::assistiveTabStopTopText = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.window.WindowState::assistiveTabStopTopText;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'assistiveTabStopTopText', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.AbstractMediaState::autoplay = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.AbstractMediaState::autoplay);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.AbstractMediaState::class, 'autoplay', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::bodyRowHeight = value.@java.lang.Double::doubleValue()();
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.shared.ui.grid.GridState::bodyRowHeight);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'bodyRowHeight', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.editor.EditorState::buffered = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.editor.EditorState::buffered);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.editor.EditorState::class, 'buffered', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setButton(Lcom/vaadin/shared/MouseEventDetails$MouseButton;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.MouseEventDetails::getButton()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'button', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.JavaScriptExtensionState::setCallbackNames(Ljava/util/Set;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.JavaScriptExtensionState::getCallbackNames()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.JavaScriptExtensionState::class, 'callbackNames', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.JavaScriptComponentState::setCallbackNames(Ljava/util/Set;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.JavaScriptComponentState::getCallbackNames()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.JavaScriptComponentState::class, 'callbackNames', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.editor.EditorState::cancelCaption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.editor.EditorState::cancelCaption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.editor.EditorState::class, 'cancelCaption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::caption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.AbstractComponentState::caption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'caption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.ColumnState::caption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.ColumnState::caption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.ColumnState::class, 'caption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.notification.NotificationState::caption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.notification.NotificationState::caption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.notification.NotificationState::class, 'caption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::caption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabState::caption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'caption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::captionAsHtml = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.AbstractComponentState::captionAsHtml);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'captionAsHtml', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.SectionState.RowState::cellGroups = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.SectionState.RowState::cellGroups;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.SectionState.RowState::class, 'cellGroups', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.SectionState.RowState::cells = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.SectionState.RowState::cells;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.SectionState.RowState::class, 'cells', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::centered = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.window.WindowState::centered);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'centered', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.checkbox.CheckBoxState::checked = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.checkbox.CheckBoxState::checked);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.checkbox.CheckBoxState::class, 'checked', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.csslayout.CssLayoutState::childCss = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.csslayout.CssLayoutState::childCss;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.csslayout.CssLayoutState::class, 'childCss', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::childData = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::childData;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState::class, 'childData', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState::childData = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState::childData;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState::class, 'childData', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.customlayout.CustomLayoutState::childLocations = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.customlayout.CustomLayoutState::childLocations;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.customlayout.CustomLayoutState::class, 'childLocations', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.embedded.EmbeddedState::classId = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.embedded.EmbeddedState::classId;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.embedded.EmbeddedState::class, 'classId', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.flash.FlashState::classId = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.flash.FlashState::classId;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.flash.FlashState::class, 'classId', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.button.ButtonState::clickShortcutKeyCode = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.button.ButtonState::clickShortcutKeyCode);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.button.ButtonState::class, 'clickShortcutKeyCode', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setClientX(I)(value.@java.lang.Integer::intValue()());
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.MouseEventDetails::getClientX()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'clientX', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setClientY(I)(value.@java.lang.Integer::intValue()());
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.MouseEventDetails::getClientY()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'clientY', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::closable = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.tabsheet.TabState::closable);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'closable', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::closable = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.window.WindowState::closable);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'closable', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::closeTimeout = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::closeTimeout);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::class, 'closeTimeout', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.embedded.EmbeddedState::codebase = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.embedded.EmbeddedState::codebase;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.embedded.EmbeddedState::class, 'codebase', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.flash.FlashState::codebase = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.flash.FlashState::codebase;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.flash.FlashState::class, 'codebase', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.embedded.EmbeddedState::codetype = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.embedded.EmbeddedState::codetype;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.embedded.EmbeddedState::class, 'codetype', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.flash.FlashState::codetype = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.flash.FlashState::codetype;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.flash.FlashState::class, 'codetype', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::colExpand = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::colExpand;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState::class, 'colExpand', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::column1 = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::column1);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::class, 'column1', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::column2 = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::column2);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::class, 'column2', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.editor.EditorState::columnFields = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.editor.EditorState::columnFields;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.editor.EditorState::class, 'columnFields', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.SectionState.CellState::columnId = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.SectionState.CellState::columnId;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.SectionState.CellState::class, 'columnId', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::columnOrder = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridState::columnOrder;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'columnOrder', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::columnReorderingAllowed = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.GridState::columnReorderingAllowed);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'columnReorderingAllowed', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::columnResizeMode = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridState::columnResizeMode;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'columnResizeMode', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::columns = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::columns);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState::class, 'columns', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::componentError = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabState::componentError;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'componentError', data);
            
          }-*/;
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs0(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::componentErrorLevel = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabState::componentErrorLevel;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'componentErrorLevel', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.SectionState.CellState::connector = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.SectionState.CellState::connector;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.SectionState.CellState::class, 'connector', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState::connectorToCssPosition = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState::connectorToCssPosition;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState::class, 'connectorToCssPosition', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::contentDescription = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.window.WindowState::contentDescription;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'contentDescription', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.label.LabelState::contentMode = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.label.LabelState::contentMode;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.label.LabelState::class, 'contentMode', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.dnd.DropTargetState::criteria = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.dnd.DropTargetState::criteria;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.dnd.DropTargetState::class, 'criteria', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.dnd.DropTargetState::criteriaMatch = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.dnd.DropTargetState::criteriaMatch;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.dnd.DropTargetState::class, 'criteriaMatch', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.dnd.DropTargetState::criteriaScript = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.dnd.DropTargetState::criteriaScript;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.dnd.DropTargetState::class, 'criteriaScript', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setCtrlKey(Z)(value.@java.lang.Boolean::booleanValue()());
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.MouseEventDetails::isCtrlKey()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'ctrlKey', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.combobox.ComboBoxState::currentFilterText = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.combobox.ComboBoxState::currentFilterText;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.combobox.ComboBoxState::class, 'currentFilterText', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.ui.schedule.CalDate::d = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@org.vaadin.addon.calendar.client.ui.schedule.CalDate::d);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.ui.schedule.CalDate::class, 'd', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.dnd.DragSourceState::data = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.dnd.DragSourceState::data;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.dnd.DragSourceState::class, 'data', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::dateFormat = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::dateFormat;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'dateFormat', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::dateStyles = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::dateStyles;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.datefield.AbstractDateFieldState::class, 'dateStyles', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::dayNames = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::dayNames;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'dayNames', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.SectionState.RowState::defaultHeader = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.SectionState.RowState::defaultHeader);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.SectionState.RowState::class, 'defaultHeader', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.notification.NotificationState::delay = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.notification.NotificationState::delay);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.notification.NotificationState::class, 'delay', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::description = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.AbstractComponentState::description;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'description', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.notification.NotificationState::description = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.notification.NotificationState::description;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.notification.NotificationState::class, 'description', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::description = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabState::description;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'description', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::descriptionContentMode = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.AbstractComponentState::descriptionContentMode;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'descriptionContentMode', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::descriptionContentMode = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabState::descriptionContentMode;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'descriptionContentMode', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.datefield.TextualDateFieldState::descriptionForAssistiveDevices = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.datefield.TextualDateFieldState::descriptionForAssistiveDevices;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.datefield.TextualDateFieldState::class, 'descriptionForAssistiveDevices', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.SingleSelectionModelState::deselectAllowed = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.SingleSelectionModelState::deselectAllowed);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.SingleSelectionModelState::class, 'deselectAllowed', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState::dialogGracePeriod = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState::dialogGracePeriod);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState::class, 'dialogGracePeriod', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState::dialogModal = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState::dialogModal);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState::class, 'dialogModal', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState::dialogText = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState::dialogText;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState::class, 'dialogText', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState::dialogTextGaveUp = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState::dialogTextGaveUp;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState::class, 'dialogTextGaveUp', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.button.ButtonState::disableOnClick = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.button.ButtonState::disableOnClick);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.button.ButtonState::class, 'disableOnClick', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@fi.jasoft.simplecalendar.shared.SimpleCalendarState::disabledDates = value;
              },
              getter: function(bean) {
                return bean.@fi.jasoft.simplecalendar.shared.SimpleCalendarState::disabledDates;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@fi.jasoft.simplecalendar.shared.SimpleCalendarState::class, 'disabledDates', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@fi.jasoft.simplecalendar.shared.SimpleCalendarState::disabledMonthdays = value;
              },
              getter: function(bean) {
                return bean.@fi.jasoft.simplecalendar.shared.SimpleCalendarState::disabledMonthdays;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@fi.jasoft.simplecalendar.shared.SimpleCalendarState::class, 'disabledMonthdays', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@fi.jasoft.simplecalendar.shared.SimpleCalendarState::disabledWeekdays = value;
              },
              getter: function(bean) {
                return bean.@fi.jasoft.simplecalendar.shared.SimpleCalendarState::disabledWeekdays;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@fi.jasoft.simplecalendar.shared.SimpleCalendarState::class, 'disabledWeekdays', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::draggable = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.window.WindowState::draggable);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'draggable', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.dnd.DropTargetState::dropEffect = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.dnd.DropTargetState::dropEffect;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.dnd.DropTargetState::class, 'dropEffect', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridDropTargetState::dropMode = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridDropTargetState::dropMode;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridDropTargetState::class, 'dropMode', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridDropTargetState::dropThreshold = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.grid.GridDropTargetState::dropThreshold);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridDropTargetState::class, 'dropThreshold', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.ui.schedule.SelectionRange::e = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.ui.schedule.SelectionRange::e;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.ui.schedule.SelectionRange::class, 'e', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.ui.schedule.SelectionRange::eMin = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@org.vaadin.addon.calendar.client.ui.schedule.SelectionRange::eMin);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.ui.schedule.SelectionRange::class, 'eMin', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.ColumnState::editable = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.ColumnState::editable);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.ColumnState::class, 'editable', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.dnd.DragSourceState::effectAllowed = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.dnd.DragSourceState::effectAllowed;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.dnd.DragSourceState::class, 'effectAllowed', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.flash.FlashState::embedParams = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.flash.FlashState::embedParams;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.flash.FlashState::class, 'embedParams', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.combobox.ComboBoxState::emptySelectionAllowed = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.combobox.ComboBoxState::emptySelectionAllowed);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.combobox.ComboBoxState::class, 'emptySelectionAllowed', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.nativeselect.NativeSelectState::emptySelectionAllowed = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.nativeselect.NativeSelectState::emptySelectionAllowed);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.nativeselect.NativeSelectState::class, 'emptySelectionAllowed', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.combobox.ComboBoxState::emptySelectionCaption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.combobox.ComboBoxState::emptySelectionCaption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.combobox.ComboBoxState::class, 'emptySelectionCaption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.nativeselect.NativeSelectState::emptySelectionCaption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.nativeselect.NativeSelectState::emptySelectionCaption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.nativeselect.NativeSelectState::class, 'emptySelectionCaption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::enableMobileHTML5DnD = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.ui.UIState::enableMobileHTML5DnD);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'enableMobileHTML5DnD', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.communication.SharedState::enabled = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.communication.SharedState::enabled);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.communication.SharedState::class, 'enabled', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::enabled = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.tabsheet.TabState::enabled);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'enabled', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@fi.jasoft.simplecalendar.shared.SimpleCalendarState::endDate = value;
              },
              getter: function(bean) {
                return bean.@fi.jasoft.simplecalendar.shared.SimpleCalendarState::endDate;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@fi.jasoft.simplecalendar.shared.SimpleCalendarState::class, 'endDate', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.ui.schedule.SelectionRange::setEndDay(Lorg/vaadin/addon/calendar/client/ui/schedule/CalDate;)(value);
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.ui.schedule.SelectionRange::getEndDay()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.ui.schedule.SelectionRange::class, 'endDay', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::errorLevel = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.AbstractComponentState::errorLevel;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'errorLevel', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::errorMessage = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.AbstractComponentState::errorMessage;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'errorMessage', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.ColumnState::expandRatio = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.grid.ColumnState::expandRatio);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.ColumnState::class, 'expandRatio', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData::expandRatio = value.@java.lang.Float::floatValue()();
              },
              getter: function(bean) {
                return @java.lang.Float::valueOf(F)(bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData::expandRatio);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData::class, 'expandRatio', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::explicitColRatios = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::explicitColRatios;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState::class, 'explicitColRatios', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::explicitRowRatios = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::explicitRowRatios;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState::class, 'explicitRowRatios', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.BrowserWindowOpenerState::features = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.BrowserWindowOpenerState::features;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.BrowserWindowOpenerState::class, 'features', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState::firstChild = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState::firstChild;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState::class, 'firstChild', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::firstDayOfWeek = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::firstDayOfWeek);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'firstDayOfWeek', data);
            
          }-*/;
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs1(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState::firstDelay = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState::firstDelay);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState::class, 'firstDelay', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.customfield.CustomFieldState::focusDelegate = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.customfield.CustomFieldState::focusDelegate;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.customfield.CustomFieldState::class, 'focusDelegate', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::footer = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridState::footer;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'footer', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::footerRowHeight = value.@java.lang.Double::doubleValue()();
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.shared.ui.grid.GridState::footerRowHeight);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'footerRowHeight', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::format = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::format;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.datefield.AbstractDateFieldState::class, 'format', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::frozenColumnCount = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.grid.GridState::frozenColumnCount);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'frozenColumnCount', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.ui.schedule.CalTime::h = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@org.vaadin.addon.calendar.client.ui.schedule.CalTime::h);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.ui.schedule.CalTime::class, 'h', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.ColumnState::handleWidgetEvents = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.ColumnState::handleWidgetEvents);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.ColumnState::class, 'handleWidgetEvents', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::hasDescriptions = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.GridState::hasDescriptions);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'hasDescriptions', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.PageState::hasResizeListeners = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.ui.PageState::hasResizeListeners);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.PageState::class, 'hasResizeListeners', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::header = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridState::header;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'header', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::headerRowHeight = value.@java.lang.Double::doubleValue()();
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.shared.ui.grid.GridState::headerRowHeight);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'headerRowHeight', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::height = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.AbstractComponentState::height;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'height', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::heightByRows = value.@java.lang.Double::doubleValue()();
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.shared.ui.grid.GridState::heightByRows);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'heightByRows', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::heightMode = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridState::heightMode;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'heightMode', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.ColumnState::hidable = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.ColumnState::hidable);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.ColumnState::class, 'hidable', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.ColumnState::hidden = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.ColumnState::hidden);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.ColumnState::class, 'hidden', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::hideEmptyRowsAndColumns = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::hideEmptyRowsAndColumns);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState::class, 'hideEmptyRowsAndColumns', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.popupview.PopupViewState::hideOnMouseOut = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.popupview.PopupViewState::hideOnMouseOut);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.popupview.PopupViewState::class, 'hideOnMouseOut', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.ColumnState::hidingToggleCaption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.ColumnState::hidingToggleCaption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.ColumnState::class, 'hidingToggleCaption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.treegrid.TreeGridState::hierarchyColumnId = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.treegrid.TreeGridState::hierarchyColumnId;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.treegrid.TreeGridState::class, 'hierarchyColumnId', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::hourMinuteDelimiter = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::hourMinuteDelimiter;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'hourMinuteDelimiter', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.SectionState.CellState::html = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.SectionState.CellState::html;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.SectionState.CellState::class, 'html', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.popupview.PopupViewState::html = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.popupview.PopupViewState::html;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.popupview.PopupViewState::class, 'html', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.AbstractMediaState::htmlContentAllowed = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.AbstractMediaState::htmlContentAllowed);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.AbstractMediaState::class, 'htmlContentAllowed', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.renderers.ButtonRendererState::htmlContentAllowed = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.renderers.ButtonRendererState::htmlContentAllowed);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.renderers.ButtonRendererState::class, 'htmlContentAllowed', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.notification.NotificationState::htmlContentAllowed = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.notification.NotificationState::htmlContentAllowed);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.notification.NotificationState::class, 'htmlContentAllowed', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.optiongroup.CheckBoxGroupState::htmlContentAllowed = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.optiongroup.CheckBoxGroupState::htmlContentAllowed);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.optiongroup.CheckBoxGroupState::class, 'htmlContentAllowed', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.optiongroup.RadioButtonGroupState::htmlContentAllowed = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.optiongroup.RadioButtonGroupState::htmlContentAllowed);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.optiongroup.RadioButtonGroupState::class, 'htmlContentAllowed', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.button.ButtonState::iconAltText = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.button.ButtonState::iconAltText;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.button.ButtonState::class, 'iconAltText', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::iconAltText = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabState::iconAltText;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'iconAltText', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::id = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.AbstractComponentState::id;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'id', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::id = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabState::id;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'id', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.upload.UploadState::immediateMode = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.upload.UploadState::immediateMode);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.upload.UploadState::class, 'immediateMode', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.progressindicator.ProgressBarState::indeterminate = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.progressindicator.ProgressBarState::indeterminate);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.progressindicator.ProgressBarState::class, 'indeterminate', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.ColumnState::internalId = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.ColumnState::internalId;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.ColumnState::class, 'internalId', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::key = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabState::key;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'key', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.twincolselect.TwinColSelectState::leftColumnCaption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.twincolselect.TwinColSelectState::leftColumnCaption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.twincolselect.TwinColSelectState::class, 'leftColumnCaption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::lenient = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::lenient);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.datefield.AbstractDateFieldState::class, 'lenient', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::loadingIndicatorConfiguration = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState::loadingIndicatorConfiguration;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'loadingIndicatorConfiguration', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::locale = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::locale;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.datefield.AbstractDateFieldState::class, 'locale', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@fi.jasoft.simplecalendar.shared.SimpleCalendarState::locale = value;
              },
              getter: function(bean) {
                return bean.@fi.jasoft.simplecalendar.shared.SimpleCalendarState::locale;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@fi.jasoft.simplecalendar.shared.SimpleCalendarState::class, 'locale', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleServiceState::localeData = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleServiceState::localeData;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleServiceState::class, 'localeData', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::localeServiceState = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState::localeServiceState;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'localeServiceState', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::locked = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::locked);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::class, 'locked', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.loginform.LoginFormState::loginButtonConnector = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.loginform.LoginFormState::loginButtonConnector;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.loginform.LoginFormState::class, 'loginButtonConnector', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.loginform.LoginFormState::loginResource = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.loginform.LoginFormState::loginResource;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.loginform.LoginFormState::class, 'loginResource', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.AbstractMediaState::loop = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.AbstractMediaState::loop);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.AbstractMediaState::class, 'loop', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.ui.schedule.CalDate::m = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@org.vaadin.addon.calendar.client.ui.schedule.CalDate::m);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.ui.schedule.CalDate::class, 'm', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.ui.schedule.CalTime::m = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@org.vaadin.addon.calendar.client.ui.schedule.CalTime::m);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.ui.schedule.CalTime::class, 'm', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::marginsBitmask = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::marginsBitmask);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState::class, 'marginsBitmask', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState::marginsBitmask = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState::marginsBitmask);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState::class, 'marginsBitmask', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.textfield.AbstractTextFieldState::maxLength = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.textfield.AbstractTextFieldState::maxLength);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.textfield.AbstractTextFieldState::class, 'maxLength', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::maxPosition = value.@java.lang.Float::floatValue()();
              },
              getter: function(bean) {
                return @java.lang.Float::valueOf(F)(bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::maxPosition);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::class, 'maxPosition', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::maxPositionUnit = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::maxPositionUnit;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::class, 'maxPositionUnit', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.slider.SliderState::maxValue = value.@java.lang.Double::doubleValue()();
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.shared.ui.slider.SliderState::maxValue);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.slider.SliderState::class, 'maxValue', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.ColumnState::maxWidth = value.@java.lang.Double::doubleValue()();
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.shared.ui.grid.ColumnState::maxWidth);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.ColumnState::class, 'maxWidth', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::maxWidth = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::maxWidth);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::class, 'maxWidth', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setMetaKey(Z)(value.@java.lang.Boolean::booleanValue()());
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.MouseEventDetails::isMetaKey()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'metaKey', data);
            
          }-*/;
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs2(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.dnd.FileParameters::setMime(Ljava/lang/String;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.dnd.FileParameters::getMime()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.dnd.FileParameters::class, 'mime', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.embedded.EmbeddedState::mimeType = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.embedded.EmbeddedState::mimeType;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.embedded.EmbeddedState::class, 'mimeType', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::minPosition = value.@java.lang.Float::floatValue()();
              },
              getter: function(bean) {
                return @java.lang.Float::valueOf(F)(bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::minPosition);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::class, 'minPosition', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::minPositionUnit = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::minPositionUnit;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::class, 'minPositionUnit', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.slider.SliderState::minValue = value.@java.lang.Double::doubleValue()();
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.shared.ui.slider.SliderState::minValue);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.slider.SliderState::class, 'minValue', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.ColumnState::minWidth = value.@java.lang.Double::doubleValue()();
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.shared.ui.grid.ColumnState::minWidth);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.ColumnState::class, 'minWidth', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.ColumnState::minimumWidthFromContent = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.ColumnState::minimumWidthFromContent);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.ColumnState::class, 'minimumWidthFromContent', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::modal = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.window.WindowState::modal);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'modal', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tree.TreeRendererState::mode = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tree.TreeRendererState::mode;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tree.TreeRendererState::class, 'mode', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.PushConfigurationState::mode = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.PushConfigurationState::mode;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.PushConfigurationState::class, 'mode', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::monthNames = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::monthNames;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'monthNames', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@fi.jasoft.simplecalendar.shared.SimpleCalendarState::multiselect = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@fi.jasoft.simplecalendar.shared.SimpleCalendarState::multiselect);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@fi.jasoft.simplecalendar.shared.SimpleCalendarState::class, 'multiselect', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.AbstractMediaState::muted = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.AbstractMediaState::muted);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.AbstractMediaState::class, 'muted', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.dnd.FileParameters::setName(Ljava/lang/String;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.dnd.FileParameters::getName()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.dnd.FileParameters::class, 'name', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.link.LinkState::name = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.link.LinkState::name;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.link.LinkState::class, 'name', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::name = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::name;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'name', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState::names = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState::names;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState::class, 'names', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::notificationConfigurations = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState::notificationConfigurations;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'notificationConfigurations', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration::notificationRole = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration::notificationRole;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration::class, 'notificationRole', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::openDelay = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::openDelay);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::class, 'openDelay', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.slider.SliderState::orientation = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.slider.SliderState::orientation;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.slider.SliderState::class, 'orientation', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::overlayContainerLabel = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState::overlayContainerLabel;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'overlayContainerLabel', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.combobox.ComboBoxState::pageLength = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.combobox.ComboBoxState::pageLength);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.combobox.ComboBoxState::class, 'pageLength', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::pageState = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState::pageState;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'pageState', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.BrowserWindowOpenerState::parameters = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.BrowserWindowOpenerState::parameters;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.BrowserWindowOpenerState::class, 'parameters', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.embedded.EmbeddedState::parameters = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.embedded.EmbeddedState::parameters;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.embedded.EmbeddedState::class, 'parameters', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.PushConfigurationState::parameters = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.PushConfigurationState::parameters;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.PushConfigurationState::class, 'parameters', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::parsable = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::parsable);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.datefield.AbstractDateFieldState::class, 'parsable', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.loginform.LoginFormState::passwordFieldConnector = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.loginform.LoginFormState::passwordFieldConnector;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.loginform.LoginFormState::class, 'passwordFieldConnector', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.dnd.DragSourceState::payload = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.dnd.DragSourceState::payload;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.dnd.DragSourceState::class, 'payload', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.combobox.ComboBoxState::placeholder = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.combobox.ComboBoxState::placeholder;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.combobox.ComboBoxState::class, 'placeholder', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.datefield.TextualDateFieldState::placeholder = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.datefield.TextualDateFieldState::placeholder;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.datefield.TextualDateFieldState::class, 'placeholder', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.textfield.AbstractTextFieldState::placeholder = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.textfield.AbstractTextFieldState::placeholder;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.textfield.AbstractTextFieldState::class, 'placeholder', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::pm = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::pm;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'pm', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::pollInterval = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState::pollInterval);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'pollInterval', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.notification.NotificationState::position = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.notification.NotificationState::position;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.notification.NotificationState::class, 'position', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::position = value.@java.lang.Float::floatValue()();
              },
              getter: function(bean) {
                return @java.lang.Float::valueOf(F)(bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::position);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::class, 'position', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::positionReversed = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::positionReversed);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::class, 'positionReversed', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::positionUnit = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::positionUnit;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState::class, 'positionUnit', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::positionX = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.window.WindowState::positionX);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'positionX', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::positionY = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.window.WindowState::positionY);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'positionY', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration::postfix = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration::postfix;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration::class, 'postfix', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration::prefix = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration::prefix;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.NotificationTypeConfiguration::class, 'prefix', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.AbstractMediaState::preload = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.AbstractMediaState::preload;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.AbstractMediaState::class, 'preload', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::primaryStyleName = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.AbstractComponentState::primaryStyleName;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'primaryStyleName', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::pushConfiguration = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState::pushConfiguration;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'pushConfiguration', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.PushConfigurationState::pushUrl = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.PushConfigurationState::pushUrl;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.PushConfigurationState::class, 'pushUrl', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::quickOpenDelay = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::quickOpenDelay);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::class, 'quickOpenDelay', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::quickOpenTimeout = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::quickOpenTimeout);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.TooltipConfigurationState::class, 'quickOpenTimeout', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::rangeEnd = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::rangeEnd;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.datefield.AbstractDateFieldState::class, 'rangeEnd', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::rangeStart = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::rangeStart;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.datefield.AbstractDateFieldState::class, 'rangeStart', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractFieldState::readOnly = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.AbstractFieldState::readOnly);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractFieldState::class, 'readOnly', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState::reconnectAttempts = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState::reconnectAttempts);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState::class, 'reconnectAttempts', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::reconnectDialogConfiguration = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState::reconnectDialogConfiguration;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'reconnectDialogConfiguration', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState::reconnectInterval = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState::reconnectInterval);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.ReconnectDialogConfigurationState::class, 'reconnectInterval', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.communication.SharedState::registeredEventListeners = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.communication.SharedState::registeredEventListeners;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.communication.SharedState::class, 'registeredEventListeners', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setRelativeX(I)(value.@java.lang.Integer::intValue()());
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.MouseEventDetails::getRelativeX()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'relativeX', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setRelativeY(I)(value.@java.lang.Integer::intValue()());
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.MouseEventDetails::getRelativeY()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'relativeY', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.ColumnState::renderer = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.ColumnState::renderer;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.ColumnState::class, 'renderer', data);
            
          }-*/;
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs3(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractFieldState::required = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.AbstractFieldState::required);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractFieldState::class, 'required', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.ColumnState::resizable = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.ColumnState::resizable);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.ColumnState::class, 'resizable', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::resizable = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.window.WindowState::resizable);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'resizable', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::resizeLazy = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.window.WindowState::resizeLazy);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'resizeLazy', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.slider.SliderState::resolution = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.slider.SliderState::resolution);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.slider.SliderState::class, 'resolution', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::resolutions = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::resolutions;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.datefield.AbstractDateFieldState::class, 'resolutions', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.communication.SharedState::resources = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.communication.SharedState::resources;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.communication.SharedState::class, 'resources', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.twincolselect.TwinColSelectState::rightColumnCaption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.twincolselect.TwinColSelectState::rightColumnCaption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.twincolselect.TwinColSelectState::class, 'rightColumnCaption', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::role = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.window.WindowState::role;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'role', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::row1 = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::row1);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::class, 'row1', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::row2 = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::row2);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData::class, 'row2', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::rowDescriptionContentMode = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridState::rowDescriptionContentMode;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'rowDescriptionContentMode', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::rowExpand = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::rowExpand;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState::class, 'rowExpand', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.SectionState::rows = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.SectionState::rows;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.SectionState::class, 'rows', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::rows = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::rows);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState::class, 'rows', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.listselect.ListSelectState::rows = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.listselect.ListSelectState::rows);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.listselect.ListSelectState::class, 'rows', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.textarea.TextAreaState::rows = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.textarea.TextAreaState::rows);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.textarea.TextAreaState::class, 'rows', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.twincolselect.TwinColSelectState::rows = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.twincolselect.TwinColSelectState::rows);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.twincolselect.TwinColSelectState::class, 'rows', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.JavaScriptExtensionState::setRpcInterfaces(Ljava/util/Map;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.JavaScriptExtensionState::getRpcInterfaces()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.JavaScriptExtensionState::class, 'rpcInterfaces', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.JavaScriptComponentState::setRpcInterfaces(Ljava/util/Map;)(value);
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.JavaScriptComponentState::getRpcInterfaces()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.JavaScriptComponentState::class, 'rpcInterfaces', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.ui.schedule.CalTime::s = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@org.vaadin.addon.calendar.client.ui.schedule.CalTime::s);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.ui.schedule.CalTime::class, 's', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.ui.schedule.SelectionRange::s = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.ui.schedule.SelectionRange::s;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.ui.schedule.SelectionRange::class, 's', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.ui.schedule.SelectionRange::sMin = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@org.vaadin.addon.calendar.client.ui.schedule.SelectionRange::sMin);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.ui.schedule.SelectionRange::class, 'sMin', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.editor.EditorState::saveCaption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.editor.EditorState::saveCaption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.editor.EditorState::class, 'saveCaption', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.panel.PanelState::scrollLeft = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.panel.PanelState::scrollLeft);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.panel.PanelState::class, 'scrollLeft', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.combobox.ComboBoxState::scrollToSelectedItem = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.combobox.ComboBoxState::scrollToSelectedItem);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.combobox.ComboBoxState::class, 'scrollToSelectedItem', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.panel.PanelState::scrollTop = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.panel.PanelState::scrollTop);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.panel.PanelState::class, 'scrollTop', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState::secondChild = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState::secondChild;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState::class, 'secondChild', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState::secondDelay = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState::secondDelay);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState::class, 'secondDelay', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.MultiSelectionModelState::selectAllCheckBoxVisible = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.MultiSelectionModelState::selectAllCheckBoxVisible);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.MultiSelectionModelState::class, 'selectAllCheckBoxVisible', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::selected = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::selected;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabsheetState::class, 'selected', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.combobox.ComboBoxState::selectedItemCaption = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.combobox.ComboBoxState::selectedItemCaption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.combobox.ComboBoxState::class, 'selectedItemCaption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.combobox.ComboBoxState::selectedItemIcon = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.combobox.ComboBoxState::selectedItemIcon;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.combobox.ComboBoxState::class, 'selectedItemIcon', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.AbstractSingleSelectState::selectedItemKey = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.AbstractSingleSelectState::selectedItemKey;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.AbstractSingleSelectState::class, 'selectedItemKey', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.AbstractSelectionModelState::selectionAllowed = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.AbstractSelectionModelState::selectionAllowed);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.AbstractSelectionModelState::class, 'selectionAllowed', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setShiftKey(Z)(value.@java.lang.Boolean::booleanValue()());
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.MouseEventDetails::isShiftKey()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'shiftKey', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::shortDayNames = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::shortDayNames;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'shortDayNames', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::shortMonthNames = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::shortMonthNames;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'shortMonthNames', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.AbstractMediaState::showControls = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.AbstractMediaState::showControls);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.AbstractMediaState::class, 'showControls', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::showISOWeekNumbers = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::showISOWeekNumbers);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.datefield.AbstractDateFieldState::class, 'showISOWeekNumbers', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.dnd.FileParameters::setSize(J)(value.@java.lang.Long::longValue()());
              },
              getter: function(bean) {
                return @java.lang.Long::valueOf(J)(bean.@com.vaadin.shared.ui.dnd.FileParameters::getSize()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.dnd.FileParameters::class, 'size', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::sortColumns = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridState::sortColumns;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'sortColumns', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.GridState::sortDirs = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.GridState::sortDirs;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.GridState::class, 'sortDirs', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.ColumnState::sortable = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.ColumnState::sortable);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.ColumnState::class, 'sortable', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.AbstractMediaState::sourceTypes = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.AbstractMediaState::sourceTypes;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.AbstractMediaState::class, 'sourceTypes', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.AbstractMediaState::sources = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.AbstractMediaState::sources;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.AbstractMediaState::class, 'sources', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::spacing = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.gridlayout.GridLayoutState::spacing);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.gridlayout.GridLayoutState::class, 'spacing', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState::spacing = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState::spacing);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState::class, 'spacing', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState::splitterState = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState::splitterState;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState::class, 'splitterState', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.embedded.EmbeddedState::standby = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.embedded.EmbeddedState::standby;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.embedded.EmbeddedState::class, 'standby', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.flash.FlashState::standby = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.flash.FlashState::standby;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.flash.FlashState::class, 'standby', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@fi.jasoft.simplecalendar.shared.SimpleCalendarState::startDate = value;
              },
              getter: function(bean) {
                return bean.@fi.jasoft.simplecalendar.shared.SimpleCalendarState::startDate;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@fi.jasoft.simplecalendar.shared.SimpleCalendarState::class, 'startDate', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.ui.schedule.SelectionRange::setStartDay(Lorg/vaadin/addon/calendar/client/ui/schedule/CalDate;)(value);
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.ui.schedule.SelectionRange::getStartDay()();
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.ui.schedule.SelectionRange::class, 'startDay', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.progressindicator.ProgressBarState::state = value.@java.lang.Float::floatValue()();
              },
              getter: function(bean) {
                return @java.lang.Float::valueOf(F)(bean.@com.vaadin.shared.ui.progressindicator.ProgressBarState::state);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.progressindicator.ProgressBarState::class, 'state', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.SectionState.CellState::styleName = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.SectionState.CellState::styleName;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.SectionState.CellState::class, 'styleName', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.SectionState.RowState::styleName = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.SectionState.RowState::styleName;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.SectionState.RowState::class, 'styleName', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.notification.NotificationState::styleName = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.notification.NotificationState::styleName;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.notification.NotificationState::class, 'styleName', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::styleName = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabState::styleName;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'styleName', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::styles = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.AbstractComponentState::styles;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'styles', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.combobox.ComboBoxState::suggestionPopupWidth = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.combobox.ComboBoxState::suggestionPopupWidth;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.combobox.ComboBoxState::class, 'suggestionPopupWidth', data);
            
          }-*/;
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs4(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.ui.schedule.CalDate::t = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.ui.schedule.CalDate::t;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.ui.schedule.CalDate::class, 't', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::tabCaptionsAsHtml = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::tabCaptionsAsHtml);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabsheetState::class, 'tabCaptionsAsHtml', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.TabIndexState::tabIndex = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.TabIndexState::tabIndex);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.TabIndexState::class, 'tabIndex', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.panel.PanelState::tabIndex = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.panel.PanelState::tabIndex);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.panel.PanelState::class, 'tabIndex', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::tabIndex = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::tabIndex);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabsheetState::class, 'tabIndex', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::tabIndex = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState::tabIndex);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'tabIndex', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::tabs = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::tabs;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabsheetState::class, 'tabs', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::tabsVisible = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.tabsheet.TabsheetState::tabsVisible);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabsheetState::class, 'tabsVisible', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.BrowserWindowOpenerState::target = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.BrowserWindowOpenerState::target;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.BrowserWindowOpenerState::class, 'target', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.link.LinkState::target = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.link.LinkState::target;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.link.LinkState::class, 'target', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.link.LinkState::targetBorder = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.link.LinkState::targetBorder;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.link.LinkState::class, 'targetBorder', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.link.LinkState::targetHeight = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.link.LinkState::targetHeight);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.link.LinkState::class, 'targetHeight', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.link.LinkState::targetWidth = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.link.LinkState::targetWidth);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.link.LinkState::class, 'targetWidth', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.customlayout.CustomLayoutState::templateContents = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.customlayout.CustomLayoutState::templateContents;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.customlayout.CustomLayoutState::class, 'templateContents', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.customlayout.CustomLayoutState::templateName = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.customlayout.CustomLayoutState::templateName;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.customlayout.CustomLayoutState::class, 'templateName', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.SectionState.CellState::text = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.SectionState.CellState::text;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.SectionState.CellState::class, 'text', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.label.LabelState::text = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.label.LabelState::text;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.label.LabelState::class, 'text', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.textfield.AbstractTextFieldState::text = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.textfield.AbstractTextFieldState::text;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.textfield.AbstractTextFieldState::class, 'text', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.datefield.TextualDateFieldState::textFieldEnabled = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.datefield.TextualDateFieldState::textFieldEnabled);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.datefield.TextualDateFieldState::class, 'textFieldEnabled', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.combobox.ComboBoxState::textInputAllowed = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.combobox.ComboBoxState::textInputAllowed);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.combobox.ComboBoxState::class, 'textInputAllowed', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::theme = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState::theme;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'theme', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState::thirdDelay = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState::thirdDelay);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LoadingIndicatorConfigurationState::class, 'thirdDelay', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::timeZoneJSON = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.datefield.AbstractDateFieldState::timeZoneJSON;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.datefield.AbstractDateFieldState::class, 'timeZoneJSON', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.PageState::title = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.PageState::title;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.PageState::class, 'title', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState::tooltipConfiguration = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.ui.UIState::tooltipConfiguration;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState::class, 'tooltipConfiguration', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.ColumnState::tooltipContentMode = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.ColumnState::tooltipContentMode;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.ColumnState::class, 'tooltipContentMode', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::twelveHourClock = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.ui.UIState.LocaleData::twelveHourClock);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.ui.UIState.LocaleData::class, 'twelveHourClock', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.MouseEventDetails::setType(I)(value.@java.lang.Integer::intValue()());
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.MouseEventDetails::getType()());
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.MouseEventDetails::class, 'type', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.embedded.EmbeddedState::type = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.embedded.EmbeddedState::type);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.embedded.EmbeddedState::class, 'type', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.SectionState.CellState::type = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.grid.SectionState.CellState::type;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.SectionState.CellState::class, 'type', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.dnd.DragSourceState::types = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.dnd.DragSourceState::types;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.dnd.DragSourceState::class, 'types', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.BrowserWindowOpenerState::uriFragment = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.BrowserWindowOpenerState::uriFragment;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.BrowserWindowOpenerState::class, 'uriFragment', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.loginform.LoginFormState::userNameFieldConnector = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.loginform.LoginFormState::userNameFieldConnector;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.loginform.LoginFormState::class, 'userNameFieldConnector', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.slider.SliderState::value = value.@java.lang.Double::doubleValue()();
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.shared.ui.slider.SliderState::value);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.slider.SliderState::class, 'value', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.textfield.AbstractTextFieldState::valueChangeMode = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.textfield.AbstractTextFieldState::valueChangeMode;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.textfield.AbstractTextFieldState::class, 'valueChangeMode', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.textfield.AbstractTextFieldState::valueChangeTimeout = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.textfield.AbstractTextFieldState::valueChangeTimeout);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.textfield.AbstractTextFieldState::class, 'valueChangeTimeout', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.SectionState::visible = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.grid.SectionState::visible);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.SectionState::class, 'visible', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.tabsheet.TabState::visible = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.tabsheet.TabState::visible);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.tabsheet.TabState::class, 'visible', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.nativeselect.NativeSelectState::visibleItemCount = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.nativeselect.NativeSelectState::visibleItemCount);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.nativeselect.NativeSelectState::class, 'visibleItemCount', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.AbstractComponentState::width = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.AbstractComponentState::width;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.AbstractComponentState::class, 'width', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.grid.ColumnState::width = value.@java.lang.Double::doubleValue()();
              },
              getter: function(bean) {
                return @java.lang.Double::valueOf(D)(bean.@com.vaadin.shared.ui.grid.ColumnState::width);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.grid.ColumnState::class, 'width', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.window.WindowState::windowMode = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.window.WindowState::windowMode;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.window.WindowState::class, 'windowMode', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.textarea.TextAreaState::wordWrap = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.textarea.TextAreaState::wordWrap);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.textarea.TextAreaState::class, 'wordWrap', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.ui.schedule.CalDate::y = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@org.vaadin.addon.calendar.client.ui.schedule.CalDate::y);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.ui.schedule.CalDate::class, 'y', data);
            
          }-*/;
          private void loadJsBundle(com.vaadin.client.metadata.TypeDataStore store) {
            loadNativeJs(store);
            loadNativeJs0(store);
            loadNativeJs1(store);
            loadNativeJs2(store);
            loadNativeJs3(store);
            loadNativeJs4(store);
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        }.onSuccess();
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("__deferred", new String[] {}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            loadJsBundle(store);
          }
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs(com.vaadin.client.metadata.TypeDataStore store) /*-{
          }-*/;
          private void loadJsBundle(com.vaadin.client.metadata.TypeDataStore store) {
            loadNativeJs(store);
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("com.vaadin.client.ui.colorpicker.ColorPickerConnector", new String[] {"com.vaadin.ui.ColorPicker",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setSuperClass(com.vaadin.shared.ui.colorpicker.AbstractColorPickerState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, com.vaadin.shared.ui.colorpicker.AbstractColorPickerState.class);
            store.setClass("com.vaadin.ui.ColorPicker", com.vaadin.client.ui.colorpicker.ColorPickerConnector.class);
            store.setConstructor(com.vaadin.client.ui.colorpicker.ColorPickerConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.colorpicker.ColorPickerConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.colorpicker.ColorPickerState.class);
              }
            });
            store.setReturnType(com.vaadin.client.ui.colorpicker.ColorPickerConnector.class, "getWidget", new Type(com.vaadin.client.ui.VColorPicker.class));
            store.setReturnType(com.vaadin.client.ui.colorpicker.ColorPickerConnector.class, "getState", new Type(com.vaadin.shared.ui.colorpicker.ColorPickerState.class));
            store.setInvoker(com.vaadin.client.ui.VColorPicker.class, "setColor",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VColorPicker) target).setColor((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VColorPicker.class, "setOpen",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VColorPicker) target).setOpen((java.lang.Boolean) params[0]);
                return null;
              }
            });
            loadJsBundle(store);
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.AbstractColorPickerState.class, "color", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.AbstractColorPickerState.class, "popupVisible", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.AbstractColorPickerState.class, "showDefaultCaption", new Type(java.lang.Boolean.class));
            store.setDelegateToWidget(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "color", "setColor");
            store.setDelegateToWidget(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "popupVisible", "setOpen");
            store.addOnStateChangeMethod(com.vaadin.client.ui.colorpicker.ColorPickerConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.colorpicker.ColorPickerConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
          }
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.AbstractColorPickerState::color = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.colorpicker.AbstractColorPickerState::color;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.AbstractColorPickerState::class, 'color', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.AbstractColorPickerState::popupVisible = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.colorpicker.AbstractColorPickerState::popupVisible);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.AbstractColorPickerState::class, 'popupVisible', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.AbstractColorPickerState::showDefaultCaption = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.colorpicker.AbstractColorPickerState::showDefaultCaption);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.AbstractColorPickerState::class, 'showDefaultCaption', data);
            
          }-*/;
          private void loadJsBundle(com.vaadin.client.metadata.TypeDataStore store) {
            loadNativeJs(store);
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("com.vaadin.client.ui.colorpicker.ColorPickerAreaConnector", new String[] {"com.vaadin.ui.ColorPickerArea",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setSuperClass(com.vaadin.shared.ui.colorpicker.AbstractColorPickerState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setSuperClass(com.vaadin.shared.ui.colorpicker.ColorPickerAreaState.class, com.vaadin.shared.ui.colorpicker.AbstractColorPickerState.class);
            store.setClass("com.vaadin.ui.ColorPickerArea", com.vaadin.client.ui.colorpicker.ColorPickerAreaConnector.class);
            store.setConstructor(com.vaadin.client.ui.colorpicker.ColorPickerAreaConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.colorpicker.ColorPickerAreaConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.colorpicker.ColorPickerAreaState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.colorpicker.ColorPickerAreaState.class);
              }
            });
            store.setReturnType(com.vaadin.client.ui.colorpicker.ColorPickerAreaConnector.class, "getWidget", new Type(com.vaadin.client.ui.VColorPickerArea.class));
            store.setReturnType(com.vaadin.client.ui.colorpicker.ColorPickerAreaConnector.class, "getState", new Type(com.vaadin.shared.ui.colorpicker.ColorPickerAreaState.class));
            store.setInvoker(com.vaadin.client.ui.VColorPickerArea.class, "setColor",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VColorPickerArea) target).setColor((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VColorPickerArea.class, "setOpen",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VColorPickerArea) target).setOpen((java.lang.Boolean) params[0]);
                return null;
              }
            });
            loadJsBundle(store);
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.AbstractColorPickerState.class, "color", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.AbstractColorPickerState.class, "popupVisible", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.AbstractColorPickerState.class, "showDefaultCaption", new Type(java.lang.Boolean.class));
            store.setDelegateToWidget(com.vaadin.shared.ui.colorpicker.ColorPickerAreaState.class, "color", "setColor");
            store.setDelegateToWidget(com.vaadin.shared.ui.colorpicker.ColorPickerAreaState.class, "popupVisible", "setOpen");
            store.addOnStateChangeMethod(com.vaadin.client.ui.colorpicker.ColorPickerAreaConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.colorpicker.ColorPickerAreaConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
          }
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.AbstractColorPickerState::color = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.colorpicker.AbstractColorPickerState::color;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.AbstractColorPickerState::class, 'color', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.AbstractColorPickerState::popupVisible = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.colorpicker.AbstractColorPickerState::popupVisible);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.AbstractColorPickerState::class, 'popupVisible', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.AbstractColorPickerState::showDefaultCaption = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@com.vaadin.shared.ui.colorpicker.AbstractColorPickerState::showDefaultCaption);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.AbstractColorPickerState::class, 'showDefaultCaption', data);
            
          }-*/;
          private void loadJsBundle(com.vaadin.client.metadata.TypeDataStore store) {
            loadNativeJs(store);
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("com.vaadin.client.ui.richtextarea.RichTextAreaConnector", new String[] {"com.vaadin.ui.RichTextArea",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setSuperClass(com.vaadin.shared.ui.richtextarea.RichTextAreaState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setClass("com.vaadin.ui.RichTextArea", com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class);
            store.setConstructor(com.vaadin.client.ui.VRichTextArea.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VRichTextArea.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.richtextarea.RichTextAreaState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.richtextarea.RichTextAreaState.class);
              }
            });
            store.setReturnType(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class, "getWidget", new Type(com.vaadin.client.ui.VRichTextArea.class));
            store.setReturnType(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class, "getState", new Type(com.vaadin.shared.ui.richtextarea.RichTextAreaState.class));
            store.setInvoker(com.vaadin.client.ui.VRichTextArea.class, "setMaxLength",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VRichTextArea) target).setMaxLength((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VRichTextArea.class, "setValue",new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VRichTextArea) target).setValue((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class, "updateReadOnly",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.richtextarea.RichTextAreaConnector::updateReadOnly(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class, "updateValueChangeMode",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.richtextarea.RichTextAreaConnector::updateValueChangeMode(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class, "updateValueChangeTimeout",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.richtextarea.RichTextAreaConnector::updateValueChangeTimeout(*)();
                return null;
              }-*/;
            });
            loadJsBundle(store);
            store.setPropertyType(com.vaadin.shared.ui.richtextarea.RichTextAreaState.class, "maxLength", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.richtextarea.RichTextAreaState.class, "value", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.richtextarea.RichTextAreaState.class, "valueChangeMode", new Type(com.vaadin.shared.ui.ValueChangeMode.class));
            store.setPropertyType(com.vaadin.shared.ui.richtextarea.RichTextAreaState.class, "valueChangeTimeout", new Type(java.lang.Integer.class));
            store.setDelegateToWidget(com.vaadin.shared.ui.richtextarea.RichTextAreaState.class, "maxLength", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.richtextarea.RichTextAreaState.class, "value", "");
            store.addOnStateChangeMethod(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateReadOnly", new String[] {"readOnly", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateValueChangeMode", new String[] {"valueChangeMode", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateValueChangeTimeout", new String[] {"valueChangeTimeout", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
          }
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.richtextarea.RichTextAreaState::maxLength = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.richtextarea.RichTextAreaState::maxLength);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.richtextarea.RichTextAreaState::class, 'maxLength', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.richtextarea.RichTextAreaState::value = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.richtextarea.RichTextAreaState::value;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.richtextarea.RichTextAreaState::class, 'value', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.richtextarea.RichTextAreaState::valueChangeMode = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.richtextarea.RichTextAreaState::valueChangeMode;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.richtextarea.RichTextAreaState::class, 'valueChangeMode', data);
            
            var data = {
              noLayout: 1, 
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.richtextarea.RichTextAreaState::valueChangeTimeout = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.richtextarea.RichTextAreaState::valueChangeTimeout);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.richtextarea.RichTextAreaState::class, 'valueChangeTimeout', data);
            
          }-*/;
          private void loadJsBundle(com.vaadin.client.metadata.TypeDataStore store) {
            loadNativeJs(store);
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector", new String[] {"com.vaadin.ui.components.colorpicker.ColorPickerGradient",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setSuperClass(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setClass("com.vaadin.ui.components.colorpicker.ColorPickerGradient", com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector.class);
            store.setConstructor(com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class);
              }
            });
            store.setReturnType(com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector.class, "getState", new Type(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class));
            store.setInvoker(com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector.class, "updateBgColor",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector::updateBgColor(*)();
                return null;
              }-*/;
            });
            store.setInvoker(com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector.class, "updateCursor",new JsniInvoker() {
              protected native Object jsniInvoke(Object target, com.vaadin.client.JsArrayObject<Object> params) /*-{ 
                target.@com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector::updateCursor(*)();
                return null;
              }-*/;
            });
            loadJsBundle(store);
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "bgColor", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "cursorX", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "cursorY", new Type(java.lang.Integer.class));
            store.addOnStateChangeMethod(com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateBgColor", new String[] {"bgColor", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod("updateCursor", new String[] {"cursorX", "cursorY", }));
          }
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGradientState::bgColor = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGradientState::bgColor;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerGradientState::class, 'bgColor', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGradientState::cursorX = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGradientState::cursorX);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerGradientState::class, 'cursorX', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGradientState::cursorY = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGradientState::cursorY);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerGradientState::class, 'cursorY', data);
            
          }-*/;
          private void loadJsBundle(com.vaadin.client.metadata.TypeDataStore store) {
            loadNativeJs(store);
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("com.vaadin.client.ui.colorpicker.ColorPickerGridConnector", new String[] {"com.vaadin.ui.components.colorpicker.ColorPickerGrid",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setSuperClass(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, com.vaadin.shared.AbstractFieldState.class);
            store.setClass("com.vaadin.ui.components.colorpicker.ColorPickerGrid", com.vaadin.client.ui.colorpicker.ColorPickerGridConnector.class);
            store.setConstructor(com.vaadin.client.ui.colorpicker.ColorPickerGridConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.colorpicker.ColorPickerGridConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class);
              }
            });
            store.setReturnType(com.vaadin.client.ui.colorpicker.ColorPickerGridConnector.class, "getState", new Type(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class));
            loadJsBundle(store);
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "changedColor", new Type(java.lang.String[].class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "changedX", new Type(java.lang.String[].class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "changedY", new Type(java.lang.String[].class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "columnCount", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "rowCount", new Type(java.lang.Integer.class));
            store.addOnStateChangeMethod(com.vaadin.client.ui.colorpicker.ColorPickerGridConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(com.vaadin.client.ui.colorpicker.ColorPickerGridConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
          }
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::changedColor = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::changedColor;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::class, 'changedColor', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::changedX = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::changedX;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::class, 'changedX', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::changedY = value;
              },
              getter: function(bean) {
                return bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::changedY;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::class, 'changedY', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::columnCount = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::columnCount);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::class, 'columnCount', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::rowCount = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::rowCount);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@com.vaadin.shared.ui.colorpicker.ColorPickerGridState::class, 'rowCount', data);
            
          }-*/;
          private void loadJsBundle(com.vaadin.client.metadata.TypeDataStore store) {
            loadNativeJs(store);
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("org.vaadin.addon.calendar.client.CalendarConnector", new String[] {"org.vaadin.addon.calendar.Calendar",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setSuperClass(org.vaadin.addon.calendar.client.CalendarState.Action.class, java.lang.Object.class);
            store.setSuperClass(org.vaadin.addon.calendar.client.CalendarState.Day.class, java.lang.Object.class);
            store.setSuperClass(org.vaadin.addon.calendar.client.CalendarState.Item.class, java.lang.Object.class);
            store.setSuperClass(org.vaadin.addon.calendar.client.CalendarState.class, com.vaadin.shared.AbstractComponentState.class);
            store.setClass("org.vaadin.addon.calendar.Calendar", org.vaadin.addon.calendar.client.CalendarConnector.class);
            store.setConstructor(org.vaadin.addon.calendar.client.CalendarConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(org.vaadin.addon.calendar.client.CalendarConnector.class);
              }
            });
            store.setConstructor(org.vaadin.addon.calendar.client.CalendarState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(org.vaadin.addon.calendar.client.CalendarState.class);
              }
            });
            store.setConstructor(org.vaadin.addon.calendar.client.CalendarState.Action.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(org.vaadin.addon.calendar.client.CalendarState.Action.class);
              }
            });
            store.setConstructor(org.vaadin.addon.calendar.client.CalendarState.Day.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(org.vaadin.addon.calendar.client.CalendarState.Day.class);
              }
            });
            store.setConstructor(org.vaadin.addon.calendar.client.CalendarState.Item.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(org.vaadin.addon.calendar.client.CalendarState.Item.class);
              }
            });
            store.setConstructor(org.vaadin.addon.calendar.client.ui.VCalendar.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(org.vaadin.addon.calendar.client.ui.VCalendar.class);
              }
            });
            store.setReturnType(org.vaadin.addon.calendar.client.CalendarConnector.class, "getState", new Type(org.vaadin.addon.calendar.client.CalendarState.class));
            store.setReturnType(org.vaadin.addon.calendar.client.CalendarConnector.class, "getWidget", new Type(org.vaadin.addon.calendar.client.ui.VCalendar.class));
            loadJsBundle(store);
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Action.class, "actionKey", new Type(java.lang.String.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.class, "actions", new Type("java.util.List", new Type[] {new Type(org.vaadin.addon.calendar.client.CalendarState.Action.class), }));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Item.class, "allDay", new Type(java.lang.Boolean.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Day.class, "blockedSlots", new Type("java.util.Set", new Type[] {new Type(java.lang.Long.class), }));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Action.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Item.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Item.class, "clickable", new Type(java.lang.Boolean.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Day.class, "date", new Type(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Item.class, "dateCaptionFormat", new Type(java.lang.String.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Item.class, "dateFrom", new Type(java.lang.String.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Item.class, "dateTo", new Type(java.lang.String.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.class, "dayNames", new Type(java.lang.String[].class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Day.class, "dayOfWeek", new Type(java.lang.Integer.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.class, "days", new Type("java.util.List", new Type[] {new Type(org.vaadin.addon.calendar.client.CalendarState.Day.class), }));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Item.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Action.class, "endDate", new Type(java.lang.String.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.class, "firstDayOfWeek", new Type(java.lang.Integer.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.class, "firstHourOfDay", new Type(java.lang.Integer.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.class, "firstVisibleDayOfWeek", new Type(java.lang.Integer.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.class, "format24H", new Type(java.lang.Boolean.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Action.class, "iconKey", new Type(java.lang.String.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Item.class, "index", new Type(java.lang.Integer.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.class, "itemCaptionAsHtml", new Type(java.lang.Boolean.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.class, "itemSortOrder", new Type(org.vaadin.addon.calendar.client.CalendarState.ItemSortOrder.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.class, "items", new Type("java.util.List", new Type[] {new Type(org.vaadin.addon.calendar.client.CalendarState.Item.class), }));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.class, "lastHourOfDay", new Type(java.lang.Integer.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.class, "lastVisibleDayOfWeek", new Type(java.lang.Integer.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Day.class, "localizedDateFormat", new Type(java.lang.String.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.class, "monthNames", new Type(java.lang.String[].class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Item.class, "moveable", new Type(java.lang.Boolean.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.class, "now", new Type(org.vaadin.addon.calendar.client.ui.schedule.CalDate.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Item.class, "resizeable", new Type(java.lang.Boolean.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.class, "scroll", new Type(java.lang.Integer.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Action.class, "startDate", new Type(java.lang.String.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Item.class, "styleName", new Type(java.lang.String.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Item.class, "timeFrom", new Type(java.lang.String.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Item.class, "timeTo", new Type(java.lang.String.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Day.class, "week", new Type(java.lang.Integer.class));
            store.setPropertyType(org.vaadin.addon.calendar.client.CalendarState.Day.class, "yearOfWeek", new Type(java.lang.Integer.class));
            store.setSerializerFactory(org.vaadin.addon.calendar.client.CalendarState.ItemSortOrder.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<org.vaadin.addon.calendar.client.CalendarState.ItemSortOrder>() {
                  public elemental.json.JsonValue serialize(org.vaadin.addon.calendar.client.CalendarState.ItemSortOrder value, com.vaadin.client.ApplicationConnection connection) {
                    org.vaadin.addon.calendar.client.CalendarState.ItemSortOrder castedValue = (org.vaadin.addon.calendar.client.CalendarState.ItemSortOrder) value;
                    return elemental.json.Json.create(castedValue.name());
                  }
                  public org.vaadin.addon.calendar.client.CalendarState.ItemSortOrder deserialize(Type type, elemental.json.JsonValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = jsonValue.asString();
                    if ("UNSORTED".equals(enumIdentifier)) {
                      return org.vaadin.addon.calendar.client.CalendarState.ItemSortOrder.UNSORTED;
                    }
                    if ("START_DATE_DESC".equals(enumIdentifier)) {
                      return org.vaadin.addon.calendar.client.CalendarState.ItemSortOrder.START_DATE_DESC;
                    }
                    if ("START_DATE_ASC".equals(enumIdentifier)) {
                      return org.vaadin.addon.calendar.client.CalendarState.ItemSortOrder.START_DATE_ASC;
                    }
                    if ("DURATION_DESC".equals(enumIdentifier)) {
                      return org.vaadin.addon.calendar.client.CalendarState.ItemSortOrder.DURATION_DESC;
                    }
                    if ("DURATION_ASC".equals(enumIdentifier)) {
                      return org.vaadin.addon.calendar.client.CalendarState.ItemSortOrder.DURATION_ASC;
                    }
                    return null;
                  }
                };
              }
            });
            store.addOnStateChangeMethod(org.vaadin.addon.calendar.client.CalendarConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "setErrorLevel", new String[] {"errorMessage", "errorLevel", }));
            store.addOnStateChangeMethod(org.vaadin.addon.calendar.client.CalendarConnector.class, new com.vaadin.client.metadata.OnStateChangeMethod(com.vaadin.client.ui.AbstractComponentConnector.class, "handleContextClickListenerChange", new String[] {"registeredEventListeners", }));
          }
          @com.google.gwt.core.client.UnsafeNativeLong
          private native void loadNativeJs(com.vaadin.client.metadata.TypeDataStore store) /*-{
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Action::actionKey = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState.Action::actionKey;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Action::class, 'actionKey', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState::actions = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState::actions;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState::class, 'actions', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Item::allDay = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@org.vaadin.addon.calendar.client.CalendarState.Item::allDay);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Item::class, 'allDay', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Day::blockedSlots = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState.Day::blockedSlots;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Day::class, 'blockedSlots', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Action::caption = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState.Action::caption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Action::class, 'caption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Item::caption = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState.Item::caption;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Item::class, 'caption', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Item::clickable = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@org.vaadin.addon.calendar.client.CalendarState.Item::clickable);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Item::class, 'clickable', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Day::date = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState.Day::date;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Day::class, 'date', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Item::dateCaptionFormat = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState.Item::dateCaptionFormat;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Item::class, 'dateCaptionFormat', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Item::dateFrom = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState.Item::dateFrom;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Item::class, 'dateFrom', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Item::dateTo = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState.Item::dateTo;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Item::class, 'dateTo', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState::dayNames = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState::dayNames;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState::class, 'dayNames', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Day::dayOfWeek = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@org.vaadin.addon.calendar.client.CalendarState.Day::dayOfWeek);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Day::class, 'dayOfWeek', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState::days = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState::days;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState::class, 'days', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Item::description = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState.Item::description;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Item::class, 'description', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Action::endDate = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState.Action::endDate;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Action::class, 'endDate', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState::firstDayOfWeek = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@org.vaadin.addon.calendar.client.CalendarState::firstDayOfWeek);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState::class, 'firstDayOfWeek', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState::firstHourOfDay = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@org.vaadin.addon.calendar.client.CalendarState::firstHourOfDay);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState::class, 'firstHourOfDay', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState::firstVisibleDayOfWeek = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@org.vaadin.addon.calendar.client.CalendarState::firstVisibleDayOfWeek);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState::class, 'firstVisibleDayOfWeek', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState::format24H = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@org.vaadin.addon.calendar.client.CalendarState::format24H);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState::class, 'format24H', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Action::iconKey = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState.Action::iconKey;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Action::class, 'iconKey', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Item::index = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@org.vaadin.addon.calendar.client.CalendarState.Item::index);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Item::class, 'index', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState::itemCaptionAsHtml = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@org.vaadin.addon.calendar.client.CalendarState::itemCaptionAsHtml);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState::class, 'itemCaptionAsHtml', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState::itemSortOrder = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState::itemSortOrder;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState::class, 'itemSortOrder', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState::items = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState::items;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState::class, 'items', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState::lastHourOfDay = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@org.vaadin.addon.calendar.client.CalendarState::lastHourOfDay);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState::class, 'lastHourOfDay', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState::lastVisibleDayOfWeek = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@org.vaadin.addon.calendar.client.CalendarState::lastVisibleDayOfWeek);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState::class, 'lastVisibleDayOfWeek', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Day::localizedDateFormat = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState.Day::localizedDateFormat;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Day::class, 'localizedDateFormat', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState::monthNames = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState::monthNames;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState::class, 'monthNames', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Item::moveable = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@org.vaadin.addon.calendar.client.CalendarState.Item::moveable);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Item::class, 'moveable', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState::now = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState::now;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState::class, 'now', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Item::resizeable = value.@java.lang.Boolean::booleanValue()();
              },
              getter: function(bean) {
                return @java.lang.Boolean::valueOf(Z)(bean.@org.vaadin.addon.calendar.client.CalendarState.Item::resizeable);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Item::class, 'resizeable', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState::scroll = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@org.vaadin.addon.calendar.client.CalendarState::scroll);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState::class, 'scroll', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Action::startDate = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState.Action::startDate;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Action::class, 'startDate', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Item::styleName = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState.Item::styleName;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Item::class, 'styleName', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Item::timeFrom = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState.Item::timeFrom;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Item::class, 'timeFrom', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Item::timeTo = value;
              },
              getter: function(bean) {
                return bean.@org.vaadin.addon.calendar.client.CalendarState.Item::timeTo;
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Item::class, 'timeTo', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Day::week = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@org.vaadin.addon.calendar.client.CalendarState.Day::week);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Day::class, 'week', data);
            
            var data = {
              setter: function(bean, value) {
                bean.@org.vaadin.addon.calendar.client.CalendarState.Day::yearOfWeek = value.@java.lang.Integer::intValue()();
              },
              getter: function(bean) {
                return @java.lang.Integer::valueOf(I)(bean.@org.vaadin.addon.calendar.client.CalendarState.Day::yearOfWeek);
              }
            };
            store.@com.vaadin.client.metadata.TypeDataStore::setPropertyData(Ljava/lang/Class;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(@org.vaadin.addon.calendar.client.CalendarState.Day::class, 'yearOfWeek', data);
            
          }-*/;
          private void loadJsBundle(com.vaadin.client.metadata.TypeDataStore store) {
            loadNativeJs(store);
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
  }
}
