package cn.jxufe.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jxufe.bean.EasyUIData;
import cn.jxufe.bean.EasyUIDataPageRequest;
import cn.jxufe.bean.Message;
import cn.jxufe.entity.CropStatus;
import cn.jxufe.entity.GrowPhase;
import cn.jxufe.entity.LandType;
import cn.jxufe.entity.SeedList;
import cn.jxufe.entity.SeedType;
import cn.jxufe.service.CropStatusService;
import cn.jxufe.service.GrowPhaseService;
import cn.jxufe.service.LandTypeService;
import cn.jxufe.service.SeedListService;
import cn.jxufe.service.SeedTypeService;

@Controller
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private CropStatusService cropStatusService;
    @Autowired
    private GrowPhaseService growPhaseService;
    @Autowired
    private LandTypeService landTypeService;
    @Autowired
    private SeedListService seedListService;
    @Autowired
    private SeedTypeService seedTypeService;
    
    
    @RequestMapping(value="/1",produces=MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Iterable<CropStatus> data1() throws Exception {
        return cropStatusService.findALl();        
    }
    
    @RequestMapping(value="/2",produces=MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Iterable<GrowPhase> data2() throws Exception {
        return growPhaseService.findALl();        
    }
    
    @RequestMapping(value="/3",produces=MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Iterable<LandType> data3() throws Exception {
        return landTypeService.findALl();        
    }
    
    @RequestMapping(value="/4",produces=MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Iterable<SeedList> data4() throws Exception {
        return seedListService.findALl();        
    }
    
    @RequestMapping(value="/5",produces=MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Iterable<SeedType> data5() throws Exception {
        return seedTypeService.findALl();        
    }
}
