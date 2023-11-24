package com.referralAndCertificatePom;

public class CertificatePOM {
	private static CertificatePOM certificatePOM;
	private CertificatePOM() {

	}

	public static CertificatePOM getInstance() {
		if (certificatePOM == null) {
			certificatePOM = new CertificatePOM();
		}

		return certificatePOM;
	}
	
	
	
	
}
