package com.example.orikamapper.lang3;

import org.apache.commons.lang3.StringUtils;

import com.google.i18n.phonenumbers.NumberParseException;

public class Main {

	public static void main(String[] args) throws NumberParseException {

		final String phoneNumber = "+639999999999";

		System.out.println(StringUtils.isBlank(null));

		System.out.println(isValidPhoneNumber(phoneNumber));
	}

	static boolean isValidPhoneNumber(String phoneNumber) {
		return (StringUtils.isNotBlank(phoneNumber)
				&& phoneNumber.startsWith("+63")
				&& phoneNumber.length() == 13);
	}
}
