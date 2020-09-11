package com.ashokit.service;

import java.util.List;

import com.ashokit.dto.ContactDTO;

public interface ContactService {
	
	public boolean saveContact(ContactDTO dto);
	public List<ContactDTO> gtAllContacts();
	
	public ContactDTO getContactById(Integer cid);
	public boolean updateContact(ContactDTO dto);
	public boolean deleteContact(Integer cid);

}
