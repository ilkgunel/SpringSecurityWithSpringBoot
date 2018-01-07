package com.ilkaygunel.webservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ilkaygunel.pojo.Address;
import com.ilkaygunel.pojo.Member;

@RestController
public class MemberListWebService {
	
	@RequestMapping(value = "/memberList", method = RequestMethod.GET)
	public List<Member> getExample(@RequestParam(value = "MemberId", defaultValue = "0") String id) {
		List<Member> memberList = new ArrayList<>();
		Member member1 = new Member("İsmail", "Ceylan", "İstanbul", "Saha",
				new Address("Haramidere", "Beylikdüzü", "TÜRKİYE"));
		memberList.add(member1);

		Member member2 = new Member("Serkan", "Akbaba", "İstanbul", "Saha",
				new Address("Cennet Mahallesi", "K.Çekmece", "TÜRKİYE"));
		memberList.add(member2);

		Member member3 = new Member("Ertan", "Şahin", "İstanbul", "Saha",
				new Address("Maslak", "Sarıyer", "TÜRKİYE"));
		memberList.add(member3);

		if (id.equals("0")) {
			return memberList;
		} else {
			return memberList.subList(Integer.parseInt(id) - 1, Integer.parseInt(id));
		}
	}
}
