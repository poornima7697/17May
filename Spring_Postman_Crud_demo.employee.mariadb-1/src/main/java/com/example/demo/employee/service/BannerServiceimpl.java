package com.example.demo.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.employee.entity.Banner;
import com.example.demo.employee.repository.BannerRepository;
@Service
public class BannerServiceimpl implements BannerService{
	
	@Autowired
	private BannerRepository bannerrepository;
	

	@Override
	
	  public List<Banner> getAllBanner() {
          List<Banner> banner = new ArrayList<Banner>();    
          banner = bannerrepository.findAll();
          for(Banner b : banner) {
              if(b.isIsactive()==true)
              System.out.println(b.getBannerid()+"-- Active Status");
          }
      return banner;
  }

}
