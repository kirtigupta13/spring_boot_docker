package io.egens.repository;
import java.util.List;
import org.springframework.data.repository.Repository;
import io.egens.pojo.User;

public interface UserRepository extends Repository<User, String> {
	public List<User> findAll();
	
//	public Page<User> findAll(Pageable pageable);//how many idetas n the page, 

	public User findOne(String id);

	//public User findByEmail(String email);

	public User save(User user);

//	public User update(User user);

	public void delete(User user);

}
