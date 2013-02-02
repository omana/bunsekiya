<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">
<head>
    <title>かわら版|【分析屋本舗】データマイニングや統計解析でマーケティング課題を解決</title>
    <meta http-equiv="Content-Type" content="text/css; charset=UTF-8">
    <meta http-equiv="Content-Script-Type" content="text/javascript">
    <meta name="description" content="かわら版|分析屋との一問一答。どうぞ、お気軽にご投稿ください。"/>
    <meta name="keywords" content="かわら版,マーケティング分析,統計解析,機械学習,アンケート分析,マーケティング調査,分析屋本舗,データ解析,データマイニング,マーケティング,分析,吉永,野村" />
    <link rel="stylesheet" type="text/css" media="screen" href="${f:url('/css/base_layout.css')}" charset="utf-8" />
    <link rel="stylesheet" type="text/css" media="screen" href="${f:url('/css/board_detail_layout.css')}" charset="utf-8" />
    <link rel="stylesheet" type="text/css" media="screen" href="${f:url('/css/subsite_layout.css')}" charset="utf-8" />

    <script type="text/javascript" src="${f:url('/js/jquery.js')}"></script>
    <link rel="shortcut icon"  href="${f:url('/ctnt_img/favicon.ico')}" />
</head>
<body>
         <tiles:insert template="/WEB-INF/view/common/layout.jsp" flush="true">
         <tiles:put name="h1" value="かわら版|分析屋本舗 | データマイニングや統計解析でマーケティング課題を解決" />
         <tiles:put name="content" type="string">
			<div id="article">
				<div id="subsite_logo">
					<p><a href=""><img src="${f:url('/ctnt_img/subsite.png')}"  /></a></p>
				</div>
				<div id="line_list">
					<p><a href="">トップページ</a>＞<s:link href ="/board" >かわら版</s:link>＞ ${f:h(tblBb.TTitle)}</p>
				</div>
				<h2><img src="${f:url('/ctnt_img/board_bar.png')}" alt="秘伝のたれ" /></h2>
					<div id="subsite_ctnt">
						<div class="kawara_ctnt">
							<h3>${f:h(tblBb.TTitle)}</h3>
							<c:forEach var="bb" items="${dplyTblResList}" >
								<div class="question_ctnt">
								<p>${bb.rWriter} 様</p>
								<p>
	    							${bb.rContext}
								</p>
								</div>
							</c:forEach>
							<div id="more_inquery">
							<s:form action="replyConfirm/${f:h(boardSessionDto.threadId)}" method="post">
							     <p><html:errors /></p>
								<p>お名前(必須)<br/><html:text property="name" size="40"  value="${f:h(boardDto.name)}" styleClass="text_form"/></p>
								<p>メールアドレス<br/><html:text property="address" styleClass="text_form" size="40" value="${f:h(boardDto.address)}"/></p>
								<html:hidden property="title" value="hoge"/>
								<html:hidden property="boardKind" value="hoge"/>
								<p>内容(400文字以内）<br/>
								    <html:textarea property="boardText" rows="10" cols="50">
								    <c:if test="${boardDto.boardText!='hogehoge'}">
								        こちらに内容をご記入下さい
								    </c:if>
								    ${f:h(boardDto.boardText)}</html:textarea>
								</p>
								<div id="inquerysbmt">
									<p><s:link href="/sitepolicy" target="_blank">個人情報の取り扱い</s:link>に同意の上、<br>
									<input type="image" src="${f:url('/ctnt_img/inquery_btr.png')}" alt="かわら版に書き込む"></p>
								</div>
                            </s:form>
							</div>
						</div>
					</div>
			</div>
			</tiles:put>
			</tiles:insert>
</body>
</html>
