package com.hotel.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hotel.app.data.CheckOut;
import com.hotel.app.data.Employee;
import com.hotel.app.data.repository.CheckOutRepository;

@Component
@Transactional
public class CheckOutBean {
	
	@Autowired
	CheckOutRepository checkOutRepository;
	
	public CheckOut[] getCheckOut(Long... id){
		List<CheckOut> checkOuts = new ArrayList<CheckOut>();
		if(id!=null && id.length>0)
			checkOutRepository.findAllById(Arrays.asList(id)).forEach(ch->checkOuts.add(ch));
		else
			checkOutRepository.findAll().forEach(ch->checkOuts.add(ch));
	    return checkOuts.toArray(new CheckOut[checkOuts.size()]);		
	}
	
	public CheckOut[] getCheckOut(Employee employee){
		List<CheckOut> checkOuts = new ArrayList<CheckOut>();
		if(employee!=null && employee.getId()>0)
			checkOuts = checkOutRepository.findByEmployeeId(employee.getId());
	    return checkOuts.toArray(new CheckOut[checkOuts.size()]);
	}

}