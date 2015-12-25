package dataservice.transitdataservice;

import java.util.ArrayList;

import po.transitPO.LoadPO;

public interface LoadDataService {
	/*
	 * 添加装车单
	 */
	public void addLoad(LoadPO po);

	/*
	 * 查找装车单
	 */
	public LoadPO findLoad(LoadPO po);

	/*
	 * 删除装车单
	 */
	public void removeLoad(LoadPO po);

	/*
	 * 修改装车单
	 */
	public void changeLoad(LoadPO po1, LoadPO po2);

	/*
	 * 获取装车单列表
	 */
	public ArrayList<LoadPO> getLoadList();

}
