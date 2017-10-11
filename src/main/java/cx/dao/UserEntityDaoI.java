package cx.dao;

import cx.entity.User;
import cx.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserEntityDaoI {

	  UserEntity  getById(@Param("id") int id);

	  User  pageQuery();

}
