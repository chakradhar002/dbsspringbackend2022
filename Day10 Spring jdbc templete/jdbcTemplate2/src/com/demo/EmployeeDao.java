package com.demo;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author Chakradhar 
 *  alt+shift+j for generating java docs
 *
 */

/*Data Access Object Pattern or DAO pattern is used to separate low level data accessing API or operations from high level business services. Following are the participants in Data Access Object Pattern.

Data Access Object Interface - This interface defines the standard operations to be performed on a model object(s).

Data Access Object concrete class - This class implements above interface. This class is responsible to get data from a data source which can be database / xml or any other storage mechanism.

Model Object or Value Object - This object is simple POJO containing get/set methods to store data retrieved using DAO class.
*/
public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**this method is save the data in DB
	 * 
	 * @param e
	 * @return
	 */
	public int saveEmployee(Employee e) {
		String query = "insert into employee values('" + e.getId() + "','" + e.getName() + "','" + e.getSalary() + "')";
		return jdbcTemplate.update(query);
	}

	/** this method is update the data in DB
	 * 
	 * @param e
	 * @return
	 */
	public int updateEmployee(Employee e) {
		String query = "update employee set name='" + e.getName() + "',salary='" + e.getSalary() + "' where id='"
				+ e.getId() + "' ";
		return jdbcTemplate.update(query);
	}

	/**
	 * @param e
	 * @return
	 */
	public int deleteEmployee(Employee e) {
		String query = "delete from employee where id='" + e.getId() + "' ";
		return jdbcTemplate.update(query);
	}

}
