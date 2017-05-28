package store;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.eclipse.persistence.internal.jpa.transaction.TransactionManagerImpl;


public class Main {
	
	

	public static void main(String[] args) {
		
		CD cd=new CD();
		cd.setTitle("Mitar Novo");
		cd.setPrice(20.5f);
		cd.setDescription("Narodnjaci");
		cd.setMusicCompany("CD RECORDS");
		cd.setNumberOfCDs(21);
		cd.setTotalDuration(149f);
		cd.setGenre("POP");
		
	
		
		
		
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("Agoncal2.inheritance");
       EntityManager em=emf.createEntityManager();
       EntityTransaction tx=em.getTransaction();
       
       tx.begin();
       em.persist(cd);
     
       tx.commit();

}
}