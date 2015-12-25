package dataservice.logdataservice;

import java.util.ArrayList;

import po.logPO.LogPO;

public interface LogDataService {
	// public LogPO find(String name);

	public void add(LogPO lp);

	public void change(LogPO lp1, LogPO lp2);

	public void remove(LogPO lp);

	public ArrayList<LogPO> getLogList();

}
