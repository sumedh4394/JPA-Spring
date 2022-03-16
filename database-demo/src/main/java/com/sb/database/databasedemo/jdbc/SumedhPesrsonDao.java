//
//  package com.sb.database.databasedemo.jdbc;
//  
//  import java.sql.ResultSet; import java.sql.SQLException; import
//  java.sql.Timestamp; import java.util.List;
//  
//  
//  import org.springframework.beans.factory.annotation.Autowired; import
//  org.springframework.jdbc.core.BeanPropertyRowMapper; import
//  org.springframework.jdbc.core.JdbcTemplate; import
//  org.springframework.jdbc.core.RowMapper; import
//  org.springframework.stereotype.Repository;
//  
//  import com.sb.database.databasedemo.entity.SumedhPerson;
//  
//  @Repository public class SumedhPerson {
//  
//  @Autowired JdbcTemplate jdbcTemplate; class PersonRowMapper implements
//  RowMapper<SumedhPerson>{
//  
//  @Override public SumedhPerson mapRow(ResultSet rs, int rowNum) throws SQLException { 
//	  SumedhPerson person = new SumedhPerson();
//	  		person.setId(rs.getInt("id")); 
//	  		person.setName(rs.getString("name"));
//	  		person.setLocation(rs.getString("location"));
//	  		person.setBirth_date(rs.getTimestamp("birth_date")); return person; 
//	  		}
//  }
//  
//  public List<SumedhPerson> findAll(){
//	  return jdbcTemplate.query("select * from Sumedh_Person", new
//			  BeanPropertyRowMapper(SumedhPerson.class));
//  
//  } 
//  
//  public SumedhPerson findById(int id){ 
//	  return jdbcTemplate.queryForObject("select * from Sumedh_Person where id=?", new
//  Object[] {id}, new PersonRowMapper()); }
//  
//  public int deleteById(int id) { 
//	  return jdbcTemplate.update("delete from Sumedh_Person where id=?",
//			  new Object[] {id}); 
//  }
//  
//  
//  public int insert(SumedhPerson person) 
//  {
//	  return jdbcTemplate.update("insert into Sumedh_Person" +
//    " ( id, name , location , birth_date) values( ?, ?, ?, ?)",
//    		new Object[] 
//    	{ 
//    		person.getId(), 
//    		person.getName(), 
//    		person.getLocation(), 
//    		new Timestamp(person.getBirth_date().getTime())}); 
//	    }
//   
//  
//  public int update(SumedhPerson person) { 
//	  return jdbcTemplate.update
//	  (" update Sumedh_Person set name = ? , location = ? , birth_date= ? "+" where id= ? ",
//			  new Object[] 
//			{ 
//					person.getName(), 
//					person.getLocation(), 
//					new Timestamp(person.getBirth_date().getTime()), person.getId()});
//	  }
//  
//  }
//  
//  
//  
// 