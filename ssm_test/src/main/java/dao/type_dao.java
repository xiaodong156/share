package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.Book;
import model.Type;


@Repository
public interface type_dao {
	@Select("select * from type ${txt}")
	public List<Type> select(@Param("txt") String txt);
	@Select("select * from type where id=#{id}")
	public Type selectByid(int id);
	@Insert("insert into type(name) values(#{name})")
	public void insert(Type t);
	@Update("update type set name=#{name} where id=#{id}")
	public void update(Type t);
	@Delete("delete type where id=#{id}")
	public void delete(int id);
}
