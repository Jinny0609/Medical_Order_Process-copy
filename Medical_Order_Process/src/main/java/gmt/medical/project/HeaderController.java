package gmt.medical.project;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class HeaderController {
	// 유저키 서버 전송
	@RequestMapping(value = "/getUserID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public ResponseEntity<?> getUserID(HttpSession session) {
	   
	    Integer user_id = (Integer) session.getAttribute("user_id");
	    String name = (String) session.getAttribute("name");
	    if (user_id != null) {
	        // user_id 값이 존재하는 경우
	        ObjectMapper objectMapper = new ObjectMapper();
	        Map<String, Object> responseMap = new HashMap<>();
	        responseMap.put("user_id", user_id);
	        responseMap.put("name", name);
	        String jsonResponse;
	        try {
	            jsonResponse = objectMapper.writeValueAsString(responseMap);
	        } catch (JsonProcessingException e) {
	            e.printStackTrace();
	            jsonResponse = "{}";
	        }
	        return ResponseEntity.ok().body(jsonResponse);
	    } else {
	        // user_id 값이 존재하지 않는 경우
	        return ResponseEntity.ok().body("{}");
	    }
	}
}
