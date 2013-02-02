/*
 * Copyright 2004-2008 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package jp.co.omana.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import jp.co.omana.entity.Rec;
import jp.co.omana.entity.TblBb;
import jp.co.omana.service.RecService;
import jp.co.omana.service.TblBbService;

import org.seasar.framework.util.IntegerConversionUtil;
import org.seasar.struts.annotation.Execute;

public class IndexAction {


    @Resource
    TblBbService tblBbService = new TblBbService();

    @Resource
    RecService recService = new RecService();

    public Rec rec = new Rec();

    public List<TblBb> tblBbList = new ArrayList<TblBb>();

    @Execute(validator = false)
	public String index() {
        Date date = new Date();
        SimpleDateFormat dateformat = new SimpleDateFormat("MM");
        String month = dateformat.format(date);
        int monthNum = IntegerConversionUtil.toPrimitiveInt(month);

        rec = recService.findById(monthNum);

        if (rec ==null){
            rec = new Rec();
            rec.recTime = 0;
        }

        tblBbList = tblBbService.findAllowedOrderByDate();

        return "index.jsp";
	}

    @Execute(validator = false,urlPattern="company")
	public String company() {
        return "company.jsp";
	}

    @Execute(validator = false)
	public String people() {
        return "people.jsp";
	}


    @Execute(validator = false)
	public String introduction() {
        return "introduction.jsp";
	}

    @Execute(validator = false)
	public String service() {
        return "searvice.jsp";
	}

    @Execute(validator = false)
    public String sitemap() {
        return "sitemap.jsp";
    }
    @Execute(validator = false)
    public String sitepolicy() {

        return "sitepolicy.jsp";
    }

}
