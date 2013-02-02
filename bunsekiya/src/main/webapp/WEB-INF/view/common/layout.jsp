<div id="wrapper">
        <div id="inner_wrapper">
                <div id="header">
                <h1><tiles:getAsString name="h1" ignore="true" /></h1>
                <tiles:insert page="/WEB-INF/view/common/header.jsp" />
                </div>
                <tiles:insert page="/WEB-INF/view/common/navi.jsp" />
                <tiles:insert attribute="content" />
        </div>
        <tiles:insert page="/WEB-INF/view/common/footer.jsp" />
</div>

