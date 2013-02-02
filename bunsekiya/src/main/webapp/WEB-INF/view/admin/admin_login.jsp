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

    <script type="text/javascript" src="${f:url('/js/jquery.js')}"></script>
</head>
<body>
         <tiles:insert template="/WEB-INF/view/common/layout.jsp" flush="true">
         <tiles:put name="h1" value="ログイン|分析屋本舗 | web分析、web解析,データマイニングで課題解決" />
         <tiles:put name="content" type="string">
			<div id="article">
			     <div id="admincntnt">
						<s:form action="login" method="post">
						 	<p>
						 		ユーザーID：<br />
						 		<html:text property="userId"  size="60" styleClass="text_form"/>
						 	</p>
						 	<p>
						 		パスワード：<br />
						 		<html:password property="passwd"  size="60" styleClass="text_form"/>
						 	</p>
						 	<p>
						 		<s:submit property="login" value="ログインする" />
						 	</p>

						</s:form>
				</div>
			</div>
		</tiles:put>
		</tiles:insert>
</body>
</html>
