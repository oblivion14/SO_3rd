package com.pineone.icbms.so.interfaces.database;
//


import com.pineone.icbms.so.interfaces.database.controller.inputdata.VirtualObjectData;
import com.pineone.icbms.so.interfaces.database.logic.itf.VirtualObjectDAO;
import com.pineone.icbms.so.interfaces.database.model.VirtualObjectForDB;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import java.util.List;

import static org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace.NONE;

@RunWith(SpringRunner.class)
//@SpringBootTest
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE) //NOTE:Jpa embaded DB 로 대체하는것을 금지 , 사용자 설정 디비로 테스트 환경 구성
@TransactionConfiguration(defaultRollback=false) //NOTE: Test 환경에서도 DB 에 기록할수 있도록 설정 / 롤백 금지
public class VOCrudTest {

    @Autowired
    private VirtualObjectDAO virtualObjectDAO;

    @Test
    public void cr() {
        VirtualObjectData virtualObjectData = new VirtualObjectData("icbms-vo-test", 1, 1, "test설명");
        virtualObjectDAO.createVirtualObject(virtualObjectData);

        List<VirtualObjectForDB> virtualObjectForDBList = virtualObjectDAO.retrieveVirtualObjectList();

        for (VirtualObjectForDB virtualObjectForDB : virtualObjectForDBList) {
            System.out.println(virtualObjectForDB.toString());
        }

    }

    @Test
    public void update() throws Exception {

        VirtualObjectData virtualObjectChangeData = new VirtualObjectData("icbms-vo-test-change",1,1,"test변경설명");
        virtualObjectDAO.updateVirtualObject(6,virtualObjectChangeData);

        List<VirtualObjectForDB> virtualObjectForDBList = virtualObjectDAO.retrieveVirtualObjectList();

        for(VirtualObjectForDB virtualObjectForDB : virtualObjectForDBList){
            System.out.println(virtualObjectForDB.toString());
        }
    }

//    @Test
//    public void delete() throws Exception {
//
//        virtualObjectDAO.deleteVirtualObject(9);
//
//        List<VirtualObjectForDB> virtualObjectForDBList = virtualObjectDAO.retrieveVirtualObjectList();
//
//        for(VirtualObjectForDB virtualObjectForDB : virtualObjectForDBList){
//            System.out.println(virtualObjectForDB.toString());
//        }
//    }
}