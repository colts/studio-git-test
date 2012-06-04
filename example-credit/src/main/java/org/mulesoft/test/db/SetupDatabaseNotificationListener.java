package org.mulesoft.test.db;
import org.apache.commons.dbutils.QueryRunner;
import org.mule.api.context.notification.MuleContextNotificationListener;
import org.mule.context.notification.MuleContextNotification;
import org.mule.transport.jdbc.JdbcConnector;

public class SetupDatabaseNotificationListener implements
		MuleContextNotificationListener<MuleContextNotification> {

	public void onNotification(MuleContextNotification notification) {
		if (notification.getAction() == MuleContextNotification.CONTEXT_STARTED)
        {
			JdbcConnector jdbcConnector = (JdbcConnector)notification.getMuleContext().getRegistry().lookupConnector("JDBC");
            
			try
	        {
	            deleteTable(jdbcConnector);
	        }
	        catch (Exception e)
	        {
	            try {
					createTable(jdbcConnector);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
	        }

	        	        

        }
	}
	
	protected void createTable(JdbcConnector jdbcConnector) throws Exception
    {
        QueryRunner qr = jdbcConnector.getQueryRunner();
        qr.update(jdbcConnector.getConnection(), "CREATE TABLE loanreq (mesageid VARCHAR(45), rating VARCHAR(45),rate VARCHAR(45))");   
        
    }
    
    protected void deleteTable(JdbcConnector jdbcConnector) throws Exception
    {
        QueryRunner qr = jdbcConnector.getQueryRunner();
        qr.update(jdbcConnector.getConnection(), "DELETE FROM loanreq");
    }
    
    

}
