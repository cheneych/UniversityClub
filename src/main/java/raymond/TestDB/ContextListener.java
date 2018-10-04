package raymond.TestDB;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.eclipse.birt.core.framework.Platform;
import org.eclipse.birt.report.engine.api.EngineConfig;
import org.eclipse.birt.report.engine.api.IReportEngine;
import org.eclipse.birt.report.engine.api.IReportEngineFactory;
import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import com.vaadin.external.org.slf4j.Logger;
import com.vaadin.external.org.slf4j.LoggerFactory;

//import edu.missouri.operations.data.OracleBoolean;
//import edu.missouri.operations.reportcenter.Pools.Names;
//import edu.missouri.operations.reportcenter.data.Property;
//import edu.missouri.operations.reportcenter.data.Property.PropertyException;
//import edu.missouri.operations.reportcenter.data.old.PropertyJDBCDataProvider;
//import edu.missouri.operations.scheduler.jobs.ReportJob;

@WebListener("Raymond Context Listener")
public class ContextListener implements ServletContextListener {

	protected static Logger logger = LoggerFactory.getLogger(ContextListener.class);
	//private final static String logFile = "/home/reportcenter/reports.log";

	public ContextListener() {
	}

//	private void initReport(ServletContext context) {
//
//		// FontFactory.register("font.ttf");
//
//		if (logger.isDebugEnabled()) {
//			logger.debug("ReportEngine is being started.");
//		}
//
//		EngineConfig config = new EngineConfig();
//		config.setLogConfig(logFile, java.util.logging.Level.SEVERE);
//
//		try {
//
//			Platform.startup(config);
//			IReportEngineFactory factory = (IReportEngineFactory) Platform
//					.createFactoryObject(IReportEngineFactory.EXTENSION_REPORT_ENGINE_FACTORY);
//
//			IReportEngine engine = factory.createReportEngine(config);
//			context.setAttribute("REPORTENGINE", engine);
//
//		} catch (Exception e) {
//
//			if (logger.isErrorEnabled()) {
//				logger.error("Error in initializing ReportEngine", e);
//			}
//
//		}
//
//	}
//
//	private void scheduleReportJobs(Scheduler sched) throws SchedulerException {
//
//		String sql = "select * from reportcrontaskdetails where isactive = 1";
//		Connection conn = null;
//		try {
//			conn = Pools.getConnection(Names.REPORTCENTER);
//
//			try (PreparedStatement stmt = conn.prepareStatement(sql)) {
//
//				try (ResultSet rs = stmt.executeQuery()) {
//
//					while (rs.next()) {
//
//						if (logger.isDebugEnabled()) {
//
//							logger.debug("Scheduling report crontask " + rs.getString("ID") + " "
//									+ rs.getString("REPORTID") + " " + rs.getString("CRONEXPRESSION"));
//						}
//
//						try {
//
//							JobDetail jobDetail = JobBuilder.newJob(ReportJob.class)
//									.withIdentity("report" + rs.getString("ID"), "reportgroup")
//									.usingJobData("ReportCronTaskId", rs.getString("ID").toString())
//									.usingJobData("ReportId", rs.getString("REPORTID"))
//									.usingJobData("ScheduledBy", rs.getString("SCHEDULEDBY"))
//									.usingJobData("FileFormat", rs.getString("FILEFORMAT"))
//									.usingJobData("OneTime", OracleBoolean.toBoolean(rs.getBigDecimal("ISONETIME")))
//									.build();
//
//							CronTrigger trigger = TriggerBuilder.newTrigger()
//									.withIdentity("trigger" + rs.getString("ID"), "reportgroup")
//									.withSchedule(CronScheduleBuilder.cronSchedule(rs.getString("CRONEXPRESSION")))
//									.build();
//
//							sched.scheduleJob(jobDetail, trigger);
//
//						} catch (org.quartz.SchedulerException se) {
//
//							if (logger.isErrorEnabled()) {
//								logger.error("Unable to reschedule reportcontask {} ", rs.getString("ID"), se);
//							}
//
//							try (PreparedStatement stmt1 = conn
//									.prepareStatement("update reportcrontasks set isactive = 0 where id = ?")) {
//
//								stmt1.setString(1, rs.getString("ID"));
//								stmt1.executeUpdate();
//
//							}
//						}
//					}
//				}
//			}
//			conn.commit();
//
//		} catch (SQLException sqle) {
//
//			if (logger.isErrorEnabled()) {
//				logger.error("Could not initialized report jobs", sqle);
//			}
//
//		} finally {
//			Pools.releaseConnection(Pools.Names.REPORTCENTER, conn);
//		}
//
//	}

//	private void scheduleSystemJobs(Scheduler sched) throws SchedulerException {
//
//		String sql = "select * from crontasks where isactive = 1";
//
//		Connection conn = null;
//		try {
//			conn = Pools.getConnection(Pools.Names.REPORTCENTER);
//
//			System.err.println("SCHEDULESYSTEMJOBS");
//
//			try (PreparedStatement stmt = conn.prepareStatement(sql)) {
//
//				try (ResultSet rs = stmt.executeQuery()) {
//
//					while (rs.next()) {
//
//						if (logger.isDebugEnabled()) {
//							logger.debug("Scheduling System crontask " + rs.getString("ID") + " "
//									+ rs.getString("JAVACLASS") + " " + rs.getString("CRONEXPRESSION"));
//						}
//
//						try {
//
//							@SuppressWarnings("unchecked")
//							Class<? extends Job> jobClass = (Class<? extends Job>) Class.forName(
//									rs.getString("JAVACLASS"), false, Thread.currentThread().getContextClassLoader());
//
//							JobDetail jobDetail = JobBuilder.newJob(jobClass)
//									.withIdentity("job" + rs.getString("ID"), "systemgroup").build();
//
//							CronTrigger trigger = TriggerBuilder.newTrigger()
//									.withIdentity("trigger" + rs.getString("ID"), "systemgroup")
//									.withSchedule(CronScheduleBuilder.cronSchedule(rs.getString("CRONEXPRESSION")))
//									.build();
//
//							sched.scheduleJob(jobDetail, trigger);
//
//						} catch (ClassNotFoundException e) {
//
//							if (logger.isErrorEnabled()) {
//								logger.error("Could not load class", e);
//							}
//
//						}
//
//					}
//				}
//			}
//
//		} catch (SQLException sqle) {
//
//			if (logger.isErrorEnabled()) {
//				logger.error("Unable to execute crontask initialization sql", sqle);
//			}
//
//		} finally {
//			Pools.releaseConnection(Pools.Names.REPORTCENTER, conn);
//		}
//
//	}

//	private void initScheduler(ServletContext context) {
//
//		SchedulerFactory sf = new StdSchedulerFactory();
//		try {
//
//			Scheduler sched = sf.getScheduler();
//
//			if (logger.isDebugEnabled()) {
//				logger.debug("Starting Quartz scheduler");
//			}
//
//			context.setAttribute("SCHEDULER", sched);
//			sched.start();
//
//			Property p = PropertyJDBCDataProvider.getSystemProperty("crontasks.enable")
//					.getOrThrow(msg -> new PropertyException(msg));
//
//			if ("1".equals(p.getVALUE())) {
//
//				Property p1 = PropertyJDBCDataProvider.getSystemProperty("crontasks.server")
//						.getOrThrow(msg -> new PropertyException(msg));
//
//				String server = p1.getVALUE();
//
//				InetAddress serverHost = InetAddress.getLocalHost();
//				InetAddress crontaskHost = InetAddress.getByName(server);
//
//				if (serverHost.equals(crontaskHost)) {
//
//					scheduleSystemJobs(sched);
//					scheduleReportJobs(sched);
//
//				}
//
//			}
//
//		} catch (PropertyException e) {
//			logger.error("Unable to get Property", e);
//		} catch (UnknownHostException e) {
//			logger.error("Unable to get host", e);
//		} catch (SchedulerException e) {
//			logger.error("Quartz Schedular error", e);
//		} catch (Exception e) {
//			logger.error("Unexpected Exception in initScheduler", e);
//		}
//
//	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {

		if (logger.isDebugEnabled()) {
			logger.debug("Context Listener contextDestroyed Called.");
		}

		IReportEngine engine = (IReportEngine) event.getServletContext().getAttribute("REPORTENGINE");
		if (engine != null) {
			engine.destroy();
		}

		Scheduler sched = (Scheduler) event.getServletContext().getAttribute("SCHEDULER");
		try {
			if (sched != null) {
				sched.shutdown();
			}
		} catch (SchedulerException e) {
			if (logger.isErrorEnabled()) {
				logger.error("Could not shutdown scheduler");
			}
		}

		Pools pools = (Pools) event.getServletContext().getAttribute("POOLS");
		pools.shutdown();

	}
	
	@Override
	public void contextInitialized(ServletContextEvent event) {

		if (logger.isDebugEnabled()) {
			logger.debug("Context Listener contextInitialized Called.");
		}
		
		Pools pools = new Pools();
		
		event.getServletContext().setAttribute("POOLS", pools);
//
//		initReport(event.getServletContext());
//		initScheduler(event.getServletContext());

	}

}
