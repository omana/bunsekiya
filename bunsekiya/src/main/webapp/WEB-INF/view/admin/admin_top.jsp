<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">
<head>
	<title>ログイン【分析屋本舗】web解析やweb分析の解決策を提供します。</title>
	<meta name="robots" content="noindex,nofollow">
	<meta http-equiv="Content-Type" content="text/css; charset=UTF-8">
	<meta http-equiv="Content-Script-Type" content="text/javascript">
  	<link rel="stylesheet" type="text/css" media="screen" href="${f:url('/css/base_layout.css')}" charset="utf-8" />
    <link rel="stylesheet" type="text/css" media="screen" href="${f:url('/css/board_detail_layout.css')}" charset="utf-8" />
    <link rel="stylesheet" type="text/css" media="screen" href="${f:url('/css/admin_layout.css')}" charset="utf-8" />
    <link rel="shortcut icon"  href="${f:url('/ctnt_img/favicon.ico')}" />
    <script type="text/javascript" src="${f:url('/js/jquery.js')}"></script>
</head>
<body>
         <tiles:insert template="/WEB-INF/view/common/layout.jsp" flush="true">
         <tiles:put name="h1" value="ログイン|分析屋本舗 | web分析、web解析,データマイニングで課題解決" />
         <tiles:put name="content" type="string">
				<div id="article">
				 <div id="admincntnt">
					<p><html:errors/></p>
					<h2>今月の仕事数</h2>
						<s:form action="recUpdate" method="post">
							<p>
								<html:text property="recNum" value="${f:h(rec.recTime)}"></html:text>
								<s:submit property="recUpdate" value="送信" />
							</p>
						</s:form>
						<hr>
                    <h2>新着情報用入稿</h2>
                        <s:form action="newInfo" method="post">
                            <p>
                                <p><html:errors/></p
                                <c:out value="更新日"></c:out>
                                <br>
                                <html:select property="infoDateY" value="2013"> property="infoDate">
                                    <html:option value="2012"></html:option>
                                    <html:option value="2013" ></html:option>
                                    <html:option value="2014"></html:option>
                                    <html:option value="2015"></html:option>
                                    <html:option value="2016"></html:option>
                                    <html:option value="2017"></html:option>
                                    <html:option value="2018"></html:option>
                                    <html:option value="2019"></html:option>
                                    <html:option value="2020"></html:option>
                                </html:select>
                                <html:select property="infoDateM"> property="infoDate">
                                    <c:forEach var="i" end="12" step="1" begin="1">
                                    <html:option value="${i}"></html:option>
                                    </c:forEach>
                                </html:select>月
                                <html:select property="infoDateD"> property="infoDate">
                                    <c:forEach var="i" end="31" step="1" begin="1">
                                    <html:option value="${i}"></html:option>
                                    </c:forEach>
                                </html:select>日
                                </br>
                                <c:out value="新着情報"></c:out>
                                </br>
                                <html:textarea property="infoContent" rows="5" cols="70"></html:textarea>
                                </br>
                                <s:submit property="newInfo" value="送信" />
                            </p>
                        </s:form>
                        <hr>
                        
					<h2>かわら版一覧</h2>
					    <c:forEach var="bb" items="${tblResList}" varStatus="index">
						<div class="admin_inquery_ctnt">
							<s:form action="dispBoard" method="post">
								<p>
									名前: ${bb.rWriter} 様
								</p>
								<p>
									アドレス: ${bb.rAddress}
								</p>
								<p>
									問い合わせ内容: ${bb.rContext}
								</p>
								<p>
									<html:radio property="disp" value="1">掲載OK</html:radio>
							     	<html:radio property="disp" value="0">掲載NG</html:radio>
                                </p>
								<p>
                                    <html:hidden property="threadId" value="${bb.threadId}"/>
                                    <html:hidden property="resId" value="${bb.resId}"/>
									<html:submit value="送信" property="dispBoard"/>
								</p>
							</s:form>
							<h3>${bb.tblBb.tTitle}への返信</h3>
							<s:form action="reply/${bb.threadId}/${bb.resId}" method="post">
                                <p>
                                 管理人名前
                                 </p>
                                 <p>
                                    <html:text property="name" value="【管理人】吉永 恵一 " styleClass="text_form" ></html:text>
                                 </p>
                                 <p>
                                 返信内容
                                 </p>
                                <p>
                                   <html:hidden property="thireadId" value="${bb.threadId}"/>
                                   <html:hidden property="resID" value="${bb.resId}"/>
                                </p>

                                <s:submit property="reply" value="送信" />
							</s:form>
							<hr>
						</div>
						</c:forEach>
						<hr>
					<h2>問い合わせ一覧</h2>
                    <c:forEach var="inq" items="${inqueryList}" varStatus="index">
						<div class="admin_inquery_ctnt">
								<p>
									名前 <a href="mailto:${inq.address}">${inq.nameKanji}</a>
								</p>
								<p>
									会社 ${inq.company}
								</p>
								<p>
									アドレス <a href="mailto:${inq.address}">${inq.address}</a>
								</p>
								<p>
									問い合わせ項目 ${inq.inqueryKind}
								</p>
								<p>
									問い合わせ内容 ${inq.inqueryText}
								</p>
								<hr>
						</div>
				    </c:forEach>
				</div>
			</div>
        </tiles:put>
        </tiles:insert>
</body>
</html>
