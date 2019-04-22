package cn.jxufe.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import cn.jxufe.entity.GrowPhase;
import cn.jxufe.entity.LandType;


public interface GrowPhaseDAO extends PagingAndSortingRepository<GrowPhase,Long> {  
}