<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">
<head>
	<title>お問い合わせ|【分析屋本舗】データマイニングや統計解析でマーケティング課題を解決</title>
	<meta http-equiv="Content-Type" content="text/css; charset=UTF-8">
	<meta http-equiv="Content-Script-Type" content="text/javascript">
	<meta name="description" content="お問い合わせ|分析屋へのご相談窓口。どうぞ、なんなりとご相談ください。"/>
	<meta name="keywords" content="お問い合わせ,マーケティング分析,統計解析,機械学習,アンケート分析,マーケティング調査,分析屋本舗,データ解析,データマイニング,マーケティング,分析,吉永,野村" />
    <link rel="stylesheet" type="text/css" media="screen" href="${f:url('/css/base_layout.css')}" charset="utf-8" />
    <link rel="stylesheet" type="text/css" media="screen" href="${f:url('/css/inquery_layout.css')}" charset="utf-8" />
    <link rel="stylesheet" type="text/css" media="screen" href="${f:url('/css/subsite_layout.css')}" charset="utf-8" />
	<script type="text/javascript" src="${f:url('/js/jquery.js')}"></script>
	<link rel="shortcut icon"  href="${f:url('/ctnt_img/favicon.ico')}" />
</head>
<body>
         <tiles:insert template="/WEB-INF/view/common/layout.jsp" flush="true">
         <tiles:put name="h1" value="お問い合わせ|分析屋本舗 | データマイニングや統計解析でマーケティング課題を解決" />
         <tiles:put name="content" type="string">
			<div id="article">
				<div id="subsite_logo">
					<p><s:link href=""><img src="${f:url('/ctnt_img/subsite.png')}"  /></s:link></p>
				</div>
				<div id="line_list">
					<p><s:link href="../">トップページ</s:link>＞お問い合わせ</p>
				</div>
				<h2><img src="${f:url('/ctnt_img/inquery_bar.png')}" alt="お問い合わせ" /></h2>
					<div id="subsite_ctnt">
						<p>
						分析屋本舗へ個別のご相談がございましたら、こちらのお問い合わせフォームをご記入の上、「確認画面へ進む」ボタンを押してください。
						</p>

						<div class="column_ctnt">

						<s:form action="confirm" method="POST">
						    <p><html:errors/></p>
<!--  							<p>お名前(必須)<br/>苗字:<html:text  property="nameMyoji" size="20" value="${f:h(inqueryDto.nameMyoji)}"/>名前:<html:text property="nameNamae"   size="20" value="${f:h(inqueryDto.nameMyoji)}"/></p>
							<p>フリガナ(必須)<br/>苗字:<html:text property="kanaMyoji"  size="20"  value="${f:h(inqueryDto.kanaMyoji)}"/>名前:<html:text property="kanaNamae"  size="20"  value="${f:h(inqueryDto.kanaMyoji)}"/></p>
-->
                            <p>お名前(必須)<br/><html:text  property="nameMyoji" size="40" styleClass="text_form" value="${f:h(inqueryDto.nameMyoji)}"/></p>
                            <p>フリガナ(必須)<br/><html:text property="kanaMyoji"  size="40" styleClass="text_form" value="${f:h(inqueryDto.kanaMyoji)}"/></p>
							<p>勤務先(必須)<br/><html:text property="cmpny"  size="40" styleClass="text_form" value="${f:h(inqueryDto.cmpny)}"/></p>
							<p>所属部署(必須)<br/><html:text property="division" size="40" styleClass="text_form" value="${f:h(inqueryDto.division)}"/></p>
							<p>メールアドレス(必須)<br/><html:text property="address" size="40" styleClass="text_form" value="${f:h(inqueryDto.address)}"/></p>
							<p>お問い合わせ区分(必須)<br/>
                            <html:select  property="inqueryKind" value="${f:h(inqueryDto.inquerykind)}">
								<html:option value="現状診断">現状診断</html:option>
								<html:option value="予測・シュミレーション">予測・シュミレーション</html:option>
								<html:option value="講習・講座">講習・講座</html:option>
								<html:option value="その他問い合わせ">その他お問い合わせ</html:option>
							</html:select>
							<p>内容(1000文字以内）<br/>
								<c:choose>
                                    <c:when test="${empty inqueryDto.inqueryText}">
										<textarea name="inqueryText" rows="20" cols="50" >こちらに内容をご記入下さい。</textarea>
                                    </c:when>
                                    <c:otherwise>
										<textarea name = "inqueryText"  rows="20" cols="50" >${f:h(inqueryDto.inqueryText)}</textarea>
								    </c:otherwise>
								</c:choose>
							</p>
							<div id="inquerysbmt">
								<p><s:link href="../sitepolicy" target="_blank">個人情報の取り扱い</s:link>に同意の上、<br>
								<input type="image" src="${f:url('/ctnt_img/inquery_btr.png')}" alt="お問い合わせを送信">
							</div>
							</p>

						</s:form>
						</div>
					</div>
			</div>
        </tiles:put>
        </tiles:insert>
</body>
</html>
