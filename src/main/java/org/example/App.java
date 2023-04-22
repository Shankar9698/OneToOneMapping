package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
//bi directional
     Address address=new Address();
     address.setId(101);
     address.setState("Telangana");

          Student student=new Student();
          student.setId(201);
          student.setName("Shankar");
     student.setAddress(address);


Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        /*session.save(student);
        session.save(address);
   */  Address address1=session.get(Address.class,101);
     System.out.println(address1.getStudent().id);
     System.out.println(address1.getStudent().name);
     transaction.commit();


        session.close();
        sessionFactory.close();



    }
}
