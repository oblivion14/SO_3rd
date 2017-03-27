package com.pineone.icbms.so.interfaces.database.controller;

import com.pineone.icbms.so.interfaces.database.logic.VirtualObjectLogic;
import com.pineone.icbms.so.interfaces.database.model.LocationForDB;
import com.pineone.icbms.so.interfaces.database.model.VirtualObjectForDB;
import com.pineone.icbms.so.interfaces.database.ref.DataLossException;
import com.pineone.icbms.so.interfaces.database.ref.DataValidation;
import com.pineone.icbms.so.interfaces.database.ref.ResponseMessage;
import com.pineone.icbms.so.interfaces.database.ref.VirtualObjectData;
import com.pineone.icbms.so.interfaces.database.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by melvin on 2017. 3. 27..
 */

//NOTE: VirtualObject 관련 controller 기능 구현
@Controller
@RequestMapping(value = "/virtualobject")
public class VirtualObjectController {

    @Autowired
    private VirtualObjectLogic virtualObjectLogic;

    @Autowired
    private ResponseMessage responseMessage;

    @Autowired
    private DataValidation dataValidation;

    //NOTE: VirtualObject Id 로 VirtualObject 조회
    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    @ResponseBody
    public VirtualObjectForDB retrieveVirtualObject(@PathVariable int id){
        VirtualObjectForDB virtualObject = virtualObjectLogic.retrieveVirtualObject(id);
        return virtualObject;
    }

    //NOTE : SO에 등록되어 있는 전체 VirtualObject 내용 조회
    @RequestMapping
    @ResponseBody
    public List<VirtualObjectForDB> retrieveVirtualObject(){
        List<VirtualObjectForDB> virtualObjectList = virtualObjectLogic.retrieveVirtualObjectList();
        return virtualObjectList;
    }

    //NOTE : SO에 Virtual Object 데이터 등록
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage createVirtualObject(@RequestBody VirtualObjectData virtualObjectData){

        try{
            dataValidation.inspectVirtualObjectData(virtualObjectData);
        } catch (DataLossException e) {
            responseMessage.setExceptionMessage(e.getMessage());
            return responseMessage;
        }

        VirtualObjectForDB virtualObjectForDB = virtualObjectLogic.createVirtualObject(virtualObjectData);
        String resultMessage = responseMessage.virtualObjectResultMessage(virtualObjectForDB);
        responseMessage.setMessage("Create : " + resultMessage);
        return responseMessage;
    }

   //NOTE : SO의 virtualObject Data Update TODO : Update 정책 반영필요
    @RequestMapping(value = "{id}", method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage updateVirtualObject(@PathVariable int id, @RequestBody VirtualObjectData virtualObjectData){

        try{
            dataValidation.inspectVirtualObjectData(virtualObjectData);
        } catch (DataLossException e) {
            responseMessage.setExceptionMessage(e.getMessage());
            return responseMessage;
        }

        VirtualObjectForDB virtualObjectForDB = virtualObjectLogic.updateVirtualObject(id, virtualObjectData);
        String resultMessage = responseMessage.virtualObjectResultMessage(virtualObjectForDB);
        responseMessage.setMessage("Update : " + resultMessage);
        return responseMessage;
    }

    //NOTE : SO의 virtualObject Date Delete
    @RequestMapping(value = "/delete/{id}")
    @ResponseBody
    public ResponseMessage deleteVirtualObject(@PathVariable int id){
        String resultMessage = virtualObjectLogic.deleteVirtualObject(id);
        responseMessage.setMessage(resultMessage);
        return responseMessage;
    }
}
