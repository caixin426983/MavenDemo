package cx.service.impl;

import cx.Tools.Tree;
import cx.dao.MenuDaoI;
import cx.service.MenuServiceI;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class MenuServiceImpl implements MenuServiceI {

	@Resource
    private MenuDaoI menuDao;


	public List<Map> getMenu() {
		List<Map> maps =null;
				List<Map> data = menuDao.getMenu();
		if (data!=null){
			 maps = Tree.turn2Tree(null, data);
		}
		return maps;
	}

}
