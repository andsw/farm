package cn.jxufe.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jxufe.dao.CropStatusDAO;
import cn.jxufe.entity.CropStatus;
import cn.jxufe.service.CropStatusService;

@Service
public class CropStatusImp implements CropStatusService {  
    @Autowired
    CropStatusDAO cropStatusDAO ;
    @Override
    public Iterable<CropStatus> findALl() {
        return cropStatusDAO.findAll();
    }
}