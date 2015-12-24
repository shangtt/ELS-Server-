package po.receiptPO;

import java.sql.Time;
//package
enum Pack {
	PAPER, WOOD, PLASTIC, OTHER
}

//Type
enum Type {
	STANDARD, ECONOMIC, EXPRESS
}

public class MailReceiptPO extends ReceiptPO {
	// Information Itself
	private String nameOfExpress;
	private int Num;
	private double Weight;
	private double Size;
	// parameter
	private Pack pack;
	private Type type;
	private double totalFee;
	// information of Receiver
	private String nameOfReceiver;
	private String addressOfReceiver;
	private String companyOfReceiver;
	private String phoneOfReceiver;
	private String teleOfReceiver;
	// information of Sender
	private String nameOfSender;
	private String addressOfSender;
	private String companyOfsender;
	private String phoneOfSender;
	private String teleOfSender;

	public MailReceiptPO(TITLE title, String id, APPROVAL approval,Time date, String n,
			int nn, double W, double V, Pack p, Type t, double f, double s,
			double tt, String R1, String R2, String R3, String R4, String R5,
			String S1, String S2, String S3, String S4, String S5) {
		super(title, id, approval,date);
		this.nameOfExpress = n;
		this.Num = nn;
		this.Weight = W;
		this.Size = V;
		this.pack = p;
		this.type = t;
		this.totalFee = tt;

		this.nameOfReceiver = R1;
		this.addressOfReceiver = R2;
		this.companyOfReceiver = R3;
		this.phoneOfReceiver = R4;
		this.teleOfReceiver = R5;

		this.nameOfSender = S1;
		this.addressOfSender = S2;
		this.companyOfsender = S3;
		this.phoneOfSender = S4;
		this.teleOfSender = S5;
	}

	public String getNameOfExpress() {
		return nameOfExpress + "X" + Num + "[" + Weight + "千克" + Size + "立方米"
				+ "]";
	}

	public Pack getPack() {
		return pack;
	}

	public Type getType() {
		return type;
	}

	public double getFee() {
		return totalFee;
	}

	// package the information
	public String getSenderInfo() {
		return nameOfSender + ":" + addressOfSender + ":" + companyOfsender
				+ ":" + phoneOfSender + ":" + teleOfSender;
	}

	public String getReceiverInfo() {
		return nameOfReceiver + ":" + addressOfReceiver + ":"
				+ companyOfReceiver + ":" + phoneOfReceiver + ":"
				+ teleOfReceiver;
	}

}
