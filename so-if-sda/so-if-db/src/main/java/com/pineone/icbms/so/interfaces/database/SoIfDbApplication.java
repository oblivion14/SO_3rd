package com.pineone.icbms.so.interfaces.database;

import com.pineone.icbms.so.interfaces.database.controller.inputdata.VirtualObjectData;
import com.pineone.icbms.so.interfaces.database.logic.itf.VirtualObjectDAO;
import com.pineone.icbms.so.interfaces.database.model.VirtualObjectForDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = "com.pineone.icbms.so")
@EntityScan(basePackages = "com.pineone.icbms.so")
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.pineone.icbms.so")
public class SoIfDbApplication { //implements CommandLineRunner{

    @Autowired
    private VirtualObjectDAO virtualObjectDAO;

    /**
     * run application.<BR/>
     * @param args arguments
     */
    public static void main(String[] args) { SpringApplication.run(SoIfDbApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        test();
//    }

//    public void test(){
//        VirtualObjectData virtualObjectData = new VirtualObjectData("icbms-vo-test",1,1,"test설명");
//        virtualObjectDAO.createVirtualObject(virtualObjectData);
//        virtualObjectDAO.createVirtualObject(virtualObjectData);
//
//        List<VirtualObjectForDB> virtualObjectForDBList = virtualObjectDAO.retrieveVirtualObjectList();
//
//        for(VirtualObjectForDB virtualObjectForDB : virtualObjectForDBList){
//            System.out.println(virtualObjectForDB.toString());
//        }
//
//        VirtualObjectData virtualObjectChangeData = new VirtualObjectData("icbms-vo-test-change",1,1,"test변경설명");
//        virtualObjectDAO.updateVirtualObject(3,virtualObjectChangeData);
//
//        for(VirtualObjectForDB virtualObjectForDB : virtualObjectForDBList){
//            System.out.println(virtualObjectForDB.toString());
//        }
//    }
}
