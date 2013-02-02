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
    <script type="text/javascript" src="${f:url('/js/f5reload.js')}"></script>
    <link rel="shortcut icon"  href="${f:url('/ctnt_img/favicon.ico')}" />
</head>
<body>
    <script type="text/javascript">
<!--
window.onload = function() {
    btn_off(116); // reload off
}
//-->
</script>
         <tiles:insert template="/WEB-INF/view/common/layout.jsp" flush="true">
         <tiles:put name="h1" value="お問い合わせ|分析屋本舗 | データマイニングや統計解析でマーケティング課題を解決" />
         <tiles:put name="content" type="string">
			<div id="article">
				<div id="subsite_logo">
					<p><s:link href="../"><img src="${f:url('/ctnt_img/subsite.png')}"  /></s:link></p>
				</div>
				<div id="line_list">
					<p><s:link href="../">トップページ</s:link>＞お問い合わせ</p>
				</div>
				<h2><img src="${f:url('/ctnt_img/inquery_bar.png')}" alt="お問い合わせ" /></h2>
					   <div id="subsite_ctnt">
                        <p>
                        </p>
						<div class="column_ctnt">
                            <p>お問い合わせを送信いたしました。ご返信にお時間がかかる場合がございますので、しばらくお待ちください。</p>
                            <p>お問い合わせ頂きありがとうございました。</p>
                            <s:link href= "../">TOPへ戻る</s:link>
						</div>
					</div>
			</div>
        </tiles:put>
        </tiles:insert>
</body>
</html>
