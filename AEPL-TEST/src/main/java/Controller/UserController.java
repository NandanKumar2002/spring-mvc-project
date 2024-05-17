package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import Dao.UserDao;
import Dto.UserDto;

@Controller
public class UserController {
@Autowired
UserDao userDao;

@ResponseBody
@RequestMapping("/in")
public String insert(@ModelAttribute UserDto userDto) {
//	return userDao.insert(userDto);
	
	long phno=userDto.getPhoneNumber();
  return userDao.find(phno, userDto);
}
}