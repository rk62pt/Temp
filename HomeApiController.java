package com.test.home;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.home.vo.HomeVO;

@Controller
@RequestMapping("/home")
public class HomeApiController {
	@RequestMapping(value = "getTitle",method = RequestMethod.GET)
	public @ResponseBody HomeVO getTitle(){
		HomeVO home = new HomeVO();
		home.setMessage("成功");
		home.setStatus("success");
		home.setBody("AJAX is a");
		return home;
	}
	
	@RequestMapping(value = "getList/{cnt}",method = RequestMethod.GET)
	public @ResponseBody HomeVO getList(@PathVariable int cnt){
		HomeVO home = new HomeVO();
		String[] _cntList = new String[cnt];
		for(int i = 0 ; i< _cntList.length;i++){
			_cntList[i] = "test"+i;
		}
		home.setMessage("成功");
		home.setStatus("success");
		home.setBody(Arrays.toString(_cntList));
		return home;
	}
}
