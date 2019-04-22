package cn.jxufe.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jxufe.dao.LandTypeDAO;
import cn.jxufe.entity.LandType;
import cn.jxufe.service.LandTypeService;

@Service
public class LandTypeImp implements LandTypeService {  
    @Autowired
    LandTypeDAO landTypeDAO ;
    @Override
    public Iterable<LandType> findALl() {
        return  landTypeDAO.findAll();
    }
}