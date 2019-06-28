package controller;	
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.opensymphony.xwork2.ActionSupport;
//import services.*;
//import jpa.*;

import controller.Model.*;




public class ActionLogin extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String user;
	private String password;

	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String execute() throws Exception {
		Student student = new Student();
    	
		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf =con.buildSessionFactory(reg);  
    	
    	Session session = sf.openSession();
    	session.beginTransaction();
    	String hql = "select * from Student WHERE progId=:email";
    	SQLQuery query = session.createSQLQuery(hql);
    	query.setParameter("email",getUser().toString());
    	query.addEntity(Student.class);
    	//System.out.print(query.toString());
    	Student students = (Student) query.uniqueResult();
    	System.out.print(students);
    	session.getTransaction().commit();
    	return "success";
	}
}