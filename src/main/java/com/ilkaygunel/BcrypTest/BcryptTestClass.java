package com.ilkaygunel.BcrypTest;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptTestClass {

	public static void main(String[] args) {
//		int i = 0;
//		while (i < 10) {
//			String password = "TEST1234";
//			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//			String hashedPassword = passwordEncoder.encode(password);
//
//			System.out.println(hashedPassword);
//			System.out.println(passwordEncoder.matches(password, hashedPassword));
//			i++;
//		}
		String password = "TEST1234";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		System.out.println(passwordEncoder.matches(password, "$2a$10$exYYU6mKdmfi71//Gnv7geZJ5C3Hh.qcAD9QtSE5it8PVCgBkCf75"));
	}
}
//$2a$10$COK3VuAgSNDQvu/xqHNag.syxC6fSFwUEMfCTs1hSMR8UqHr6IcsC
//true
//$2a$10$i73DaWEn9yzl3MVyLLkmX.6NVmg.mzXs7XPOOsDRR/2mpEjaLI38i
//true
//$2a$10$vKIcIwd2dQa.0a06Gc8AMeh/fZY8nygr0QbcQj/CObjuG6HZLoZZe
//true
//$2a$10$exYYU6mKdmfi71//Gnv7geZJ5C3Hh.qcAD9QtSE5it8PVCgBkCf5O
//true
//$2a$10$hgNKFemAzK4tjGE1HwOVAO3C9vTCnnZWA2NsTTX8npVxSzpj7lUIi
//true
//$2a$10$3JQQU8iGfwa31jiX/lG1gOxl9eUoXjBB3culTM/jUFnbczlHT8lDS
//true
//$2a$10$Xb1KkVfsIiH5kwp.h4y0u.iR8Q6Yr8/J4IV1qVklf/8BfdxZQJhES
//true
//$2a$10$qeY4kygt2L.DLdKnaTIP6uKQvQxYNiznIG3iVxGWMOayx5Odm1EW.
//true
//$2a$10$LURtA5UyJAHv0itdWadmB.9LCY9JHeJzlprlzRl3.XGLoK0u3Ld0e
//true
//$2a$10$T4T99y3QJCDBo6QUAxbioutirDXfshFqC0GRK8PBmpID4ryqJY.Qe