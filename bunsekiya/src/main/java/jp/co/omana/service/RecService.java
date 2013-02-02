package jp.co.omana.service;

import java.util.List;
import javax.annotation.Generated;
import jp.co.omana.entity.Rec;

import static jp.co.omana.entity.RecNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Rec}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2012/11/20 1:07:37")
public class RecService extends AbstractService<Rec> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param recId
     *            識別子
     * @return エンティティ
     */
    public Rec findById(Integer recId) {
        return select().id(recId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Rec> findAllOrderById() {
        return select().orderBy(asc(recId())).getResultList();
    }
}