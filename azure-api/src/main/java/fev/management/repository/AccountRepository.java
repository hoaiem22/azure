package fev.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fev.management.entity.FevAccount;

@Repository
public interface AccountRepository extends CrudRepository<FevAccount, Integer> {

	@Query(nativeQuery = true, value = "SELECT * FROM fptueventclub.fev_account\r\n"
			+ "where username = :username and password = :password")
	FevAccount checkLogin(@Param("username") String username, @Param("password") String password);

	@Query(nativeQuery = true, value = "select a.id, a.username, a.password, ar.role, a.note from fptueventclub.fev_account a\r\n"
			+ "inner join fptueventclub.fev_account_role ar on ar.id = a.role;")
	List<Object[]> getAll();

	@Query(nativeQuery = true, value = "select a.id, a.username, a.password, a.role, a.note from fptueventclub.fev_account a\r\n"
			+ "where a.username = :username")
	FevAccount findByUsername(@Param("username") String username);
	
	@Query(nativeQuery = true, value = "select a.id, a.username, a.password, a.role, a.note from fptueventclub.fev_account a\r\n"
			+ "where a.username = :id")
	FevAccount findByID(@Param("id") int id);
}
