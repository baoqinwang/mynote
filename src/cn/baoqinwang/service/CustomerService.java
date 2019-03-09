package cn.baoqinwang.service;

import java.util.List;

import cn.baoqinwang.pojo.BaseDict;
import cn.baoqinwang.pojo.Customer;
import cn.baoqinwang.pojo.QueryVo;

public interface CustomerService {

	public List<BaseDict> findDictByCode(String code);
	
	public List<Customer> findCustomerByVo(QueryVo vo);
	public Integer findCustomerByVoCount(QueryVo vo);
	
	public Customer findCustomerById(Long id);
	
	public void updateCustomerById(Customer customer);
	
	public void delCustomerById(Long id);
}
