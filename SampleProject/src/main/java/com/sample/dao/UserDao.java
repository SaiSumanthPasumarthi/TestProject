package com.sample.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.sample.models.UserMaster;


@Repository
public class UserDao {
	
	Configuration configuration = new Configuration().configure("hibernate.cgf.xml");
    StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
        .applySettings(configuration.getProperties());
    SessionFactory factory = configuration.buildSessionFactory(builder.build());
	
	public UserMaster getUserMaster(Long userid) {
		 Session session = factory.openSession();
		    Transaction transaction = session.beginTransaction();
		    System.out.println("above criteria   "+userid);
	
		    Criteria cr = session.createCriteria(UserMaster.class);
		    cr.add(Restrictions.eq("userid", userid));
		    UserMaster userMaster = (com.sample.models.UserMaster) cr.uniqueResult();
		    System.out.println("Dao");
			System.out.println( userMaster);
		    transaction.commit();
		    session.flush();
		    session.close();
		    
		    
		    return userMaster;
			

	}
public boolean deleteUserDetails(Long userid){
		
	    Session session = factory.openSession();
	    Transaction transaction = session.beginTransaction();
	    System.out.println("userid...."+userid);
	    String hql = "delete from users where userid= '"+userid+"'";
	    Query query = session.createQuery(hql);
	    System.out.println("hql...."+hql);
	    query.executeUpdate();
	    transaction.commit();
	    session.flush();
	    session.close();
	    
	    return true;
	    
	}
    
}
