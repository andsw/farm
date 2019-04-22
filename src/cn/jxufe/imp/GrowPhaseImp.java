package cn.jxufe.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jxufe.dao.GrowPhaseDAO;
import cn.jxufe.entity.GrowPhase;
import cn.jxufe.service.GrowPhaseService;

@Service
public class GrowPhaseImp implements GrowPhaseService {  
    @Autowired
    GrowPhaseDAO growPhaseDAO ;
    @Override
    public Iterable<GrowPhase> findALl() {
        return growPhaseDAO.findAll();
    }
}