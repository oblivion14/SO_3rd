package com.pineone.icbms.so.interfaces.database.ref;


import org.springframework.stereotype.Service;

/**
 * Created by melvin on 2016. 8. 9..
 */

//NOTE : 중요데이터의 누락이 있는지 검증
@Service
public class DataValidation {

    //NOTE : virtualObjectData Validation
    public void inspectVirtualObjectData(VirtualObjectData virtualObjectData) throws DataLossException {
        //
        if(virtualObjectData.getName() == null
                || virtualObjectData.getFunctionality_id() == 0
                || virtualObjectData.getAspect_id() == 0
                || virtualObjectData.getDescription() == null){
            throw new DataLossException();
        }
    }
}
