package com.controller.pages;

import java.math.BigInteger;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dao.RegistrationDao;
import com.pojo.pages.Registration2;
import com.pojo.pages.RegistrationPojo;

@RestController
public class MainControllerAadhar {
	@GetMapping("/sample")
	public String getData() {
		return "hello";
	}

	@PostMapping("/getAadharDetails")
	public List getDetails(@RequestBody RegistrationPojo reg) {
		BigInteger phoneNo = reg.getPhoneNo();
		List<RegistrationPojo> listObject = null;
		RegistrationDao regObj = new RegistrationDao();
		Session session1 = regObj.registDao();
		org.hibernate.Transaction txt = session1.beginTransaction();
		Query query = session1.createSQLQuery(
				"SELECT s.fname, s.lname, s.gender, s.email, s.dob,s.phoneNo,f.aadharNo,t.address,t.pincode,t.state "
						+ " FROM FirstRegist f JOIN SecondRegist s ON f.cid = s.registration1_cid "
						+ "JOIN ThirdRegist t ON s.phoneNo = t.registration2_phoneNo WHERE phoneNo='" + phoneNo + "'");
		query.setResultTransformer(Transformers.aliasToBean(RegistrationPojo.class));
		listObject = query.list();
		System.out.println("details are:" + listObject.toString());
		txt.commit();
		return listObject;
	}

}
