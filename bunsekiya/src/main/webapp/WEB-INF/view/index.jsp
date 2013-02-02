<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">
<head>
	<title>【分析屋本舗】データマイニングや統計解析でマーケティング課題を解決</title>
	<meta http-equiv="Content-Type" content="text/css; charset=UTF-8">
	<meta http-equiv="Content-Script-Type" content="text/javascript">
	<meta name="description" content="我々は、「分析は高い、難しい、成果が見えにくい」という現状を刷新すべく奔走する、データ分析を生業とする専門家集団です。"/>
	<meta name="keywords" content="マーケティング分析,統計解析,機械学習,アンケート分析,マーケティング調査,分析屋本舗,データ解析,データマイニング,マーケティング,分析,吉永,野村" />
	<link rel="stylesheet" type="text/css" media="screen" href="${f:url('/css/base_layout.css')}" charset="utf-8" />
    <link rel="stylesheet" type="text/css" media="screen" href="${f:url('/css/board_layout.css')}" charset="utf-8" />
	<link rel="stylesheet" type="text/css" media="screen" href="${f:url('/css/jquery.slider.css')}" charset="utf-8" />
	<link rel="shortcut icon"  href="${f:url('/ctnt_img/favicon.ico')}" />
	<script type="text/javascript" src="${f:url('/js/jquery.js')}"></script>
	<script type="text/javascript" src="${f:url('/js/jquery.slider.min.js')}"></script>
	<link rel="shortcut icon"  href="${f:url('/ctnt_img/favicon.ico')}" />
</head>
<body>
         <tiles:insert template="/WEB-INF/view/common/layout.jsp" flush="true">
         <tiles:put name="h1" value="分析屋本舗 | データマイニングや統計解析でマーケティング課題を解決" />
         <tiles:put name="content" type="string">
			<div id="article">
				<div id="slider">
					<div><s:link href="introduction"><img src="${f:url('/ctnt_img/sy_hll1.png')}" height="360" width="920" alt="分析屋本舗のご挨拶"  /></s:link></div>
					<div><s:link href="service"><img src="${f:url('/ctnt_img/sy_hll2.png')}" height="360" width="920" alt="分析屋本舗のお品書き" /></s:link></div>
					<div><s:link href="board"><img src="${f:url('/ctnt_img/sy_hll3.png')}" height="360" width="920" alt="かわら版" /></s:link></div>
					<div><s:link href="column"><img src="${f:url('/ctnt_img/sy_hll4.png')}" height="360" width="920" alt="秘伝のたれ" /></s:link></div>
					<div><s:link href="people"><img src="${f:url('/ctnt_img/sy_hll5.png')}" height="360" width="920" alt="分析屋のご紹介" /></s:link></div>
				</div>
				<script type="text/javascript">
                $(function() {
                    $('#slider').slider({
                     wait: 5000,

                    });
                });
				</script>
				<div id="mnctnt">
					<div id="newInfomation">
						<h2><img src="${f:url('/ctnt_img/news.png')}" alt="新着情報"></h2>
						<div id="newscntnt">
							<p>2012/10/17弊社の分析屋である吉永がadtech-tokyoで公演を行いました。</p>
							<p>2012/10/17サイトをオープンしました。</p>
						</div>
					</div>
					<div id="qtlist">
						<h2><img src="${f:url('/ctnt_img/bbs_large.png')}" alt="かわら版の質問一覧"></h2>
						<div id="qtcntnt">
						<c:if test="${empty tblBbList}">
							<p>
							まだ投稿はありません。
							</p>
						</c:if>
						<c:forEach var="bb" items="${tblBbList}" varStatus="index">
    							<p>${f:h(bb.TTitle)}</p>
                        </c:forEach>
						</div>
					</div>
					<div id="stsrbanner">
                    <h2><img src="ctnt_img/work_num.png" alt="今月の残り仕事数"></h2>
                        <div id="wkcntnt">

                            <c:if test="${rec.recTime != 0}">
                                <p>今月はあと<em span id="red">
                                ${f:h(rec.recTime)}
                                </em>件仕事を請け負います。</p>
                            </c:if>
                           <c:if test="${rec.recTime == 0}">
                                <p><em span id="red">
                                    完売御礼
                                </em></p>
                            </c:if>

                        </div>
                    </div>
                    <div class="ad_bnr">
                        <p><s:link href="/service"><img src="${f:url('/ctnt_img/osn_bnnr.png')}" alt="お品書へ" width="200"></s:link>
                    </div>
				</div>
			</div>
		</tiles:put>
		</tiles:insert>
    </body>
</html>
