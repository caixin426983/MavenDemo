package cx.service;



import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MenuServiceI {

	  List<Map> getMenu();

}
