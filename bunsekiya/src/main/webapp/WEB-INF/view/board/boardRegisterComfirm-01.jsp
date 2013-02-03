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
                    <p><s:link href=""><img src="${f:url('/ctnt_img/subsite.png')}"  /></s:link></p>
                </div>
                <div id="line_list">
                    <p><s:link href="">トップページ</s:link>＞<s:link href="">かわら版</s:link>＞投稿内容を確認</p>
                </div>
                <h2><img src="${f:url('/ctnt_img/board_bar.png')}" alt="かわら版" /></h2>
                    <div id="subsite_ctnt">
                        <p>分分析屋との一問一答。どうぞ、お気軽にご投稿ください。</p>
                        <div id="rgst_cnfrm">
                          <s:form action ="send01" method="POST">
                                <div class="cnfrm_txt">
                                    <p>タイトル(必須)<br/>${f:h(boardDto.title)}</p>
                                    <html:hidden property="title" value="${f:h(boardDto.title)}"/>
                                </div>
                                <div class="cnfrm_txt">
                                    <p>お名前(必須)<br/>${f:h(boardDto.name)} 様</p>
                                    <html:hidden property="name" value="${f:h(boardDto.name)}"/>
                                </div>
                                <div class="cnfrm_txt">
                                    <p>メールアドレス<br/>${f:h(boardDto.address)}</p>
                                    <html:hidden property="address" value="${f:h(boardDto.address)}"/>
                                </div>
                                <div class="cnfrm_txt">
                                    <p>内容(400文字以内）<br/>
                                        ${f:h(boardDto.boardText)}
                                    </p>
                                <html:hidden property="boardText" value="${f:h(boardDto.boardText)}"/>
                                <html:hidden property="threadId" value="${f:h(boardSessionDto.threadId)}"/>
                                </div>
                                <div id="inquerysbmt">
                                    <p><s:link href="../sitepolicy">個人情報の取り扱い</s:link>に同意の上、<br>
                                    <!--<s:link href="sended"><img src="${f:url('/ctnt_img/inquery_btr.png')}" alt="お問い合わせを送信"></s:link> -->
                                     <input type="image" src="${f:url('/ctnt_img/submit_btr.png')}" alt="かわら版に書き込みます。">
                                    </p>
                                    <p>※なお、当サイトでは、管理人からの返信がついたもののみ表示されます。</p>
                                </div>

                           </s:form>
                        </div>
                    </div>

                    </div>
        </tiles:put>
        </tiles:insert>
</body>
</html>
