//package com.pineone.icbms.so.interfaces.database;
//
//import com.pineone.icbms.so.interfaces.database.model.LocationForDB;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//import javax.persistence.*;
//
///**
// * Created by melvin on 2017. 3. 24..
// */
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class CrudTest {
//
//    @Test
//    public void test() throws Exception {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("so_database");
//        EntityManager em = emf.createEntityManager(); //엔티티 매니저 생성
//
//        EntityTransaction tx = em.getTransaction(); //트랜잭션 기능 획득
//
//        try {
//            tx.begin(); //트랜잭션 시작
//            LocationForDB locationForDB = new LocationForDB(1731,"테스트장소","테스트uri");
//            em.persist(locationForDB);
//            tx.commit();//트랜잭션 커밋
//        } catch (Exception e) {
//            e.printStackTrace();
//            tx.rollback(); //트랜잭션 롤백
//        } finally {
//            em.close(); //엔티티 매니저 종료
//        }
//        emf.close(); //엔티티 매니저 팩토리 종료
//    }
//}
//