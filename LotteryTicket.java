package com.oops;

public class LotteryTicket {
	private int ticketNo;// encapsulation Carried out to hide ticketNo
	int prize;

	LotteryTicket(int ticketNo) {// constructor Created
		this.ticketNo = ticketNo;
}

	void CheckNo() {
		if (this.ticketNo == 2255) {
			System.out.println("CONGRATULATIONS! YOU WIN PRIZE OF 2CRORES");
		} else {
			System.out.println("Better Luck Next Time");
		}
	}

}
