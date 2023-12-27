package com.kn.crud.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kn.crud.entity.Mobile;

@RestController
@RequestMapping("/mobile")
public class MobileController {
	Mobile mobile ;

	@PostMapping
	public String createMobile(@RequestBody Mobile mobile) {
		this.mobile = mobile;
		return mobile.toString() + "has been added successfully!!";
	}

	@GetMapping("{iMEINumber}")
	public Mobile getMobile(@PathVariable String iMEINumber) {
		if (mobile.getiMEINumber().equals(iMEINumber)) {
			return mobile;
		} else {
			return null;
		}
	}

	@PutMapping
	public String updateMobile(@RequestBody Mobile mobile) {
		Mobile temp = this.mobile;
		this.mobile = mobile;

		return temp.toString() + " has been updated to " + mobile.toString();
	}

	@DeleteMapping("delete/{iMEINumber}")
	public String deleteMobile(@PathVariable String iMEINumber) {
		if (iMEINumber == mobile.getiMEINumber()) {
			mobile = null;
			return "Mobile has been deleted successfully";
		}

		return "IMEINumber not found in database";
	}

}
