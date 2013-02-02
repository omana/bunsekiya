package jp.co.omana.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import org.seasar.extension.jdbc.where.SimpleWhere;

import jp.co.omana.entity.TblBb;

import static jp.co.omana.entity.TblBbNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link TblBb}のサービスクラスです。
 *
 */
 @Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2012/10/20 11:54:50")
 public class TblBbService extends AbstractService<TblBb> {

     /**
      * 識別子でエンティティを検索します。
      *
      * @param threadId
      *            識別子
      * @return エンティティ
      */
     public TblBb findById(Integer threadId) {
         return select().id(threadId).getSingleResult();
     }

     /**
      * 識別子の昇順ですべてのエンティティを検索します。
      *
      * @return エンティティのリスト
      */
     public List<TblBb> findAllOrderById() {
         return select().orderBy(asc(threadId())).getResultList();
     }

     /**
      * T_Dateの昇順ですべてのエンティティを検索します。
      * @return
      */
     public List<TblBb> findAllowedOrderByDate() {
         //TAdminFlgが1の場合の条件 （管理者が許可した場合の条件）
         SimpleWhere allowWhere = new SimpleWhere()
         .eq("TAdminFlg", 1);

         List<TblBb> tblBbList = new ArrayList<TblBb>();

         tblBbList = select()
                 .orderBy(asc(TDate()))
                 .where(allowWhere)
                 .getResultList();
         return tblBbList;
     }

     /**
      * 最大のスレッドIDを取得
      * @return
      */
     public int  findMaxThreadId() {
         int maxThreadId = 0;
         TblBb tblBb = new TblBb();
         try {
             tblBb = select()
                     .orderBy(desc(threadId()))
                     .limit(1)
                     .getSingleResult();

             maxThreadId = tblBb.threadId;

         } catch (NullPointerException nullex) {
             maxThreadId = 0;
         }
         return maxThreadId;

     }


 }