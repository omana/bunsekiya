package jp.co.omana.action;

import org.seasar.struts.annotation.Execute;

public class ServiceAction {

	   @Execute(validator = false)
		public String index() {
	        return "service.jsp";
		}

//	   @Execute(validator = false)
//		public String confirm() {
//	        return "index.jsp";
//		}
//
//	   @Execute(validator = false)
//		public String finish() {
//	        return "index.jsp";
//		}


}
