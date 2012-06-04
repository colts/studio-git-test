package org.mulesoft.samples.loan;

public class LoanRequestImpl implements LoanRequest {

	@Override
	public LoanResp loanRequest(LoanReq parameters) {
		// TODO Auto-generated method stub
		
		
		LoanResp lresp = new LoanResp();
		lresp.setCreditRating("High");
		lresp.setRate("2.125");
		
		return lresp;
	}

}
