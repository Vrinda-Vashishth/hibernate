package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class question1 {

	public static void main(String[] args) {

        Configuration con = new Configuration().configure().addAnnotatedClass(Author.class).addAnnotatedClass(Book.class);
		
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf = con.buildSessionFactory(reg); 		
		
		Session session = sf.openSession();		
		 
		Transaction tx = session.beginTransaction();

		Author author =new Author();
		Author author2 =new Author();
		Author author3 =new Author();
		Author author4 =new Author();
		Author author5 =new Author();
		Author author6 =new Author();
		Author author7 =new Author();
		Author author8 =new Author();
		Author author9 =new Author();
		Author author10 =new Author();
		session.flush();
        //1st author
        author.setAuthorid(471);
        author.setFname("Chetan");
        author.setLname("Bhagat");
        author.setEmail("chetan.bhagat@gmail.com");
        author.setContact(123456789);
        session.save(author);
        //2nd author
        author2.setAuthorid(522);
        author2.setFname("James");
        author2.setLname("Patterson");
        author2.setEmail("james.patterson@gmail.com");
        author2.setContact(68732134);
        session.save(author2);
        //3rd author
        author3.setAuthorid(352);
        author3.setFname("J.K.");
        author3.setLname("Rowling");
        author3.setEmail("rowling.jk@yahoo.com");
        author3.setContact(446229);
        session.save(author3);
        //4th author
        author4.setAuthorid(252);
        author4.setFname("Bill");
        author4.setLname("Clinton");
        author4.setEmail("clinton@outlook.com");
        author4.setContact(875611);
        session.save(author4);
        //5th author
        author5.setAuthorid(56);
		author5.setFname("Nora");
        author5.setLname("Roberts");
        author5.setEmail("nora.roberts@gmail.com");
        author5.setContact(8675926);
        session.save(author5);
        //6th author
        author6.setAuthorid(246);
        author6.setFname("Tim");
        author6.setLname("Tigner");
        author6.setEmail("tignertim@gmail.com");
        author6.setContact(6783119);
        session.save(author6);
        //7th author
        author7.setAuthorid(335);
        author7.setFname("Kevin");
        author7.setLname("Horsley");
        author7.setEmail("horsley.kevinn@yahoo.com");
        author7.setContact(61368563);
        session.save(author7);
        //8th author
        author8.setAuthorid(655);
        author8.setFname("Stephen");
        author8.setLname("King");
        author8.setEmail("stephen@gmail.com");
        author8.setContact(692935);
        session.save(author8);
        //9th author
        author9.setAuthorid(682);
        author9.setFname("Jordan");
        author9.setLname("Peterson");
        author9.setEmail("jordanpeterson@gmail.com");
        author9.setContact(5374875);
        session.save(author9);
        //10th author
        author10.setAuthorid(512);
        author10.setFname("Kristin");
        author10.setLname("Hannah");          
        author10.setEmail("hannah.kristin@yahoo.com");
        author10.setContact(6187685);
        session.save(author10);
        
        session.flush();
        Book book=new Book();
        Book book2 = new Book();
        Book book3=new Book();
        Book book4=new Book();
        Book book5=new Book();
        Book book6=new Book();
        Book book7=new Book();
        Book book8=new Book();
        Book book9=new Book();
        Book book10=new Book();
        //1st book
        book.setBookId(546);
        book.setTitle("The 3 Mistakes of My Life");
		session.save(book);
        
		//2nd book
        book2.setBookId(484);
        book2.setTitle("Witch & Wizard");
		session.save(book2);
       
        //3rd book
        book3.setBookId(56786);
        book3.setTitle("Harry Potter");
		session.save(book3);
        
        //4th book
        book4.setBookId(2586);
        book4.setTitle("Back To Work");
		session.save(book4);
       
        //5th book
        book5.setBookId(5236);
        book5.setTitle("Island of Glass");
		session.save(book5);
        
        //6th book
        book6.setBookId(2324);
        book6.setTitle("Betrayal");
		session.save(book6);
        
        //7th book
        book7.setBookId(2314);
        book7.setTitle("Unlimited Memory");
		session.save(book7);
        
        //8th book
        book8.setBookId(435);
        book8.setTitle("IT");
		session.save(book8);
        
        //9th book
        book9.setBookId(1587);
        book9.setTitle("12 Rules for Life");
		session.save(book9);
       
        //10th book
        book10.setBookId(5357);
        book10.setTitle("The Great Alone");
		session.save(book10);

		tx.commit();
		session.close();
  

	}

}
