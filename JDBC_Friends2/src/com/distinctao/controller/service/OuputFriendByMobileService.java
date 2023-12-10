package com.distinctao.controller.service;

import java.sql.SQLException;
import java.util.List;

import com.distinctao.dao.FriendMngDao;
import com.distinctao.dao.FriendMngDaoImpl;
import com.distinctao.service.FriendManagementService;
import com.distinctao.service.GetDataInfo;
import com.distinctao.vo.FriendVo;

public class OuputFriendByMobileService implements FriendManagementService {

	public List<FriendVo> list;
	public boolean isEmpty;
	
	@Override
	public void toDo() throws ClassNotFoundException, SQLException {
		FriendMngDao fmd = FriendMngDaoImpl.getInstance();
		String data = GetDataInfo.getInstance().inputMobile();
		list = fmd.selectByMobile(data);

		if (list.size() == 0) {
			System.out.println("조회할 정보가 업습니다.");
		} else {
			for (FriendVo f : list) {
				System.out.println(f.toString());
			}

		}

	}

}
