package sharding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import sharding.entity.User;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
