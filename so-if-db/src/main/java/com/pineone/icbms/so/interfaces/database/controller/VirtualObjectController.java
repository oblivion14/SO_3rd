package com.pineone.icbms.so.interfaces.database.controller;//package com.pineone.icbms.so.interfaces.database.controller;
//
//import com.pineone.icbms.so.interfaces.database.logic.itf.VirtualObjectDAO;
//import com.pineone.icbms.so.interfaces.database.model.VirtualObjectForDB;
//import com.pineone.icbms.so.interfaces.database.ref.DataLossException;
//import com.pineone.icbms.so.interfaces.database.ref.DataValidation;
//import com.pineone.icbms.so.interfaces.database.ref.ResponseMessage;
//import com.pineone.icbms.so.interfaces.database.controller.inputdata.VirtualObjectData;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
///**
// * Created by melvin on 2017. 3. 27..
// */
//
////NOTE: VirtualObject 관련 controller 기능 구현
//@Controller
//@RequestMapping(value = "/virtualobject")
//public class VirtualObjectController {
//
//    @Autowired
//    private VirtualObjectDAO virtualObjectDAO;
//
//    @Autowired
//    private ResponseMessage responseMessage;
//
//    @Autowired
//    private DataValidation dataValidation;
//
//    //NOTE: VirtualObject Id 로 VirtualObject 조회
//    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
//    @ResponseBody
//    public VirtualObjectForDB retrieveVirtualObject(@PathVariable long id){
//        VirtualObjectForDB virtualObject = virtualObjectDAO.retrieveVirtualObject(id);
//        return virtualObject;
//    }
//
//    //NOTE : SO에 등록되어 있는 전체 VirtualObject 내용 조회
//    @RequestMapping
//    @ResponseBody
//    public List<VirtualObjectForDB> retrieveVirtualObjectList(){
//        List<VirtualObjectForDB> virtualObjectList = virtualObjectDAO.retrieveVirtualObjectList();
//        return virtualObjectList;
//    }
//
//    //NOTE : SO에 Virtual Object 데이터 등록
//    @RequestMapping(method = RequestMethod.POST)
//    @ResponseBody
//    public ResponseMessage createVirtualObject(@RequestBody VirtualObjectData virtualObjectData){
//
//        try{
//            dataValidation.inspectVirtualObjectData(virtualObjectData);
//        } catch (DataLossException e) {
//            responseMessage.setExceptionMessage(e.getMessage());
//            return responseMessage;
//        }
//
//        String createMessage = virtualObjectDAO.createVirtualObject(virtualObjectData);
//        responseMessage.setMessage(createMessage);
//        return responseMessage;
//    }
//
//   //NOTE : SO의 virtualObject Data Update TODO : Update 정책 반영필요
//    @RequestMapping(value = "{id}", method = RequestMethod.POST)
//    @ResponseBody
//    public ResponseMessage updateVirtualObject(@PathVariable long id, @RequestBody VirtualObjectData virtualObjectData){
//
//        try{
//            dataValidation.inspectVirtualObjectData(virtualObjectData);
//        } catch (DataLossException e) {
//            responseMessage.setExceptionMessage(e.getMessage());
//            return responseMessage;
//        }
//
//        String updateMessage = virtualObjectDAO.updateVirtualObject(id, virtualObjectData);
//        responseMessage.setMessage(updateMessage);
//        return responseMessage;
//    }
//
//    //NOTE : SO의 virtualObject Date Delete
//    @RequestMapping(value = "/delete/{id}")
//    @ResponseBody
//    public ResponseMessage deleteVirtualObject(@PathVariable long id){
//        String deleteMessage = virtualObjectDAO.deleteVirtualObject(id);
//        responseMessage.setMessage(deleteMessage);
//        return responseMessage;
//    }
//}
