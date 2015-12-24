package po.orderPO;

public enum TypeOfPack {
	纸箱5元{public  double getfee(){return 5;}},
	木箱10元{public  double getfee(){return 10;}},
	快递袋1元{public  double getfee(){return 1;}};
	
	public abstract double getfee();
}
