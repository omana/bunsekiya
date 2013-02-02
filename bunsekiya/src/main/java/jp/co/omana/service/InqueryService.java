package jp.co.omana.service;

import java.util.List;
import javax.annotation.Generated;


import jp.co.omana.entity.Inquery;

import static jp.co.omana.entity.InqueryNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Inquery}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2012/10/28 22:08:39")
public class InqueryService extends AbstractService<Inquery> {

    /**
     * 識別子でエンティティを検索します。
     *
     * @param inqueryId
     *            識別子
     * @return エンティティ
     */
    public Inquery findById(Integer inqueryId) {
        return select().id(inqueryId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<Inquery> findAllOrderById() {
        return select().orderBy(asc(inqueryId())).getResultList();
    }

    /**
     * インクエリーIDの最大値を取得します。
     * @return
     */
    public int findMaxInqueryId(){
        int maxInqueryId = 0;
        Inquery inquery = new Inquery();
        try {

        inquery = select()
                .orderBy(desc(inqueryId()))
                .limit(1)
                .getSingleResult();

        maxInqueryId = inquery.inqueryId;
        } catch (NullPointerException e) {
            maxInqueryId =0;
        }
        return maxInqueryId;
    }

}