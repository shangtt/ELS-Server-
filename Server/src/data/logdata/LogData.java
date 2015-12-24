package data.logdata;

import java.util.ArrayList;

import dataservice.logdataservice.LogDataService;
import po.logPO.LogPO;

public class LogData implements LogDataService {
	public static LogList ll = new LogList();

	@Override
	public void add(LogPO lp) {
		// TODO Auto-generated method stub
		ll.addLog(lp);

	}

	@Override
	public void change(LogPO lp) {
		// TODO Auto-generated method stub
		ll.changeLog(lp);

	}

	@Override
	public void remove(LogPO lp) {
		// TODO Auto-generated method stub
		ll.removeLog(lp);

	}

	@Override
	public ArrayList<LogPO> getLogList() {
		// TODO Auto-generated method stub
		ArrayList<LogPO> a = ll.getLogList();
		return a;
	}

}
