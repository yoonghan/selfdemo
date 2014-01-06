package app;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import junit.framework.Assert;

import org.junit.Test;

import com.ejb.image.interfaces.remote.IImageRemote;

public class TestApplication {
	@Test
	public void testEJB(){
		
		Context context = null;
		
//		System.setProperty("remote.connections", "default");
//		System.setProperty("endpoint.name", "client-endpoint");
//		System.setProperty("remote.connectionprovider.create.options.org.xnio.Options.SSL_ENABLED", "false");
//		System.setProperty("remote.connection.default.connect.options.org.xnio.Options.SASL_POLICY_NOANONYMOUS", "false");
//		
		Properties jndiProperties = new Properties();
		//jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
		final String REMOTE_CONN="remote://localhost:4447";
		System.out.println("Connecting..."+REMOTE_CONN);
		jndiProperties.put(Context.PROVIDER_URL, REMOTE_CONN);
		jndiProperties.put("jboss.naming.client.ejb.context", true);
//		try{
//			context = new InitialContext(jndiProperties);
//			System.out.println("Context:"+context);
//			//IImageRemote imageRemote = (IImageRemote) context.lookup("ejb:jbossas/ImageBean!com.ejb.image.interfaces.remote.IImageRemote");
//			IImageRemote imageRemote = null; 
//			imageRemote = (IImageRemote) context.lookup("ejb:global/ROOT/ImageBean!com.ejb.image.interfaces.remote.IImageRemote");
//			
//			imageRemote.insertImage("test", "test", "test", "test", "test");
//			System.out.println("Success");
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		try{
//			context = new InitialContext(jndiProperties);
//			System.out.println("Context:"+context);
//			//IImageRemote imageRemote = (IImageRemote) context.lookup("ejb:jbossas/ImageBean!com.ejb.image.interfaces.remote.IImageRemote");
//			IImageRemote imageRemote = null; 
//			imageRemote = (IImageRemote) context.lookup("ejb:app/ROOT/ImageBean!com.ejb.image.interfaces.remote.IImageRemote");
//			
//			imageRemote.insertImage("test", "test", "test", "test", "test");
//			System.out.println("Success");
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		try{
//			context = new InitialContext(jndiProperties);
//			System.out.println("Context:"+context);
//			//IImageRemote imageRemote = (IImageRemote) context.lookup("ejb:jbossas/ImageBean!com.ejb.image.interfaces.remote.IImageRemote");
//			IImageRemote imageRemote = null; 
//			imageRemote = (IImageRemote) context.lookup("ejb:module/ImageBean!com.ejb.image.interfaces.remote.IImageRemote");
//			
//			imageRemote.insertImage("test", "test", "test", "test", "test");
//			System.out.println("Success");
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		try{
			context = new InitialContext(jndiProperties);
			System.out.println("Context:"+context);
			IImageRemote imageRemote = (IImageRemote) context.lookup("resume-ear-0.0.1-SNAPSHOT/resume-ejb/ImageBean!com.ejb.image.interfaces.remote.IImageRemote");
			
			
			imageRemote.insertImage("test", "test", "test", "test", "test");
			System.out.println("Success");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		Assert.assertEquals("Hello World", "Hello World");
	}
}
