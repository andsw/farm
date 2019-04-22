package cn.jxufe.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jxufe.dao.SeedListDAO;
import cn.jxufe.entity.SeedList;
import cn.jxufe.service.SeedListService;

@Service
public class SeedListImp implements SeedListService {  
    @Autowired
    SeedListDAO SeedListDAO ;
    @Override
    public Iterable<SeedList> findALl() {
        return SeedListDAO.findAll();
    }
}