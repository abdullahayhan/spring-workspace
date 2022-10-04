package com.hibernatedemo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		// bunlar standart yazýlýr.
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		// Unit Of Work bir tasarým desenidir ve amacý : 
		// tüm iþlemler baþarýlý olmalý yoksa hepsi iptal edilir
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction(); // baþlýcam demek
			
			// HQL--> HÝBERNATE QUERY LANGUAGE sql cakmasý
			// SELECT * FROM CÝTY ile ayný þey en son listeye cevirip atýyoz
			// from City c where c.countryCode='TUR' AND c.district='Ankara'
			// from City c where c.name LIKE '%kar%'
			// from City c ORDER BY c.name 
			// select countryCode from City c GROUP BY c.countryCode bir kere getiriyor grupluyor yani
//			List<String> countryCode = session.createQuery("select countryCode from City c GROUP BY c.countryCode ").getResultList();
//			
//			for(String countryode:countryCode) {
//				System.out.println(countryode);
//			}
			
			// INSERT 
//			City city = new City();
//			city.setName("Düzce 10");
//			city.setCountryCode("TUR");
//			city.setDistrict("Karadeniz");
//			city.setPopulation(100000);
//			session.save(city); // veri ekleme
			
			// UPDATE
//			City city = session.get(City.class, 4090); // bu idye baglý veriyi bana komple getir demek
//			city.setPopulation(110000);
//			session.save(city); // yine savelememiz lazým

			// DELETE
			City city = session.get(City.class, 4090);
			session.delete(city);
			
			session.getTransaction().commit(); // veritabanýna gönder demek
			System.out.println("Þehir Silme Baþarýlý");
		}finally {
			factory.close();
		}
	}

}
