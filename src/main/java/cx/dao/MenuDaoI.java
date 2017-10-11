package cx.dao;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MenuDaoI {

	  List<Map> getMenu();

}
