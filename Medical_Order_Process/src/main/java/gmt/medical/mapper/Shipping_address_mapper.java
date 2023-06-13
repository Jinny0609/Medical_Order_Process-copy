package gmt.medical.mapper;

import java.util.List;

import gmt.medical.model.Shipping_address;

public interface Shipping_address_mapper {
	public void saveAddress(Shipping_address address);
	public List<Shipping_address> getAllAddresses();
}
