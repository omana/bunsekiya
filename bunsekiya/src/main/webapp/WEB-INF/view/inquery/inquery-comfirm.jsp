<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">
<head>
	<title>お問い合わせ|【分析屋本舗】データマイニングや統計解析でマーケティング課題を解決</title>
	<meta http-equiv="Content-Type" content="text/css; charset=UTF-8">
	<meta http-equiv="Content-Script-Type" content="text/javascript">
	<meta name="description" content="お問い合わせ|分析屋へのご相談窓口。どうぞ、なんなりとご相談ください。"/>
	<meta name="keywords" content="お問い合わせ,マーケティング分析,統計解析,機械学習,アンケート分析,マーケティング調査,分析屋本舗,データ解析,データマイニング,マーケティング,分析,吉永,野村" />
	<link rel="stylesheet" type="text/css" media="screen" href="${f:url('/css/base_layout.css')}" charset="utf-8" />
	<link rel="stylesheet" type="text/css" media="screen" href="${f:url('/css/board_layout.css')}" charset="utf-8" />
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
					<p><s:link href="../"><img src="${f:url('/ctnt_img/subsite.png')}"  /></s:link></p>
				</div>
				<div id="line_list">
					<p><s:link href="../">トップページ</s:link>＞<s:link href="">お問い合わせ</s:link>＞お問い合わせを確認</p>
				</div>
				<h2><img src="${f:url('/ctnt_img/inquery_bar.png')}" alt="お問い合わせ" /></h2>
					<div id="subsite_ctnt">
						<p>分析屋本舗の分析屋と気軽に web分析、web解析,データマイニングについて相談できます。</p>
						<div id="rgst_cnfrm">
							<form action="send" method="post">
								<div class="cnfrm_txt">
									<p>お名前<br/>${f:h(inqueryDto.nameMyoji)} 様</p>
									<html:hidden property="nameMyoji" value="${f:h(inqueryDto.nameMyoji)} "/>
								</div>
								<div class="cnfrm_txt">
									<p>フリガナ<br/>${f:h(inqueryDto.kanaMyoji)} 様</p>
									<html:hidden property="kanaMyoji" value="${f:h(inqueryDto.kanaMyoji)} "/>
								</div>
								<div class="cnfrm_txt">
									<p>お勤め先<br/>${f:h(inqueryDto.cmpny)}</p>
									<html:hidden property="cmpny" value="${f:h(inqueryDto.cmpny)} "/>
								</div>
                                <div class="cnfrm_txt">
                                    <p>所属部署<br/>${f:h(inqueryDto.division)}</p>
                                    <html:hidden property="division" value="${f:h(inqueryDto.division)} "/>
                                </div>
								<div class="cnfrm_txt">
									<p>メールアドレス<br/>${f:h(inqueryDto.address)}</p>
                                   <html:hidden property="address" value="${f:h(inqueryDto.address)} "/>
								</div>
								<div class="cnfrm_txt">
									<p>問い合わせ種類<br/>${f:h(inqueryDto.inqueryKind)}</p>
                                    <html:hidden property="inqueryKind" value="${f:h(inqueryDto.inqueryKind)} "/>
								</div>
								<div class="cnfrm_txt">
									<p>内容(400文字以内）<br/>
										${f:h(inqueryDto.inqueryText)}
									</p>
									<html:hidden property="inqueryText" value="${f:h(inqueryDto.inqueryText)} "/>
								</div>
								<div id="inquerysbmt">
									<p><s:link href="../sitepolicy">個人情報の取り扱い</s:link>に同意の上、<br>
                                   <input type="image" src="${f:url('/ctnt_img/submit_btr.png')}" alt="お問い合わせを送信">
									</p>
								</div>
							</form>
						</div>
					</div>
			</div>
        </tiles:put>
        </tiles:insert>
</body>
</html>