package cn.jxufe.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jxufe.dao.SeedTypeDAO;
import cn.jxufe.entity.SeedType;
import cn.jxufe.service.SeedTypeService;

@Service
public class SeedTypeImp implements SeedTypeService {  
    @Autowired
    SeedTypeDAO seedTypeDAO ;
    @Override
    public Iterable<SeedType> findALl() {
        return seedTypeDAO.findAll();
    }
}