package cx.service.impl;

import cx.dao.RegionDaoI;
import cx.entity.RegionEntity;
import cx.service.RegionServiceI;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017-6-20.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RegionServiceImpl implements RegionServiceI{

    @Resource
    private RegionDaoI regionDaoI;


    public List<Map> getEntity() {
        return regionDaoI.getEntity();
    }
}
