package jp.co.omana.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link UpdateInfo}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2013/07/14 19:28:22")
public class UpdateInfoNames {

    /**
     * autoNumのプロパティ名を返します。
     * 
     * @return autoNumのプロパティ名
     */
    public static PropertyName<Integer> autoNum() {
        return new PropertyName<Integer>("autoNum");
    }

    /**
     * yyyymmddのプロパティ名を返します。
     * 
     * @return yyyymmddのプロパティ名
     */
    public static PropertyName<String> yyyymmdd() {
        return new PropertyName<String>("yyyymmdd");
    }

    /**
     * infoContextのプロパティ名を返します。
     * 
     * @return infoContextのプロパティ名
     */
    public static PropertyName<String> infoContext() {
        return new PropertyName<String>("infoContext");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _UpdateInfoNames extends PropertyName<UpdateInfo> {

        /**
         * インスタンスを構築します。
         */
        public _UpdateInfoNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _UpdateInfoNames(final String name) {
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
        public _UpdateInfoNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * autoNumのプロパティ名を返します。
         *
         * @return autoNumのプロパティ名
         */
        public PropertyName<Integer> autoNum() {
            return new PropertyName<Integer>(this, "autoNum");
        }

        /**
         * yyyymmddのプロパティ名を返します。
         *
         * @return yyyymmddのプロパティ名
         */
        public PropertyName<String> yyyymmdd() {
            return new PropertyName<String>(this, "yyyymmdd");
        }

        /**
         * infoContextのプロパティ名を返します。
         *
         * @return infoContextのプロパティ名
         */
        public PropertyName<String> infoContext() {
            return new PropertyName<String>(this, "infoContext");
        }
    }
}