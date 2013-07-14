package jp.co.omana.entity;

import javax.annotation.Generated;
import jp.co.omana.entity.InqueryNames._InqueryNames;
import jp.co.omana.entity.RecNames._RecNames;
import jp.co.omana.entity.TblBbNames._TblBbNames;
import jp.co.omana.entity.TblResNames._TblResNames;
import jp.co.omana.entity.UpdateInfoNames._UpdateInfoNames;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2013/07/14 19:28:22")
public class Names {

    /**
     * {@link Inquery}の名前クラスを返します。
     * 
     * @return Inqueryの名前クラス
     */
    public static _InqueryNames inquery() {
        return new _InqueryNames();
    }

    /**
     * {@link Rec}の名前クラスを返します。
     * 
     * @return Recの名前クラス
     */
    public static _RecNames rec() {
        return new _RecNames();
    }

    /**
     * {@link TblBb}の名前クラスを返します。
     * 
     * @return TblBbの名前クラス
     */
    public static _TblBbNames tblBb() {
        return new _TblBbNames();
    }

    /**
     * {@link TblRes}の名前クラスを返します。
     * 
     * @return TblResの名前クラス
     */
    public static _TblResNames tblRes() {
        return new _TblResNames();
    }

    /**
     * {@link UpdateInfo}の名前クラスを返します。
     * 
     * @return UpdateInfoの名前クラス
     */
    public static _UpdateInfoNames updateInfo() {
        return new _UpdateInfoNames();
    }
}