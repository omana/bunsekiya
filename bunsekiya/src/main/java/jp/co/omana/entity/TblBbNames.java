package jp.co.omana.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link TblBb}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/11/20 1:07:34")
public class TblBbNames {

    /**
     * threadIdのプロパティ名を返します。
     * 
     * @return threadIdのプロパティ名
     */
    public static PropertyName<Integer> threadId() {
        return new PropertyName<Integer>("threadId");
    }

    /**
     * TCatのプロパティ名を返します。
     * 
     * @return TCatのプロパティ名
     */
    public static PropertyName<String> TCat() {
        return new PropertyName<String>("TCat");
    }

    /**
     * TTitleのプロパティ名を返します。
     * 
     * @return TTitleのプロパティ名
     */
    public static PropertyName<String> TTitle() {
        return new PropertyName<String>("TTitle");
    }

    /**
     * TDateのプロパティ名を返します。
     * 
     * @return TDateのプロパティ名
     */
    public static PropertyName<String> TDate() {
        return new PropertyName<String>("TDate");
    }

    /**
     * TAdminFlgのプロパティ名を返します。
     * 
     * @return TAdminFlgのプロパティ名
     */
    public static PropertyName<Byte> TAdminFlg() {
        return new PropertyName<Byte>("TAdminFlg");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _TblBbNames extends PropertyName<TblBb> {

        /**
         * インスタンスを構築します。
         */
        public _TblBbNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _TblBbNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _TblBbNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * threadIdのプロパティ名を返します。
         *
         * @return threadIdのプロパティ名
         */
        public PropertyName<Integer> threadId() {
            return new PropertyName<Integer>(this, "threadId");
        }

        /**
         * TCatのプロパティ名を返します。
         *
         * @return TCatのプロパティ名
         */
        public PropertyName<String> TCat() {
            return new PropertyName<String>(this, "TCat");
        }

        /**
         * TTitleのプロパティ名を返します。
         *
         * @return TTitleのプロパティ名
         */
        public PropertyName<String> TTitle() {
            return new PropertyName<String>(this, "TTitle");
        }

        /**
         * TDateのプロパティ名を返します。
         *
         * @return TDateのプロパティ名
         */
        public PropertyName<String> TDate() {
            return new PropertyName<String>(this, "TDate");
        }

        /**
         * TAdminFlgのプロパティ名を返します。
         *
         * @return TAdminFlgのプロパティ名
         */
        public PropertyName<Byte> TAdminFlg() {
            return new PropertyName<Byte>(this, "TAdminFlg");
        }
    }
}