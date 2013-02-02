package jp.co.omana.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import org.seasar.extension.jdbc.where.SimpleWhere;


import jp.co.omana.entity.TblRes;

import static jp.co.omana.entity.TblBbNames.threadId;
import static jp.co.omana.entity.TblResNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link TblRes}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2012/10/20 11:54:50")
public class TblResService extends AbstractService<TblRes> {

    /**
     * 識別子でエンティティを検索します。
     *
     * @param threadId
     *            識別子
     * @param resId
     *            識別子
     * @return エンティティ
     */
    public TblRes findById(Integer threadId, Integer resId) {
        return select().id(threadId, resId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<TblRes> findAllOrderById() {
        return select().orderBy(asc(threadId()), asc(resId())).getResultList();
    }

    /**
     *threadIdで検索します。
     * @return
     */
    public List<TblRes> findAllByThreadIdOrderBythreadId(int id) {
        List<TblRes> tblResList = new ArrayList<TblRes>();
        SimpleWhere threadIdWhere = new SimpleWhere()
        .eq("threadId", id)
        .eq("RAllowFlg", 1);
        tblResList =  select()
                .where(threadIdWhere)
                .orderBy(asc(threadId()), asc(resId())).getResultList();

            return tblResList;
    }

    public List<TblRes> findAllByNotAllowed() {
        List<TblRes> tblResList = new ArrayList<TblRes>();
        SimpleWhere notAllowed = new SimpleWhere().eq("rAllowFlg", 0);
        tblResList = select()
                .innerJoin("tblBb")
                .where(notAllowed)
                .orderBy(asc(threadId()), asc(resId())).getResultList();
        return tblResList;
    }


    /**
     * 最大のスレッドIDを取得
     * @return
     */
    public int  findMaxResId(int id) {
        int maxResId = 0;
        TblRes tblRes = new TblRes();
        SimpleWhere threadIdWhere = new SimpleWhere().eq("threadId", id);
        try {
            tblRes = select()
                    .where(threadIdWhere)
                    .orderBy(desc(resId()))
                    .limit(1)
                    .getSingleResult();

            maxResId = tblRes.resId;

        } catch (NullPointerException nullex) {
            maxResId = 0;
        }
        return maxResId;

    }

}