package chento.smos.sample.repository;

import chento.smos.sample.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserRepository {
    @Select("""
                SELECT *FROM users
            """)
    List<User> findAll();
}

