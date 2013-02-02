package jp.co.omana.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

/**
 * {@link Rec}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2012/11/18 20:59:42")
public class RecTest extends S2TestCase {

    private JdbcManager jdbcManager;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("s2jdbc.dicon");
    }

    /**
     * 全件取得をテストします。
     * 
     * @throws Exception
     */
    public void testFindAll() throws Exception {
        jdbcManager.from(Rec.class).getResultList();
    }
}