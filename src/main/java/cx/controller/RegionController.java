package cx.controller;

import cx.entity.RegionEntity;
import cx.service.RegionServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017-6-20.
 */
@Controller
@RequestMapping("/region")
public class RegionController {

    @Resource
    private RegionServiceI regionServiceI;

    @RequestMapping("/getEntity")
    public String getEntity(Model model){

        List<Map> entity = regionServiceI.getEntity();

        model.addAttribute("regionEntity",entity);

        return "region";
    }



}
