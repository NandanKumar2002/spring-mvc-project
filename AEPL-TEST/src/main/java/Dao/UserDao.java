package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;
import Dto.UserDto;

@Component
public class UserDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("develop");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

public  String insert(UserDto userDto) {
	entityTransaction.begin();
	entityManager.persist(userDto);
	entityTransaction.commit();
	return "Registration Successfull";
}

public String find(long no,UserDto dto1)
{
	UserDto dto=entityManager.find(UserDto.class,no);
	if(dto!=null)
	{
		return "the object with same number already exist";
	}
	else
	{
		insert(dto1);
		return "Registration succussfull";
		
	}
}
}
