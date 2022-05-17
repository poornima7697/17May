package com.example.demo.employee.service;

import java.sql.Date; 
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.employee.entity.HolidayMaster;
import com.example.demo.employee.entity.User;
import com.example.demo.employee.repository.UserRepository;
import com.example.demo.view.UserView;

@Service
public class userServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserView> showAll() {
		List<User> list = null;
		List<UserView> list1 = new ArrayList<>();

		list = userRepository.findAll();
		for (User u : list) {
			list1.add(new UserView(u.getFirstname(), u.getLastname(), u.getDesignation(), u.getAitemail(),
					u.getContactnumber()));
		}
		return list1;
	}

	@Override
	public User findByAitid(String id) {
		
		User user = userRepository.findByAitid(id);
		return user;
	}

	@Override
    public List<User> getTodayBirthdate(Date date) {
        // TODO Auto-generated method stub
        return userRepository.findBydob(date);
    }

		
	
		




	
	
}

