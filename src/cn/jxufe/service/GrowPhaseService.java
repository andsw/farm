package cn.jxufe.service;

import cn.jxufe.entity.CropStatus;
import cn.jxufe.entity.GrowPhase;

public interface GrowPhaseService {
    public Iterable<GrowPhase> findALl();
}