package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dto.WeatherInfo;
import com.demo.model.CustomDetail;
import com.demo.repository.CustomDetailRepository;

@Service
public class CustomDetailServiceImpl implements CustomDetailService{

	@Autowired
	private CustomDetailRepository customDetailRepository;
	
	@Override
	public void addCustomDetail(WeatherInfo weatherInfo, String pincode) {
		
		CustomDetail cd = new CustomDetail();
		cd.setPincode(pincode);
		cd.setLat(weatherInfo.getCoord().getLat());
		cd.setLon(weatherInfo.getCoord().getLon());
		customDetailRepository.save(cd);
		
		
	}

}
