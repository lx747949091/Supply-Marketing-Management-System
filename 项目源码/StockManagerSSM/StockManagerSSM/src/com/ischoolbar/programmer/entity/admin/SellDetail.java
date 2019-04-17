package com.ischoolbar.programmer.entity.admin;

import org.springframework.stereotype.Component;

/**
 * 销售单详细商品实体
 * @author Administrator
 *
 */
@Component
public class SellDetail {
	private Long id;
	private Long sellId;//所属销售订单id
	private String productName;//商品名称
	private Float price;//商品价格
	private Integer productNum;//商品数量
	private Float money;//该商品金额
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getSellId() {
		return sellId;
	}
	public void setSellId(Long sellId) {
		this.sellId = sellId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getProductNum() {
		return productNum;
	}
	public void setProductNum(Integer productNum) {
		this.productNum = productNum;
	}
	public Float getMoney() {
		return money;
	}
	public void setMoney(Float money) {
		this.money = money;
	}
	
}
