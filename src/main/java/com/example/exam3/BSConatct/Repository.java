package com.example.exam3.BSConatct;

import com.example.exam3.Entity.People;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Classname: Repository
 * Package: com.example.exam3.BSConatct
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 21:52
 * @Version: v1.0
 */
@Mapper
public interface Repository {
    @Insert("")
    public void add(People people);
    @Select("")
    public List<People> getAll();
    @Select("")
    public People getByName(String name);
    @Delete("")
    public void delete(String name);
    @Update("")
    public void update(People people);
}
