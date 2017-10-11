package cx.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017-6-20.
 */
@Repository
public interface RegionDaoI {

    List<Map>  getEntity();
}
