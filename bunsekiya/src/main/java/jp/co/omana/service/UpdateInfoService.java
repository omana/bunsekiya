package jp.co.omana.service;

import java.util.List;
import javax.annotation.Generated;
import jp.co.omana.entity.UpdateInfo;

import static jp.co.omana.entity.UpdateInfoNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link UpdateInfo}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2013/07/14 19:28:25")
public class UpdateInfoService extends AbstractService<UpdateInfo> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param autoNum
     *            識別子
     * @return エンティティ
     */
    public UpdateInfo findById(Integer autoNum) {
        return select().id(autoNum).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<UpdateInfo> findAllOrderById() {
        return select().orderBy(asc(autoNum())).getResultList();
    }
}