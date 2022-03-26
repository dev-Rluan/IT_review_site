package yuhan.mvc.hardware.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import yuhan.mvc.teamproject.dao.HardWareDao;
import yuhan.mvc.teamproject.dto.UserInfo;

public class HardWareModifyService implements iHardWareService {

	@Override
	public void execute(Model model) {

		Map<String, Object>map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		
		String h_no = request.getParameter("h_no");
		String h_subject = request.getParameter("h_subject");
		String h_name = request.getParameter("h_name");
		String h_code = request.getParameter("h_code");
		String h_content = request.getParameter("h_content");
		String h_price = request.getParameter("h_price");
		String h_score = request.getParameter("h_score");
		
		HardWareDao dao = new HardWareDao();
		
		dao.modify(h_no, h_subject, h_name, h_code, h_content, h_price, h_score);

	}

}
