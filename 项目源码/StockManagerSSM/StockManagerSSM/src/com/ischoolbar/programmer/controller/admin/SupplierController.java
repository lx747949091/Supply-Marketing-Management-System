package com.ischoolbar.programmer.controller.admin;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ischoolbar.programmer.entity.admin.Supplier;
import com.ischoolbar.programmer.page.admin.Page;
import com.ischoolbar.programmer.service.admin.SupplierService;

/**
 * ��Ӧ�̹��������
 * @author Administrator
 *
 */
@RequestMapping("/admin/supplier")
@Controller
public class SupplierController {
	
	@Autowired
	private SupplierService supplierService;
	
	/**
	 * ��Ӧ�̹����б�ҳ��
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView list(ModelAndView model){
		model.setViewName("supplier/list");
		return model;
	}
	
	/**
	 * ģ��������ҳ��ȡ��Ӧ����Ϣ
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getList(
			@RequestParam(name="name",defaultValue="") String name,Page page
			){
		Map<String, Object> ret = new HashMap<String, Object>();
		Map<String, Object> queryMap = new HashMap<String, Object>();
		queryMap.put("name", name);
		queryMap.put("offset", page.getOffset());
		queryMap.put("pageSize", page.getRows());
		ret.put("total", supplierService.getTotal(queryMap));
		ret.put("rows", supplierService.findList(queryMap));
		return ret;
	}
	
	
	/**
	 * ��ӹ�Ӧ����Ϣ
	 * @param supplier
	 * @return
	 */
	@RequestMapping(value="add",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> add(Supplier supplier){
		Map<String, String> ret = new HashMap<String, String>();
		if(supplier == null){
			ret.put("type", "error");
			ret.put("msg", "����д��ȷ�Ĺ�Ӧ����Ϣ!");
			return ret;
		}
		if(StringUtils.isEmpty(supplier.getName())){
			ret.put("type", "error");
			ret.put("msg", "����д��Ӧ������!");
			return ret;
		}
		if(StringUtils.isEmpty(supplier.getTel())){
			ret.put("type", "error");
			ret.put("msg", "����д��Ӧ�̵绰!");
			return ret;
		}
		if(StringUtils.isEmpty(supplier.getContactName())){
			ret.put("type", "error");
			ret.put("msg", "����д��Ӧ����ϵ��!");
			return ret;
		}
		if(StringUtils.isEmpty(supplier.getContactPhone())){
			ret.put("type", "error");
			ret.put("msg", "����д��Ӧ����ϵ���ֻ���!");
			return ret;
		}
		if(StringUtils.isEmpty(supplier.getAddress())){
			ret.put("type", "error");
			ret.put("msg", "����д��Ӧ�̵�ַ!");
			return ret;
		}
		if(supplierService.add(supplier) <= 0){
			ret.put("type", "error");
			ret.put("msg", "���ʧ�ܣ�����ϵ����Ա!");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "��ӳɹ�!");
		return ret;
	}
	
	/**
	 * �༭��Ӧ����Ϣ
	 * @param supplier
	 * @return
	 */
	@RequestMapping(value="edit",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> edit(Supplier supplier){
		Map<String, String> ret = new HashMap<String, String>();
		if(supplier == null){
			ret.put("type", "error");
			ret.put("msg", "����д��ȷ�Ĺ�Ӧ����Ϣ!");
			return ret;
		}
		if(StringUtils.isEmpty(supplier.getName())){
			ret.put("type", "error");
			ret.put("msg", "����д��Ӧ������!");
			return ret;
		}
		if(StringUtils.isEmpty(supplier.getTel())){
			ret.put("type", "error");
			ret.put("msg", "����д��Ӧ�̵绰!");
			return ret;
		}
		if(StringUtils.isEmpty(supplier.getContactName())){
			ret.put("type", "error");
			ret.put("msg", "����д��Ӧ����ϵ��!");
			return ret;
		}
		if(StringUtils.isEmpty(supplier.getContactPhone())){
			ret.put("type", "error");
			ret.put("msg", "����д��Ӧ����ϵ���ֻ���!");
			return ret;
		}
		if(StringUtils.isEmpty(supplier.getAddress())){
			ret.put("type", "error");
			ret.put("msg", "����д��Ӧ�̵�ַ!");
			return ret;
		}
		if(supplierService.edit(supplier) <= 0){
			ret.put("type", "error");
			ret.put("msg", "�༭ʧ�ܣ�����ϵ����Ա!");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "��ӳɹ�!");
		return ret;
	}
	
	/**
	 * ɾ��ָ��id�Ĺ�Ӧ��
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> delete(Long id){
		Map<String, String> ret = new HashMap<String, String>();
		if(id == null){
			ret.put("type", "error");
			ret.put("msg", "��ѡ��Ҫɾ���Ĺ�Ӧ��!");
			return ret;
		}
		try {
			if(supplierService.delete(id) <= 0){
				ret.put("type", "error");
				ret.put("msg", "ɾ��ʧ�ܣ�����ϵ����Ա!");
				return ret;
			}
		} catch (Exception e) {
			// TODO: handle exception
			ret.put("type", "error");
			ret.put("msg", "�ù�Ӧ���´�����Ʒ��Ϣ�����Ƚ���Ʒ��Ϣɾ��!");
			return ret;
		}
		ret.put("type", "success");
		ret.put("msg", "ɾ���ɹ�!");
		return ret;
	}
}
