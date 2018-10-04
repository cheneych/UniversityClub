package raymond.report;
import java.util.HashMap;
import java.util.logging.Level;
import com.vaadin.server.VaadinService;
 
import org.eclipse.birt.core.framework.Platform;
import org.eclipse.birt.report.engine.api.EngineConfig;
import org.eclipse.birt.report.engine.api.EngineConstants;
import org.eclipse.birt.report.engine.api.EngineException;
import org.eclipse.birt.report.engine.api.HTMLActionHandler;
import org.eclipse.birt.report.engine.api.HTMLEmitterConfig;
import org.eclipse.birt.report.engine.api.HTMLRenderContext;
import org.eclipse.birt.report.engine.api.HTMLRenderOption;
import org.eclipse.birt.report.engine.api.HTMLServerImageHandler;
import org.eclipse.birt.report.engine.api.IReportEngine;
import org.eclipse.birt.report.engine.api.IReportEngineFactory;
import org.eclipse.birt.report.engine.api.IReportRunnable;
import org.eclipse.birt.report.engine.api.IRunAndRenderTask;
import org.eclipse.birt.report.engine.api.PDFRenderOption;
import org.eclipse.core.internal.registry.RegistryProviderFactory;

public class ExecuteReport {
	/**
	 * @throws EngineException
	 */
	public static void executeReport2() throws EngineException {
		 
	    IReportEngine engine = null;
	    EngineConfig config = null;
	 
	    try {
	        config = new EngineConfig();  
	        config.setLogConfig("c:/birt4.8/log", Level.FINEST);
	        Platform.startup(config);
	        final IReportEngineFactory FACTORY = (IReportEngineFactory) Platform
	            .createFactoryObject(IReportEngineFactory.EXTENSION_REPORT_ENGINE_FACTORY);
	        engine = FACTORY.createReportEngine(config);       
	 
	        // Open the report design
	        IReportRunnable design = null;
	        design = engine.openReportDesign("C:/birt4.8/ReportEngine/samples/questionnaire.rptdesign"); 
	        IRunAndRenderTask task = engine.createRunAndRenderTask(design);  
	        task.validateParameters();
	 
//	        final HTMLRenderOption HTML_OPTIONS = new HTMLRenderOption();       
//	        HTML_OPTIONS.setOutputFileName("C:/birt4.8/ReportEngine/resamples/hello_world.html");
//	        HTML_OPTIONS.setOutputFormat("html");
	        // HTML_OPTIONS.setHtmlRtLFlag(false);
	        // HTML_OPTIONS.setEmbeddable(false);
	        // HTML_OPTIONS.setImageDirectory("C:\\test\\images");
	 
	         final PDFRenderOption PDF_OPTIONS = new PDFRenderOption();
	         PDF_OPTIONS.setOutputFileName("C:/birt4.8/ReportEngine/resamples/" + "questionnaire" + ".pdf");
	         PDF_OPTIONS.setOutputFormat("pdf");
	 
	        task.setRenderOption(PDF_OPTIONS);
	        task.run();
	        task.close();
	        engine.destroy();
	    } catch(final Exception EX) {
	        EX.printStackTrace();
	    } finally {
	       Platform.shutdown();
	       //add to solve the problem: can only generate the pdf file once unless restart glassfish
	       RegistryProviderFactory.releaseDefault();
	       engine = null;
	    }
	}
	
	public static void executeReport() throws EngineException {
		 
	    IReportEngine engine = null;
	    EngineConfig config = null;
	 
	    try {
	        config = new EngineConfig();  
	        config.setLogConfig("c:/birt4.8/log", Level.FINEST);
	        Platform.startup(config);
	        final IReportEngineFactory FACTORY = (IReportEngineFactory) Platform
	            .createFactoryObject(IReportEngineFactory.EXTENSION_REPORT_ENGINE_FACTORY);
	        engine = FACTORY.createReportEngine(config);       
	 
	        // Open the report design
	        IReportRunnable design = null;
	        design = engine.openReportDesign("C:/birt4.8/ReportEngine/samples/uclub.rptdesign"); 
	        IRunAndRenderTask task = engine.createRunAndRenderTask(design);  
	        int fid, eid;
	        int flag = (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("create_or_modify");
	        if (flag == 1) {
	        	fid=  (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("fid_modify");
		        eid = (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("evtid_modify");	
	        } else {
	        	fid=  (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("fid_create");
		        eid = (int)VaadinService.getCurrentRequest().getWrappedSession().getAttribute("evtid_create");	
	        }
	        task.setParameterValue("param_2", fid);
	        task.setParameterValue("param_1", eid);
	        task.validateParameters();
	 
//	        final HTMLRenderOption HTML_OPTIONS = new HTMLRenderOption();       
//	        HTML_OPTIONS.setOutputFileName("C:/birt4.8/ReportEngine/resamples/hello_world.html");
//	        HTML_OPTIONS.setOutputFormat("html");
	        // HTML_OPTIONS.setHtmlRtLFlag(false);
	        // HTML_OPTIONS.setEmbeddable(false);
	        // HTML_OPTIONS.setImageDirectory("C:\\test\\images");
	 
	         final PDFRenderOption PDF_OPTIONS = new PDFRenderOption();
	         PDF_OPTIONS.setOutputFileName("C:/birt4.8/ReportEngine/resamples/" + fid + ".pdf");
	         PDF_OPTIONS.setOutputFormat("pdf");
	 
	        task.setRenderOption(PDF_OPTIONS);
	        task.run();
	        task.close();
	        engine.destroy();
	    } catch(final Exception EX) {
	        EX.printStackTrace();
	    } finally {
	       Platform.shutdown();
	       //add to solve the problem: can only generate the pdf file once unless restart glassfish
	       RegistryProviderFactory.releaseDefault();
	       engine = null;
	    }
	}

    public static void main() {
        try {
           executeReport();
        } catch (final Exception EX) {
           EX.printStackTrace();
        }
        
        try {
            executeReport2();
         } catch (final Exception EX) {
            EX.printStackTrace();
         }
    }
}