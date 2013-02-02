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
					<p><a href="">トップページ</a>＞かわら版</p>
				</div>
				<h2><img src="${f:url('/ctnt_img/board_bar.png')}" alt="秘伝のたれ" /></h2>
					<div id="subsite_ctnt">
						<p>分析屋との一問一答。どうぞ、お気軽にご投稿ください。</p>
						<div id="kwr_form">
							<form action="register" method="post" >
									<p>
	                                <input type="image" src="${f:url('/ctnt_img/kwr_btr.png')}" />
									</p>
							</form>
						</div>
						<c:forEach var="bb" items="${dplyTblBbList}" varStatus="index">
						<div class="column_ctnt">
							<p><fmt:formatDate value='${f:date(bb.TDate,"yyyy-MM-dd")}' pattern="yyyy/MM/dd"/>
							:<a href="reply/${f:h(bb.threadId)}">${f:h(bb.TTitle)}</a></p>
						</div>
						</c:forEach>

					</div>
			</div>
		</tiles:put>
		</tiles:insert>
</body>
</html>
