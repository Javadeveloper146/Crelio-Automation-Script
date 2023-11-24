package com.referral;

public class GROReferralPrintRefAndUploadRefAndPrintReceiptAndFeedback {

	public void onePrintOneUploadReferralLetter() throws Throwable {

		PrintReferralLetter printReferralLetter = new PrintReferralLetter();
		printReferralLetter.onePrintReferralLetter();

		UploadReferralLetter uploadReferralLetter = new UploadReferralLetter();
		uploadReferralLetter.oneUploadRefferralLetter();

		PrintReceipt printReceipt = new PrintReceipt();
		printReceipt.onePrintReceiptAndFeedbackAndLogOut();
	}

	public void twoReferralLetter() throws Throwable {
		PrintReferralLetter printReferralLetter = new PrintReferralLetter();
		printReferralLetter.onePrintReferralLetter();
		printReferralLetter.twoPrintReferralLetter();

		UploadReferralLetter uploadReferralLetter = new UploadReferralLetter();
		uploadReferralLetter.oneUploadRefferralLetter();
		uploadReferralLetter.twoUploadReferralLetter();

		PrintReceipt printReceipt = new PrintReceipt();
		printReceipt.onePrintReceiptAndFeedbackAndLogOut();
	}
	
	public void twoPrintRefLetterAndOneUploadRefLetterPrintReceipt() throws Throwable {
		PrintReferralLetter printReferralLetter = new PrintReferralLetter();
		printReferralLetter.onePrintReferralLetter();
		printReferralLetter.twoPrintReferralLetter();
		UploadReferralLetter uploadReferralLetter = new UploadReferralLetter();
		uploadReferralLetter.oneUploadRefferralLetter();
		PrintReceipt printReceipt = new PrintReceipt();
		printReceipt.onePrintReceiptAndFeedbackAndLogOut();
	}
	
	
	public void fourPrintLetterThreeUploadRefLetterAndPrintReceiptAndLogOut() throws Throwable {
		PrintReferralLetter letter = new PrintReferralLetter();
		letter.onePrintReferralLetter();
		letter.twoPrintReferralLetter();
		letter.threePrintReferralLetter();
		letter.fourPrintReferralLetter();
		
		UploadReferralLetter letter2 = new UploadReferralLetter();
		letter2.oneUploadRefferralLetter();
		letter2.twoUploadReferralLetter();
		letter2.threeUploadReferralLetter();
		
		PrintReceipt printReceipt = new PrintReceipt();
		printReceipt.onePrintReceiptAndFeedbackAndLogOut();
		
	}
	

}
