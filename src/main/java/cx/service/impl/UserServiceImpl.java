package cx.service.impl;

import org.springframework.stereotype.Service;

import cx.dao.UserEntityDaoI;
import cx.entity.UserEntity;
import cx.service.UserServiceI;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements  UserServiceI {

	@Resource
    private UserEntityDaoI userEntityDao;

	public UserEntity getById(int id) {
		
		return userEntityDao.getById(id);
	}  
	

}
