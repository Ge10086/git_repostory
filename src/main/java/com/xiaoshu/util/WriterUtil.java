package com.xiaoshu.util;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WriterUtil {
	
	public static void write(HttpServletResponse response,String obj){
		try {
			 response.setContentType("text/html; charset=utf-8");
			 PrintWriter out=response.getWriter();
			 out.println(obj);
			 out.flush();
			 out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writePlain(HttpServletResponse response,String obj){
		try {
			 response.setContentType("text/plain; charset=utf-8");
			 PrintWriter out = response.getWriter();
			 out.println(obj);
			 out.flush();
			 out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
