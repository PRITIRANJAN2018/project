package com.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashokit.dto.ContactDTO;

@Service
public class ContactServiceImpl implements ContactService {

	@Override
	public boolean saveContact(ContactDTO dto) {
		
		return false;
	}

	@Override
	public List<ContactDTO> gtAllContacts() {
		
		return null;
	}

	@Override
	public ContactDTO getContactById(Integer cid) {
		
		return null;
	}

	@Override
	public boolean updateContact(ContactDTO dto) {
		
		return false;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		
		return false;
	}

}
