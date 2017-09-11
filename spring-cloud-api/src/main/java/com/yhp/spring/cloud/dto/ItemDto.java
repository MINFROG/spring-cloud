package com.yhp.spring.cloud.dto;
/**
 * @desc TODO添加描述
 * 
 * @author yuhuiping
 * @version v1.0 
 * @date 2016年12月1日下午1:59:21
 */
public class ItemDto {
	private Long itemId;
	private Double price;
	private String itemName;
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	@Override
	public String toString() {
		return "ItemDto [itemId=" + itemId + ", price=" + price + ", itemName="
				+ itemName + "]";
	}

}

