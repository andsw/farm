package cn.jxufe.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import cn.jxufe.entity.SeedList;
import cn.jxufe.entity.SeedType;

public interface SeedTypeDAO extends PagingAndSortingRepository<SeedType,Long> {  
}