package com.zaynah.daikichii.controllers;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
////@RestController
//@RequestMapping("/daikichi")
public class FormController {
@RequestMapping("")
  public java.lang.String index() { // 3
          return "Hello Daikichi!";
  }
  
  
  @RequestMappig("/travel/{city}")
  public java.lang.String travel(@PathVariable("city") String city){
  	return "Congratulations! You will soon travel to " + city;
  }
  
  @RequestMapping("/lotto/{number}")
  public java.lang.String lotto(@PathVariable("number") int number){
	  if(number % 2 == 0)
		  return "You will take a grand journey in the near future, but be weary of tempting offers.";
	  else 
  	return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
  }
  
  @RequestMapping("/omikuji")
  public String form() {
	  return "index.jsp";
  }
  
  @RequestMapping("/confirm")
  public String confirm() {
	  return "submission.jsp";
  }

  
//...
  @RequestMapping(value="/processForm", method=RequestMethod.POST)
  public String processForm(HttpSession session,
	   @RequestParam(value="number") Integer number,
	   @RequestParam(value="city") String city,
	   @RequestParam(value="celebrity") String celebrity,
	   @RequestParam(value="profession") String profession,
	   @RequestParam(value="biotic") String biotic,
	   @RequestParam(value="compliment") String compliment){
	   
	  	session.setAttribute("number", number);
	  	session.setAttribute("city", city);
	  	session.setAttribute("celebrity", celebrity);
	  	session.setAttribute("profession", profession);
	  	session.setAttribute("biotic", biotic);
	  	session.setAttribute("compliment", compliment);

	  	
	   // Code here to complete the transaction and charge CC
	   // ** Put any necessary information in session for later **
	       
	   return "redirect:/confirm"; // <-- redirects to a /confirm render route.
	}
	//...
}
