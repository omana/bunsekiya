<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">
<head>
	<title>かわら版|【分析屋本舗】データマイニングや統計解析でマーケティング課題を解決</title>
	<meta http-equiv="Content-Type" content="text/css; charset=UTF-8">
	<meta http-equiv="Content-Script-Type" content="text/javascript">
	<meta name="description" content="かわら版|分析屋との一問一答。どうぞ、お気軽にご投稿ください。"/>
	<meta name="keywords" content="かわら版,マーケティング分析,統計解析,機械学習,アンケート分析,マーケティング調査,分析屋本舗,データ解析,データマイニング,マーケティング,分析,吉永,野村" />
	<link rel="stylesheet" type="text/css" media="screen" href="${f:url('/css/base_layout.css')}" charset="utf-8" />
	<link rel="stylesheet" type="text/css" media="screen" href="${f:url('/css/board_layout.css')}" charset="utf-8" />
	<link rel="stylesheet" type="text/css" media="screen" href="${f:url('/css/subsite_layout.css')}" charset="utf-8" />

	<script type="text/javascript" src="js/jquery.js"></script>
	<link rel="shortcut icon"  href="${f:url('/ctnt_img/favicon.ico')}" />
</head>
<body>
         <tiles:insert template="/WEB-INF/view/common/layout.jsp" flush="true">
         <tiles:put name="h1" value="かわら版|分析屋本舗 | データマイニングや統計解析でマーケティング課題を解決" />
         <tiles:put name="content" type="string">
			<div id="article">
				<div id="subsite_logo">
					<p><s:link href=""><img src="${f:url('/ctnt_img/subsite.png')}"  /></s:link></p>
				</div>
				<div id="line_list">
					<p><s:link href="../">トップページ</s:link>＞<s:link href="">かわら版</s:link>＞かわら版に投稿</p>
				</div>
				<h2><img src="${f:url('/ctnt_img/board_bar.png')}" alt="秘伝のたれ" /></h2>
					<div id="subsite_ctnt">
						<p>分析屋との一問一答。どうぞ、お気軽にご投稿ください。</p>
						<s:form action="confirm" method="POST">
						    <p><html:errors /></p>
							<p>タイトル(必須)<br/><html:text property="title" size="60"  styleClass="text_form"  value="${f:h(boardDto.title)}" /></p>
							<p>お名前(必須)<br/><html:text property="name"   size="60" styleClass="text_form" value="${f:h(boardDto.name)}"/></p>
							<p>メールアドレス<br/><html:text property="address" size="60" styleClass="text_form"  value="${f:h(boardDto.address)}" /></p>
							<p>内容(400文字以内）<br/>
								<c:choose>
                                    <c:when test="${empty boardDto.boardText}">
										<textarea name="boardText" rows="20" cols="50" >こちらに内容をご記入下さい。</textarea>
                                    </c:when>
                                    <c:otherwise>
										<textarea name = "boardText"  rows="20" cols="50" >${f:h(inqueryDto.inqueryText)}</textarea>
								    </c:otherwise>
								</c:choose>
								</p>
							<div id="inquerysbmt">
								<p><s:link href="../sitepolicy"  target="_blank">個人情報の取り扱い</s:link>に同意の上、<br>
								<input type="image" src="${f:url('/ctnt_img/inquery_btr.png')}"  alt="かわら版に書き込む"></p>
							</div>

						</s:form>
					</div>

					</div>
        </tiles:put>
        </tiles:insert>
</body>
</html>
