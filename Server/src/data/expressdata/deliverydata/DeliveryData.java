package data.expressdata.deliverydata;

import java.util.ArrayList;

import po.expressPO.deliveryPO.DeliveryPO;
import dataservice.expressdataservice.deliverydataservice.DeliveryDataService;

public class DeliveryData implements DeliveryDataService {
	public static DeliveryList dl = new DeliveryList();

	@Override
	public void addDeliveryl(DeliveryPO po) {
		dl.addDelivery(po);
	}

	@Override
	public void removeDelivery(DeliveryPO po) {
		dl.removeDelivery(po);

	}

	@Override
	public void changeDelivery(DeliveryPO po1, DeliveryPO po2) {
		dl.changeDriver(po1, po2);

	}

	@Override
	public DeliveryPO findDelivery(DeliveryPO po) {
		return dl.getArrival(po);
	}

	@Override
	public ArrayList<DeliveryPO> getArrivalList() {
		return dl.getArrivalList();
	}

}
