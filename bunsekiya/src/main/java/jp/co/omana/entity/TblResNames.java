package jp.co.omana.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link TblRes}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/11/20 1:07:34")
public class TblResNames {

    /**
     * threadIdのプロパティ名を返します。
     * 
     * @return threadIdのプロパティ名
     */
    public static PropertyName<Integer> threadId() {
        return new PropertyName<Integer>("threadId");
    }

    /**
     * resIdのプロパティ名を返します。
     * 
     * @return resIdのプロパティ名
     */
    public static PropertyName<Integer> resId() {
        return new PropertyName<Integer>("resId");
    }

    /**
     * RDateのプロパティ名を返します。
     * 
     * @return RDateのプロパティ名
     */
    public static PropertyName<String> RDate() {
        return new PropertyName<String>("RDate");
    }

    /**
     * RWriterのプロパティ名を返します。
     * 
     * @return RWriterのプロパティ名
     */
    public static PropertyName<String> RWriter() {
        return new PropertyName<String>("RWriter");
    }

    /**
     * RAddressのプロパティ名を返します。
     * 
     * @return RAddressのプロパティ名
     */
    public static PropertyName<String> RAddress() {
        return new PropertyName<String>("RAddress");
    }

    /**
     * RContextのプロパティ名を返します。
     * 
     * @return RContextのプロパティ名
     */
    public static PropertyName<String> RContext() {
        return new PropertyName<String>("RContext");
    }

    /**
     * RAllowFlgのプロパティ名を返します。
     * 
     * @return RAllowFlgのプロパティ名
     */
    public static PropertyName<Byte> RAllowFlg() {
        return new PropertyName<Byte>("RAllowFlg");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _TblResNames extends PropertyName<TblRes> {

        /**
         * インスタンスを構築します。
         */
        public _TblResNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _TblResNames(final String name) {
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
        public _TblResNames(final PropertyName<?> parent, final String name) {
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
         * resIdのプロパティ名を返します。
         *
         * @return resIdのプロパティ名
         */
        public PropertyName<Integer> resId() {
            return new PropertyName<Integer>(this, "resId");
        }

        /**
         * RDateのプロパティ名を返します。
         *
         * @return RDateのプロパティ名
         */
        public PropertyName<String> RDate() {
            return new PropertyName<String>(this, "RDate");
        }

        /**
         * RWriterのプロパティ名を返します。
         *
         * @return RWriterのプロパティ名
         */
        public PropertyName<String> RWriter() {
            return new PropertyName<String>(this, "RWriter");
        }

        /**
         * RAddressのプロパティ名を返します。
         *
         * @return RAddressのプロパティ名
         */
        public PropertyName<String> RAddress() {
            return new PropertyName<String>(this, "RAddress");
        }

        /**
         * RContextのプロパティ名を返します。
         *
         * @return RContextのプロパティ名
         */
        public PropertyName<String> RContext() {
            return new PropertyName<String>(this, "RContext");
        }

        /**
         * RAllowFlgのプロパティ名を返します。
         *
         * @return RAllowFlgのプロパティ名
         */
        public PropertyName<Byte> RAllowFlg() {
            return new PropertyName<Byte>(this, "RAllowFlg");
        }
    }
}