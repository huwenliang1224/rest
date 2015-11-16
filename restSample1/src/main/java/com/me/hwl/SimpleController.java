package com.me.hwl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/simple")
public class SimpleController {

	@RequestMapping("/index")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("message", "Hello,This is a example of Spring3 RESTful!");
		return "index.jsp";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public void get(@PathVariable String id, HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		PrintWriter out = response.getWriter();
		String str = "{\"type\":\"get\"}";
		out.write(str);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public void post(@PathVariable String id, HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		PrintWriter out = response.getWriter();
		String str = "{\"type\":\"post\"}";
		out.write(str);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id, HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		PrintWriter out = response.getWriter();
		String str = "{\"type\":\"delete\"}";
		out.write(str);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void put(@PathVariable String id, HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		PrintWriter out = response.getWriter();
		String str = "{\"type\":\"put\"}";
		out.write(str);
	}
}
