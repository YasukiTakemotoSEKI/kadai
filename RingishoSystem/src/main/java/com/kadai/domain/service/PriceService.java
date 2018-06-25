package com.kadai.domain.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kadai.domain.entity.App;
import com.kadai.domain.entity.Price;
import com.kadai.domain.repository.PriceRepository;

@Service
@Transactional
public class PriceService implements UserDetailsService{
	
	@Autowired
	PriceRepository priceRepository;
	
	public Price save(Price price){
        return priceRepository.save(price);	
    }	
	
    public List<Price> findAll(){	
        return priceRepository.findAll();	
    }
    
    public Price findOne(Integer priceId){	
        return priceRepository.findById(priceId).get();	
    }	
    	
    public Price create(Price price){	
        return priceRepository.save(price);	
    }	
    	
    public Price update(Price price){	
        return priceRepository.save(price);	
    }	
    	
    public void delete(Integer price){	
    	priceRepository.deleteById(price);
    }

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}	
    

}