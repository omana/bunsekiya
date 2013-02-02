package jp.co.omana.action;

import org.seasar.struts.annotation.Execute;

public class ColumnAction {

	   @Execute(validator = false)
		public String index() {
	        return "column.jsp";
		}



}
