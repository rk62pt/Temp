package com.test.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.home.vo.HomeVO;
import com.test.home.vo.ItemVO;
import com.test.home.vo.ResultVO;

@Controller
@RequestMapping("/home")
public class HomeApiController {
	@RequestMapping(value = "getTitle",method = RequestMethod.GET)
	public @ResponseBody ResultVO<String> getTitle(){
		ResultVO<String> vo = new ResultVO<String>();
		vo.setMessage("成功");
		vo.setStatus("success");
		vo.setBody("this is t");
		return vo;
	}
	
	@RequestMapping(value = "getList/{cnt}",method = RequestMethod.GET)
	public @ResponseBody ResultVO<List<String>> getList(@PathVariable int cnt){
		ResultVO<List<String>> home = new ResultVO<List<String>>();
		
		List<String> _cntList = new ArrayList<String>();
		for(int i = 0 ; i< cnt;i++){
			_cntList.add("test"+i);
		}
		home.setMessage("成功");
		home.setStatus("success");
		home.setBody(_cntList);
		return home;
	}
}
